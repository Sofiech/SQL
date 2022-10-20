package command;

import data.Resource;
import data.Properties;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * FileName: IDBExecutor
 * Author: aspid
 * Date: 03.10.2022 17:41
 * Description:
 */
public abstract class IDBExecutor  {
    private Properties dbProps = null;
    private static Connection connection;       //private static Connection connection=null;
    private static Statement statement;         //private static Statement statement=null;
    private static ResultSet result;
    Resource resource = new Properties();

    Map<String, String> myresult = new HashMap<String, String>();
    Map<String, String> props = null;
                                            //конструктор
    public IDBExecutor(Resource resource) throws SQLException{this.resource = resource;}
    public IDBExecutor(Map<String, String> result) throws SQLException {this.result = (ResultSet) result;}
    public IDBExecutor(Map<String, String> props) throws SQLException {this.props = props;}

                                    //gettery&settery
    public void setDbProps(Properties dbProps) {this.dbProps = dbProps;}
    public static void setConnection(Connection connection) {IDBExecutor.connection = connection;}
    public static void setStatement(Statement statement) {IDBExecutor.statement = statement;}
    public static void setResult(ResultSet result) {IDBExecutor.result = result;}

    public Properties getDbProps() {return dbProps;}
    public static Connection getConnection() {return connection;}
    public static Statement getStatement() {return statement;}
    public static ResultSet getResult() {return result;}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    props.
            connection = DriverManager.getConnection(url, props.get("username"), props.get("password"));
    connection DriverManage.getConnection(String.format("Mr/Ms"),
    props.getDbProps ("url"),
    props.getProperty ("db_name"),
    props.getProperty ("username"),
    props.getProperty ("password")));
        stat = connection.createStatement();
        result = stat.executeQuery(command.getSqlCommand());
while(result.next())
{
    if(this.class.getCommandName().containg ("User"))
    {
   User user = new User; {
       (result.getInt(1),result.getString(2), result.getInt(3);
       result.add.user();
            }
            else{
   Teacher teacher = new Teacher{
       (result.getInt(1),result.getString(2), result.getInt(3));
   }
         result.add.teacher();
            }
        }
    }
    catch (SQLException ex) {
        ex.printStackTrace();
        }
    }
}


//@Override
//    public ResultSet execute(String s, boolean b, Connection connection, Statement statement, boolean isResult) throws SQLException {
//        return null;
//    }