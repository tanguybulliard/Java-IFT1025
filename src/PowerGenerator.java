public class PowerGenerator {
	
	int aFactor;
	long result = 1;
	public PowerGenerator(int aFactor) {
		this.aFactor = aFactor;
	}
	
	public long nextPower() {
		this.result = (long) this.aFactor * this.result;
		return this.result;
	}
}
