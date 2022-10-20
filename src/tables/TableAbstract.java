package tables;

import command.IDBExecutor;
import command.MySqlDbExecutor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * FileName: TableABC
 * Author: aspid
 * Date: 04.09.2022 15:49
 * Description:
 */
public abstract class TableAbstract implements ITable {
    private String tableName;
    public TableAbstract(String tableName) {this.tableName = tableName;}

    IDBExecutor iDBExecutor = new MySqlDbExecutor() {
        @Override
        public ResultSet execute(String sqlRequest, boolean Connection, boolean isResult) throws SQLException {
            return super.execute(sqlRequest, Connection, isResult);}


        @Override
        public void create() throws SQLException {
            iDBExecutor.execute("CREATE TABLE Student (name varchar(5), lastname varchar(5));", false);
        }

        @Override
        public void delete() throws SQLException {
            iDBExecutor.execute(String.format("DROP TABLE %s", tableName), false);
        }

        public String createPredicate(String[] predicateValues) {
            return String.format("WHERE %s", String.join(" AND ", predicateValues));
        }
    };
}




