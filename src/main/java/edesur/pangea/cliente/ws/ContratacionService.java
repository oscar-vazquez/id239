package edesur.pangea.cliente.ws;

import edesur.pangea.ws.SuccessAsyncResponse;
import io.swagger.annotations.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Api(value = "/", description = "Servicio de procesamiento de contratación")
public class ContratacionService {

    @POST
    @Path("/alta")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Procesar alta contrato", response = SuccessAsyncResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Request invalido"),
            @ApiResponse(code = 500, message = "Internal Error")
    })
    public Response alta(@ApiParam(value = "request", required = true) AltaContratoRequest request) {
        return null;
    }

    @POST
    @Path("/baja")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Procesar baja contrato", response = SuccessAsyncResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Request invalido"),
            @ApiResponse(code = 500, message = "Internal Error")
    })
    public Response baja(@ApiParam(value = "request", required = true) BajaContratoRequest request) {
        return null;
    }

    @POST
    @Path("/cambioTitular")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Procesar canbio titular contrato", response = SuccessAsyncResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Request invalido"),
            @ApiResponse(code = 500, message = "Internal Error")
    })
    public Response cambioTitular(@ApiParam(value = "request", required = true) CambioTitularRequest request) {
        return null;
    }

    @POST
    @Path("/cambioCondiciones")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Procesar canbio titular contrato", response = SuccessAsyncResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Request invalido"),
            @ApiResponse(code = 500, message = "Internal Error")
    })
    public Response cambioCondiciones(@ApiParam(value = "request", required = true) CambioCondicionesRequest request) {
        return null;
    }

}
