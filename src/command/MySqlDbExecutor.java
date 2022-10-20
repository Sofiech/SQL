package command;

import data.Resource;
import data.Properties;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * FileName: MySqlDbExecutor
 * Author: aspid
 * Date: 02.09.2022 20:53
 * Description:
 */

public abstract class MySqlDbExecutor extends IDBExecutor {
    private static Connection connection =null;
    public static Statement statement = null;

    public MySqlDbExecutor(Resource resource) throws SQLException {
        super(resource);
    }

    public ResultSet execute(String sqlRequest, boolean Connection, boolean isResult) throws SQLException {

    Resource resource = new Properties();

        Map<String, String> props = Resource.read();
        String url = String.format("%s/%s", props.get("url"), props.get("db_name"));

        if (connection==null){
            connection = DriverManager.getConnection(url, props.get("username"), props.get("password"));
            statement = connection.createStatement();
        }
        if (isResult) {
            return statement.executeQuery(sqlRequest);
        }
        statement.execute(sqlRequest);
        return null;
    }

    public abstract String getIDBExecutor();

    public void close() throws SQLException {
           if (statement!=null){
            statement.close();
           }
            if (connection!=null){
                connection.close();
        }
    }

    @Override
    public ResultSet execute(String s, boolean b, Connection connection, Statement statement, boolean isResult) throws SQLException {
        return null;
    }

    public abstract Map<Integer, String> execute(String sqlRequest, boolean isResult) throws SQLException;
}
