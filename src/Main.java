import command.IDBExecutor;
import command.MySqlDbExecutor;
import tables.Student;
import tables.TableAbstract;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * FileName: Main
 * Author: aspid
 * Date: 02.09.2022 21:59
 * Description:
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        IDBExecutor iDBExecutor = new MySqlDbExecutor() {
            @Override
            public String getIDBExecutor() {
                return null;
            }

            @Override
            public Map<Integer, String> execute(String sqlRequest, boolean isResult) throws SQLException {
                return null;}


        TableAbstract student = new Student();
        String [] array = new String[2];
        array[0] = "name = Sofa";
        array[1] = "age > 10";
        student.createPredicate(array);

        try {
        ResultSet tables = (ResultSet) iDBExecutor.execute("show tables;", true);
            boolean isTableCreated = false;
            while(tables.next()) {
                if(tables.getString(1).equals("Student")){      //1 столбик = Студент
            isTableCreated = true;
                break;
                }
            }
        if(isTableCreated) {
           student.delete();}

            student.create();
        iDBExecutor.execute("INSERT INTO Student VALUES ('Sofa', 'Bla');",false);

        ResultSet students = (ResultSet) iDBExecutor.execute("SELECT * FROM Student WHERE sex = f and age >10", true);
            while (students.next()){
                System.out.println(students.getString(1));
                System.out.println(students.getString(2));
            }
        } finally {
            try {
                iDBExecutor.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }
}
