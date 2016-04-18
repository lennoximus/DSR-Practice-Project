
// Данный класс и FileFilter – возможный вариант открытия файла настроек xls.

package com.mycompany.autointegrationapp;

import javax.swing.*;
import java.io.*;

public class FileChooserDialog extends JFrame {
    String fName = null;
    String line = null;
    
    
    FileChooserDialog() {
        setBounds(0, 0, 500, 500);
        JFileChooser dialog = new JFileChooser();
        dialog.setFileFilter(new FileFilter(".xls", ""));
        dialog.showOpenDialog(this);
        File file = dialog.getSelectedFile();
        fName = file.getAbsolutePath();
        try {
            BufferedReader in = new BufferedReader(new FileReader(fName));
            /*while ((line = in.readLine()) != null) {
                textArea.append(line);
                textArea.append("\n");
                }*/
                in.close();
        } catch (IOException ex) {System.out.println(ex);}
    }
}
