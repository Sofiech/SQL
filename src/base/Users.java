package base;

import command.ISqlCommand;

/**
 * FileName: Users
 * Author: aspid
 * Date: 03.10.2022 18:54
 * Description:
 */
public enum Users implements ISqlCommand {
    GetUsers("SELECT* FROM Users"),
    GetUsersWithPredicate("SELECT*FROM Users WHERE id");

    private String sqlCommand;
    Users(String sqlCommand) {this.sqlCommand = sqlCommand;}

    @Override
    public String getSqlCommand() {
        return sqlCommand;
    }
}


