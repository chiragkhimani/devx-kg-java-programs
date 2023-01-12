package com.java.class11;

public class NestedSwitch {
    public static void main(String[] args) {


        int num = 10;
        String country = "USA";
        switch (num) {
            case 1:
                System.out.println("case 1");
                switch (country){
                    case "USA":
                        //do you work
                        break;
                    case "Canada":
                        //do you work
                        break;
                }

        }




        //case or default statements can have entire switch statement inside

        //Online store.
        // we want to write a program which calculates shipping cost based on
        //destination and based on total spending
        //if the customer is spending less than $5 than charge $5 for shipping
        //if spending more than 5 and less or equal to $10 then charge $10


        //if spending more than 10 then.
        //we also look at the shipping destination.
        //if it's usa -> we should charge 10% of the total spending for shipping
        //if it's canada -> charge 15% of total spending
        //if it's Europe -> charge 20% of total spending
        //if it's any other place -> charge 25% of total spending


        String destination = "USA";

        double totalSpending = 144;

        if ( (int)totalSpending>0 ) {

            switch ((int) totalSpending) {

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Shipping cost is $5");
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Shipping cost is $10");
                    break;

                default:
                    switch (destination.toLowerCase()) {
                        case "usa": //10%
                            System.out.println("Shipping cost is $" + totalSpending * 0.1);
                            break;
                        case "canada"://15%
                            System.out.println("Shipping cost is $" + totalSpending * 0.15);
                            break;
                        case "europe"://20%
                            System.out.println("Shipping cost is $" + totalSpending * 0.2);//totalSpending/100*20) //totalSpending*20/100
                            break;
                        default:    //25%
                            System.out.println("Shipping cost is $" + totalSpending * 0.25);
                            break;
                    }

            }
        } else {
            System.out.println("Wrong input");
        }

    }
}
