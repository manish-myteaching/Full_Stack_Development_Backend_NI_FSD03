package iterativewhileloop;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
	 int a=5,b=0; 
	 
	 while(++a<=10) {
		 b*=a;   //b=b*a;
		 System.out.println(a+ "\t" +b);
	 }
	}

}
