
public class Bitwise {
	
	public static void main(String[] args) {
		
		int a = 5, b = 3;//binary valuse 5--->0101,3--->0011
		
		System.out.println("Bitwise AND: "+ (a & b));
		
		//0101
		//0011
		//-------
		// 0001---->1
		//-------
		System.out.println("Bitwise OR: "+ (a | b));
		/**
		 * 0101
		 * 0011
		 * -----
		 * 0111---->7
		 * -----
		 */
		System.out.println("Bitwise XOR: "+ (a ^ b));
		
		/**
		 * 0101
		 * 0011
		 * -----
		 * 0110--->6
		 * ------
		 * 
		 */
		System.out.println("Bitwise NOT: "+ (~a));
	/**
	 * NOT---> -(n+1)
	 * 0101--->5
	 * 0001--->1
	 * -----
	 * 0110-->6
	 * -----
	 * 
	 */
	}

}
