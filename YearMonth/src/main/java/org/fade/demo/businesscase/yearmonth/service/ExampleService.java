package org.fade.demo.businesscase.yearmonth.service;

import org.fade.demo.businesscase.yearmonth.entity.Example;

import java.time.YearMonth;
import java.util.List;

/**
 * @author fade
 * @date 2022/01/09
 */
public interface ExampleService {

    /**
     * 保存
     * @param example 例子
     * @see Example
     * */
    void save(Example example);

    /**
     * 查询所有
     * @return 例子的列表
     * @see Example
     * */
    List<Example> queryAll();

    /**
     * 根据条件查询
     * @param id 主键
     * @param time 日期
     * @return 例子的列表
     * @see Example
     * */
    List<Example> queryByIdAndTime(Long id, YearMonth time);

    /**
     * 修改
     * @param example 例子
     * @see Example
     * */
    void update(Example example);

}
