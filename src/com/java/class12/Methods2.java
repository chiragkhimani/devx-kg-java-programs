package com.java.class12;

public class Methods2 {

    public static void main(String[] args) {
        //you can use methods with a return type(not void)
        //directly inside sysout to print the result of the method
        Methods2 someVarName = new Methods2();
        System.out.println(someVarName.sum(2,3));

        System.out.println(someVarName.inTheRange(2,4));

    }


    public  int sum(int num, int num2) {
//        return 2 * (num+ num2); //return statement is like a finishline.
        //when your code runs return statement
        //it means you want to break out of this method.

        if (num == num2) {
            return 2 * (num + num2);
        }

        return num + num2;
    }


    public boolean inTheRange(int num, int num2) {
        //local variables are variables that are defined without a certain scope
        //so you can use same variables names as long as they are defined in completely
        //different scopes
        return num >=10 && num <=20 || num2 >=10 && num2 <= 20;
        //1. if you have a method that returns boolean
        //2. if you have just a simple if and else logic
        //you can put the condition expression with return
    }



}

