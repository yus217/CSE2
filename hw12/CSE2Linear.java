import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class CSE2Linear{
  int num;
  int[] binary;
  Random random;
  int count;
  Scanner sc = new Scanner(System.in);
   
  public CSE2Linear(int[] n){
    binary = n;
    num = n.length;
  }
  
  public CSE2Linear enterData(){
    for(int i=0; i<num; i++){
      if(sc.hasNextInt()){
        binary[i] = sc.nextInt();
        if(binary[i] <1 || binary[i]>100){
          System.out.println("not in the range");
          break;
        }
        }
      else{
        System.out.println("not an integer");
        break;
      }  
    }
    return new CSE2Linear(binary);
  }
  
  
  public String search(){
    int grade = sc.nextInt();
    int  init = 0;
    int len = binary.length -1;
    count = 0;
    String result ="";
    
    while(len >= init){
      int middle = init + (len - init) /2;
      if(grade < binary[middle]){
        len = middle -1;
      }else if(grade > binary[middle]){
        init = middle + 1;
      }else{
        return result += binary[middle];
      }
      count++;
    }
    return result += grade + " was not found in the list with "+ count +" iterations";
  }
  
  public CSE2Linear Scrambled(){
    random = new Random();
    int rand;
    for(int i=0;i<num;i++){
      rand = random.nextInt(num);
      int temp = binary[i];
      binary[i] = binary[rand];
      binary[rand] = temp;
    }
    return new CSE2Linear(binary);
  }
  
  public void tostring(){
    String result = "[";
    for(int i=0; i<num-1; i++){
      result += binary[i] +", ";
    }
    result += binary[num-1]+"]";
    System.out.println(result);
  }
  
  public CSE2Linear sort(){
    Arrays.sort(binary);
    return new CSE2Linear(binary);
    
  }
  
  public static void main(String[] args){
    CSE2Linear c = new CSE2Linear(new int[15]);
    c.enterData().tostring();
    System.out.println(c.search());
    c.Scrambled().tostring();
    c.sort().tostring();
    System.out.println(c.search());
  }
}