package com.david.database.oracle;


import com.david.database.driver.DataBaseDriver;

/**
 * Created by sc on 2018/12/13.
 */
public class OracleDriver implements DataBaseDriver {
    @Override
    public String connect(String s) {
        return "begin build oracle connection";
    }
}
