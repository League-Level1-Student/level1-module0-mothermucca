import javax.swing.JFrame;


public class Methods3 {
    void eat (String food) {
    	System.out.println("eat " + food);
    }

    double getDinnerTime(){
    	return 6.0;
    }

    String getFavoriteFood(String personsName){
    	System.out.println("returning favorite food for " + personsName);
    	return "pizza";
    }

    void chomp(){
    	System.out.println("chomp");
    }

    boolean isTasty(){
    	return true;
    }
    
    JFrame getWindow() {
    	System.out.println("getWindow");
    	return null;
    }
    
    private int getNumberOfPizzaSlicesLeft() {
		System.out.println("getNumberOfPizzaSlicesLeft");
		return 0;
	}

	private String getFavoriteVegetable(String person) {
		System.out.println("getFavoriteVegetable " + person);
		return null;
	}
	
	private void peel(String string) {
		System.out.println("peel");
		
	}
	
	private boolean isHealthy(String string) {
		System.out.println("isHealthy " + string);
		return false;
	}
	
	private void simmer(String dish) {
		System.out.println("simmer " + dish);
	}
	
    void callStuff() {
        JFrame window = getWindow();
        int slices = getNumberOfPizzaSlicesLeft();
        String faveVeggie = getFavoriteVegetable("Mom");
        peel("potato");
        boolean healthyOrNot = isHealthy("avocado");
        simmer("soup");     	
    }
    








	public static void main(String[] args) {
    	Methods3 methods = new Methods3();
		methods.eat("pizza");
		System.out.println("dinner time is " + methods.getDinnerTime());
		System.out.println("favorite food is " + methods.getFavoriteFood("Bob"));
		methods.chomp();
		System.out.println("isTasty " + methods.isTasty());
		
		methods.callStuff();

	}
}
