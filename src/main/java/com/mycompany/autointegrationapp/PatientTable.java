/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.autointegrationapp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class PatientTable {

    @DatabaseField(generatedId = true)
    private int PatientID;
    @DatabaseField
    private String FirstName;
    @DatabaseField
    private String LastName;
    @DatabaseField
    private int NumOfExaminations;

    public PatientTable() {
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int id) {
        this.PatientID = id;
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

    public int getNumOfExaminations() {
        return NumOfExaminations;
    }

    public void setNumOfExaminations(int NumOfExaminations) {
        this.NumOfExaminations = NumOfExaminations;
    }

    @Override
    public String toString() {
        return "Patient{"
                + "id =" + PatientID
                + ", First Name =" + FirstName
                + ", Last Name =" + LastName
                + ", Number of Examinations =" + NumOfExaminations
                + '}';
    }
}
