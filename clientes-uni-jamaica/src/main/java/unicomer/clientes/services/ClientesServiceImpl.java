package unicomer.clientes.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import unicomer.clientes.excepciones.AppPropertiesException;
import unicomer.clientes.excepciones.ClienteException;
import unicomer.clientes.excepciones.ServicioGDDException;
import unicomer.clientes.servicios.model.Cliente;
import unicomer.clientes.utils.Propiepdades;

/**
*
* @author DIEGO_CELERY@MIMAIL.COM
* 
*/

@Service
public class ClientesServiceImpl implements ClientesService {

	
	
	@Override
	public Cliente createCliente(Cliente cliente) throws ClienteException {
		
		//Me hubiera gustado usar Mockito, pero por temas personales no dispongo del tiempo esta semana
		cliente.setAddressHome("Ramon Corvalan 67");
		cliente.setBirthday(LocalDate.of(1975, 8, 24));		
		cliente.setFirstName("Diego");
		cliente.setLastName("Celery");
		cliente.setGender("M");
		cliente.setHomephone(22222222);
		cliente.setCellphone(11111111);
		cliente.setIncomes(3000000);
		cliente.setProfession("Informatico");	
		cliente.setSuccess("1");
		
		return cliente;
	}
	
	@Override
	public Cliente getCliente(String key) throws ClienteException {

		Cliente cliente = new Cliente();
		
		//Me hubiera gustado usar Mockito, pero por temas personales no dispongo del tiempo esta semana
		cliente.setAddressHome("Ramon Corvalan 67");
		cliente.setBirthday(LocalDate.of(1975, 8, 24));		
		cliente.setFirstName("Diego");
		cliente.setLastName("Celery");
		cliente.setGender("M");
		cliente.setHomephone(22222222);
		cliente.setCellphone(11111111);
		cliente.setIncomes(3000000);
		cliente.setProfession("Informatico");
		
		cliente.setSuccess("1");
		
		return cliente;
	}
	
	@Override
	public Cliente updateCliente(Cliente cliente) throws ClienteException {
					
		//Me hubiera gustado usar Mockito, pero por temas personales no dispongo del tiempo esta semana
		cliente.setAddressHome("Ramon Corvalan 67");
		cliente.setBirthday(LocalDate.of(1975, 8, 24));		
		cliente.setFirstName("Diego");
		cliente.setLastName("Celery");
		cliente.setGender("M");
		cliente.setHomephone(22222222);
		cliente.setCellphone(11111111);
		cliente.setIncomes(3000000);
		cliente.setProfession("Informatico");
		
		cliente.setSuccess("1");
		
		return cliente;
	}
	
	@Override
	public Cliente deleteCliente(String key) throws ClienteException {
		
		Cliente cliente = new Cliente();
		
		//Me hubiera gustado usar Mockito, pero por temas personales no dispongo del tiempo esta semana
		cliente.setAddressHome("Ramon Corvalan 67");
		cliente.setBirthday(LocalDate.of(1975, 8, 24));		
		cliente.setFirstName("Diego");
		cliente.setLastName("Celery");
		cliente.setGender("M");
		cliente.setHomephone(22222222);
		cliente.setCellphone(11111111);
		cliente.setIncomes(3000000);
		cliente.setProfession("Informatico");	
		cliente.setSuccess("1");
		
		return cliente;
	}
	
	
}
