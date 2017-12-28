package edesur.pangea.cliente.ws;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(value = "AltaContratoRequest")
public class AltaContratoRequest extends ContratoRequest{
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
    @ApiModelProperty(value = "Razón secundaria del caso.")
    private String submotivo;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty(value = "Estado al que se quiere actualizar la solicitud.")
    private String estado;

    @ApiModelProperty
    private int solicitante;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String tarifa;

    @NotNull
    @ApiModelProperty
    private Date fechaAltaContrato;

    @Size(max = 4)
    @NotNull
    @ApiModelProperty(value = "Identificador de Empresa en Synergia")
    private String codigoEmpresa;

    @Size(max = 1)
    @NotNull
    @ApiModelProperty
    private String categoria;

    @Size(max = 3)
    @NotNull
    @ApiModelProperty
    private String cuitCuil;

    @Size(max = 16)
    @NotNull
    @ApiModelProperty
    private String codigoFiscal;

    @Size(max = 40)
    @ApiModelProperty
    private String razonSocial;

    @Size(max = 40)
    @ApiModelProperty
    private String nombre;

    @Size(max = 40)
    @ApiModelProperty
    private String apellido;

    @Size(max = 1)
    @ApiModelProperty
    private String direccionPrincipal;

    @Size(max = 60)
    @NotNull
    @ApiModelProperty
    private String calle;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String numeroCalle;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String codigoPostal;

    @Size(max = 40)
    @NotNull
    @ApiModelProperty
    private String localidad;

    @Size(max = 3)
    @NotNull
    @ApiModelProperty
    private String provincia;

    @Size(max = 40)
    @ApiModelProperty
    private String piso;

    @Size(max = 50)
    @ApiModelProperty
    private String mail;

    @Size(max = 10)
    @ApiModelProperty
    private String departamento;

    @Size(max = 2)
    @ApiModelProperty
    private String tipoDeSuministro;

    @Size(max = 30)
    @NotNull
    @ApiModelProperty
    private String direccionAlternativa;

    @Size(max = 30)
    @ApiModelProperty
    private String cuentaMadre;

    @Size(max = 1)
    @NotNull
    @ApiModelProperty
    private String typeC;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String contractID;

    @NotNull
    @ApiModelProperty
    private Date fechaValidacion;

    @Size(max = 60)
    @NotNull
    @ApiModelProperty
    private String calleAux;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String numeroCalleAux;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String codigoPostalAux;

    @Size(max = 40)
    @NotNull
    @ApiModelProperty
    private String localidadAux;

    @Size(max = 3)
    @NotNull
    @ApiModelProperty
    private String provinciaAux;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String codigoCIU;

    @Size(max = 2)
    @NotNull
    @ApiModelProperty
    private String nivelTension;

    @Size(max = 3)
    @ApiModelProperty
    private String codigoPais;

    @Size(max = 2)
    @ApiModelProperty
    private String iC;

    @Size(max = 4)
    @ApiModelProperty
    private String cNT;

    @Size(max = 25)
    @ApiModelProperty
    private String cNTB2B;

    @Size(max = 20)
    @ApiModelProperty
    private String telefono;

    @Size(max = 20)
    @ApiModelProperty
    private String cuentaContrato;

    @Size(max = 4)
    @ApiModelProperty
    private String codigoServicio;

    @Size(max = 2)
    @ApiModelProperty
    private String tax;

    @Size(max = 2)
    @ApiModelProperty
    private String region;

    @Size(max = 3)
    @ApiModelProperty
    private String partido;

    @Size(max = 3)
    @ApiModelProperty
    private String pais;

    @Size(max = 20)
    @ApiModelProperty
    private String contractIDAux;

    @Size(max = 4)
    @NotNull
    @ApiModelProperty
    private String sucursal;

    @Size(max = 4)
    @ApiModelProperty
    private String tarifaCliente;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String podId;

    @Size(max = 10)
    @ApiModelProperty
    private String consumoEstimado;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String numeroDeFases;

    @Size(max = 20)
    @NotNull
    @ApiModelProperty
    private String transLoss;

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

    @ApiModelProperty
    @Size(max = 9)
    private String demandaContratadaEnPicoB2B;

    @ApiModelProperty
    @Size(max = 9)
    private String demandaContratadaB2B;

    @Size(max = 1)
    @NotNull
    @ApiModelProperty
    private String grupoCliente;

    @Size(max = 1)
    @NotNull
    @ApiModelProperty
    private String regionInstalacion;

    @NotNull
    @ApiModelProperty
    private int costoInstalacion;

    @Size(max = 10)
    @ApiModelProperty
    private String executiveC;

    @Size(max = 8)
    @NotNull
    @ApiModelProperty
    private String claseSubClase;

    @Size(max = 9)
    @ApiModelProperty
    private String generacionDemandaContratada;


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

