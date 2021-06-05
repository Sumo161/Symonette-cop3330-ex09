package ex09;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Scanner;
import java.lang.*;

public class App {
    public static void main(String [] args){

        //taking length and breadth of ceiling as input
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the ceiling ");


        // concat; calculations
        float length = st.nextFloat();
        float breadth = st.nextFloat();
        float area = length * breadth;

        double result = Math.ceil(area / 350 );
        System.out.println("You will need to purchase ");

    }
}
