
public class IntroToMethods {
	public static void weRock() {
		System.out.println("The League rocks");
	}
	
	public static void rocker(String name) {
		System.out.println(name + " rocks");
	}
	
	public static void truth(String name) {
		if (name.equals("John Lennon")) {
			System.out.println(name + " is awesome");
		} else {
			System.out.println(name + " is annoying");
		}
	}
	
	public static void echo(String word) {
		System.out.println(word + " " + word);
	}
	
	public static void repeat(String word, int repeats) {
		String repeated = "";
		
		for (int i = 0; i < repeats; i++) {
			repeated += word + " ";
		}
		System.out.println(repeated);
	}
	
	public static String getTheBestCoder() {
		return "Dave";
	}
	
	public static int add(int first, int second) {
		return first + second;
	}
	
	public boolean isOdd(int number) {
		return number % 2 == 1;
	}
	
	public static void main(String[] args) {
		weRock(); //prints "The League rocks"
		rocker("Bob"); //prints "Bob rocks"
		truth("John Lennon"); //prints "John Lennon is awesome"
		truth("Justin Bieber"); //prints "Justin Bieber is annoying"
		echo("hello"); //prints "hello hello"
		repeat("mayday", 4); //prints "mayday mayday mayday mayday"
		String theBest = getTheBestCoder();
		System.out.println(theBest); // prints Dave
		int sum = add(2,2);
		System.out.println(sum); //prints 4
	}
}
