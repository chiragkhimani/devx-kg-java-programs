package com.java.class15;

public class Replace {
    public static void main(String[] args) {
        String str = "earth is flat";
        String str1 = str.replace('a', 'W');
        System.out.println(str1);

        String str3 = "public static void main(String{} args)";
        str3  = str3.replace('{','[').replace('}', ']');
        System.out.println(str3);



        //        System.out.println(str3);
//        System.out.println(str4);
//
//        String str5 = str4.replace('}', ']');
//        System.out.println(str5);



        String str10 = "Rock and Roll, Spring Roll";
        str10 = str10.replace('o', 'B');
        System.out.println(str10);




      //Replace String
        String str11 = "I hate Java I hate Java";
        System.out.println(str11.replace("hate", "love"));


        String str12 = "System.out.println(Hello World)";
        //whenever you want append
        System.out.println(str12.replace(")", ");"));


        //replace the first matching occurance
        String str13 = "system.out.println(Hello World)";
        System.out.println(str13.replaceFirst("s", "S"));

        String str14 = "I hate Java, I hate Programming";
        System.out.println(str14.replaceFirst("hate", "love"));

















    }
}
