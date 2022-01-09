package org.fade.demo.businesscase.yearmonth.service;

import org.fade.demo.businesscase.yearmonth.entity.Example;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 * @author fade
 * @date 2022/01/09
 */
@SpringBootTest
@Transactional(rollbackFor = Throwable.class)
public class ExampleServiceTest {

    @Resource(name = "exampleServiceImpl")
    private ExampleService exampleService;

    @Test
    public void testSave() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM");
        YearMonth time = YearMonth.parse("2021-11", dateTimeFormatter);
        Example example = new Example().setTime(time);
        exampleService.save(example);
    }

}
