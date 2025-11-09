package recursos;

import java.util.List;

import entidades.Funcionario;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("funcionarios")
public class FuncionarioRecurso {

    @GET
    public List<Funcionario> listar() {
        return Funcionario.listAll();
    }

    @POST
    @Transactional
    public Response salvar(Funcionario funcionario) {
        funcionario.persist();
         return Response.status(Response.Status.CREATED).entity(funcionario).build();
    }
}
