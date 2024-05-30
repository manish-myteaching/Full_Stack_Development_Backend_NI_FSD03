package nestedifelse;

public class NestedIfelseDemo {

	public static void main(String[] args) {
     int a=5,b=6;
     
     if(a++>4) {  //5>4
			if (b > a++) {  //6>6
				System.out.println(a);
			} else {
				System.out.println(a);
				System.out.println(b);
    	  }
     }
	}

}
