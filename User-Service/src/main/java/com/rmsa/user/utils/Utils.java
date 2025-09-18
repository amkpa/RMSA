package com.rmsa.user.utils;

public class Utils {
    public static boolean isNull(Object object) {
        boolean flag = true;
        if (object == null) {
            flag = false;
        }
        return flag;
    }

    public boolean isNull(String string) {
        boolean flag = true;
        if (string == null || string.equals("")) {
            flag = false;
        }
        return flag;
    }
}
