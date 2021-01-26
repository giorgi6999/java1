package ge.edu.btu;
import java.io.*;

public class FileCounter {
    public static void main(String args[])
    {
        File file =new File("C:/Users/Dazai/Desktop/java final exam/BTU_DOCUMENTS/");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File file, String name) {
                return name.startsWith("btu");
            }
        };
        String[] ls=file.list(filter);
        int ln=ls.length;
        System.out.println("მოძებნილი ფაილების რაოდენობა არის: "+ln);
    }
}

