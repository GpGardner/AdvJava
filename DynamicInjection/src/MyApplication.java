//Mock ContactListServiceClass

public class MyApplication {

	//Every MyApplication object also has to initalize an
	//EmailService Obj
	private EmailService email = new EmailService();

	public void processMessages(String msg, String receiver){
		//msg validation
		this.email.sendEmail(msg, receiver);
	}
	

}
