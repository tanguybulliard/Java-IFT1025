
public class Annee {
	
	public static boolean estBissextile(int annee) {
		if ( (annee%4 == 0 && annee%100 != 0) || (annee%400 == 0) ) {
			return true;
		} else { 
			return false;
		}
	}
}
