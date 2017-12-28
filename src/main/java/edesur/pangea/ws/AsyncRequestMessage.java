package edesur.pangea.ws;

import edesur.pangea.ws.AsyncRequest;
import io.swagger.annotations.ApiModelProperty;

public class AsyncRequestMessage {
    @ApiModelProperty(value = "Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    @ApiModelProperty
    private String accion;

    @ApiModelProperty
    private AsyncRequest message;

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public AsyncRequest getMessage() {
        return message;
    }

    public void setMessage(AsyncRequest message) {
        this.message = message;
    }
}
