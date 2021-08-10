package com.coderwizard.uis.util;

public class QueryUtil {

    public static final String SAVE_SQL = "insert into user_tbl(user_name, password, mobileNo, salary, dob, active )values(?,?,?,?,?,?)";
    public static final String UPDATE_SQL = "update user_tbl ser user_name?, password? , mobileNo?, salary?, dob?, active? ) where id=?";
    public static final String DELETE_SQL = "delete from user_tbl where id=?";
    public static final String LIST_SQL = "select *  from user_tbl";
    public static final String GET_BY_ID_SQL = "select * from user_tbl where id=?";
}
