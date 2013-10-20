package co.edu.udea.dae.main;

/**
 * @author andrea
 *
 */
public class CardinalesToRomanos {

	public String convertirCardinalToRomano(int numero) {
		int decimas;
		int unidades;
		String numeroRomano = "";
		decimas = numero / 10;
		unidades = numero%10;		
		
		switch (decimas) {		
		case 1:
			numeroRomano = numeroRomano.concat("X");
			break;
		case 2:
			numeroRomano = numeroRomano.concat("XX");
			break;
		case 3:
			numeroRomano = numeroRomano.concat("XXX");
			break;
		case 4:
			numeroRomano = numeroRomano.concat("XL");
			break;
		case 5:
			numeroRomano = numeroRomano.concat("L");
			break;
		}	
		
		switch (unidades) {		
		case 1:
			numeroRomano = numeroRomano.concat("I"); 
			break;
		case 2:
			numeroRomano = numeroRomano.concat("II"); 
			break;
		case 3:
			numeroRomano = numeroRomano.concat("III"); 
			break;
		case 4:
			numeroRomano = numeroRomano.concat("IV");
			break;
		case 5:
			numeroRomano = numeroRomano.concat("V");
			break;
		case 6:
			numeroRomano = numeroRomano.concat("VI"); 
			break;
		case 7:
			numeroRomano = numeroRomano.concat("VII");
			break;
		case 8:
			numeroRomano = numeroRomano.concat("VIII"); 
			break;
		case 9:
			numeroRomano = numeroRomano.concat("IX"); 
			break;
		}		
		
		return numeroRomano;			
	}

}
