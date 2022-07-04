package com.darkwilly08.copyimage.models;

import java.io.File;
import java.io.IOException;
import java.lang.Runnable;

import org.apache.commons.io.FileUtils;

public class CopyPaste implements Runnable {
    private String sourcePath;
    private String destPath;

    public CopyPaste(String sourcePath, String destPath) {
        this.sourcePath = sourcePath;
        this.destPath = destPath;
    }

    public void copyImg(String sourcePath, String destPath) {
        File source = new File(sourcePath);
        File dest = new File(destPath);
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(String destPath) {
        File file = new File(destPath);
        file.delete();
    }

    @Override
    public void run() {
        for (int i = 0; i < 4999; i++) {
            copyImg(sourcePath, destPath);
            deleteFile(destPath);
        }
        copyImg(sourcePath, destPath);
    }

    public void start() {
        for (int i = 0; i < 4999; i++) {
            copyImg(sourcePath, destPath);
            deleteFile(destPath);
        }
        copyImg(sourcePath, destPath);
    }

}
