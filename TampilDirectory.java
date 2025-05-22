package PemlanTugas9;

import java.io.File;

public class TampilDirectory {
    public static void main(String[] args) {
        File directory = new File("D:\\JAVA\\PemlanTugas9");
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("Tidak ada file di direktori.");
            }
        } else {
            System.out.println("Direktori tidak ada.");
        }
    }
}
