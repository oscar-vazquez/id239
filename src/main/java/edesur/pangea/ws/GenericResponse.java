package edesur.pangea.ws;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * Respuesta JSON Genérica.
 * Contiene un código y descripción
 *
 * Se incluyen como variables estáticas una lista de respuestas standard
 *
 * TODO: Verficar longitud de los campos a devolver
 *
 * TODO: Faltan definir la codificación de los valores a retornar
 */
@XmlRootElement
@ApiModel(value = "GenericResponse")
public abstract class GenericResponse {
    @ApiModelProperty(value = "Codigo del Resultado de la Peticion.")
    private String codigo;

    @ApiModelProperty(value =" Descripcion del Codigo del Resultado.")
    private String descripcion;

    public String getCodigo() {
        return codigo;
    }

    protected void setInternalCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    protected void setInternalDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
