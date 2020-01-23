
public class Etudiant extends Personne {
	
	String université;
	
	public Etudiant(String nom, int anneeNaissance, String sexe) {
		super(nom, anneeNaissance, sexe);
	}

	public void inscription(String université) {
		this.université = université;
	}
	public String getUniversity() {
		return this.université;
	}
	public String toString() {
		return "Nom: " + this.nom 
				+ "; Année de naissance: " + this.anneeNaissance
				+ "; Age: " + this.getAge()
				+ "; Sexe: " + this.sexe
				+ "; Université: " + this.université
				+".";
	}
}
