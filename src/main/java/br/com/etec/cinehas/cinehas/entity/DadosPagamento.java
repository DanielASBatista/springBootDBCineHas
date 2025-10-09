//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "TBL_DADOS_PAGAMENTO")
public class DadosPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DADOS_PAGAMENTO")
    private Long id;
    @OneToOne
    @JoinColumn(name = "ID_PAGAMENTO", nullable = false)
    private Pagamento pagamento;
    @OneToOne(mappedBy = "dadosPagamento", cascade = CascadeType.ALL)
    private DadosCartao dadosCartao;

    @OneToOne(mappedBy = "dadosPagamento", cascade = CascadeType.ALL)
    private DadosPix dadosPix;
    @OneToOne(mappedBy = "dadosPagamento", cascade = CascadeType.ALL)
    private DadosBoleto dadosBoleto;
    }
