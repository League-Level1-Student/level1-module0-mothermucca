
public class Methods2 {
	public static void main(String[] args) {
		System.out.println(whichPresent("Bob"));
		System.out.println(doPigsEat("bananas"));
		System.out.println(getMyLuckyNumber());
		System.out.println(eggsMomWants() + eggsDadWants() + eggsBabyWants());
		System.out.println(getAverageHeight(15));
	}
	
	static String whichPresent(String friendName) {

	   return friendName + " wants a laptop.";

	}
	
	static boolean doPigsEat(String food) {
		if(food.equals("roots")) {
			return true;
			//more code here
		}
		else {
			return false;
		}
	}
	
	static int getMyLuckyNumber() {
		return 6;
	}

	static int eggsMomWants() {
		return 6;
	}
	
	static int eggsDadWants() {
		return 5;
	}

	static int eggsBabyWants() {
		return 1;
	}
	
	static int getAverageHeight(int age) {
		if (age > 100) {
			return 34;
		} 

		if (age > 50) {
			return 30;
		}

		if (age < 10) {
			return 20;
		}
		return 0;
	}

}
