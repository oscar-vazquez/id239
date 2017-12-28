package edesur.pangea.ws;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@ApiModel(value = "SuccesResponse")
public class SuccesResponse extends GenericResponse{
    public static SuccesResponse response = new SuccesResponse();

    public SuccesResponse() {
        super.setInternalCodigo("OK");
    }

    @Override
    protected void setInternalCodigo(String codigo) {
        throw new RuntimeException("Operation not allowed");
    }

    @Override
    protected void setInternalDescripcion(String descripcion) {
        throw new RuntimeException("Operation not allowed");
    }
}
