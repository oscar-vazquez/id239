package edesur.pangea.cliente.ws;

import edesur.pangea.ws.AsyncRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApiModel(value = "CambioCondicionesRequest")
public class CambioCondicionesRequest extends AsyncRequest {
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
    @ApiModelProperty
    private String contractID;

    @Size(max = 10)
    @ApiModelProperty(value = "Estado al que se quiere actualizar la solicitud.")
    private String estado;

    @NotNull
    @ApiModelProperty
    private Date fechaModificacion;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String numeroCliente;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String podId;

    @Size(max = 14)
    @ApiModelProperty
    private String consumoContratado;

    @Size(max = 10)
    @ApiModelProperty
    private String tarifa;

    @Size(max = 8)
    @ApiModelProperty
    private String claseSubClase;

    @Size(max = 2)
    @ApiModelProperty
    private String sinImpuesto;

    @Size(max = 2)
    @ApiModelProperty
    private String cNT;

    @Size(max = 9)
    @ApiModelProperty
    private String demandaContratadaFueraDePico;

    @Size(max = 9)
    @ApiModelProperty
    private String demandaContratadaEnPico;

    @Size(max = 9)
    @ApiModelProperty
    private String demandaContratada;

    @Size(max = 9)
    @ApiModelProperty
    private String demandaContratadaFueraDePicoB2B;

    @Size(max = 9)
    @ApiModelProperty
    private String demandaContratadaEnPicoB2B;

    @Size(max = 9)
    @ApiModelProperty
    private String demandaContratadaB2B;

    @Size(max = 9)
    @ApiModelProperty
    private String generacionDemandaContratada;

    @Size(max = 9)
    @ApiModelProperty
    private String suplementoDemanda;

    @ApiModelProperty
    private Date fechaFirmaContrato;

    @Size(max = 1)
    @ApiModelProperty
    private String facturaFinal;

    @Size(min = 1)
    @Valid
    @ApiModelProperty
    private List<IluminacionPublica> iluminacionPublica = new ArrayList<IluminacionPublica>();

    @Size(min = 1)
    @Valid
    @ApiModelProperty
    private List<GeneracionDistribuida> generacionDistribuida = new ArrayList<GeneracionDistribuida>();

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

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public String getConsumoContratado() {
        return consumoContratado;
    }

    public void setConsumoContratado(String consumoContratado) {
        this.consumoContratado = consumoContratado;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getClaseSubClase() {
        return claseSubClase;
    }

    public void setClaseSubClase(String claseSubClase) {
        this.claseSubClase = claseSubClase;
    }

    public String getSinImpuesto() {
        return sinImpuesto;
    }

    public void setSinImpuesto(String sinImpuesto) {
        this.sinImpuesto = sinImpuesto;
    }

    public String getCNT() {
        return cNT;
    }

    public void setCNT(String cNT) {
        this.cNT = cNT;
    }

    public String getDemandaContratadaFueraDePico() {
        return demandaContratadaFueraDePico;
    }

    public void setDemandaContratadaFueraDePico(String demandaContratadaFueraDePico) {
        this.demandaContratadaFueraDePico = demandaContratadaFueraDePico;
    }

    public String getDemandaContratadaEnPico() {
        return demandaContratadaEnPico;
    }

    public void setDemandaContratadaEnPico(String demandaContratadaEnPico) {
        this.demandaContratadaEnPico = demandaContratadaEnPico;
    }

    public String getDemandaContratada() {
        return demandaContratada;
    }

    public void setDemandaContratada(String demandaContratada) {
        this.demandaContratada = demandaContratada;
    }

    public String getDemandaContratadaFueraDePicoB2B() {
        return demandaContratadaFueraDePicoB2B;
    }

    public void setDemandaContratadaFueraDePicoB2B(String demandaContratadaFueraDePicoB2B) {
        this.demandaContratadaFueraDePicoB2B = demandaContratadaFueraDePicoB2B;
    }

    public String getDemandaContratadaEnPicoB2B() {
        return demandaContratadaEnPicoB2B;
    }

    public void setDemandaContratadaEnPicoB2B(String demandaContratadaEnPicoB2B) {
        this.demandaContratadaEnPicoB2B = demandaContratadaEnPicoB2B;
    }

    public String getDemandaContratadaB2B() {
        return demandaContratadaB2B;
    }

    public void setDemandaContratadaB2B(String demandaContratadaB2B) {
        this.demandaContratadaB2B = demandaContratadaB2B;
    }

    public String getGeneracionDemandaContratada() {
        return generacionDemandaContratada;
    }

    public void setGeneracionDemandaContratada(String generacionDemandaContratada) {
        this.generacionDemandaContratada = generacionDemandaContratada;
    }

    public String getSuplementoDemanda() {
        return suplementoDemanda;
    }

    public void setSuplementoDemanda(String suplementoDemanda) {
        this.suplementoDemanda = suplementoDemanda;
    }

    public Date getFechaFirmaContrato() {
        return fechaFirmaContrato;
    }

    public void setFechaFirmaContrato(Date fechaFirmaContrato) {
        this.fechaFirmaContrato = fechaFirmaContrato;
    }

    public String getFacturaFinal() {
        return facturaFinal;
    }

    public void setFacturaFinal(String facturaFinal) {
        this.facturaFinal = facturaFinal;
    }

    public List<IluminacionPublica> getIluminacionPublica() {
        return iluminacionPublica;
    }

    public void setIluminacionPublica(List<IluminacionPublica> iluminacionPublica) {
        this.iluminacionPublica = iluminacionPublica;
    }

    public List<GeneracionDistribuida> getGeneracionDistribuida() {
        return generacionDistribuida;
    }

    public void setGeneracionDistribuida(List<GeneracionDistribuida> generacionDistribuida) {
        this.generacionDistribuida = generacionDistribuida;
    }


    @ApiModel("GeneracionDistribuida")
    public class GeneracionDistribuida {
        @Size(max = 10)
        @NotNull
        @ApiModelProperty
        private String podIdAux;

        @Size(max = 10)
        @NotNull
        @ApiModelProperty
        private String ratio;

        public String getPodIdAux() {
            return podIdAux;
        }

        public void setPodIdAux(String podIdAux) {
            this.podIdAux = podIdAux;
        }

        public String getRatio() {
            return ratio;
        }

        public void setRatio(String ratio) {
            this.ratio = ratio;
        }
    }

    @ApiModel("IluminacionPublica")
public class IluminacionPublica {
        @Size(max = 4)
        @NotNull
        @ApiModelProperty
        private String codigoAparato;

        @Size(max = 10)
        @NotNull
        @ApiModelProperty
        private String potencia;

        @Size(max = 10)
        @NotNull
        @ApiModelProperty
        private String factorPerdida;

        @NotNull
        @ApiModelProperty
        private int cantidad;

        public String getCodigoAparato() {
            return codigoAparato;
        }

        public void setCodigoAparato(String codigoAparato) {
            this.codigoAparato = codigoAparato;
        }

        public String getPotencia() {
            return potencia;
        }

        public void setPotencia(String potencia) {
            this.potencia = potencia;
        }

        public String getFactorPerdida() {
            return factorPerdida;
        }

        public void setFactorPerdida(String factorPerdida) {
            this.factorPerdida = factorPerdida;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }
    }
}
