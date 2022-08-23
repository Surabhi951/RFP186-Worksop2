package com.bridgelabz;

import java.util.Scanner;

public class HospitalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hospital name");
        Hospital hospital = Hospital.createNewHospital(sc.next());

        boolean doExit = false;
        while (!doExit){
            System.out.println("*******\n HospitalList:" +Hospital.hospitalMap.keySet());
            System.out.println();
        }

    }
}
