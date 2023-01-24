package com.java.class15;

public class Contains {

    public static void main(String[] args) {
        String str = "Hello, Askar!\n thank you for interviewing for Apple." +
                "We want to congratulate you on receving an offer";

        //contains method return boolean(true/false)
        //returns true if the given String param exists
        //in the String.
        boolean doesContain = str.contains("Apple");
        System.out.println(doesContain);

        if (str.contains("Apple")) {
            //do print out the text in certain format.
        }


        String str2 = "Course Offerings: Java, Python";
        if (str2.contains("JavaScript")) {
            //go and scehdule a call
            //and enroll
        }

        String anyOfTheWebsites = "";

        if(anyOfTheWebsites.contains("Turkish rest near me")){

        }

        //startsWith()
        //endWith()
        //isEmpty()
        //replace f*** ==> F#^%&
        //b*** => B#^%&
        //

        //
        if(str.contains("F") || str.contains("B")) {
            //       int indexOfFirstSpace  = str.indexOf(" ");
            //
            //        // AdvXntures World
            //        String noDevXEReplaced = str.substring(indexOfFirstSpace).replaceFirst("e", "X");
            //        //DevX
            //        String devXOnly = str.substring(0, indexOfFirstSpace);
            //
            //        String finalResult = devXOnly.concat(noDevXEReplaced);
            //        System.out.println(finalResult);
        }











    }
}
