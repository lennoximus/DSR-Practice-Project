
// Данный класс и FileChooserDialog – возможный вариант открытия файла настроек xls.

package com.mycompany.autointegrationapp;

import java.io.*;
/**
 *
 * @author Lennoximus
 */

public class FileFilter extends javax.swing.filechooser.FileFilter {
    String ext, description;
    public String getDescription() {
        return description;
    }
    FileFilter(String ext, String description) {
        this.ext = ext;
    }
    public boolean accept(File f) {
        if(f != null) {
            if(f.isDirectory()) {
                return true;
            }
            return f.toString().endsWith(ext);
        }
        return false;
    }
}
