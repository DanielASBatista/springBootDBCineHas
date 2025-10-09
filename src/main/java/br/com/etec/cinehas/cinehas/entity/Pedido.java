//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import br.com.etec.cinehas.cinehas.enums.StatusPedidoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_PEDIDO")

public class Pedido {
    @Id
    @Column(name = "ID_PEDIDO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private StatusPedidoEnum statusPedidoEnum;
    @Column(name = "DT_CRIACAO")
    private LocalDateTime dataDoPedido;
    @Column(name = "TP_STATUS")
    private String statusPedido;
    @ManyToMany
    @JoinTable(name = "TBL_REL_PEDIDO_INGRESSO",
    joinColumns = @JoinColumn(name = "ID_PEDIDO"),
    inverseJoinColumns = @JoinColumn(name = "ID_INGRESSO"))

    private List<Ingresso> ingressos = new ArrayList<>();
}
