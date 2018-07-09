package com.xinlizz.demo.utils;

/**
 *
 * @Author xinlizz
 * @Date 2018/7/9
 */
public class StringUtils {

    public static boolean isBlank(String str) {
        return (null == str) || "".equals(str);
    }

    public static boolean isNotBlank(String str){
        return !isBlank(str);
    }

    public static boolean equals(String first,String second){
        if (null == first && null == second) {
            return false;
        }

        if (null != first) {
            return first.equals(second);
        }

        if (null != second) {
            return second.equals(first);
        }
        return first.equals(second);
    }
}
