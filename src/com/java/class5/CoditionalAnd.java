package com.java.class5;

public class CoditionalAnd {

    public static void main(String[] args) {
        //Conditional And is used when
        //you want to enforce multiple rules
        //before you execute your logic
        //all of the rules must be met



        //to issue certificate I want
        //students to have gpa more than 3.5
        //and I want students to have less than
        //3 missed classes

        boolean giveSezimCertificate = false;

        double sezimGPA = 4.0;
        int sezimMissedClasses = 3;
                              //true           //false
        giveSezimCertificate = sezimGPA>3.5 && sezimMissedClasses < 3;
        System.out.println(giveSezimCertificate);


        //write a program where you give your gpa
        //and number of missed classes
        //and print out result of giveCertificate

















        //write a program where you give your age
        //tell if do you have a passport
        //return true if age is more than 16
        //and you have passport

        int askarAge = 29;
        boolean doesAskarHaveAPassport = true; //==> with
        //avoid writing true==true type of comparison.
        //doesAskarHaveAPassport can be used by itself.

        boolean issueDriverLicense = askarAge > 16 && doesAskarHaveAPassport;
        System.out.println(issueDriverLicense);







        //write a program where you give your
        //credit score
        //your marital status
        //number of children


        //if credit score is more than 680
        //married
        //more than 2 children

        boolean giveFamilyHealthInsuranceCoverage;







    }

}
