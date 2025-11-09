package recursos;

import java.util.List;

import entidades.ItemVenda;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("itensvenda")
public class ItemVendaRecurso {

    @GET
    public List<ItemVenda> listar() {
        return ItemVenda.listAll();
    }

    @POST
    @Transactional
    public Response salvar(ItemVenda itemVenda) {
        itemVenda.persist();
        return Response.status(Response.Status.CREATED).entity(itemVenda).build();
    }
}
