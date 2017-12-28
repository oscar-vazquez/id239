package edesur.pangea.cliente.ws;

import edesur.pangea.ws.AsyncRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(value = "BajaContratoRequest")
public class BajaContratoRequest extends AsyncRequest {
    @Size(max = 15)
    @NotNull
    @ApiModelProperty(value = "Identificador del caso de SFDC.")
    private String numeroCasoSFDC;

    @Size(max = 15)
    @ApiModelProperty(value = "Identificador de la solicitud generada en synergia.")
    private String numeroOrden;

    @Size(max = 4)
    @NotNull
    @ApiModelProperty(value = "Razón del caso.")
    private String motivo;

    @Size(max = 4)
    @NotNull
    @ApiModelProperty(value = "Razón secundaria del caso.")
    private String submotivo;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty(value = "Estado al que se quiere actualizar la solicitud.")
    private String estado;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String numeroCliente;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String contractID;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String numeroInstalacion;

    @NotNull
    @ApiModelProperty
    private Date fechaSolicitud;

    @Size(max = 1)
    @ApiModelProperty
    private String facturaFinal;

    @Size(max = 1)
    @ApiModelProperty
    private String facturaPrincipal;

    @Size(max = 1)
    @ApiModelProperty
    private String retiroMedidor;

    public String getNumeroCasoSFDC() {
        return numeroCasoSFDC;
    }

    public void setNumeroCasoSFDC(String numeroCasoSFDC) {
        this.numeroCasoSFDC = numeroCasoSFDC;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSubmotivo() {
        return submotivo;
    }

    public void setSubmotivo(String submotivo) {
        this.submotivo = submotivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getNumeroInstalacion() {
        return numeroInstalacion;
    }

    public void setNumeroInstalacion(String numeroInstalacion) {
        this.numeroInstalacion = numeroInstalacion;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFacturaFinal() {
        return facturaFinal;
    }

    public void setFacturaFinal(String facturaFinal) {
        this.facturaFinal = facturaFinal;
    }

    public String getFacturaPrincipal() {
        return facturaPrincipal;
    }

    public void setFacturaPrincipal(String facturaPrincipal) {
        this.facturaPrincipal = facturaPrincipal;
    }

    public String getRetiroMedidor() {
        return retiroMedidor;
    }

    public void setRetiroMedidor(String retiroMedidor) {
        this.retiroMedidor = retiroMedidor;
    }
}
