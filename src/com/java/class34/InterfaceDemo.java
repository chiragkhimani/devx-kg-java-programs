package com.java.class34;

import java.util.Scanner;

interface Browser {
    void openBrowser();

    void viewHistory();

    void openURL();
}

class Chrome implements Browser {

    @Override
    public void openBrowser() {
        System.out.println("Chrome Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Chrome view history");
    }

    @Override
    public void openURL() {
        System.out.println("Chrome open url");
    }

}

class Firefox implements Browser {

    @Override
    public void openBrowser() {
        System.out.println("Firefox Web Open Browser");
    }

    @Override
    public void viewHistory() {
        System.out.println("Firefox View History");
    }

    @Override
    public void openURL() {
        System.out.println("Firefox Open url");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Please enter your browser");
        Scanner input = new Scanner(System.in);
        String browserFromUser = input.nextLine();


        Browser browser = null;

        if (browserFromUser.contains("Chrome")) {
            browser = new Chrome();
        } else if (browserFromUser.contains("Firefox")) {
            browser = new Firefox();
        }

        browser.openBrowser();
        browser.openURL();
        browser.viewHistory();


    }
}
