/***Conditional Statements***/
/*
Given an integer, n, perform the following actions:
- If n is odd, print "Weird"
- If n is even and in the inclusive range 2 to 5,
  print "Not Weird"
- If n is even and in the inclusive range 6 to 20,
  print "Weird"
- If n is even and greater than 20, print "Not Weird"

Assume n will be between 1 and 100.
Complete the function below.
*/

String weirdOrNot(int n) {
  String answer;
  //Start Your Code Here
 if( n%2 == 1) answer = "Weird";
  else if(n<=5 && n>=2) answer = "Not Weird";
  else if (n>=6 && n<=20) answer = "Weird";
  else answer = "Not Weird";
  
  //End Your Code Here
  return answer;
}
