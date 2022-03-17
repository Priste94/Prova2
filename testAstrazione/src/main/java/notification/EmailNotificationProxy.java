package notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import model.Clienti;

@Component
@Primary
@Qualifier("Email")
public class EmailNotificationProxy implements NotificationProxy{

	@Override
	public void sendNotifica(Clienti clienti) {
		
		System.out.println(String.format("Inviato via email al cliente %s (il quale ha %s bollini)", clienti.getNome(), clienti.getBollini()));
		
	}

}
