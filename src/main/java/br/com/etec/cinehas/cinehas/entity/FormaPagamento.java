//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import br.com.etec.cinehas.cinehas.enums.TipoPagamentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_FORMA_PAGAMENTO")


public class FormaPagamento {
    @Id
    @Column(name = "ID_FORMA_PAGAMENTO")
    private Integer id;
    @Column(name = "TX_NOME")
    private String nomeFP;
    @Column(name = "TP_TIPO")
    @Enumerated(EnumType.STRING)
    private TipoPagamentoEnum tipoPagamento;
}
