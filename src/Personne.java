import java.util.Calendar;

public class Personne {
	
	protected String sexe;
	protected int anneeNaissance;
	protected String nom;

	public Personne(String nom, int anneeNaissance, String sexe) {
		this.nom = nom;
		this.anneeNaissance = anneeNaissance;
		this.sexe = sexe;
	}
	
	public String getName() {
		return this.nom;
	} 
	public int getBirthDate() {
		return this.anneeNaissance;
	}
	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		int date = calendar.get(Calendar.YEAR);
		return (date - this.anneeNaissance); 
	}
	public String toString() {
		return "Nom: " + this.nom 
				+ "; Année de naissance: " + this.anneeNaissance 
				+ "; Age: " + this.getAge()
				+ "; Sexe: " + this.sexe
				+".";
	}
}
