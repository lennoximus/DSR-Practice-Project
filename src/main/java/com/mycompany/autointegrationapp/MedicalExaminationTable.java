/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.autointegrationapp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class MedicalExaminationTable {

    @DatabaseField(generatedId = true)
    private int MedExamID;
    @DatabaseField
    private String MedicalConclusion;
    @DatabaseField
    private long MedicalRecord;
    @DatabaseField(foreign = true)
    private int PatientID;
    @DatabaseField(foreign = true)
    private int DoctorID;

    public MedicalExaminationTable() {
    }

    public int getMedExamID() {
        return MedExamID;
    }

    public void setMedExamID(int MedExamID) {
        this.MedExamID = MedExamID;
    }

    public String getMedicalConclusion() {
        return MedicalConclusion;
    }

    public void setMedicalConclusion(String MedicalConclusion) {
        this.MedicalConclusion = MedicalConclusion;
    }

    public long getMedicalRecord() {
        return MedicalRecord;
    }

    public void setMedicalRecord(long MedicalRecord) {
        this.MedicalRecord = MedicalRecord;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int id) {
        this.DoctorID = id;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int id) {
        this.PatientID = id;
    }

    @Override
    public String toString() {
        return "MedicalExamination{"
                + "id =" + MedExamID
                + ", Patient id =" + PatientID
                + ", Doctor id =" + DoctorID
                + ", Medical Conclusion =" + MedicalConclusion
                + ", Medical Record =" + MedicalRecord
                + '}';
    }

}
