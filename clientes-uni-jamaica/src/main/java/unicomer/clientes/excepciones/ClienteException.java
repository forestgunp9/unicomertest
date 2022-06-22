package unicomer.clientes.excepciones;

/**
*
* @author DIEGO_CELERY@MIMAIL.COM
*/

public class ClienteException extends CustomException {

    private static final long serialVersionUID = -888123045740919110L;

	public ClienteException() {
        super("fechas-faltantes-exception", "Error al intentar recuperar las fechas faltantes.");
    }
    
    public ClienteException(String msg) {
        super("fechas-faltantes-exception", msg);
    }
}
