package switchdemo;

public class SwitchDemo2 {

	public static void main(String[] args) {
		 int a=2;
		 switch(a) {
		 case 5%2: System.out.println(++a);
		 break;
		 case 5/2: System.out.println(++a);
		 break;
		 default: System.out.println(--a);	 
		 }

	}

}
