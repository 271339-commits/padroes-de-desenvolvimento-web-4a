package recursos;

import java.util.List;

import entidades.Categoria;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("categorias")
public class CategoriaRecurso {

    @GET
    public List<Categoria> listar() {
        return Categoria.listAll();
    }

    @POST
    @Transactional
    public Response  salvar(Categoria categoria) {
        categoria.persist();
        return Response.status(Response.Status.CREATED).entity(categoria).build();
    }
}
