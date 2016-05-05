import java.util.Random;
import java.util.ArrayList;
import java.util.*;
public class holoporter{
  
  public static String[][][] soRandom(){
    Random number = new Random();
    int oneD = number.nextInt(10)+1;
    int twoD = number.nextInt(10)+1;
    int threeD = number.nextInt(10)+1;
    String[][][] array = new String[oneD][twoD][threeD];;

    for(int i=0; i<array.length;i++){
 
      for(int j=0; j<array[0].length; j++){

        for(int z=0; z<array[0][0].length; z++){
          array[i][j][z] = coder();
        }
      }
    }
    
    return array;
  }
  
  public static String coder(){

    Random r = new Random();
    char c1 = (char) (r.nextInt(26) + 'a');
    char c2 = (char) (r.nextInt(26) + 'a');
    
    int one = r.nextInt(10);
    int two = r.nextInt(10);
    int three = r.nextInt(10);
    int four = r.nextInt(10);
    
    String coder =""+ c1 + c2 + one + two + three + four;
    
    return coder;
  }
  
  
   public static void print(String[][][] array){
    String result = "";
    
    for(int i=0; i<array.length;i++){
      for(int j=0; j<array[0].length; j++){
        result += "[";
        for(int z=0; z<array[0][0].length; z++){
          if (z < array[0][0].length-1) {
                    result += array[i][j][z]+",";
                } else {
                    result += array[i][j][z]+"]";
                }
        }
        if(j< array.length-1){
        result += "|";
        }
      }
      if(i < array.length-1){
        result += "---";
      }
    }
    
    System.out.println(result);
  }
  
  public static void sampling(String[][][] array, String code){
    for(int i=0; i<array.length;i++){
 
      for(int j=0; j<array[0].length; j++){

        for(int z=0; z<array[0][0].length; z++){
          if(array[i][j][z].equals(code)){
            System.out.println("("+i+","+j+","+z+")");
            return;
          }
           
        }
      }
    }
    System.out.println("Code not found");
  }
  
  public static void percentage(String[][][] original, String[][][] holoported){
    int number1 = original.length*original[0].length*original[0][0].length;
    int number2 = holoported.length*holoported[0].length*holoported[0][0].length;
    
    double percentage = (double)(number2-number1)/number1 * 100;
    System.out.println(percentage +"%");
  }
  
  public static String[][][] holoport(String[][][] original, String[][][] container){
    ArrayList temp = new ArrayList<String>();
    int counter = 0;
    
    for(int i=0; i<original.length;i++){
 
      for(int j=0; j<original[0].length; j++){

        for(int z=0; z<original[0][0].length; z++){
          temp.add(original[i][j][z]);
        }
      }
    }
    
     for(int m=0; m<container.length;m++){
 
      for(int n=0; n<container[0].length; n++){

        for(int k=0; k<container[0][0].length; k++){
          if(counter < temp.size()){
            container[m][n][k] = (String) temp.get(counter);
          } else{
            container[m][n][k] = "$$$$$$";
          }
          counter++;
        }
      }
    }
    return container;
  }
  
  public static String[][][] frankenstein(String[][][] array){
    ArrayList temp = new ArrayList<String>();
    
    for(int i=0; i<array.length;i++){
 
      for(int j=0; j<array[0].length; j++){

        for(int z=0; z<array[0][0].length; z++){
          temp.add(array[i][j][z]);
        }
      }
    }
    Collections.sort(temp);
    
    int counter = 0;
    
    for(int m=0; m<array.length;m++){
 
      for(int n=0; n<array[0].length; n++){

        for(int k=0; k<array[0][0].length; k++){
          array[m][n][k] = (String)temp.get(counter);
          counter++;
        }
      }
    }
    return array;
  }
    
  

  
  public static void main(String[] args){
        
    String[][][] b = soRandom();
    print(b);
    String[][][] container = holoport(b, new String[4][7][7]);
    print(container);
   
    percentage(b, container);
    sampling(container, "cq2279");
    
    print(frankenstein(container));

  }
}