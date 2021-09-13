/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex09;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length? ");
        int length = input.nextInt();

        System.out.print("What is the width? ");
        int width = input.nextInt();

        int area = length * width;
        int gallonsNeeded = area / 350;

        if(area%350>0){
            gallonsNeeded = gallonsNeeded + 1;
        }
        System.out.print("You will need to purchase " + gallonsNeeded + " gallons of paint to cover "+area+" square feet.");

    }
}
