package edesur.pangea.cliente.ws;

import edesur.pangea.ws.AsyncRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(value = "CambioTitularRequest")
public class CambioTitularRequest extends AsyncRequest {
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

    @ApiModelProperty
    private int solicitante;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String clienteAnterior;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String contractIDAnterior;

    @Size(max = 20)
    @NotNull
    @ApiModelProperty
    private String numeroContratoAnterior;

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

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String numeroCuenta;

    @Size(max = 20)
    @ApiModelProperty
    private String codigoEmpresaAux;

    @Size(max = 20)
    @ApiModelProperty
    private String codigoEmpresaAnterior;

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

    @Size(max = 20)
    @ApiModelProperty
    private String direccionPrincipal;

    @Size(max = 1)
    @ApiModelProperty
    private String esDireccionPrincipal;

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
    private String fraccion;

    @Size(max = 50)
    @ApiModelProperty
    private String mailPrincipal;

    @Size(max = 3)
    @ApiModelProperty
    private String cNTBanco;

    @Size(max = 15)
    @ApiModelProperty
    private String cNTAgencia;

    @Size(max = 18)
    @ApiModelProperty
    private String cNTCuenta;

    @Size(max = 60)
    @ApiModelProperty
    private String idnumberIE;

    @Size(max = 60)
    @ApiModelProperty
    private String idnumberIM;

    @Size(max = 60)
    @ApiModelProperty
    private String idnumberNIS;

    @Size(max = 60)
    @ApiModelProperty
    private String idnumberINB;

    @Size(max = 60)
    @ApiModelProperty
    private String idnumberRAMI;

    @Size(max = 20)
    @ApiModelProperty
    private String externalIDBanco;

    @Size(max = 10)
    @ApiModelProperty
    private String sDBanco;

    @Size(max = 10)
    @ApiModelProperty
    private String cNTCalle;

    @Size(max = 4)
    @ApiModelProperty
    private String cNTPago;

    @Size(max = 4)
    @NotNull
    @ApiModelProperty
    private String sector;

    @Size(max = 2)
    @NotNull
    @ApiModelProperty
    private String carat;

    @Size(max = 2)
    @NotNull
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
    private String tipoPago;

    @Size(max = 4)
    @ApiModelProperty
    private String datoBanco;

    @Size(max = 4)
    @ApiModelProperty
    private String acuseRecibo;

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

    @Size(max = 1)
    @ApiModelProperty
    private String modoEjecucion;

    @Size(max = 3)
    @ApiModelProperty
    private String codigoPais;

    @Size(max = 1)
    @ApiModelProperty
    private String contractFac1;

    @Size(max = 1)
    @ApiModelProperty
    private String contractFac2;

    @Size(max = 4)
    @NotNull
    @ApiModelProperty
    private String cNTInter;

    @Size(max = 2)
    @ApiModelProperty
    private String iC;

    @Size(max = 40)
    @ApiModelProperty
    private String datosBancario;

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

    @Size(max = 1)
    @ApiModelProperty
    private String cNTBloqueo;

    @Size(max = 4)
    @ApiModelProperty
    private String codigoServicio;

    @Size(max = 30)
    @ApiModelProperty
    private String formulariodefactura;

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

    @Size(max = 2)
    @ApiModelProperty
    private String indicadorIVA;

    @Size(max = 4)
    @ApiModelProperty
    private String iVAcondiciN;

    @ApiModelProperty
    private Date inicioBloqueo;

    @ApiModelProperty
    private Date finBloqueo;

    @Size(max = 15)
    @ApiModelProperty
    private String certifExenciN;

    @Size(max = 6)
    @ApiModelProperty
    private String excentoPorc;

    @Size(max = 20)
    @NotNull
    @ApiModelProperty
    private String contractIDAux;

    @Size(max = 4)
    @NotNull
    @ApiModelProperty
    private String sucursal;

    @Size(max = 2)
    @ApiModelProperty
    private String grupoCO;

    @Size(max = 4)
    @ApiModelProperty
    private String tarifaCliente;

    @Size(max = 35)
    @ApiModelProperty
    private String descripContract;

    @Size(max = 1)
    @ApiModelProperty
    private String tasaAlumbrado;

    @Size(max = 1)
    @ApiModelProperty
    private String bonusVIP;

    @Size(max = 1)
    @ApiModelProperty
    private String bonusEBP;

    @Size(max = 1)
    @ApiModelProperty
    private String bonusTIS;

    @Size(max = 10)
    @ApiModelProperty
    private String podId;

    @Size(max = 10)
    @ApiModelProperty
    private String consumoEstimado;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String aNEELID;

    @Size(max = 10)
    @NotNull
    @ApiModelProperty
    private String aNEELGroupId;

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

    @Size(max = 9)
    @ApiModelProperty
    private String demandaContratadaEnPicoB2B;

    @Size(max = 9)
    @ApiModelProperty
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
    private String premise;

    @Size(max = 2)
    @ApiModelProperty
    private String mailDigital;

    @Size(max = 10)
    @ApiModelProperty
    private String executiveC;

