package com.company;
import javax.swing.*;
import java.io.*;

/**
 * Created by randkill on 6/26/17.
 */
public class FileR {
    public FileR(String directory , int lines) {
        this.Directory = directory;
        this.Lines = lines;
    }
    int Line;
    int Lines;
    String Directory;
    public String readline(int line) {
        this.Line = line;
        FileReader file = null;
        try {
            file = new FileReader(Directory+".txt");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null , e+"\nfile is not found");
        }
        BufferedReader br;
        br = new BufferedReader(file);
        String info = "";
        for (int i = 0; i < Lines; i++) {
            try {
                info = br.readLine();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null ,e);
            }
            if (i == (Line-1)) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        return info;
    }
}