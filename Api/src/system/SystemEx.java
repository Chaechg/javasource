package system;

public class SystemEx {
	public static void main(String[] args) {
		System.out.println();
		//out => PrintStream
		//in => InputStream
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+"\t");
			
			if (i==5) {
				System.exit(0);
			}
		}
		
	
		
		
		
	}
}
