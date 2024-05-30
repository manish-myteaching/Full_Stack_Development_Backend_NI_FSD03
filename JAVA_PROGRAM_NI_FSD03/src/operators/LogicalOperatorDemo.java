package operators;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
	
		int a=8,b=7,c=5;
		
		boolean d= (a<b) && (a<c);
		System.out.println(d);
		
		
		String aadharNo="123444444443";
		if(aadharNo.length()==12  && aadharNo.startsWith("13")) {
			System.out.println("Aadhar will be valid");
		}else {
			System.out.println("Aadhar is not valid");
		}
		
		boolean aa=false;
		System.out.println(!aa);
		
		

	}

}
