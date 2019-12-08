package com.t3h.bai2;

import java.util.ArrayList;

public class Manager {
    private ArrayList<User> arrayList = new ArrayList<>();

    public Manager(){
        arrayList.add(0,new User("trang",
                "12324",
                "trang",
                "12/8/2019",
                7,
                "it"));
    }

    public void printManager(){
        for (int i = 0; i <arrayList.size() ; i++) {
            arrayList.get(i).showInfo();
        }
    }

    public boolean checkUser(String user){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getUserName() == user){
                return true;
            }
        }
        return false;
    }

    public void sign(String user, String password, String name, String dateOfBirth, int age, String job){
        if(checkUser(user) == false){
            arrayList.add(0, new User(user,password,name,dateOfBirth,age,job));
        } else {
            System.out.println("Dang ki that bai");
        }
    }

    public boolean login(String user, String password){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getUserName() == user && arrayList.get(i).getPassword() == password){
                System.out.println(i);
                System.out.println("Đang nhap thanh cong");
                return true;
            }
        }
        System.out.println("user hoặc pass không đúng");
        return false;
    }

    public void changePass(String user, String pass, String newPass){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getUserName() == user && arrayList.get(i).getPassword() == pass){
                System.out.println("dang nhap thanh cong");
                arrayList.get(i).changePassword(newPass);
            }else {
                System.out.println("bạn chưa login thanh cong");
            }
        }
    }

    public void clearUser(String user, String pass){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getUserName() == user && arrayList.get(i).getPassword() == pass){
                arrayList.remove(i);
            }
        }
    }

    public void findUser(String name){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getName() == name){
                System.out.println("user có name = " + name + " là: "  + arrayList.get(i).getUserName()) ;
            }
        }
    }

}
