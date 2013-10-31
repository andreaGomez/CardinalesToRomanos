package co.edu.udea.dae.test;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import co.edu.udea.dae.main.CardinalesToRomanos;


public class TestCardinalesToRomanos {
	private CardinalesToRomanos conversion;
	private String romano; 
	
	@Before
	public void init(){		
		conversion = new CardinalesToRomanos();
	}
	
	@Test
	public void ConvertirUnoARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(1);
		Assert.assertEquals("I", romano);
	}
	
	@Test
	public void ConvertirDosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(2);
		Assert.assertEquals("II", romano);
	}
	
	@Test
	public void ConvertirTresARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(3);
		Assert.assertEquals("III", romano);
	}
	
	@Test
	public void ConvertirCuatroARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(4);
		Assert.assertEquals("IV", romano);
	}
	
	@Test
	public void ConvertirCincoARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(5);
		Assert.assertEquals("V", romano);
	}
	
	@Test
	public void ConvertirSeisARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(6);
		Assert.assertEquals("VI", romano);
	}
	
	@Test
	public void ConvertirSieteARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(7);
		Assert.assertEquals("VII", romano);
	}
	
	@Test
	public void ConvertirOchoARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(8);
		Assert.assertEquals("VIII", romano);
	}
	
	@Test
	public void ConvertirNueveARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(9);
		Assert.assertEquals("IX", romano);
	}
	
	@Test
	public void ConvertirDiezARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(10);
		Assert.assertEquals("X", romano);
	}
	
	@Test
	public void ConvertirOnceARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(11);
		Assert.assertEquals("XI", romano);
	}
	
	@Test
	public void ConvertirQuinceARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(15);
		Assert.assertEquals("XV", romano);
	}
	
	@Test
	public void ConvertirVeinteARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(20);
		Assert.assertEquals("XX", romano);
	}
	
	@Test
	public void ConvertirVeinticincoARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(25);
		Assert.assertEquals("XXV", romano);
	}
	
	@Test
	public void ConvertirTreintaARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(30);
		Assert.assertEquals("XXX", romano);
	}
	
	@Test
	public void ConvertirTreintaynueveARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(39);
		Assert.assertEquals("XXXIX", romano);
	}
	
	@Test
	public void ConvertirCuarentaARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(40);
		Assert.assertEquals("XL", romano);
	}
	
	@Test
	public void ConvertirCuarentayseisARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(46);
		Assert.assertEquals("XLVI", romano);
	}
	
	@Test
	public void ConvertirCincuentaARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(50);
		Assert.assertEquals("L", romano);
	}
	
	@Test
	public void ConvertirCincuentayCuatroARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(54);
		Assert.assertEquals("LIV", romano);
	}
	
	@Test
	public void ConvertirSesentaARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(60);
		Assert.assertEquals("LX", romano);
	}
	
	@Test
	public void ConvertirSetentaARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(70);
		Assert.assertEquals("LXX", romano);
	}
	
	@Test
	public void ConvertirOchentaARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(80);
		Assert.assertEquals("LXXX", romano);
	}
	
	@Test
	public void ConvertirNoventaARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(90);
		Assert.assertEquals("XC", romano);
	}
	
	@Test
	public void ConvertirCienARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(100);
		Assert.assertEquals("C", romano);
	}
	
	@Test
	public void ConvertirDocientosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(200);
		Assert.assertEquals("CC", romano);
	}
	
	@Test
	public void ConvertirTrecientosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(300);
		Assert.assertEquals("CCC", romano);
	}
	
	@Test
	public void ConvertirCuatrocientosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(400);
		Assert.assertEquals("CD", romano);
	}
	
	@Test
	public void ConvertirQuinientosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(500);
		Assert.assertEquals("D", romano);
	}
	
	@Test
	public void ConvertirSeiscientosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(600);
		Assert.assertEquals("DC", romano);
	}
	
	@Test
	public void ConvertirSetecientosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(700);
		Assert.assertEquals("DCC", romano);
	}
	
	@Test
	public void ConvertirOchocientosARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(800);
		Assert.assertEquals("DCCC", romano);
	}
	

	@Test
	public void Convertir458ARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(458);
		Assert.assertEquals("CDLVIII", romano);
	}
	
	
	@Test
	public void Convertir501ARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(501);
		Assert.assertEquals("DI", romano);
	}
	
	@Test
	public void Convertir975ARomanoTest() {		
		romano = conversion.convertirCardinalToRomano(975);
		Assert.assertEquals("CMLXXV", romano);
	}
	
	
	}
