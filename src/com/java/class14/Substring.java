package com.java.class14;

public class Substring {
    //substring(int i) => returns a String which a substring from ith to the end of
    //original String

    //substring(int i,
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(6));
        System.out.println(str);


        String str1 = "Tesla Motors inc.";
        System.out.println(str1.substring(6));

        //System.out.println(str1.substring(20));
        //StringIndexOutOfBoundsException: String index out of range: -3

        String str2 = "La Ferrari";
        System.out.println(str2.substring(3,8));

        String str3 = "Maldive Islands";
        System.out.println(str3.substring(0,7));

        System.out.println(str3.substring(5,1));
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -4
        //can not go backwards


    }
}
