
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
				+ "; Année de naissance: " + this.anneeNaissance
				+ "; Age: " + this.getAge()
				+ "; Sexe: " + this.sexe
				+ "; Université: " + this.université
				+ "; Directeur: " + this.directeur.nom
				+".";
	}
}
