package org.fade.demo.businesscase.yearmonth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * 例子
 *
 * @author fade
 * @date 2022/01/09
 */
@Data
@Accessors(chain = true)
@TableName("example")
public class Example {

    /**
     * 主键
     * */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 日期
     * */
    @TableField("time")
    @DateTimeFormat(pattern = "yyyy-MM")
    private LocalDate time;

}
