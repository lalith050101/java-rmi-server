package firapp;

import components.emailSender.EmailSenderV2;
import components.emailSender.EmailSenderV2Imp;
import implementation.ImplementationFramework;

public class FIRClient {

	public static Object getFIRApp() {

		Object fir = new FIR();

		// creating implementation
		EmailSenderV2Imp eSender = new EmailSenderV2Imp();

		// setting interfaces
		ImplementationFramework.setInterface(EmailSenderV2.class);

		// getting object
		fir = ImplementationFramework.getObject(new Object[] { fir, eSender });

		return fir;

	}

}
