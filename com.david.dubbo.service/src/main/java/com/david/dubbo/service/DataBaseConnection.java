package com.david.dubbo.service;


import com.david.database.driver.DataBaseDriver;

import java.util.ServiceLoader;

/**
 * Created by sc on 2018/12/13.
 */
public class DataBaseConnection {

    public static void main(String[] args) {
        System.out.println("123");
        ServiceLoader<DataBaseDriver> serviceLoader=
                ServiceLoader.load(DataBaseDriver.class);

        for(DataBaseDriver driver:serviceLoader){
            System.out.println(driver.connect("localhost"));
        }
        System.out.println("555");
    }
}
