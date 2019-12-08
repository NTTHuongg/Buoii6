package com.t3h.bai1;

import java.util.ArrayList;

public class SmartString {
    private String text;
    private ArrayList<News> arrayList = new ArrayList<>();

    public SmartString(String text) {
        this.text = text;
    }

    public void filter() {
        text = text.replace("<![CDATA[", "");
        text = text.replace("]]>", "");
        text = text.replace("\n", "");
        text = text.replace("  ", "");
        text = text.replace("src=","" );

        String[] arr = text.split("<item>");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length() > 0) {
                String title = arr[j].substring(arr[j].indexOf("<title>")+7, arr[j].indexOf("</title>"));
                String linkDetail = arr[j].substring(arr[j].indexOf("<link>")+6, arr[j].indexOf("</link>"));
                String imgLink = arr[j].substring(arr[j].indexOf("<img")+6, arr[j].indexOf("/></")-2);
                String date = arr[j].substring(arr[j].indexOf("<pubDate>")+9, arr[j].indexOf("</pubDate>"));
                arrayList.add(0, new News(title, linkDetail, imgLink, date));
            }
        }
    }

    public void printSmartString() {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).printNews();
        }
    }
}
