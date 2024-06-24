package block;

public class BlockDemo extends Test {

	BlockDemo() {
		super();
		System.out.println("BlockDemo - Constructor");
	}

	{
		System.out.println("Block-1");
	}

	static {
		System.out.println("Static Block-2");
	}

	public static void main(String[] args) {
		new BlockDemo();
	}

}
