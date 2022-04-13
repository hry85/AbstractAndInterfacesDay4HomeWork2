
public class Customer implements Entity {
	
	 public int Id;
	    public String FirstName;
	    public String LastName;
	    public int DateOfBirth;
	    public String NationalityId;

	    public Customer(){

	    }

	    public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
	        super();
	       this.Id = id;
	        this.FirstName = firstName;
	        this.LastName = lastName;
	        this.DateOfBirth = dateOfBirth;
	        this.NationalityId = nationalityId;
	    }

	    public int getId() {
	        return Id;
	    }

	    public void setId(int id) {
	        Id = id;
	    }

	    public String getFirstName() {
	        return FirstName;
	    }

	    public void setFirstName(String firstName) {
	        FirstName = firstName;
	    }

	    public String getLastName() {
	        return LastName;
	    }

	    public void setLastName(String lastName) {
	        LastName = lastName;
	    }

	    public int getDateOfBirth() {
	        return DateOfBirth;
	    }

	    public void setDateOfBirth(int dateOfBirth) {
	        DateOfBirth = dateOfBirth;
	    }

	    public String getNationalityId() {
	        return NationalityId;
	    }

	    public void setNationalityId(String nationalityId) {
	        NationalityId = nationalityId;
	    }

}
