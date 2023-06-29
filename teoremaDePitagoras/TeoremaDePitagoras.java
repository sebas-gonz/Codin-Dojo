package teoremaDePitagoras;

public class TeoremaDePitagoras {

	public double calcularHipotenusa(int catetoA, int catetoB) {
	
		double hipotenusa = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
		
		hipotenusa = Math.sqrt(hipotenusa);
		return hipotenusa;
	}

}
