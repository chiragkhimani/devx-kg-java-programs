package com.java.class35;

import java.util.HashMap;
import java.util.Map;

enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum MarksOfStudent{

    AIDAI(45), EMILY(33), AZAT(55), TAIRA(55), MADINA(90), BEGIMAI(54), JANAT("Pass");

    int marks;
    private String result;

    MarksOfStudent(int marks){
        this.marks = marks;
    }

    MarksOfStudent(String result){
        this.result = result;
    }

    public String getResult(){
        return result;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(MarksOfStudent.AZAT);
        System.out.println(MarksOfStudent.AZAT.marks);
        System.out.println(MarksOfStudent.JANAT.getResult());

        MarksOfStudent[] listOfMarks = MarksOfStudent.values();

        System.out.println(listOfMarks[0].marks);
        System.out.println(listOfMarks[1].marks);

    }
}
