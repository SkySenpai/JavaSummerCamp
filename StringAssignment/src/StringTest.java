//HIT CTRL+A to select all
//Then CTRL+C to copy
// StringTest
// Functions for Manipulating Strings
// Complete Function Stubs
// Test in function in main

public class StringTest {
    
    // 1.
    public static String writeFirstLast(String name) {
        String fullName = "";
        //TODO: Complete function code
       int n = (name.indexOf(","));
        fullName = fullName +(name.substring(n + 1 , name.length())) + " " + (name.substring(0,n));
        return fullName;
    }
    
    // 2.
    public static String reverse(String str) {
        String out = "";
        //TODO: Complete function code
        
        for (int L = 0;  L < str.length(); L++ ) {
        	out = out +  (str.charAt(str.length()- 1 - L));
//        	System.out.println(str.charAt(str.length()));
//        	System.out.println(out);
        }
       
        return out;
    }
    
    private static int charAt(int length) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 3.
    public static boolean isPalindrome(String str) {
        boolean palindrome = true;
        int length = str.length();
        String word = "";
        	for(int letter = 0;letter<length;letter++) {
        	word = word + (str.charAt(letter) +1 -length);
        		}
        	if (word == str)
        		palindrome = false;
        	if (word!=str) palindrome = true;
			return palindrome;  	
        	} 
			
       
  
    // 4.
    public static String removeDashes(String ssn) {
        String out = "";
        int dash = ssn.indexOf("-");
        out = out + (ssn.substring(0,dash)+ ssn.substring(4,6) + ssn.substring(7,11));
        //TODO: Complete function code
        
        return out;
    }
    
    // 5a and 5b.
    public static String changeDateFormat(String dateStr) {
    	 String out ="";
         
         if(dateStr.length() == 8) {
         
         String months3 = dateStr.substring(0,2); // 9-
         String days3 = dateStr.substring(2,4);   // 1-
         String years3 = dateStr.substring(4,8);  // 2002
         
         	
         out = out + (days3 + months3 + years3);
         }
         
         
         if(dateStr.length() == 9) {
         	
         String months2 = dateStr.substring(0,2); //9 0 
         String days2 = dateStr.substring(2,5);   //-10- 1,2,3,4
         String years2 = dateStr.substring(5,9);  //2002  5,6,7,8
         
         	
         out = out + (days2 + months2+ years2);
         }
         
        
        
        if (dateStr.length() == 10) {
        
        String months = dateStr.substring(0,2);
        String days = dateStr.substring(3,6);
        String years = dateStr.substring(5,10);
        
        out = out + (days + months + years);
        }         	
        	return out;
        }   
    // 6a.
    public static String lastFour(String ccNumber) {
        String out = "";
        out = out  +(ccNumber.substring(15,19) );
        //TODO: Complete function code
        
        return out;
    }
    
    // 6b.
    public static String lastFive(String ccNumber) {
        String out = "";
        out = out  +(ccNumber.substring(13,19) );
        //TODO: Complete function code
        
        return out;
    }
    
    // 7.
    public static String scroll(String str) {
        String out = "";
        char one = str.charAt(0);
        out = out +(str.substring(1,9) + one);
        //TODO: Complete function code
        
        return out;
    }
    
    // 8.
    public static String removeComments(String str) {
        String out = "";
        int fSlash = str.indexOf("/*");
        int fSlash2 = str.indexOf("*/");
        String c = str.substring(0,12);
       // String a = str.substring(0,fSlash);
        //String b = str.substring(fSlash + 1, fSlash2);
        String d = str.substring (fSlash ,fSlash2);
        if(str.indexOf(c) == str.indexOf(d)) {
        	out = out +(d);	
        
        } else {
        	out = out + (str);
        
        
        	
        }
        return out;
    }
    // 9.
    public static String removeTag(String html) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 10.
    public boolean isValidISBN(String isbn) {
        boolean valid = true;
        //TODO: Complete function code
        
        return valid;
    }
    
    

    public static void main(String[] args) {
        // Test your functions here
        // For example
        // 1.
        System.out.println("Testing Number 1");
        String name = "Twain, Mark";
        System.out.println(writeFirstLast(name));
        System.out.println("Testing reverse String"); //works //1
      	System.out.println(reverse("John Wick"));    //works  //2
      	System.out.println(isPalindrome("racecar")); //does'nt work //3
      	System.out.println(removeDashes("674-45-7896")); // works  //4
      	System.out.println(changeDateFormat("09-10-2002")); //works //5.a 5.b
      	System.out.println(lastFour("4111 1111 1111 1111")); //works // 6.a 
      	System.out.println(lastFive("4111 1111 1111 1111")); //works //6.b
      	System.out.println(scroll("John Wick")); //works  //7
      	System.out.println(removeComments("/*JohnWick*/")); //8  //does'nt work but i am close
      	System.out.println(removeTag("<b> dogs <b>"));
    }

}
