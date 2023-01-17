package com.java.class14;

public class IndexOf {

    //indexOf(String str) -> returns the index of the first occurrence
    //whenever there is no matching string then it will returns -1

    //indexOf(String str, int i) -> returns the first occurance of a strings after given index.

    //lastIndexOf(String str) -> returns the index of last occurance of str. if not found returns -1;

    public static void main(String[] args) {
        String str = "tik tak";
        System.out.println(str.indexOf("tak"));
        System.out.println(str.indexOf("k"));

        String str2 = "bla bla bla";
        System.out.println(str2.indexOf("FDsgdfgdfgdgd"));//-1
        System.out.println(str2.indexOf("bla"));
        System.out.println(str2.indexOf("bla"));

        String str3 = "Macbook Air, Nike Air, Ipod Air";

        System.out.println(str3.indexOf("Air", 10));
        System.out.println(str3.indexOf("Air", 19));

        String str4 = "Lala polluza lala land la lakers";
        System.out.println(str4.indexOf("La", 5));
        System.out.println(str4.indexOf("la", 5));
        System.out.println(str4.indexOf("la", 13));
        System.out.println(str4.indexOf("la", 14));


        String str5 = "Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));

        String str6 = "Almazova";
        int last2Chars = str6.lastIndexOf("va");
        System.out.println(last2Chars);


    }
}
