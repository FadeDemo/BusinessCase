package org.fade.demo.businesscase.yearmonth.service.impl;

import org.fade.demo.businesscase.yearmonth.entity.Example;
import org.fade.demo.businesscase.yearmonth.mapper.ExampleMapper;
import org.fade.demo.businesscase.yearmonth.service.ExampleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

}
