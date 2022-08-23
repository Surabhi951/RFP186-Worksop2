package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {

    Scanner sc = new Scanner(System.in);
    static HashMap<String,Hospital> hospitalMap = new HashMap<>();
    String hospitalName;
    ArrayList<Patient> patientList = new ArrayList<>();

    static Hospital createNewHospital(String hospitalName){
        Hospital hospital = new Hospital();
        hospitalMap.put(hospitalName,hospital);
        return hospital;
    }

    Patient createPatient(){
        Patient patient = new Patient();
        System.out.println("Enter patient name");
        patient.setPatientName(sc.next());
        System.out.println("Enter patient age");
        patient.setPatientAge(sc.nextInt());
        System.out.println("Enter patient city");
        patient.setPatientCity(sc.next());
        System.out.println("Enter patient state");
        patient.setPatientState(sc.next());
        System.out.println("Enter patient phone number");
        patient.setPatientPhoneNumber(sc.nextInt());
        patient.selectPatientDepartment();
        return patient;

    }

    void addPatient(){
        Patient patient = createPatient();
        patientList.add(patient);
        System.out.println(patient);
        System.out.println("patient added successfully");

    }
}
