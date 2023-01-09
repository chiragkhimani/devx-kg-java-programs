package com.java.class9;

import java.net.StandardSocketOptions;

public class NestedIf {


    public static void main(String[] args) {


        //first if statement scope {} -> is outer if statement
        //if line 13 if statement is false then the program is going to to line 18
//        if () {
//
//            if () {
//
//            }
//
//        }

        boolean outerBoolean = true;
        boolean innerBoolean = false;

        //this program wont print out anything because
        //first if is true
        //and inner if is false
        if (true) {

            if (false) {
                System.out.println("Hi from Inner If statement");
            }
        }


        if (true) {

            if (true) {
                System.out.println("Hi from Inner If statement 2");
            }

        }


        if (false) {

            if (true) {
                System.out.println("Hi 3");
            }

        }


        if (true) {

            if (true) {
                System.out.println("Hi 4");
            }

            System.out.println("Outer Hi 4");
        }


        if (true) {

            System.out.println("Outer Hi 5.1");
            if (true) {
                System.out.println("Inner Hi 5");
            }

            System.out.println("Outer Hi 5.2");
        }




        if (true) {

            System.out.println("Outer Hi 6.1");

            if (false) {
                System.out.println("Inner Hi 6");
            }

            System.out.println("Outer Hi 6.2");
        }


        if (false) {

            System.out.println("Outer Hi 7.1");

            if (true) {
                System.out.println("Inner Hi 7");
            }

            System.out.println("Outer Hi 7.2");
        }




        if (true) {

            System.out.println("Outer If Hi 8.1");

            if (true) {
                System.out.println("Inner If Hi 8");
            }
            else {
                System.out.println("Inner Else 8");
            }

            System.out.println("Outer If Hi 8.2");
        }




        if (true) { // outer

            System.out.println("Outer If Hi 9.1");

            if (false) { //inner  if
                System.out.println("Inner If 9");
            }
            else { //inner else
                System.out.println("Inner Else 9");
            }

            System.out.println("Outer If Hi 9.2");
        }




        if (true) { // outer if

            System.out.println("Outer If 10.1");

            if (false) { //inner  if
                System.out.println("Inner If 10");
            }
            else { //inner else
                System.out.println("Inner Else 10");
            }

            System.out.println("Outer If 10.2");
        }
        else { //outer else
            System.out.println("Outer Else 10.1");
        }








        if (false) { // outer if

            System.out.println("Outer If 11.1");

            if (false) { //inner  if
                System.out.println("Inner If 11");
            }
            else { //inner else
                System.out.println("Inner Else 11");
            }

            System.out.println("Outer If 11.2");
        }
        else { //outer else
            System.out.println("Outer Else 11.1");
        }



        if (false) { // outer if

            System.out.println("12.1");

            if (false) { //inner  if
                System.out.println("12.2");
            }
            else { //inner else
                System.out.println("12.3");
            }

            System.out.println("Outer If 12.4");
        }
        else { //outer else
            System.out.println("12.5");

            if (false) {
                System.out.println("12.6");
            }
            else if (true) {
                System.out.println("12.7");
            }

            else {
                System.out.println("12.8");
            }
        }



        if (false) { // outer if

            System.out.println("13.1");

            if (false) { //inner  if
                System.out.println("13.2");
            }
            else { //inner else
                System.out.println("13.3");
            }

            System.out.println("Outer If 13.4");
        }
        else { //outer else
            System.out.println("13.5");

            if (true) {
                System.out.println("13.6");
            }
            else if (true) {
                System.out.println("13.7");
            }
            else {
                System.out.println("13.8");
            }
        }



        if (true) { // outer if

            System.out.println("14.1");

            if (false) { //inner  if
                System.out.println("14.2");
            }
            else if (true) {
                System.out.println("14.3");
            }
            else if (true) {
                System.out.println("14.4");
            }
            else { //inner else
                System.out.println("14.5");
            }

            System.out.println("Outer If 14.6");
        }

        else { //outer else
            System.out.println("14.7");

            if (true) {
                System.out.println("14.8");
            }
            else if (true) {
                System.out.println("14.9");
            }
            else if(true) {
                System.out.println("14.10");
            }
            else {
                System.out.println("14.11");
            }
        }



        if (true) {
            System.out.println("Hello");

        }
        else {
            System.out.println("Hi");

        }














        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        





































































    }
}
