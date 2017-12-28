package edesur.pangea.cliente.ws;

import io.swagger.annotations.ApiModelProperty;

public class AltaContratoRequestMessage extends ContratoRequestMessage {
    @ApiModelProperty
    private AltaContratoRequest message;

    public AltaContratoRequest getMessage() {
        return message;
    }

    public void setMessage(AltaContratoRequest message) {
        this.message = message;
    }
}
