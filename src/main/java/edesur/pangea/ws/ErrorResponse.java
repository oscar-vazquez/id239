package edesur.pangea.ws;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@ApiModel(value = "ErrorResponse")
public final class ErrorResponse extends GenericResponse {

    public static ErrorResponse numeroClienteNoValido = new ErrorResponse("E001", "Numero Cliente no valido");
    public static ErrorResponse clienteNoExiste       = new ErrorResponse("E002", "Cliente no existe");
    public static ErrorResponse requestError          = new ErrorResponse("E003");
    public static ErrorResponse internalError         = new ErrorResponse("E500");

    private ErrorResponse(String codigo, String descripcion) {
        super.setInternalCodigo(codigo);
        super.setInternalDescripcion(descripcion);
    }

    private ErrorResponse(String codigo) {
        super.setInternalCodigo(codigo);
    }

    public ErrorResponse setDescripcion(String descripcion) {
        if (getDescripcion() == null) {
            setInternalDescripcion(descripcion);
        }
        else {
            throw new RuntimeException("Operation not allowed");
        }

        return this;
    }

    public ErrorResponse setDescripcion(Exception e) {
        return setDescripcion(e.getMessage());
    }
}
