//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "TBL_PAGAMENTO")
    public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAGAMENTO")
    private Long id;
    @Column(name = "NR_VALOR")
    private Double valor;
    @Column(name = "TP_STATUS")
    private String status;
    @ManyToOne
    @JoinColumn(name = "ID_PEDIDO")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "ID_FORMA_PAGAMENTO")
    private FormaPagamento formaPagamento;
    @OneToOne(mappedBy = "pagamento", cascade = CascadeType.ALL)
    private DadosPagamento dadosPagamento;
}
