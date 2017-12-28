package edesur.pangea.cliente.ws;

import io.swagger.annotations.ApiModelProperty;

public class ContratoRequestMessage {
    @ApiModelProperty(value = "Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    @ApiModelProperty
    private String accion;

    @ApiModelProperty
    private ContratoRequest message;

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

    public ContratoRequest getMessage() {
        return message;
    }

    public void setMessage(ContratoRequest message) {
        this.message = message;
    }
}
