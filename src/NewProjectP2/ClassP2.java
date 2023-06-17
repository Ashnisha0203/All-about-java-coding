package NewProjectP2;

import NewProjectP1.ClassA;

public class ClassP2 extends ClassA {

	public static void main(String[] args) {
		
		System.out.println(ClassA.var_A);
		ClassA.methodA();

		System.out.println("*****************************");
		System.out.println(ClassP2.var_A);

		ClassP2.methodA();
		

		
		
		
	}

}