    @Size(max = 2)
    @ApiModelProperty
    private String sinImpuesto;

    @Size(max = 8)
    @NotNull
    @ApiModelProperty
    private String claseSubClase;

    @Size(max = 1)
    @ApiModelProperty
    private String discountRuralOption;

    @Size(max = 1)
    @ApiModelProperty
    private String discountSeasonalOption;

    @ApiModelProperty
    @Size(max = 9)
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

    public String getClienteAnterior() {
        return clienteAnterior;
    }

    public void setClienteAnterior(String clienteAnterior) {
        this.clienteAnterior = clienteAnterior;
    }

    public String getContractIDAnterior() {
        return contractIDAnterior;
    }

    public void setContractIDAnterior(String contractIDAnterior) {
        this.contractIDAnterior = contractIDAnterior;
    }

    public String getNumeroContratoAnterior() {
        return numeroContratoAnterior;
    }

    public void setNumeroContratoAnterior(String numeroContratoAnterior) {
        this.numeroContratoAnterior = numeroContratoAnterior;
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

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCodigoEmpresaAux() {
        return codigoEmpresaAux;
    }

    public void setCodigoEmpresaAux(String codigoEmpresaAux) {
        this.codigoEmpresaAux = codigoEmpresaAux;
    }

    public String getCodigoEmpresaAnterior() {
        return codigoEmpresaAnterior;
    }

    public void setCodigoEmpresaAnterior(String codigoEmpresaAnterior) {
        this.codigoEmpresaAnterior = codigoEmpresaAnterior;
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

    public String getEsDireccionPrincipal() {
        return esDireccionPrincipal;
    }

    public void setEsDireccionPrincipal(String esDireccionPrincipal) {
        this.esDireccionPrincipal = esDireccionPrincipal;
    }

    /**
     *
     * (Required)
     *
     */
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

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public String getMailPrincipal() {
        return mailPrincipal;
    }

    public void setMailPrincipal(String mailPrincipal) {
        this.mailPrincipal = mailPrincipal;
    }

    public String getCNTBanco() {
        return cNTBanco;
    }

    public void setCNTBanco(String cNTBanco) {
        this.cNTBanco = cNTBanco;
    }

    public String getCNTAgencia() {
        return cNTAgencia;
    }

    public void setCNTAgencia(String cNTAgencia) {
        this.cNTAgencia = cNTAgencia;
    }

    public String getCNTCuenta() {
        return cNTCuenta;
    }

    public void setCNTCuenta(String cNTCuenta) {
        this.cNTCuenta = cNTCuenta;
    }

    public String getIdnumberIE() {
        return idnumberIE;
    }

    public void setIdnumberIE(String idnumberIE) {
        this.idnumberIE = idnumberIE;
    }

    public String getIdnumberIM() {
        return idnumberIM;
    }

    public void setIdnumberIM(String idnumberIM) {
        this.idnumberIM = idnumberIM;
    }

    public String getIdnumberNIS() {
        return idnumberNIS;
    }

    public void setIdnumberNIS(String idnumberNIS) {
        this.idnumberNIS = idnumberNIS;
    }

    public String getIdnumberINB() {
        return idnumberINB;
    }

    public void setIdnumberINB(String idnumberINB) {
        this.idnumberINB = idnumberINB;
    }

    public String getIdnumberRAMI() {
        return idnumberRAMI;
    }

    public void setIdnumberRAMI(String idnumberRAMI) {
        this.idnumberRAMI = idnumberRAMI;
    }

    public String getExternalIDBanco() {
        return externalIDBanco;
    }

    public void setExternalIDBanco(String externalIDBanco) {
        this.externalIDBanco = externalIDBanco;
    }

    public String getSDBanco() {
        return sDBanco;
    }

    public void setSDBanco(String sDBanco) {
        this.sDBanco = sDBanco;
    }

    public String getCNTCalle() {
        return cNTCalle;
    }

    public void setCNTCalle(String cNTCalle) {
        this.cNTCalle = cNTCalle;
    }

    public String getCNTPago() {
        return cNTPago;
    }

    public void setCNTPago(String cNTPago) {
        this.cNTPago = cNTPago;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCarat() {
        return carat;
    }

    public void setCarat(String carat) {
        this.carat = carat;
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

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getDatoBanco() {
        return datoBanco;
    }

    public void setDatoBanco(String datoBanco) {
        this.datoBanco = datoBanco;
    }

    public String getAcuseRecibo() {
        return acuseRecibo;
    }

    public void setAcuseRecibo(String acuseRecibo) {
        this.acuseRecibo = acuseRecibo;
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

    public String getModoEjecucion() {
        return modoEjecucion;
    }

    public void setModoEjecucion(String modoEjecucion) {
        this.modoEjecucion = modoEjecucion;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getContractFac1() {
        return contractFac1;
    }

    public void setContractFac1(String contractFac1) {
        this.contractFac1 = contractFac1;
    }

    public String getContractFac2() {
        return contractFac2;
    }

    public void setContractFac2(String contractFac2) {
        this.contractFac2 = contractFac2;
    }

    public String getCNTInter() {
        return cNTInter;
    }

    public void setCNTInter(String cNTInter) {
        this.cNTInter = cNTInter;
    }

    public String getIC() {
        return iC;
    }

    public void setIC(String iC) {
        this.iC = iC;
    }

    public String getDatosBancario() {
        return datosBancario;
    }

    public void setDatosBancario(String datosBancario) {
        this.datosBancario = datosBancario;
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

    public String getCNTBloqueo() {
        return cNTBloqueo;
    }

    public void setCNTBloqueo(String cNTBloqueo) {
        this.cNTBloqueo = cNTBloqueo;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getFormulariodefactura() {
        return formulariodefactura;
    }

    public void setFormulariodefactura(String formulariodefactura) {
        this.formulariodefactura = formulariodefactura;
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

    public String getIndicadorIVA() {
        return indicadorIVA;
    }

    public void setIndicadorIVA(String indicadorIVA) {
        this.indicadorIVA = indicadorIVA;
    }

    public String getIVAcondiciN() {
        return iVAcondiciN;
    }

    public void setIVAcondiciN(String iVAcondiciN) {
        this.iVAcondiciN = iVAcondiciN;
    }

    public Date getInicioBloqueo() {
        return inicioBloqueo;
    }

    public void setInicioBloqueo(Date inicioBloqueo) {
        this.inicioBloqueo = inicioBloqueo;
    }

    public Date getFinBloqueo() {
        return finBloqueo;
    }

    public void setFinBloqueo(Date finBloqueo) {
        this.finBloqueo = finBloqueo;
    }

    public String getCertifExenciN() {
        return certifExenciN;
    }

    public void setCertifExenciN(String certifExenciN) {
        this.certifExenciN = certifExenciN;
    }

    public String getExcentoPorc() {
        return excentoPorc;
    }

    public void setExcentoPorc(String excentoPorc) {
        this.excentoPorc = excentoPorc;
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

    public String getGrupoCO() {
        return grupoCO;
    }

    public void setGrupoCO(String grupoCO) {
        this.grupoCO = grupoCO;
    }

    public String getTarifaCliente() {
        return tarifaCliente;
    }

    public void setTarifaCliente(String tarifaCliente) {
        this.tarifaCliente = tarifaCliente;
    }

    public String getDescripContract() {
        return descripContract;
    }

    public void setDescripContract(String descripContract) {
        this.descripContract = descripContract;
    }

    public String getTasaAlumbrado() {
        return tasaAlumbrado;
    }

    public void setTasaAlumbrado(String tasaAlumbrado) {
        this.tasaAlumbrado = tasaAlumbrado;
    }

    public String getBonusVIP() {
        return bonusVIP;
    }

    public void setBonusVIP(String bonusVIP) {
        this.bonusVIP = bonusVIP;
    }

    public String getBonusEBP() {
        return bonusEBP;
    }

    public void setBonusEBP(String bonusEBP) {
        this.bonusEBP = bonusEBP;
    }

    public String getBonusTIS() {
        return bonusTIS;
    }

    public void setBonusTIS(String bonusTIS) {
        this.bonusTIS = bonusTIS;
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

    public String getANEELID() {
        return aNEELID;
    }

    public void setANEELID(String aNEELID) {
        this.aNEELID = aNEELID;
    }

    public String getANEELGroupId() {
        return aNEELGroupId;
    }

    public void setANEELGroupId(String aNEELGroupId) {
        this.aNEELGroupId = aNEELGroupId;
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

    public String getPremise() {
        return premise;
    }

    public void setPremise(String premise) {
        this.premise = premise;
    }

    public String getMailDigital() {
        return mailDigital;
    }

    public void setMailDigital(String mailDigital) {
        this.mailDigital = mailDigital;
    }

    public String getExecutiveC() {
        return executiveC;
    }

    public void setExecutiveC(String executiveC) {
        this.executiveC = executiveC;
    }

    public String getSinImpuesto() {
        return sinImpuesto;
    }

    public void setSinImpuesto(String sinImpuesto) {
        this.sinImpuesto = sinImpuesto;
    }

    public String getClaseSubClase() {
        return claseSubClase;
    }

    public void setClaseSubClase(String claseSubClase) {
        this.claseSubClase = claseSubClase;
    }

    public String getDiscountRuralOption() {
        return discountRuralOption;
    }

    public void setDiscountRuralOption(String discountRuralOption) {
        this.discountRuralOption = discountRuralOption;
    }

    public String getDiscountSeasonalOption() {
        return discountSeasonalOption;
    }

    public void setDiscountSeasonalOption(String discountSeasonalOption) {
        this.discountSeasonalOption = discountSeasonalOption;
    }

    public String getGeneracionDemandaContratada() {
        return generacionDemandaContratada;
    }

    public void setGeneracionDemandaContratada(String generacionDemandaContratada) {
        this.generacionDemandaContratada = generacionDemandaContratada;
    }
}
