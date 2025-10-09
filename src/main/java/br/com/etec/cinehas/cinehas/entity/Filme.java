//Daniel Alves - RM:251376
//Hernan Rodrigo - RM:251169

package br.com.etec.cinehas.cinehas.entity;
import br.com.etec.cinehas.cinehas.enums.ClassificacaoIndicativaEnum;
import br.com.etec.cinehas.cinehas.enums.GeneroEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_FILME")
public class Filme {
    @Id
    @Column(name = "ID_FILME")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "NR_DURACAO")
    private int duracao;
    @Column(name = "TP_GENERO")
    @Enumerated(EnumType.STRING)
    private GeneroEnum tipoGenero;
    @Enumerated(EnumType.STRING)
    private ClassificacaoIndicativaEnum tipoClassificacao;
    @Column(name = "NR_ANO")
    private int nrAno;
    @Column(name = "TX_CAPA")
    private String txCapa;
    @Column(name = "TX_DIRETOR")
    private String nomeDiretor;
    @Column(name = "TX_ELENCO")
    private String elenco;
    @Column(name = "TX_DESCRICAO")
    private String descricao;
    @Column(name = "NR_AVALIACAO")
    private double avaliacao;
    @Column(name = "NR_PRECO")
    private double nrPreco;
}
