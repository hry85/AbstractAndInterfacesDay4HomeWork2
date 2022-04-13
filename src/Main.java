
public class Main {
	
	public static void main(String[] args) {
		
		  BaseCustomerManager customerManager = new NeroCustomerManager();
	        customerManager.Save(new Customer(1,"Huray","Erdi", 1985,"123456789"));

	}

}
