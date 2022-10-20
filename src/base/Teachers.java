package base;

import command.ISqlCommand;

/**
 * FileName: Teachers
 * Author: aspid
 * Date: 03.10.2022 18:47
 * Description:
 */

    public enum Teachers implements ISqlCommand {

        GetTeachers("SELECT* FROM Teachers"),
        GetTeachersWithPredicate("SELECT*FROM Teachers WHERE id");

        private final String sqlCommand;

        Teachers(String sqlCommand){this.sqlCommand=sqlCommand;}

        @Override
        public String getSqlCommand() {
            return sqlCommand;
        }


    }

