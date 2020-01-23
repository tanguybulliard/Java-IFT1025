public class PowerIterator {
//Numero 4.1.
	public static void main(String[] args) {
		long repetition = Long.parseLong(args[1]);
		long base = Long.parseLong(args[0]);
		for (int i = 0; i < repetition; i++) {
			System.out.println((long) Math.pow(base, i));
		}
	}
}
