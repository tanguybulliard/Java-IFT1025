
public class PowerGeneratorTest {

	public static void main(String[] args) {
		PowerGenerator powerGenerator = new PowerGenerator(Integer.parseInt(args[0]));
		for (int i = 0; i < Integer.parseInt(args[1]); i++ ) {
			System.out.println(powerGenerator.nextPower());
		}
	}
}
