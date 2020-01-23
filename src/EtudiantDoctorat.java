
public class EtudiantDoctorat extends Etudiant {
	
	Professeur directeur;
	
	public EtudiantDoctorat(String nom, int anneeNaissance, String sexe) {
		super(nom, anneeNaissance, sexe);
	}
	
	public void assignDirector(Professeur directeur) {
		this.directeur = directeur;
	}
	public String toString() {
		return "Nom: " + this.nom 
				+ "; Ann�e de naissance: " + this.anneeNaissance
				+ "; Age: " + this.getAge()
				+ "; Sexe: " + this.sexe
				+ "; Universit�: " + this.universit�
				+ "; Directeur: " + this.directeur.nom
				+".";
	}
}
