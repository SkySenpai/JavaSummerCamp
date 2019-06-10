String example = "The first example";

println(example.length());

//Give a letter, find out where in the word it is.

println( example.charAt(8) );

//given a string find out where it exists in a another string

//Background
//example.indexOf("first");
//definition indexOf(string str)
//String str = "first";
println(example.indexOf("first"));

//oracle
//JavaAPI

//first parameter is inclusive
//second parameter is exclusive

String myCar = "ford";
println(myCar.substring(1,2));
println(example.substring(4,9));
println(example.substring(10,13));

println(example.compareTo(myCar));
println(myCar.compareTo(example));

String theirCar = "Chev";
println(theirCar.compareTo(myCar));
println(example.equals(myCar));
println( myCar.equals(theirCar) );

String myCarAgain = "Ford";
println (myCar.equals(myCarAgain) );

String knockOff = "drof";
println( myCar.equals(knockOff) );

String myNewString = "\"";
println(myNewString); 
String backslash = "\\\"\\";

println("\n");

String withANewLine = "Duke \nDukem";
println(withANewLine);





//loops allow you to repeat
//needs two things 1) repetitive steps, 2) know when to stop
