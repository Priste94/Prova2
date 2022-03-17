package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import model.Clienti;
import notification.NotificationProxy;
import repository.ClientiRepository;

@Service 
public class ClientiServiceImpl implements ClientiService{
	
	@Autowired
	private ClientiRepository clientiRepository;	
	@Autowired
	@Qualifier("SMS")
	private NotificationProxy notificationProxy;

	@Override
	public void saveAndNotify(Clienti clienti) {
		
		clientiRepository.saveCliente(clienti);
		notificationProxy.sendNotifica(clienti);
		
	}

}
