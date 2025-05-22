package PemlanTugas9;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            long fileSizeInBytes = file.length();
            if (fileSizeInBytes < 1024 * 1024) { 
                double fileSizeInKB = fileSizeInBytes / 1024.0;
                System.out.println("Ukuran file: " + fileSizeInKB + " KB");
            } else { // >= 1 MB
                double fileSizeInMB = fileSizeInBytes / (1024.0 * 1024.0);
                System.out.println("Ukuran file: " + fileSizeInMB + " MB");
            }
        } else {
            System.out.println("File tidak ada");
        }
    }
}
