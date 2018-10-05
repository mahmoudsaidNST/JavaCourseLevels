package LevelOne;

public class Variables {

	public static void main(String[] args) {
		
		int intVar = 5; // 32 bit 
		double dVar = 6.8; // 64 bit
		float fVar; // 32 bit
		char cVar; // 1 OR 2 byte
		boolean boolVar; // 1 byte
		String strVar = "5"; // Class variables (Object)
		
		fVar = 8.2f;
		System.out.println(intVar + 5);
		System.out.println(intVar + dVar);
		System.out.println(intVar + dVar + fVar);

		System.out.printf("this is my lucky charcter ( %c ) \n" ,  cVar = 'c');
		
		boolVar = true;
		if(boolVar) {
			System.out.println("this true");
		}
		
		strVar = "NST";
		
		System.out.println("the value of string variable is:" + strVar);
		
		
		
		
		
	}

}
