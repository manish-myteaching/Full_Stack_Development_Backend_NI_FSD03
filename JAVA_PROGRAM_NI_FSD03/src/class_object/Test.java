package class_object;

public class Test {
	
	public static void main(String[] args) {
		
		Customer.shopName="Zomato";
		
		Customer customer=	new Customer();   // Heap Area
		System.out.println("customer ID: "+ customer.customerId);
		System.out.println("customer Name: " + customer.customerName);
		System.out.println("customer PhoneNo: "  + customer.customerPhoneNo);
		
		customer.customerId=1000;
		System.out.println("customer ID: " +customer.customerId);
		customer.customerName =  "Ramesh";
		System.out.println("customer Name: " + customer.customerName);
		customer.customerPhoneNo="+91-45000-33454";
		System.out.println("customer PhoneNo: " + customer.customerPhoneNo);
		customer.address="Pune";
		System.out.println("customer Address: " + customer.address);
		System.out.println("customer Address: " + Customer.shopName);
		
		System.out.println("\t");
		
		Customer customer2=new Customer(1002,"Tom","+63-98898-8888","UK");  //Initialize + Instantiate        
		customer2.getCustomerDeatil();
		
		System.out.println("\t");
		
		
		Customer customer3=new Customer(1003,"Jeery","+63-98844-8888","US");  //Initialize + Instantiate        
		customer3.getCustomerDeatil();
		
		System.out.println("\t");
		
		Customer customer4=new Customer(1004,"Smith","+63-98444-8888","Asia");  //Initialize + Instantiate        
		customer4.getCustomerDeatil();
		
		
		
	}

}
