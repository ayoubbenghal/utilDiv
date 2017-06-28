package utilTest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import util.UtilMain;

public class UtilTest {

	private static UtilMain utilMain;
	/**
	 * Possible avec un tableau 
	 * Meilleure lisibilité avec nom variable de classe
	 * private static Integer nums[]={-1,0,3,5,15};
	 * 
	 * 
	 * private static Integer zero,negative,trois,cinq,quinze;
	 * Si retour Objet Integer
	 */
	
	
	@BeforeClass
	public static void initialiser(){
		utilMain=new UtilMain();
		/*zero=0;
		negative=-1;
		trois=3;
		cinq=5;
		quinze=15;*/
	}
	
	@Test
	public void estDivisiblePar3(){
		assertEquals(3, utilMain.estDivisiblePar3par5OuLesDeux(6));
	}
	@Test
	public void estDivisiblePar5(){
		assertEquals(5, utilMain.estDivisiblePar3par5OuLesDeux(10));
	}
	@Test
	public void estDivisibleParLesDeux(){
		assertEquals(15, utilMain.estDivisiblePar3par5OuLesDeux(30));
	}
	@Test
	public void estZero(){
		assertEquals(-1, utilMain.estDivisiblePar3par5OuLesDeux(0));
	}
	@Test
	public void nEstPasDivisible(){
		assertEquals(0, utilMain.estDivisiblePar3par5OuLesDeux(7));
	}

}
