package com.java.class02;

interface Page {
    // All variable in interface by default public, static, final
    int PAGE_LOAD_TIME = 60;

    // All methods in interface are by default public and abstract
    void waitForPageToLoad();

    void openPage();
}

class LoginPage implements Page {
    @Override
    public void waitForPageToLoad() {
        System.out.println("Wait for login page to load");
    }

    @Override
    public void openPage() {
        System.out.println("Opening login page");
    }
}

class HomePage implements Page {
    @Override
    public void waitForPageToLoad() {
        System.out.println("Wait for home page to load");
    }

    @Override
    public void openPage() {
        System.out.println("Opening home page");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Page page = new LoginPage();
        page.waitForPageToLoad();
        page.openPage();

        page = new HomePage();
        page.waitForPageToLoad();
        page.openPage();
    }
}