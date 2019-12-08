package com.t3h.file;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
//        fileManager.init();
//        fileManager.readAllFile(new File("C:/"));
//        fileManager.write("asdfghkjdfb sdgadgagfd\n");
//        fileManager.read();

        String link = "https://c4-ex-swe.nixcdn.com/PreNCT17/NgayEmDiLayChongPhucAcoustic1Tap3-TangPhuc-6152013.mp4?st=m6BoKhiPwKCub5c2k9bhww&e=1575894759&t=1575808654647";
        String path = "C:/T3H/Download/Video.mp4";
        fileManager.download(link, path);

    }
}
