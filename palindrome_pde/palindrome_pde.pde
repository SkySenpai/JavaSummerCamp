Boolean palindrome = false;
String word = "racecar";      //first word
String word2 = "";            //word but its gonna  be spelled backwards
int a = word.length();        // a is a number and we set that number to the length of of the word
for ( int letter = 0;letter < a; letter++ ) {    //we create the variable letter and set it to 0, the letter is less than the word length, so we add the letter plus another letter
  word2 = word2 + word.charAt( a - 1 - letter);  // we set nothing equal to nothing and add it to the charachter at wordlength minus 1 - the value of the letter
  
}
println (word.equals(word2));  // we now print the the origional word and see if it equals the new word
                               // since its a boolean statement, it will print true if the old word equals the new world or false if they dont.
