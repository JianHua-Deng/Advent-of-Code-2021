import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AoC_Day1 {

  public static void main(String[] args){
    
  Aoc_Part1(list);
  Aoc_Part2(list);

  ArrayList<Integer> list = new ArrayList<Integer>();
  //Plugging the data to the arraylist
  try{
      File inputTxt = new File("input.txt");

      Scanner readInputs = new Scanner(inputTxt);

      while(readInputs.hasNextInt()){

        list.add(readInputs.nextInt());

      }//end while method

    } catch (FileNotFoundException e){

      System.out.println("File not found");

    }//end catch 

    //printing out the results
    System.out.println(Aoc_Part1(list));
    System.out.println(Aoc_Part2(list));

  }//end main method

  public static int Aoc_Part1(ArrayList<Integer> list){
    int count = 0;
    int increments = 0;

      int old = list.get(increments);
      
      while(increments < list.size()){

      int current = list.get(increments);

      if(old < current){

        count++;
       
      }//end if statement
    
      old = current;
      increments++;
      
    }//end while loop of checking if input still exist in next line

  return count;
    
  }//end Aoc_Part1 method



  public static int Aoc_Part2(ArrayList<Integer> list){

    int count = 0;
    int oldSum = 0;
    int sum = 0;
    //setting oldSum equal to the sum starting from the index of 0
    oldSum = list.get(0) + list.get(1) + list.get(2);
    for(int i = 0; i < list.size(); i++){
      if(i + 2 < list.size()){
      sum = list.get(i) + list.get(i + 1) + list.get(i + 2);
      if(sum > oldSum){
        count++;
      }//end if statement
      oldSum = sum;
      }
    }//end for loop
    return count;
  }//end Aoc_Part2 method 

}//end class
