package edesur.pangea.ws;

import io.swagger.annotations.ApiModelProperty;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Random;


public class SuccessAsyncResponse extends SuccesResponse {
    @ApiModelProperty(value = "Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    @SuppressWarnings("unused")
    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
}
