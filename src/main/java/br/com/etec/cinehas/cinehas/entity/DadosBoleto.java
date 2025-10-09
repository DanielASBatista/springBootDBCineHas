//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Setter
@Getter

@Entity
@Table(name = "TBL_DADOS_BOLETO")
public class DadosBoleto {
    @Id
    @Column(name = "ID_DADOS_PAGAMENTO")
    private Long id;
    @OneToOne
    @MapsId
    @JoinColumn(name = "ID_DADOS_PAGAMENTO")
    private DadosPagamento dadosPagamento;
    @Column(name = "TX_LINHA_DIGITAVEL")
    private String linhaDigitavel;
    @Column(name = "TX_CODIGO_BARRAS")
    private String codigoBarras;
    @Column(name = "DT_VENCIMENTO")
    private LocalDate vencimento;
}
