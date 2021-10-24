// Program Header
// Saunders, John
// CISP 401
// 10/24/21



package com.company;

import java.util.*;

import com.company.controllers.studentList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.println("Random Grade Generator Homework \n");

        String[] nameList = new String[10];
        int grades = 0;
//          String[] nameList = studentList.names;

//        for (int i = 0; i <10; i++){
//            nameList[i] = studentList.names[i];
//            System.out.println("Name " + nameList[i] + " \n");
//        }

//        nameList[10] = String.valueOf(new String[]{"michael", "jim", "pamela", "oscar", "kevin", "dwight",
//                "angela", "ryan", "andy", "stanley"});
            nameList[0] = "michael";
            nameList[1] = "jim";
            nameList[2] = "pamela";
            nameList[3] = "oscar";
            nameList[4] = "kevin";
            nameList[5] = "dwight";
            nameList[6] = "angela";
            nameList[7] = "ryan";
            nameList[8] = "andy";
            nameList[9] = "stanley";

        for (int i = 0; i < 10; i++)
        {

            Random rand = new Random();
            int grade = rand.nextInt(101);

            System.out.println("Name: " + nameList[i] + " ");
            System.out.println("Score: " + grade + " ");

            if (grade >= 90) {
                System.out.println("Grade: A \n");
            }
            if (grade >= 80 && grade <= 89) {
                System.out.println("Grade: B \n");
            }
            if (grade >= 70 && grade <= 79) {
                System.out.println("Grade: C \n");
            }
            if (grade >= 60 && grade <= 69) {
                System.out.println("Grade: D \n");
            }
            if (grade <= 59) {
                System.out.println("Grade: F \n");
            }
        }



            int A = 90;
            int B = 80;
            int C = 70;
            int D = 60;
            int F = 59;

            Random rand = new Random();
            int grade = rand.nextInt(101);
//            System.out.println("Number: " + grade + " \n");
//
//            if (grade >= 90) {
//                System.out.println("Grade: A \n");
//            }
//            if (grade >= 80 && grade <= 89) {
//                System.out.println("Grade: B \n");
//            }
//            if (grade >= 70 && grade <= 79) {
//                System.out.println("Grade: C \n");
//            }
//            if (grade >= 60 && grade <= 69) {
//                System.out.println("Grade: D \n");
//            }
//            if (grade <= 59) {
//                System.out.println("Grade: F \n");
//            }





    }
}
