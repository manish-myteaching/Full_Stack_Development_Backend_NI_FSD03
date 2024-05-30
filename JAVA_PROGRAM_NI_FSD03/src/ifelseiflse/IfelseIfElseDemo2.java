package ifelseiflse;

public class IfelseIfElseDemo2 {

	public static void main(String[] args) {
		int a=5;
		 
		if(a++>6) {          //5>6
			System.out.println(a);
		}else if(a++>6) {   //6>6
			System.out.println(a);
		}else {
			System.out.println(a);
		}

	}

}
