//Yuecheng Shi
//hw04
//ToHex Program

import java.util.Scanner;


public class ToHex{
    
   public static void main(String[] args) {
    Scanner input = new Scanner( System.in );
     System.out.print("Please enter three numbers representing RGB values: ");
     
     
     String hex1 ="";
     int number1 = 0;
int number2 = 0;
int number3 = 0;


if(!input.hasNextInt()){
  System.out.println("Sorry, your input must consist of integers");	
}
else{
  number1 = input.nextInt();
}


if(!input.hasNextInt()){
  System.out.println("Sorry, your input must consist of integers");	
}
else{
  number2 = input.nextInt();
}
if(!input.hasNextInt()){
  System.out.println("Sorry, your input must consist of integers");	
}
else{
  number3 = input.nextInt();
}
     


      if (number1 <=255 && number1 >=0){
       
       int value1=(int) (number1/16);
       
     switch (value1){
      
      case 0:
      hex1=hex1+'0';
      break;
      
      case 1:
      hex1=hex1+'1';
      break;
      
      case 2:
      hex1=hex1+'2';
      break;
      
      case 3:
      hex1=hex1+'3';
      break;
      
      case 4:
      hex1=hex1+'4';
      break;
      
      case 5:
      hex1=hex1+'5';
      break;
      
      case 6:
      hex1=hex1+'6';
      break;
      
      case 7:
      hex1=hex1+'7';
      break;
      
      case 8:
      hex1=hex1+'8';
      break;
      
      case 9:
      hex1=hex1+'9';
      break;


     }
     
     int value2=(int) (number1%16);
     switch (value2){
      case 10:
      hex1=hex1+'A';
      break;
      
      case 11:
      hex1=hex1+'B';
      break;
      
      case 12:
      hex1=hex1+'C';
      break;
      
      case 13:
      hex1=hex1+'D';
      break;
      
      case 14:
      hex1=hex1+'E';
      break;
      
      case 15:
      hex1=hex1+'F';
      break;
     }
       
       
      }
     else{
        System.out.println("Sorry, you must enter values between 0-255,please enter again");
        number1 = input.nextInt();
     }


     
     


      if (number2 <=255 && number2 >=0){
       
       int value3=(int) (number2/16);
     switch (value3){
      
      case 0:
      hex1=hex1+'0';
      break;
      
      case 1:
      hex1=hex1+'1';
      break;
      
      case 2:
      hex1=hex1+'2';
      break;
      
      case 3:
      hex1=hex1+'3';
      break;
      
      case 4:
      hex1=hex1+'4';
      break;
      
      case 5:
      hex1=hex1+'5';
      break;
      
      case 6:
      hex1=hex1+'6';
      break;
      
      case 7:
      hex1=hex1+'7';
      break;
      
      case 8:
      hex1=hex1+'8';
      break;
      
      case 9:
      hex1=hex1+'9';
      break;


     }
     
     
     int value4=(int) (number2%16);
     switch (value4){
      case 10:
      hex1=hex1+'A';
      break;
      
      case 11:
      hex1=hex1+'B';
      break;
      
      case 12:
      hex1=hex1+'C';
      break;
      
      case 13:
      hex1=hex1+'D';
      break;
      
      case 14:
      hex1=hex1+'E';
      break;
      
      case 15:
      hex1=hex1+'F';
      break;
     }
     
       
       
      }
     else{
        System.out.println("Sorry, you must enter values between 0-255");
     }


     
     
     
     
     
    
      if (number3 <=255 && number3 >=0){
       
       int value5=(int) (number3/16);
     switch (value5){
      
      case 0:
      hex1=hex1+'0';
      break;
      
      case 1:
      hex1=hex1+'1';
      break;
      
      case 2:
      hex1=hex1+'2';
      break;
      
      case 3:
      hex1=hex1+'3';
      break;
      
      case 4:
      hex1=hex1+'4';
      break;
      
      case 5:
      hex1=hex1+'5';
      break;
      
      case 6:
      hex1=hex1+'6';
      break;
      
      case 7:
      hex1=hex1+'7';
      break;
      
      case 8:
      hex1=hex1+'8';
      break;
      
      case 9:
      hex1=hex1+'9';
      break;
      
     }
     int value6=(int) (number3%16);
     switch (value6){
      case 10:
      hex1=hex1+'A';
      break;
      
      case 11:
      hex1=hex1+'B';
      break;
      
      case 12:
      hex1=hex1+'C';
      break;
      
      case 13:
      hex1=hex1+'D';
      break;
      
      case 14:
      hex1=hex1+'E';
      break;
      
      case 15:
      hex1=hex1+'F';
      break;
     }
       
      }
     else{
        System.out.println("Sorry, you must enter values between 0-255");
     }
   
     
   
     System.out.println("The decimal numbers R:" + number1 + ", G:" + number2 + " ,B:" + number3 + " is represented in hexadecimal as "  + hex1); 
   }
}
     