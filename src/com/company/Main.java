package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double curentView = 0;
        double nextView = 0;
        double finalView = 0;
        double maxView = 0;
        double slope = 0;
        double newHigh = 0;

        //the scanner
        Scanner timeReader = new Scanner(System.in);

        //list
        ArrayList<Double> mountainHeight = new ArrayList<Double>();

        //text for the user
        System.out.println(" Enter the height of the mountains \n enter 'Done' when finished");

        //loop to see the weights
        while (timeReader.hasNextDouble()) {
            double x = timeReader.nextDouble();
            mountainHeight.add(x);
        }

        int i =0;
        int j =1;
        int k =2;

        curentView = mountainHeight.get(i);
        nextView = mountainHeight.get(j);
        finalView = mountainHeight.get(k);


        slope = (nextView - curentView) / (j - i);

        newHigh = slope * (k - i) + curentView;

        if (newHigh <= finalView) {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }






        /*
        for (int i = 0; i < mountainHeight.get(0); i++){
            curentView = 0;
            for (int j = 1; j < mountainHeight.size(); j++){

            }
            if (curentView < maxView){
                curentView = maxView;
            }
        }

         */

    }
}
