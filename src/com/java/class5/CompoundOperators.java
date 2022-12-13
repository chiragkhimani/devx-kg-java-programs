package com.java.class5;

/**
 * Compound Operators are easy way to use the current value of a variable
 * and add, substruct, multiple or divide by a new value and
 * reassign the resulting value into the original variable
 *
 * the only use case for compound operators is clean code
 * you avoid typing the variable name twice for the calculation
 *
 * less code is always a better code
 */
public class CompoundOperators {

    public static void main(String[] args) {
        int num1 = 10;
        num1+=5; //num1 = num1+5;
        System.out.println(num1);


        int num2 = 11;
        num2+= 22; //num2 = num2+22;  num2 = 22;
        System.out.println(num2);//num2=33


        num2+=5;// num2 = num2(22) + 5
        System.out.println(num2); //num2=38


        num2+=11; //num2 = num2(33)+11;
        System.out.println(num2);//49


        num2+=14;
        System.out.println(num2);//63

        num2-=11; //num2 = num2-11;
        System.out.println(num2);//52

        num2-=5; //num2 = num2-5;
        System.out.println(num2);//47

        System.out.println(num2);//47

        System.out.println(num2-5); //42

        num2-=2;//num2=num2-2
        System.out.println(num2);//45


        int numberOfChicken  = 100;
        numberOfChicken+=50;

        System.out.println(numberOfChicken);//150

        numberOfChicken*=2; //numberOfChicken = numberOfChicken*2;
        System.out.println(numberOfChicken);//300


        numberOfChicken /= 10; //numberOfChicken = numberOfChicken/10;
        System.out.println(numberOfChicken);//30


        numberOfChicken%=2; //numberOfChicken=numberOfChicken%2;
        System.out.println(numberOfChicken);//remainder is 0;


        System.out.println("================================");


        int num = 10; //num=10
        System.out.println(num+5);//num=10
        num*=2;//20
        num+=5;//25

        System.out.println(num+1);//num=25

        num-=5;//20

        System.out.println(num);//20
    }
}
