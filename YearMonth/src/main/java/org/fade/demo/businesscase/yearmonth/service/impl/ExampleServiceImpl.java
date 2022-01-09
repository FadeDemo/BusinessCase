package org.fade.demo.businesscase.yearmonth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.fade.demo.businesscase.yearmonth.entity.Example;
import org.fade.demo.businesscase.yearmonth.mapper.ExampleMapper;
import org.fade.demo.businesscase.yearmonth.service.ExampleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.YearMonth;
import java.util.List;
import java.util.Objects;

/**
 * @author fade
 * @date 2022/01/09
 */
@Service
public class ExampleServiceImpl implements ExampleService {

    @Resource
    private ExampleMapper exampleMapper;

    @Override
    public void save(Example example) {
        Objects.requireNonNull(example);
        Objects.requireNonNull(example.getTime());
        exampleMapper.insert(example);
    }

    @Override
    public List<Example> queryAll() {
        return exampleMapper.selectList(Wrappers.emptyWrapper());
    }

    @Override
    public List<Example> queryByIdAndTime(Long id, YearMonth time) {
        QueryWrapper<Example> wrapper = new QueryWrapper<>();
        if (id != null) {
            wrapper.lambda().eq(Example::getId, id);
        }
        if (time != null) {
            wrapper.lambda().eq(Example::getTime, time);
        }
        return exampleMapper.selectList(wrapper);
    }

    @Override
    public void update(Example example) {
        Objects.requireNonNull(example);
        Objects.requireNonNull(example.getId());
        Objects.requireNonNull(example.getTime());
        exampleMapper.updateById(example);
    }

}
