package com.t3h.bai1;

import java.util.Date;

public class News {
    protected String title;
    protected String linkDetail;
    protected String imgLink;
    protected String date;

    public News(String title, String linkDetail, String imgLink, String date) {
        this.title = title;
        this.linkDetail = linkDetail;
        this.imgLink = imgLink;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getLinkDetail() {
        return linkDetail;
    }

    public String getImgLink() {
        return imgLink;
    }

    public String getDate() {
        return date;
    }

    public void printNews(){
        System.out.println("title: " +title );
        System.out.println("linkDetail: " + linkDetail);
        System.out.println("imgLink: " + imgLink);
        System.out.println("date: " + date);
        System.out.println("-----------------------");
    }
}
