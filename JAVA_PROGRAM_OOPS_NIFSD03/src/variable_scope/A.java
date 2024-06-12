package variable_scope;

public class A {

   public int i = 10; //Instance
	public String city="Pune";  //Instance // Reference 
	public int a[]= new int[] {10,20};  //Instance //Reference
	
    public  static int j=20; // class variable
	
	public void show() {
		System.out.println(this.i);
		System.out.println(A.j);
	}

}
