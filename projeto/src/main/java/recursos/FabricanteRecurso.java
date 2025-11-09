package recursos;

import java.util.List;

import entidades.Fabricante;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("fabricantes")
public class FabricanteRecurso {

    @GET
    public List<Fabricante> listar() {
        return Fabricante.listAll();
    }

    @POST
    @Transactional
    public Response salvar(Fabricante fabricante) {
        fabricante.persist();
        return Response.status(Response.Status.CREATED).entity(fabricante).build();
    }
}
