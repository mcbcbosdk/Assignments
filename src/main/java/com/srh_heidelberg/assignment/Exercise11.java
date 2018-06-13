package com.srh_heidelberg.assignment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Exercise11 {

    private static int[] sampleArray;
    private static int index;
    private static int size;
    private static Scanner scanner;
    private static int[][] twoDimensionalArray;
    private static File fileHarry;
    private static File filePotter;
    private static FileInputStream fileInputStream;
    private static FileOutputStream fileOutputStream;
    private static BufferedInputStream bufferedInputStream;
    private static DataInputStream dataInputStream;
    private static BufferedReader bufferedReader;
    private static FileReader fileReader;
    private static FileWriter fileWriter;
    private static BufferedWriter bufferedWriter;
    private static String harryFileName = "harry.txt";
    private static String potterFileName = "potter.txt";

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        getUserDirectory();
        createFile(harryFileName);
        readDataFromFile(harryFileName);
        readDataByBufferedReader(harryFileName);
        transferDataToOtherFile(potterFileName);
        appendDataTofile(harryFileName);
        renameFile();
        copyFile();
        deletefile();
    }

    private static void getUserDirectory() {
        System.out.println("Part 1");
        System.out.println("The user home directory is : " + System.getProperty("user.dir"));
    }

    private static void createFile(String fileName) {

        File file = new File("F:\\Notes\\SDP\\" + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {

                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readDataFromFile(String fileName) {

        fileHarry = new File("F:\\Notes\\SDP\\" + fileName);
        dataInputStream = null;

        try {
            fileInputStream = new FileInputStream(fileHarry);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            dataInputStream = new DataInputStream(bufferedInputStream);

            System.out.println("Data Read from the File ");
            while (dataInputStream.available() > 0) {
                System.out.print((char) dataInputStream.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    private static void readDataByBufferedReader(String filename) {
        fileHarry = new File("F:\\Notes\\SDP\\" + filename);
        bufferedReader = null;
        fileReader = null;
        try {


            fileReader = new FileReader(fileHarry);
            bufferedReader = new BufferedReader(fileReader);

            String dataReadFromFile;

            while ((dataReadFromFile = bufferedReader.readLine()) != null) {
                System.out.println(dataReadFromFile);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bufferedReader != null) {
                    bufferedReader.close();
                }

                if (fileReader != null) {
                    fileReader.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }


        }

    }

    private static void transferDataToOtherFile( String toFile) {
        fileOutputStream = null;
        String dataToWrite = "This is the Contents that has kncwevnk vjkqenv kwenv fkjqnekjv kewn f qkejfnk qvjq vk qvkqejnvk qekj vkqenvje";
        try {
            filePotter = new File("F:\\Notes\\SDP\\" + toFile);
            System.out.println("Size of file before writing any content = " + calculateFileSize(filePotter) + "KB");
            fileOutputStream = new FileOutputStream(filePotter);
            if (!filePotter.exists()) {
                filePotter.createNewFile();
            }
            byte[] contents = dataToWrite.getBytes();
            fileOutputStream.write(contents);
            fileOutputStream.flush();
            System.out.println("Data written into the File Successfully");
            System.out.println("Size of file after writing the content = " + calculateFileSize(filePotter) + "KB");
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static double calculateFileSize(File fileName) {

        double fileSize = 0;

        if (fileName.exists()) {
            double bytes = fileName.length();
            fileSize = (bytes / 1024);
        } else {
            System.out.println("No File Exists");
        }

        return fileSize;
    }

    private static void appendDataTofile(String fileName) {
        bufferedWriter = null;
        fileWriter = null;
        String dataToWrite = "\nThe series was originally printed in English by two major publishers, Bloomsbury in the United\n" +
                "Kingdom and Scholastic Press in the United States. The seven books adapted into an eightpart\n" +
                "film series by Warner Bros. Pictures, which is the second highest-grossing film series of all\n" +
                "time as of August 2015.";
        fileHarry = new File("F:\\Notes\\SDP\\" + fileName);

        try {
            if (!fileHarry.exists()) {
                fileHarry.createNewFile();
            }
            fileWriter = new FileWriter(fileHarry.getAbsoluteFile(), true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(dataToWrite);
            System.out.println("Data Written Successfully ");
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private  static void deletefile(){
        System.out.println("Enter the file name you want to delete: ");
        String fileName = scanner.nextLine();
        File fileToDelete = new File("F:\\Notes\\SDP\\" +fileName);
        if (fileToDelete.exists()){
            fileToDelete.delete();
            System.out.println("File Deleted ");
        }else {
            System.out.println("File Doesn't exists  ");
        }
    }

    private static void renameFile() {

        File oldfile =new File("F:\\Notes\\SDP\\harry.txt");
        File newfile =new File("F:\\Notes\\SDP\\gameofthrones.txt");

        if(oldfile.renameTo(newfile)){
            System.out.println("harry.txt Renamed to gameofthrones successfully");
        }else{
            System.out.println("Rename failed");
        }
    }

    private static void copyFile(){

        Path fromFile = Paths.get("F:\\Notes\\SDP\\harry.txt");
        Path toFile = Paths.get("F:\\Notes\\SDP\\ron.txt");


        try {
            Files.copy(fromFile, toFile, StandardCopyOption.REPLACE_EXISTING);

            File file = new File("F:\\Notes\\SDP\\ron.txt");
            bufferedReader = null;
            fileReader = null;


            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String sCurrentLine;

            while ((sCurrentLine = bufferedReader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bufferedReader != null)
                    bufferedReader.close();

                if (fileReader != null)
                    fileReader.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }


        }
    }
}
