package stringManipulator;

public class StringManipulator {

	public String trimAndConcat(String cadenaA, String cadenaB) {
		
		String sentencia = cadenaA.trim() + cadenaB.trim();
		
		return sentencia;

	}
	
	public int getIndexOrNull(String cadenaA, char caracter) {
		
		int indice = cadenaA.indexOf(caracter);
		
		return indice;
	}
	
	public int getIndexOrNull(String cadenaA, String cadenaB) {
		
		int indice = cadenaA.indexOf(cadenaB);
		
		return indice;
	}
	
	public String concatSubstring(String cadenaA, int a, int b, String cadenaB) {
		
		String concat = cadenaA.substring(a, b) + cadenaB;
		
		return concat;
	}
}
