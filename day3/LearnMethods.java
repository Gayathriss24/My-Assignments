package week1.day3;

public class LearnMethods {
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	public void sendSms() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		LearnMethods MyPhone = new LearnMethods();
		MyPhone.makeCall();
		MyPhone.sendSms();
		
		
		

	}

}
