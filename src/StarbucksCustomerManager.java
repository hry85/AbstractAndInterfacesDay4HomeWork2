
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)){
            System.out.println("a valid person.");
            super.Save(customer);
        }else {
            System.out.println("Not a valid person.");
        }
    }

}
