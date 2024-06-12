package final_abstract;

strictfp class StrifpDemo {
    //IEEE 754 
	public static void main(String[] args) {
		float a=10.0f;
		double b=3.0;
		float c=(float)(a/b);
		//Output will be same for all machine
        System.out.println(c);
	}

}
