
public class Etudiant extends Personne {
	
	String universit�;
	
	public Etudiant(String nom, int anneeNaissance, String sexe) {
		super(nom, anneeNaissance, sexe);
	}

	public void inscription(String universit�) {
		this.universit� = universit�;
	}
	public String getUniversity() {
		return this.universit�;
	}
	public String toString() {
		return "Nom: " + this.nom 
				+ "; Ann�e de naissance: " + this.anneeNaissance
				+ "; Age: " + this.getAge()
				+ "; Sexe: " + this.sexe
				+ "; Universit�: " + this.universit�
				+".";
	}
}
