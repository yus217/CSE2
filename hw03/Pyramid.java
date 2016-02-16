//Yuecheng Shi
//hw03
//Pyramid Program

import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("The square side of the pyramid is (input length): ");
        double squareSide = myScanner.nextDouble();
        System.out.print("The height of the pyramid is (input height): ");
        double pyramidHeight =  myScanner.nextDouble();
        
        double pyramidVolume;
        pyramidVolume = (squareSide*squareSide) * pyramidHeight / 3;
        int pyramidvolume =(int)pyramidVolume;
        System.out.println("The volume inside the pyramid is: " + pyramidvolume );
        
    }
}


