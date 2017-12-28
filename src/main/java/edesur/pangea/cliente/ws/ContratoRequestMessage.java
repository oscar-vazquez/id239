package edesur.pangea.cliente.ws;

import io.swagger.annotations.ApiModelProperty;

public abstract class ContratoRequestMessage {
    @ApiModelProperty(value = "Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    @ApiModelProperty
    private String accion;

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
}
