package recursos;

import java.util.List;

import entidades.Venda;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("vendas")
public class VendaRecurso {

    @GET
    public List<Venda> listar() {
        return Venda.listAll();
    }

    @POST
    @Transactional
    public Response salvar(Venda venda) {
        venda.persist();
         return Response.status(Response.Status.CREATED).entity(venda).build();
    }
}
