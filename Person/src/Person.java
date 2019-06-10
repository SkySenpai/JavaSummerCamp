
public class Person {
	
	
	//fields aka instance variables
	//think:adjectives
	public String name;
	private int age;
	private int height; //height in inches
	private double weight; //lbs
	private String nationality;
	private String birthday;
	
	//Default constructor
	Person() {
		name ="";
		age = 0;
		height = 0;
		weight = 0;
		nationality = "";
		birthday = "";
	}
	//overloaded constructor
	Person(String name,int age, int height, double weight, String nationality, String birthday) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.nationality = nationality;
		this.birthday = birthday;
	}
	
	//Getters and Setters
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	
	// methods or functions
	// think: verbs
	
	String speak() {
		return "Hello,Bruh, my name is " + this.name;
	}
	String speak(String phrase) {
		return "Hello, " + phrase + "my name is " + name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person firstPerson = new Person();
		Person secondPerson = new Person("Neal" , 15, 72, 110, "Indian","12/5/2003" );
		System.out.println(firstPerson.getAge());
		System.out.println(secondPerson.getAge());
		System.out.println(secondPerson.speak());
		System.out.println(secondPerson.speak("how you doing, ")); 

	}
}
