package recursos;

import java.util.List;

import entidades.Produto;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoRecurso {

    @GET
    public List<Produto> listar() {
        return Produto.listAll();
    }

    @POST
    @Transactional
    public Response salvar(Produto produto) {
        produto.persist();
        return Response.status(Response.Status.CREATED).entity(produto).build();
    }
}
