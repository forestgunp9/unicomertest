package unicomer.clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import unicomer.clientes.excepciones.ClienteException;
import unicomer.clientes.excepciones.CustomException;
import unicomer.clientes.excepciones.CustomStatusException;
import unicomer.clientes.services.ClientesService;
import unicomer.clientes.servicios.model.Cliente;

/**
*
* @author DIEGO_CELERY@MIMAIL.COM
*/
@RestController
@RequestMapping(value = "cliente")
public class ClientesController {
	
	
	@Autowired
	ClientesService clientesService;
	
	
	@RequestMapping(value = "/{key}", method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getCliente(@PathVariable("key") String key) {
				
		Cliente cliente=null;
		try {
			cliente = clientesService.getCliente(key);
			return devolverRespuestaCorrectaGET(cliente);
		} catch (ClienteException e) {
			e.printStackTrace();			
			return devolverRespuestaIncorrecta(new CustomException("E","Hubo un error al intentar obtener datos del cliente: "+e.getMessage()));
		}				
		
	}
	
	@RequestMapping(value = "/{key}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object deleteCliente(@PathVariable("key") String key) {

		Cliente cliente = null;
		try {
			cliente = clientesService.deleteCliente(key);
			return devolverRespuestaCorrectaGET(cliente);
		} catch (ClienteException e) {
			e.printStackTrace();
			return devolverRespuestaIncorrecta(new CustomException("E",
					"Hubo un error al intentar borrar datos del cliente: "
							+ e.getMessage()));
		}

	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object crearCliente(@RequestBody Cliente cliente,
                                   BindingResult result){
        try {
            return devolverRespuestaCorrectaPost(clientesService.createCliente(cliente));
        } catch(Exception e) {
            return devolverRespuestaIncorrecta(e);
        }
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object actualizarCliente(@RequestBody Cliente cliente,
                                   BindingResult result){
        try {
            return devolverRespuestaCorrectaPut(clientesService.updateCliente(cliente));
        } catch(Exception e) {
            return devolverRespuestaIncorrecta(e);
        }
    }
	
	
	
	
	///////////////////////PRIVADAS///////////////////////
	//Colocar esto mejor en un Supercontroller del cual heredar
	
	private Object devolverRespuestaCorrectaGET(Object o) {
        return new ResponseEntity<>(o, HttpStatus.OK);
    }
	
	public Object devolverRespuestaIncorrecta(Exception e){

        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;        
                
        return new ResponseEntity<>(new CustomStatusException(e), httpStatus);
    }

	public Object devolverRespuestaCorrectaPost(Object o) {
        if(o == null){
            return devolverRespuestaIncorrecta(new CustomException("E",
					"Objeto a crear no valido."));
        }
        return new ResponseEntity<>(o, HttpStatus.OK);
    }
	public Object devolverRespuestaCorrectaPut(Object o) {
        if(o == null){
            return devolverRespuestaIncorrecta(new CustomException("E",
					"Objeto a actualizar no valido."));
        }
        return new ResponseEntity<>(o, HttpStatus.OK);
    }
	
    

}
