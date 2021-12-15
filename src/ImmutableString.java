import java.text.DecimalFormat;

public final class ImmutableString {
	final String pancardNumber;

	public ImmutableString(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
	public String setPancardNumber(String pan){
		return this.pancardNumber=pan;
	}
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("########.##");
	}

}
