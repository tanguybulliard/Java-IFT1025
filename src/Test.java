
public class Test {

	public static void main(String[] args) {
		//Création des Personnes
		Professeur jacques = new Professeur("Jacques", 1980, "masculin");
			jacques.assignation("agrégé", "UdeM");
		Professeur marie = new Professeur("Marie", 1990, "feminine");
			marie.assignation("adjoint", "concordia");
		Professeur frank = new Professeur("Frank", 1970, "masculin");
			frank.assignation("titulaire", "McGill");
		EtudiantBac jean = new EtudiantBac("Jean", 2000, "masculin");
			jean.inscription("UdeM");
		EtudiantMaitrise claire = new EtudiantMaitrise("Claire", 1998, "feminine");
			claire.inscription("Concordia");
			claire.assignDirector(marie);
		EtudiantDoctorat eric = new EtudiantDoctorat("Éric", 1995, "masculin");
			eric.inscription("McGill");
			eric.assignDirector(frank);
		
		//Ajouter les personnes dans le tableau;
			Personne[] population = new Personne[6];
				population[0] = jacques;
				population[1] = marie;
				population[2] = frank;
				population[3] = jean;
				population[4] = claire;
				population[5] = eric;
		//Afficher sur l'écran les informations de chaque personne dans le tableau population
			for ( int i = 0; i < population.length; i++) {
				System.out.println(population[i].toString());
			}
		//Calculer et afficher l'age moyen de toutes ces personnes
			int average = 0;
			for (int i = 0; i < population.length; i++) {
				average += population[i].getAge();
			}
			average /= 6;
			if (average == 1) {
				System.out.println("l'age moyen est : " + average + " an.");
			} else {
			System.out.println("l'age moyen est : " + average + " ans.");
			}
	}
}
