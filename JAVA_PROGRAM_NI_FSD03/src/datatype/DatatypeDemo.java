package datatype;

public class DatatypeDemo {

	public static void main(String[] args) {	
		//Primitive
		byte b=100;    //-128 to 127
		short s=32767;  // -32768 to 32767
		int i=60; //-2,147,483,648 to -2,147,483,648
		long l=100000000; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		float f=10.6888f;
		double d=2000.7;
		
		char c='A';
		
		boolean bb = true;
		
		//Non-primitive(Rererance)
		String newgen="Newgen";
		String a[]= {"ABC","XYZ"};
		int aa[]= {10,20};	
		RefDT rd= new RefDT();
			
		
		System.out.println("BYTE: "+b);
		System.out.println("SHORT: "+s);
		System.out.println("INTEGER: "+i);
		System.out.println("LONG : "+l);
		
		System.out.println("FLOAT: "+f);
		System.out.println("DOUBLE: "+d);
		
		System.out.println("CHAR : "+c);
		
		System.out.println("BOOLEAN : "+bb);
		
	}

}
