//Yuecheng Shi
//lab04
//CardGenerator Program

public class CardGenerator{
   public static void main(String[] args) {
       //int suit = (int)(Math.random()*(upperBound+1))+baseNum;
       int suit = (int)(Math.random()*52)+1;
       //int identity = (int)(Math.random()*(upperBound+1))+baseNum;
       int identity = (int)(Math.random()*52)+1;

    if (suit<14){
           System.out.println("You picked   diamonds");
       }
       else if(suit>=14 && suit <27){
           System.out.println("You picked identity%13 clubs");
       }
       else if(suit>=27 && suit <40){
           System.out.println("You picked identity%13 hearts");
       }
        else if(suit>=40 && suit <=52){
           System.out.println("You picked identity%13 spades");
       }
   
       
       switch(identity%13){
           case 1:System.out.print("Ace");
           break;
       
           case 2:System.out.print("2");
           break; 
      
           case 3:System.out.print("3");
           break;
           
           case 4:System.out.print("4");
           break;
           
           case 5:System.out.print("5");
           break;
         
           case 6:System.out.print("6");
           break;
        
           case 7:System.out.print("7");
           break;
           
           case 8:System.out.print("8");
           break;
          
           case 9:System.out.print("9");
           break;
          
           case 10:System.out.print("10");
           break;
          
           case 11:System.out.print("Jack");
           break;
         
           case 12:System.out.print("Queen");
           break;
          
           case 13:System.out.print("King");
           break;
       }
   
   }
}