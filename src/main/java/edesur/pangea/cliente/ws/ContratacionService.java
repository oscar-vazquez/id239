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
    public Response process(@ApiParam(value = "request", required = true) AltaContratoRequest request) {
        return null;
    }

}
