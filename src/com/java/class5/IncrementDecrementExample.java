package com.java.class5;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        int numberOfClients = 0;

        numberOfClients++;  //numberOfClients = numberOfClients + 1;

        System.out.println(numberOfClients);

        numberOfClients++;
        System.out.println(numberOfClients);

        numberOfClients++;
        System.out.println(numberOfClients); //3


        numberOfClients+=1; //
        System.out.println(numberOfClients);


        numberOfClients+=3;//numberOfClients = numberOfClients + 3;



        double gasPrice = 3.99;
        gasPrice++;//gasPrice = gasPrice + 1.0
        System.out.println(gasPrice);//4.99


        double gasPriceAfterTax = gasPrice++;
        System.out.println(gasPriceAfterTax);




        //when you have a post increment/decrement
        //it changes it's own value, but return the old value

        int num = 1;
        int y = num++;//incrementd itself. but returns the not incremented value(old value)
        System.out.println(num);//2
        System.out.println(y);


        int x = 1;
        int w = ++x; //increments itself plus return the incremented value
        System.out.println(x);
        System.out.println(w);






        int z = 10;
        int r = z++;
        System.out.println(r);//10
        System.out.println(z);//11

        System.out.println(z++);//11 on line where you are post incrementing
        //the returned value is still going to be old one.

        System.out.println(z);//12 next line where you use the incremented
        //variable it will return the new value.



        //post increment/decrement like a friend that gives old clothes
        //and renews his/her own clothes
        int u = 11;
        int q = u++; //q=11, u=12
        int t = q++;//t=11, q=12

        System.out.println(u);
        System.out.println(q);
        System.out.println(t);



        int ab = 50;
        int ac = ab++; //ac=50, ab=51
        int ad = ++ab; //ad=52, ab=52

        System.out.println(ad++); //52
        System.out.println(++ab);//53


        int tempVar = ab++;
        //System.out.println(tempVar=ab++)

        System.out.println(ab++); //53
        System.out.println(ab++);//54
        System.out.println(ab);




        int il = 10;
        int temp = il++;//temp=10, il=11;
        System.out.println(temp);
        System.out.println(il);



        int var = 10;
        // System.out.println(int temp = var++);//temp=10, var=11;
        System.out.println(var++);
        System.out.println(var);



        int var1 = 20;
        System.out.println(var1++);//print 20, var1=21
        System.out.println(++var1);//print 22, var1=22

        int var2 = var1++;//var2= 22, var1=23
        int var3 = ++var1;//var3 = 24, var1=24

        System.out.println(var1);//24
        System.out.println(var2);//22
        System.out.println(var3);//24








        //20
        //22
        //24
        //22
        //24

































    }
}
