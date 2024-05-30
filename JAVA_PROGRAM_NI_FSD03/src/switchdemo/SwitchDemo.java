package switchdemo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int a=2;
		switch(a) {   
		 case 1: System.out.println(++a);
		              break;
		 case 2:  System.out.println(a++);    
		             break;
		  default: System.out.println(--a);
		}
		
	}

}
