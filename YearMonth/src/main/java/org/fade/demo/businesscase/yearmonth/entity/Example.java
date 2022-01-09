package org.fade.demo.businesscase.yearmonth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.YearMonth;

/**
 * 例子
 *
 * @author fade
 * @date 2022/01/09
 */
@Data
@Accessors(chain = true)
@TableName(value = "example", autoResultMap = true)
public class Example {

    /**
     * 主键
     * */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 日期
     * */
    @TableField(value = "time")
    private YearMonth time;

}
