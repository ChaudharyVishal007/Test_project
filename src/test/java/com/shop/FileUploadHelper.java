package com.shop;

import java.io.IOException;

public class FileUploadHelper {

    public void uploadFile(String filePath) {
        try {
            // Replace with the path to your compiled AutoIt executable
            String autoItScript = "C:\\browse file\\browse_file.exe";

            // Execute the AutoIt script with the file path as an argument
            ProcessBuilder pb = new ProcessBuilder(autoItScript, filePath);
            pb.start();

            // Optionally, wait for the process to complete
            // pb.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}














