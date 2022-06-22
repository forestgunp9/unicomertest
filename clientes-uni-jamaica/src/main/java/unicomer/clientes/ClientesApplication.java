package unicomer.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
*
* @author DIEGO_CELERY@MIMAIL.COM
*/

@SpringBootApplication
public class ClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
		
		/* Otra forma de cmabiar el puerto
		 * SpringApplication app = new SpringApplication(ClientesApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8081"));
        app.run(args);
        */
	}

}
