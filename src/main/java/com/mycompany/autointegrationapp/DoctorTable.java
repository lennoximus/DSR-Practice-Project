/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.autointegrationapp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class DoctorTable {

    @DatabaseField(generatedId = true)
    private int DoctorID;
    @DatabaseField
    private String FirstName;
    @DatabaseField
    private String LastName;

    public DoctorTable() {
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int id) {
        this.DoctorID = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return "Doctor{"
                + "id =" + DoctorID
                + ", First Name =" + FirstName
                + ", Last Name = " + LastName
                + '}';
    }

}
