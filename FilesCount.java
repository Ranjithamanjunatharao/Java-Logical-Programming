/* 4. Write a java program to count the list of files based on their extension using File class. 
      Display following files count on console. 
     ==> Number of text files
     ==> Number of document files
     ==> Number of image files
     ==> Number of other files

   Sample Input: Create folder and create different files such as document, pdf, image and text files.

   Expected Output: 
    Number of text files: 5
    Number of document files: 3
    Number of image files: 4
    Number of other files: 3
*/
import java.io.*;

public class FilesCount {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter folder path: ");
            String folderPath = br.readLine();
            File folder = new File(folderPath);

        
            File[] fileList = folder.listFiles();

            int textFileCount = 0;
            int documentFileCount = 0;
            int imageFileCount = 0;
            int otherFileCount = 0;

            for (File file : fileList) {
                String fileName = file.getName();
                String extension = fileName.substring(fileName.lastIndexOf('.') + 1);

                if (extension.equals("txt")) {
                    textFileCount++;
                } else if (extension.equals("doc") || extension.equals("docx") || extension.equals("pdf")) {
                    documentFileCount++;
                } else if (extension.equals("jpg") || extension.equals("jpeg") || extension.equals("png") || extension.equals("gif")) {
                    imageFileCount++;
                } else {
                    otherFileCount++;
                }
            }

            System.out.println("Number of text files: " + textFileCount);
            System.out.println("Number of document files: " + documentFileCount);
            System.out.println("Number of image files: " + imageFileCount);
            System.out.println("Number of other files: " + otherFileCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}