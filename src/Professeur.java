
public class Professeur extends Personne {
	
	String rang;
	String université;
	
	public Professeur(String nom, int anneeNaissance, String sexe) {
		super(nom, anneeNaissance, sexe);
	}
	
	public void assignation(String rang, String université) {
		if (rang == "adjoint" || rang == "agrégé" || rang == "titulaire") {
			this.rang = rang;
		} else {
			System.out.println("Erreur: le rang que vous avez choisi n'est pas admissible.");
		}
		this.université = université;
	}
	public String toString() {
		return "Nom: " + this.nom 
				+ "; Année de naissance: " + this.anneeNaissance
				+ "; Age: " + this.getAge()
				+ "; Sexe: " + this.sexe
				+ "; Université: " + this.université
				+ "; Rang: " + this.rang
				+".";
	}
}
