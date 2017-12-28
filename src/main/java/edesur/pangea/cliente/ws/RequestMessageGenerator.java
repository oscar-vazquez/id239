package edesur.pangea.cliente.ws;

import edesur.pangea.ws.SuccessAsyncResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Random;

@SuppressWarnings("unused")
public class RequestMessageGenerator implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(RequestMessageGenerator.class);

    @Override
    public void process(Exchange exchange) {
        String action = exchange.getIn().getHeader("CamelHttpPath", String.class).substring(1).toUpperCase();

        ContratoRequestMessage message;

        switch (action) {
            case "ALTA":
                message = new AltaContratoRequestMessage();
                ((AltaContratoRequestMessage)message).setMessage(exchange.getIn().getBody(AltaContratoRequest.class));
                break;
            default:
                throw new IllegalArgumentException("Invalid action " + action);
        }

        message.setNumeroOrden((generateRandom()));
        message.setAccion(action);

        exchange.getIn().setBody(message);
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
