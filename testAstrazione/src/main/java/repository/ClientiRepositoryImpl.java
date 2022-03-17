package repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import model.Clienti;

@Repository
public class ClientiRepositoryImpl implements ClientiRepository{

	@Override
	public void saveCliente(Clienti cliente) {
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getBollini());
		
	}

}
