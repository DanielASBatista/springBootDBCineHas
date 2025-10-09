//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import br.com.etec.cinehas.cinehas.enums.TipoIngressoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_INGRESSO")

public class Ingresso {
    @Id
    @Column(name = "ID_INGRESSO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TP_INGRESSO")
    @Enumerated(EnumType.STRING)
    private TipoIngressoEnum tipoIngressoEnum;
    @Column(name = "NR_PRECO")
    private double valorIngresso;
    @OneToOne
    @JoinColumn(name = "ID_SESSAO")
    private Sessao sessao;
    @OneToOne
    @JoinColumn(name = "ID_ASSENTO")
    private Assento assento;
    @ManyToMany(mappedBy = "ingressos")
    private List<Pedido> pedidos = new ArrayList<>();
}
