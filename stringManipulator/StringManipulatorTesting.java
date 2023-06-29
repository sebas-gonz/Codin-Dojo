package stringManipulator;

public class StringManipulatorTesting {

	public static void main(String[] args) {
		
		StringManipulator manipulator = new StringManipulator();
		
		String str = manipulator.trimAndConcat("    Hola     ","    Mundo     ");

		System.out.println(str);    // HolaMundo
		
		char letter = 'n';
		
		char letter2 = 'o';
		
		int a = manipulator.getIndexOrNull("Coding", letter);
		
		int b = manipulator.getIndexOrNull("Hola Mundo", letter2);
		
		int c = manipulator.getIndexOrNull("Saludar", letter);
		
		System.out.println(a);    // 4
		
		System.out.println(b);		// 1
		
		System.out.println(c);		// -1
		
		String word = "Hola";
		
		String subString = "la";
		
		String notSubString = "Mundo";
		
		int d = manipulator.getIndexOrNull(word, subString);
		
		int e = manipulator.getIndexOrNull(word, notSubString);
		
		System.out.println(d);   	// 2
		
		System.out.println(e);		//-1
		
		String word2 = manipulator.concatSubstring(word, 1, 3, notSubString);
		
		System.out.println(word2); // olmundo
		
		
	
	}

}
