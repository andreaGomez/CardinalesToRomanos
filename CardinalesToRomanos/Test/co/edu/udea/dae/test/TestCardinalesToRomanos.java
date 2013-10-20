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
}
