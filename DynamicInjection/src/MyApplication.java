//Mock ContactListServiceClass

public class MyApplication {

	/**
	 * Testing the application will be very difficult since our application is 
	 * directly creating the email service instance.
	 *  There is no way we can mock these objects in our test classes.
	 */

	//Every MyApplication object also has to initalize an
	//EmailService Obj
	private EmailService email = new EmailService();

	//this is a HARD-CODED dependency
	//Makes your application harder to extend
	//if email service was used in multiple classes it creates some spaghetti code

	public void processMessages(String msg, String receiver){
		//msg validation
		this.email.sendEmail(msg, receiver);
	}
	

}
