// convert a binary to decimal

 int biDeciConvo(String a) {
   int b = 0;
   int c = 0;
   String d ="";
   for ( int i = 0; i < a.length(); i++){
     
    d = "" + a.charAt(a.length()-1 - i);
    if( d.equals("1")==true) b = (int)pow(2,i);
    else b = 0;
    c = c+ b; 
  
   }
 return c; 
}
void setup() {
  
  
  
}
void setup() {
  String num = "1111111111";
  println(biDeciConvo(num));
  
}
