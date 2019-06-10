void checker(String word) {   //this whole function is named checker.
String word2 = "";            
int a = word.length();        
  for (int letter = 0;letter < a; letter++)  {   
  word2 = word2 + word.charAt( a - 1 - letter);  
  }
   println (word.equals(word2));
}


void setup() {
  checker("racecar");            //i call down checker and input any word i want and it then runs throught the function.
  

}
//example of function             
