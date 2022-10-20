package tables;

import java.sql.SQLException;

/**
 * FileName: Student
 * Author: aspid
 * Date: 04.09.2022 16:56
 * Description:
 */
public class Student extends TableAbstract  {

    String student;
    public Student(String tableName) {super(tableName);}

    public String getStudent() {return student;}

    public void setStudent(String student) {this.student = student;}

    public Student() {super("Student");}

                                //gettery/settery
    @Override
    public void create() throws SQLException {super.create();}

    @Override
    public void delete() throws SQLException {super.delete();}


}


