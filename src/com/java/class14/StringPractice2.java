package com.java.class14;

public class StringPractice2 {
    //concat
    //Strings are immutable objects ->
    //Strings can not be modified.
    //in order to change a String you have to reassign values.
    //whenever you use String manipulation methods
    //the original String doesnt change.
    public static void main(String[] args) {
        //two ways of concatenating Strings
        //one via + sign
        String str = "<html>";
        str += "<body>"; //str = str+"<body>";
        str += "<h1> Hello DevX </h1>";
        str += "</body>";
        str +="</html>";

        System.out.println(str);

        String str1 = "public class Hello";

        //concat method
        str1 = str1.concat("{");
        System.out.println(str1);

        //\n -> creates new line
        //\t -> creates a tab.
        //\" -> add " as a String
        //\\ -> add \ as a string
        str1 = str1.concat("\n\t{");

        System.out.println(str1);



        System.out.println();

        String str4 = "Hello";
        str4.concat(" DevX!");
        System.out.println(str4);


        String str5 = "I ";
        str5.concat(" Love ");
        str5 = str5.concat(" Java");
        System.out.println(str5);


    }
}