    public int getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(int solicitante) {
        this.solicitante = solicitante;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public Date getFechaAltaContrato() {
        return fechaAltaContrato;
    }

    public void setFechaAltaContrato(Date fechaAltaContrato) {
        this.fechaAltaContrato = fechaAltaContrato;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCuitCuil() {
        return cuitCuil;
    }

    public void setCuitCuil(String cuitCuil) {
        this.cuitCuil = cuitCuil;
    }

    public String getCodigoFiscal() {
        return codigoFiscal;
    }

    public void setCodigoFiscal(String codigoFiscal) {
        this.codigoFiscal = codigoFiscal;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoDeSuministro() {
        return tipoDeSuministro;
    }

    public void setTipoDeSuministro(String tipoDeSuministro) {
        this.tipoDeSuministro = tipoDeSuministro;
    }

    public String getDireccionAlternativa() {
        return direccionAlternativa;
    }

    public void setDireccionAlternativa(String direccionAlternativa) {
        this.direccionAlternativa = direccionAlternativa;
    }

    public String getCuentaMadre() {
        return cuentaMadre;
    }

    public void setCuentaMadre(String cuentaMadre) {
        this.cuentaMadre = cuentaMadre;
    }

    public String getTypeC() {
        return typeC;
    }

    public void setTypeC(String typeC) {
        this.typeC = typeC;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public Date getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public String getCalleAux() {
        return calleAux;
    }

    public void setCalleAux(String calleAux) {
        this.calleAux = calleAux;
    }

    public String getNumeroCalleAux() {
        return numeroCalleAux;
    }

    public void setNumeroCalleAux(String numeroCalleAux) {
        this.numeroCalleAux = numeroCalleAux;
    }

    public String getCodigoPostalAux() {
        return codigoPostalAux;
    }

    public void setCodigoPostalAux(String codigoPostalAux) {
        this.codigoPostalAux = codigoPostalAux;
    }

    public String getLocalidadAux() {
        return localidadAux;
    }

    public void setLocalidadAux(String localidadAux) {
        this.localidadAux = localidadAux;
    }

    public String getProvinciaAux() {
        return provinciaAux;
    }

    public void setProvinciaAux(String provinciaAux) {
        this.provinciaAux = provinciaAux;
    }

    public String getCodigoCIU() {
        return codigoCIU;
    }

    public void setCodigoCIU(String codigoCIU) {
        this.codigoCIU = codigoCIU;
    }

    public String getNivelTension() {
        return nivelTension;
    }

    public void setNivelTension(String nivelTension) {
        this.nivelTension = nivelTension;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getIC() {
        return iC;
    }

    public void setIC(String iC) {
        this.iC = iC;
    }

    public String getCNT() {
        return cNT;
    }

    public void setCNT(String cNT) {
        this.cNT = cNT;
    }

    public String getCNTB2B() {
        return cNTB2B;
    }

    public void setCNTB2B(String cNTB2B) {
        this.cNTB2B = cNTB2B;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuentaContrato() {
        return cuentaContrato;
    }

    public void setCuentaContrato(String cuentaContrato) {
        this.cuentaContrato = cuentaContrato;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContractIDAux() {
        return contractIDAux;
    }

    public void setContractIDAux(String contractIDAux) {
        this.contractIDAux = contractIDAux;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTarifaCliente() {
        return tarifaCliente;
    }

    public void setTarifaCliente(String tarifaCliente) {
        this.tarifaCliente = tarifaCliente;
    }

    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public String getConsumoEstimado() {
        return consumoEstimado;
    }

    public void setConsumoEstimado(String consumoEstimado) {
        this.consumoEstimado = consumoEstimado;
    }

    public String getNumeroDeFases() {
        return numeroDeFases;
    }

    public void setNumeroDeFases(String numeroDeFases) {
        this.numeroDeFases = numeroDeFases;
    }

    public String getTransLoss() {
        return transLoss;
    }

    public void setTransLoss(String transLoss) {
        this.transLoss = transLoss;
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

    public String getGrupoCliente() {
        return grupoCliente;
    }

    public void setGrupoCliente(String grupoCliente) {
        this.grupoCliente = grupoCliente;
    }

    public String getRegionInstalacion() {
        return regionInstalacion;
    }

    public void setRegionInstalacion(String regionInstalacion) {
        this.regionInstalacion = regionInstalacion;
    }

    public int getCostoInstalacion() {
        return costoInstalacion;
    }

    public void setCostoInstalacion(int costoInstalacion) {
        this.costoInstalacion = costoInstalacion;
    }

    public String getExecutiveC() {
        return executiveC;
    }

    public void setExecutiveC(String executiveC) {
        this.executiveC = executiveC;
    }

    public String getClaseSubClase() {
        return claseSubClase;
    }

    public void setClaseSubClase(String claseSubClase) {
        this.claseSubClase = claseSubClase;
    }

    public String getGeneracionDemandaContratada() {
        return generacionDemandaContratada;
    }

    public void setGeneracionDemandaContratada(String generacionDemandaContratada) {
        this.generacionDemandaContratada = generacionDemandaContratada;
    }
}
