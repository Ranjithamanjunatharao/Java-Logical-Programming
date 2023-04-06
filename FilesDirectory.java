
/* 1. Write a Java program to get a list of all files/directory names from the given path using File class object.*/

import java.io.*;

public class FilesDirectory {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter path: ");
            String path = br.readLine();
          
            File file = new File(path);
            String[] fileList = file.list();

            System.out.println("List of files/directories in " + path + ":");
            for (String name : fileList) {
                System.out.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



