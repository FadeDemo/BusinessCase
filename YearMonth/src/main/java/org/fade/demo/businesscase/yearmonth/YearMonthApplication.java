package org.fade.demo.businesscase.yearmonth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fade
 * @date 2022/01/09
 */
@SpringBootApplication
@MapperScan("org.fade.demo.businesscase.yearmonth.mapper")
public class YearMonthApplication {

    public static void main(String[] args) {
        SpringApplication.run(YearMonthApplication.class, args);
    }

}
