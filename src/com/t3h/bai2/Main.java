package com.t3h.bai2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.printManager();
        System.out.println("1---------------------");
        manager.login("trang", "12876");
        System.out.println("2------------------------");
        System.out.println(manager.checkUser("huong"));
        System.out.println("3-----------------------");
        manager.sign("trinh", "098765", "trinh", "11/09/04", 9, "o");
        manager.printManager();
        System.out.println("4------------------------");
        manager.changePass("trang", "12324", "4567");
        manager.printManager();
        System.out.println("5---------------------------");
        manager.clearUser("trinh", "098765");
        manager.printManager();
        manager.findUser("trang");

    }
}
