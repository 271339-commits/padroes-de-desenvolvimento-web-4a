package entidades;


import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Venda extends PanacheEntityBase {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   public Integer codigo;  
   public LocalDateTime horario;
   public Integer valortotal;
   public Integer quantidade_total; 
   
   @OneToOne
   public Cliente cliente;

      @ManyToOne
   public Funcionario Funcionario;
}
