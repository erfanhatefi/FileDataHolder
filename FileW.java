package com.company;

import javax.swing.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Created by randkill on 6/26/17.
 */
public class FileW {
    public FileW(String data, String directory) {
        this.Data = data;
        this.Directory = directory;
    }
    String Data;
    String Directory ;
    public void writeFile()
    {
        File newfile = new File(Directory+".txt");
        if (newfile.exists()) {
            JOptionPane.showMessageDialog(null,"file exists");
        }
        else {
            try {
                newfile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(newfile);
            BufferedWriter buffw = new BufferedWriter(fileWriter);
            buffw.write(Data);
            buffw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}