package com.bridgelabz;

import java.util.Scanner;

public class Patient {
    String patientName;
    int patientAge;
    String patientCity;
    String patientState;
    String patientPhoneNumber;
    PatientDepartment patientDepartment;

    Scanner sc = new Scanner(System.in);

    public String getPatientName() {
        return patientName;
    }

    public enum PatientDepartment {
        ONCOLOGY, NEUROLOGY, CARDIOLOGY, GYNOCOLOGY
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public void selectPatientDepartment() {
        System.out.println("Select Department: \n1.ONCOLOGY \n2.NEUROLOGY \n3.CARDIOLOGY \n4.GYNOCOLOGY");
        int option = sc.nextInt();
        if (option == 1) {
            this.patientDepartment = PatientDepartment.ONCOLOGY;
        } else if (option == 2) {
            this.patientDepartment = PatientDepartment.NEUROLOGY;
        } else if (option == 3) {
            this.patientDepartment = PatientDepartment.CARDIOLOGY;
        } else if (option == 4) {
            this.patientDepartment = PatientDepartment.GYNOCOLOGY;
        }else{
            System.out.println("select valid option");
            selectPatientDepartment();
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientCity='" + patientCity + '\'' +
                ", patientState='" + patientState + '\'' +
                ", patientPhoneNumber=" + patientPhoneNumber +
                ", patientDepartment=" + patientDepartment +
                '}';
    }
}
