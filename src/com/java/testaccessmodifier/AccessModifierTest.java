package com.java.testaccessmodifier;

import com.java.class32.ChaseBank;

public class AccessModifierTest extends ChaseBank{
    public static void main(String[] args) {
        System.out.println(balance);
        withdraw(100);
        deposit(100);
    }
}
