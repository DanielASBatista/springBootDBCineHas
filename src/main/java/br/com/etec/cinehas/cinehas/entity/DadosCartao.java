//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "TBL_DADOS_CARTAO")
public class DadosCartao {
    @Id
    @Column(name = "ID_DADOS_PAGAMENTO")
    private Long id;
    @OneToOne
    @MapsId
    @JoinColumn(name = "ID_DADOS_PAGAMENTO")
    private DadosPagamento dadosPagamento;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TX_NUMERO")
    private String numero;
    @Column(name = "TX_EXPIRACAO")
    private String expiracao;
    @Column(name = "TX_CODIGO")
    private String codigo;
    }
