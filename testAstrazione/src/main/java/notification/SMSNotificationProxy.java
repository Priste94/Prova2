package notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import model.Clienti;

@Component
@Qualifier("SMS")
public class SMSNotificationProxy implements NotificationProxy{

	@Override
	public void sendNotifica(Clienti clienti) {

		System.out.println(String.format("Inviato via SMS al cliente %s (il quale ha %s bollini)", clienti.getNome(), clienti.getBollini()));

		
	}

}
