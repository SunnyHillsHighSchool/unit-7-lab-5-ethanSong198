//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
    public NumberAnalyzer(int[]n){
      list = new ArrayList<Number>();
      for(int a: n){
        list.add(new Number(a));
      }
        
    }

	//write count odds
  public int countOdds(){

    //create output set at 0
    int output = 0;

    //for int x list
    for(Number x: list){

      //if isOdd is true
      if(x.isOdd() == true){
        //add one to output
        output++;
      }
    }

    //return output 
    return output;
  }

	//write count evens
  public int countEvens(){

    //create output set at 0
    int output = 0;

    //for int x list
    for(Number x: list){

      //if isOdd is false
      if(x.isOdd() == false){
        //add one to output
        output++;
      }
    }

    //return output 
    return output;
  }

	//write count perfects
    public int countPerfects(){

    //create output set at 0
    int output = 0;

    //for int x list
    for(Number x: list){
      //if is perfect is true
      if(x.isPerfect() == true){
        //add to output
        output++;
      }

    }

    //return output 
    return output;
  }
	
	//write a toString
  public String toString(){
    String output = "" + list;
    return output;
  }
  
}