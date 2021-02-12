//add Number.java code from lab 4

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number{

//private instance variable (must be an Integer)
private Integer num;

//constructor
public Number(){
  num = 0;
}

public Number(int n){
  num = n;
}

//getter method
public Integer getNum(){
  return num;
}

//setter method
public void setNum(int n){
  num = n;
}

//isOdd method
public boolean isOdd(){

  //if the modulus of given number divided by 2 has a remainder of 1
  if(num % 2 == 1){
	  //return true
	  return true;
	}

//return false
return false;

}

//isPerfect method
public boolean isPerfect(){

  //create integer called divSum set at 0
  int divSum = 0;
  //for loop with int x, less than number, adding one per iteration
  for(int x = 1; x < num; x++){

	  //if the number divided by x has no remainder
	  if(num % x == 0){
		//add x to divSum
		divSum = divSum + x;
	}

}
  //if divSum is equal to the number
  if(divSum == num){
	//return true
	return true;
}

  //else
  else
	  //return false
	  return false;

}


//toString
public String toString(){
  String output = "Nums: " + num;
  return output;
}

}