package org.fade.demo.businesscase.yearmonth.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.YearMonth;

/**
 * @author fade
 * @date 2022/01/09
 */
@MappedTypes({YearMonth.class})
public class YearMonthTypeHandler extends BaseTypeHandler<YearMonth> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, YearMonth parameter, JdbcType jdbcType) throws SQLException {
        LocalDate localDate = LocalDate.of(parameter.getYear(), parameter.getMonthValue(), 1);
        ps.setObject(i, localDate);
    }

    @Override
    public YearMonth getNullableResult(ResultSet rs, String columnName) throws SQLException {
        LocalDate localDate = rs.getObject(columnName, LocalDate.class);
        return YearMonth.of(localDate.getYear(), localDate.getMonthValue());
    }

    @Override
    public YearMonth getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        LocalDate localDate = rs.getObject(columnIndex, LocalDate.class);
        return YearMonth.of(localDate.getYear(), localDate.getMonthValue());
    }

    @Override
    public YearMonth getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        LocalDate localDate = cs.getObject(columnIndex, LocalDate.class);
        return YearMonth.of(localDate.getYear(), localDate.getMonthValue());
    }

}
