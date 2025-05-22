package PemlanTugas9;

import java.io.File;

public class HapusDirectory {
    public static void main(String[] args) {
          File directory = new File("D:\\JAVA\\PemlanTugas9");
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
                directory.delete(); // Menghapus direktori setelah semua file dihapus
                System.out.println("Direktori dan file telah dihapus.");
            }
        } else {
            System.out.println("Direktori tidak ada atau bukan direktori.");
        }
    }
}
