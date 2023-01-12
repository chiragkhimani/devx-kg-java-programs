package com.java.class11;

public class Switch1 {

    public static void main(String[] args) {

        int rate = 1;

//        if (rate == 1) {
//            System.out.println("Awful service");
//        }
//        else if(rate ==2 ){
//            System.out.println("Poor service");
//        }

        //once java finds the sd matching case
        //it will enter the body that case execute it
        //and it will enter the bodies of all of the following
        //cases until the first break or end of the switch
        switch (rate) {
            case 1://2==1?
            case 2:
            case 3:
                System.out.println("Bad service");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Okay service");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Good service");
                break;
            default://it's same as else statement
                System.out.println("Invalid input");
                break;
        }

//        String shipmentState = "Florida";

//        if (shipmentState.equals("Alaska")) {
//
//        }
//        else if(shipmentState.equals("NY")){
//
//        }
//        else if (shipmentState.equals("Florida")){
//
//        }
//        else if(shipmentState.equals("California")){
//
//        }

        //String values in double quotes are literals
        //values like 5,10,143.44

        String shipmentState = "Hawaii";
        final String alaska = "Alaska";
        final String il = "Illinois";
        //add Hawaii -> $10
        switch (shipmentState) {
            //is case is Alaska || Hawaii
            case "Alaska":
//            case alaska: variables are not allowed in cases
            case il:
                System.out.println("shippment cost is $10");
            case "Hawaii":
//            case "Hawaii":// Duplicate cases are not allowed
                System.out.println("shippment cost is $10");
                break;
            case "NY":
                System.out.println("shippment cost is $5");
                break;
            case "Florida":
                System.out.println("shippment cost is $7");
                break;
            case "California":
                System.out.println("shippment cost is $12");
                break;
//            case 10: experession data type and case data type must be same. compare apples to apples


        }

        //if you have same exact body for 2 or more cases it means they need to be merged


        //final is a java keyword that ensures the value of a variable can only be
        //initialized once and can not be changed afterwards
        //this is a constant value
        final int num = 23;
        //num = 10;

        //ex:
        //area code for chicago
        final int areaCodeForChicago = 312;

    }
}
