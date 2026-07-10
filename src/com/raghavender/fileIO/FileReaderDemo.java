package com.raghavender.fileIO;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("File reader demo.");
        String filePath = "/home/raghavender/text";
         readFile(filePath);

    }

    public static void readFile(String path){
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException e) {
            System.out.println("IO exception.");
        }
        }
    }

