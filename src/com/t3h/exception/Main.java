package com.t3h.exception;

public class Main {
    public static void main(String[] args) {
//        try{
//            String a = "3";
//            int v =Integer.parseInt(a);
//            System.out.println(v);
//            String str = "Hello";
//            char c = str.charAt(100);
//            System.out.println(c);
//        }catch (Exception ex){
//            System.out.println("bị lỗi");
//            ex.printStackTrace();
//        }
//        System.out.println("Kết thúc!");
//
        try{
            Example example = new Example();
            example.print();
        }catch (Exception ex){
            System.out.println("bi loi");
            ex.printStackTrace();
        }
    }



}
