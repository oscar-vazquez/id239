package edesur.pangea.ws;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@SuppressWarnings("unused")
public class SuccessAsyncResponseGenerator implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(SuccessAsyncResponseGenerator.class);

    @Override
    public void process(Exchange exchange) {
        logger.debug(exchange.getIn().getBody().getClass().getName());

        SuccessAsyncResponse response = new SuccessAsyncResponse();
        response.setNumeroOrden((generateRandom()));
        exchange.getOut().setBody(response);
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
