//Yuecheng Shi
//hw03
//Convert Program

import java.util.Scanner;

public class Convert{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the distance in meters: ");
         double distanceInMeters = myScanner.nextDouble();
         double convertRatio = 39.37;
         double distanceInInches;
         distanceInInches = distanceInMeters * convertRatio;
         distanceInInches = distanceInInches*10000;
         distanceInInches = (double)((int)distanceInInches);
         distanceInInches = distanceInInches/10000;
         System.out.println(+ distanceInMeters + " meters is " + distanceInInches + " inches ");
         
    }
}