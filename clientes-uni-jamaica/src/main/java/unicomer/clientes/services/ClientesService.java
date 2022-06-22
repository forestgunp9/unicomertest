package unicomer.clientes.services;

import unicomer.clientes.excepciones.ClienteException;
import unicomer.clientes.servicios.model.Cliente;

/**
*
* @author DIEGO_CELERY@MIMAIL.COM
*/

public interface ClientesService {
	
	Cliente createCliente(Cliente cliente) throws ClienteException;

	Cliente updateCliente(Cliente cliente) throws ClienteException;

	Cliente getCliente(String key) throws ClienteException;

	Cliente deleteCliente(String key) throws ClienteException;

}
