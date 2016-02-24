package ejercicios;

/**
 * 
 * @author manuel
 * @version 1.0
 *
 */
public class ClaveSegura {
	private String clave;

	/**
	 * @param clave inicializa el constructor
	 */
	public ClaveSegura(String clave) {
		this.clave = clave;
	}

	/**
	 * 
	 * @return true si tiene al menos 8 caracteres
	 */
	private boolean tieneAlMenos8Caracteres(){
		return this.clave.length()> 7;
	}
	/**
	 * 
	 * @return true si contiene al menos una
	 * letra en minúscula
	 */
	private boolean contieneLetraMinuscula(){
		return this.clave.matches(".*[a-z].*");
	}
	/**
	 * 
	 * @return true si contiene al menos una
	 * letra en mayúscula
	 * 	 */
	private boolean contieneLetraMayuscula(){
		return this.clave.matches(".*[A-Z].*");
	}
	/**
	 * 
	 * @return true si contiene al menos
	 * un dígito
	 */
	private boolean contieneDigito(){
		return this.clave.matches(".*[0-9].*");
	}
	/**
	 * 
	 * @return true si contiene al menos
	 * un caracter no alfanumérico
	 */
	private boolean contieneCaracterNoAlfaNumerico(){
		return this.clave.matches(".*\\W.*")
				|| this.clave.matches(".*_.*");
	}
	/**
	 * 
	 * @return true si tiene al menos 8 caracteres, una
	 * mayúscula, una minúscula y un caracter no alfa-
	 * numérico
	 */
	public boolean esClaveSegura(){
		return tieneAlMenos8Caracteres() && contieneCaracterNoAlfaNumerico()
				&& contieneDigito() && contieneLetraMayuscula()
				&& contieneLetraMinuscula();
	}
	/*public static void main(String[] args) {
		ClaveSegura c = new ClaveSegura("ONw(uMQtnvu3bp9Rb8(DkV@ENyjrkKc9MM¡=Sd:XLRhC2JxAkeI,?fñGSCb4ñQo:1B3");
		System.out.println(c.tieneAlMenos8Caracteres());
		System.out.println(c.contieneLetraMinuscula());
		System.out.println(c.contieneLetraMayuscula());
		System.out.println(c.contieneDigito());
		System.out.println(c.contieneCaracterNoAlfaNumerico());
		System.out.println(c.esClaveSegura());

	}*/
}
