package com.bridgelabz;

import java.util.Scanner;
public class HospitalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        boolean doExit = false;
        while (!doExit){
            System.out.println("HospitalList:" +Hospital.hospitalMap.keySet());
            System.out.println("Select option: \n1.create new hospital \n2.add patient \n3.Edit patient \n4.Show patient by city \n5.Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> {

                    System.out.println("Enter hospital name");
                    hospital = Hospital.createNewHospital(sc.next());
                }
                case 2 -> hospital.addPatient();
                case 3 -> hospital.editPatient();
                case 4 -> hospital.showPatientByCity();
                case 5 -> doExit = true;
                default -> System.out.println("select valid option");
            }
        }

    }
}
