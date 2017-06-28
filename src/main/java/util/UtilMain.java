package util;

public class UtilMain {
	
	public int estDivisiblePar3par5OuLesDeux(int candidat){
		/**
		 * Si candidat = 0 renvoi -1
		 * Si candidat est divisible par 3 et 5 renvoi 15
		 * Si candidat est divisible par 5 renvoi 5
		 * Si candidat est divisible par 3 renvoi 3
		 * si candidat n est pas divisible renvoi 0
		 */
		
		return (candidat!=0) ? ((candidat%15!=0) ?
				((candidat%5!=0) ? (candidat%3!=0 ? 0:3):5):15):-1;
	}

}