package com.java.class15;

public class Replace2 {
    public static void main(String[] args) {

        //write a program that updates the first e in the second word
        //to X
//        String str = "DevX Adventures World"; //=> DevX AdvXntures World
         String str     = "Hello Coder superstar java rockstar"; // => Hello CodXr superstar
                // = "I went to College"; // ==> I wXnt to College
        int indexOfFirstSpace  = str.indexOf(" ");

        // AdvXntures World
        String noDevXEReplaced = str.substring(indexOfFirstSpace).replaceFirst("e", "X");
        //DevX
        String devXOnly = str.substring(0, indexOfFirstSpace);

        String finalResult = devXOnly.concat(noDevXEReplaced);
        System.out.println(finalResult);



    }
}
