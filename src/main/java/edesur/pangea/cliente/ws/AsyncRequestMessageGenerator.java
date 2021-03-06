package edesur.pangea.cliente.ws;

import edesur.pangea.ws.AsyncRequest;
import edesur.pangea.ws.AsyncRequestMessage;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

// TODO: nombre property harcoded
public class AsyncRequestMessageGenerator implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(AsyncRequestMessageGenerator.class);

    @Override
    public void process(Exchange exchange) {
        String action = exchange.getIn().getHeader("CamelHttpPath", String.class).substring(1).toUpperCase();

        AsyncRequestMessage message = new AsyncRequestMessage();

        String numeroOrden = generateRandom();

        message.setNumeroOrden(numeroOrden);
        message.setAccion(action);

        Class clazz;

        switch (action) {
            case "ALTA":
                clazz = AltaContratoRequest.class;
                break;
            case "BAJA":
                clazz = BajaContratoRequest.class;
                break;
            case "CAMBIOTITULAR":
                clazz = CambioTitularRequest.class;
                break;
            case "CAMBIOCONDICIONES":
                clazz = CambioCondicionesRequest.class;
                break;
            default:
                throw new IllegalArgumentException("Invalid Action " + action);
        }
        message.setMessage((AsyncRequest) exchange.getIn().getBody(clazz));

        exchange.getIn().setBody(message);

        exchange.setProperty("numeroOrden", numeroOrden);
    }

    private String generateRandom() {
        int length = 15;
        Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return new String(digits);
    }
}
