package edesur.pangea.ws;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

// TODO: nombre property harcoded
public class SuccessAsyncResponseGenerator implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(SuccessAsyncResponseGenerator.class);

    @Override
    public void process(Exchange exchange) {
        SuccessAsyncResponse response = new SuccessAsyncResponse();
        response.setNumeroOrden(exchange.getProperty("numeroOrden", String.class));
        exchange.getOut().setBody(response);
    }
}
