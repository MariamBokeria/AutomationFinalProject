package com.mesaudabeauty.utils;

public class Utils {
    public static void log(String message){
        if (ExtentReportManager.getTest() != null){
            ExtentReportManager.getTest().info(message);
        }
    }
}
