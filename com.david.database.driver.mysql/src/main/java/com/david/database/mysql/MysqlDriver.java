package com.david.database.mysql;

import com.david.database.driver.DataBaseDriver;

/**
 * Created by sc on 2018/12/13.
 */
public class MysqlDriver implements DataBaseDriver {
    @Override
    public String connect(String s) {
        return "begin build Mysql connection";
    }
}
