package programs;

import java.util.Scanner;

public class NestedIfelse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur age:");
		int age = sc.nextInt();
		
		System.out.println("Enter ur weight:");
		int weight = sc.nextInt();
		
		if(age>20) {
			if(weight>50) {
				System.out.println("age and weight are satisfied can denote blood");
			}else {
			System.out.println("Under weight cannot denote blood");
			}
		}if(age<20) {
			if(weight>40) {
				System.out.println("age and weight are not satisfied");
			}else {
				System.out.println("Uder weight can denote blood");
			}
		}
	}
}
			
		
		
		
	


