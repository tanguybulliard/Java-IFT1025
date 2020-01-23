
public class Professeur extends Personne {
	
	String rang;
	String universit�;
	
	public Professeur(String nom, int anneeNaissance, String sexe) {
		super(nom, anneeNaissance, sexe);
	}
	
	public void assignation(String rang, String universit�) {
		if (rang == "adjoint" || rang == "agr�g�" || rang == "titulaire") {
			this.rang = rang;
		} else {
			System.out.println("Erreur: le rang que vous avez choisi n'est pas admissible.");
		}
		this.universit� = universit�;
	}
	public String toString() {
		return "Nom: " + this.nom 
				+ "; Ann�e de naissance: " + this.anneeNaissance
				+ "; Age: " + this.getAge()
				+ "; Sexe: " + this.sexe
				+ "; Universit�: " + this.universit�
				+ "; Rang: " + this.rang
				+".";
	}
}
