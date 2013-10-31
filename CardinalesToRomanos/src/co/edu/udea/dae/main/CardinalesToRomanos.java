package co.edu.udea.dae.main;

/**
 * @author andrea
 *
 */
public class CardinalesToRomanos {

	public String convertirCardinalToRomano(int numero) {
		int decimas;
		int unidades;
		int centesimas;
		
		//Se el numero entero que ingresa, por centesimas, decimas y unidades.
		String numeroRomano = "";
		centesimas = numero/100;
		numero=numero-centesimas*100;
		decimas = numero/10;
		numero=numero-decimas*10;
		unidades = numero%10;	
		

		//Se evalua cada caso y se agrega al resultado
		switch (centesimas) {		
		case 1:
			numeroRomano = numeroRomano.concat("C");
			
			break;
		case 2:
			numeroRomano = numeroRomano.concat("CC");
			break;
		case 3:
			numeroRomano = numeroRomano.concat("CCC");
			break;
		case 4:
			numeroRomano = numeroRomano.concat("CD");
			break;
		case 5:
			numeroRomano = numeroRomano.concat("D");
			break;
		case 6:
			numeroRomano = numeroRomano.concat("DC");
			break;
		case 7:
			numeroRomano = numeroRomano.concat("DCC");
			break;
		case 8:
			numeroRomano = numeroRomano.concat("DCCC");
			break;
		case 9:
			numeroRomano = numeroRomano.concat("CM");
			break;
		}	
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
		case 6:
			numeroRomano = numeroRomano.concat("LX");
			break;
		case 7:
			numeroRomano = numeroRomano.concat("LXX");
			break;
		case 8:
			numeroRomano = numeroRomano.concat("LXXX");
			break;
		case 9:
			numeroRomano = numeroRomano.concat("XC");
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
