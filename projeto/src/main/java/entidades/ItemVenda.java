package entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ItemVenda extends PanacheEntityBase {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     public Integer codigo;  
   public Integer valorParcial;
   public Integer quantidadeParcial;
 
     @OneToOne
   public Produto produto;

}
