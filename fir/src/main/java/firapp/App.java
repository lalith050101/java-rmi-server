package firapp;

import components.emailSender.EmailSenderV2;

public class App {

	public static void main(String[] args) {

		Object fir = FIRClient.getFIRApp();
		EmailSenderV2 es = (EmailSenderV2)fir;
		
		es.sendEmail("receiver_mail_id", "First mail", "Hi Lalith, \n Welcome to My App", "abc.text");
		
	}
}
