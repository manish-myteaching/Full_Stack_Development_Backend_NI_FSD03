package class_object;

public class Customer {  // UDDT
	
	long customerId;   //Instance variable
	String customerName; //Instance variable
	String customerPhoneNo; //Instance variable
	String address; //Instance variable
	
	static String shopName; // class variable
	
	Customer(){
	}
	
	//Instantiation
	Customer(long customerId,String customerName,String customerPhoneNo,String address){
		this.customerId =customerId;
		this.customerName=customerName;
		this.customerPhoneNo=customerPhoneNo;
		this.address=address;
	}
	
	
	void getCustomerDeatil(){
		//Business Logic
		System.out.println("customer ID: " +this.customerId);
		System.out.println("customer Name: " + this.customerName);
		System.out.println("customer PhoneNo: " + this.customerPhoneNo);
		System.out.println("customer Address: " + this.address);
		System.out.println("customer Address: " + Customer.shopName);
	}
	

}
