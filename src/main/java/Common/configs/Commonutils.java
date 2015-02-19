package Common.configs;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by praveen on 2/9/2015.
 */
public class Commonutils {
    public static void deleteDirectory(String dirName) {
        try {
            FileUtils.deleteDirectory(new File(dirName));
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
    }

    /**
     * creates directory based on given path
     *
     * @author Karol Kujawiak
     */
    public static void createDirectory(String fileName) {
        try {
            new File(fileName).mkdir();
            System.out.println("directory " + fileName + " created");
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        }
    }
    public static void appendTextToFile(String filePath, String textToWrite) {
        try {
            FileWriter newFile = new FileWriter(filePath, true);
            BufferedWriter out = new BufferedWriter(newFile);
            out.write(textToWrite);
            out.newLine();
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("ERROR in saveTextToFile(2 args) in Commonutils.java \n" + e.getMessage());
        }
    }
}
