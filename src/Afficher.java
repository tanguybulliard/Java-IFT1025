public class Afficher {
	
	public static void main(String[] args) {
		printDashes(args[0]);
		System.out.println("|" + args[0] + "|");
		printDashes(args[0]);
	}
	
	private static void printDashes(String word) {
		System.out.print("+");
		for (int i = 0; i < word.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
