package recursos;

import java.util.List;

import entidades.Cliente;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("clientes")
public class ClienteRecurso {

    @GET
    public List<Cliente> listar() {
        return Cliente.listAll();
    }

    @POST
    @Transactional
    public Response salvar(Cliente cliente) {
        cliente.persist();
        return Response.status(Response.Status.CREATED).entity(cliente).build();
    }
}
