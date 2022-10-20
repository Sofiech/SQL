package tables;

import java.sql.SQLException;

/**
 * FileName: ITable
 * Author: aspid
 * Date: 04.09.2022 17:48
 * Description:
 */
public interface ITable {
    void create() throws SQLException;
    void delete() throws SQLException;

    String createPredicate(String[] array);
}
