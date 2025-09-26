package br.com.etec.cinehas.cinehas.entity;

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
    private long id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "NR_DURACAO")
    int duracao;
    @Column(name = "TP_GENERO")
    String tipoGenero;
    @Column(name = "TP_CLASSIFICACAO")
    String tipoClassificacao;
    @Column(name = "NR_ANO")
    int nrAno;
    @Column(name = "TX_CAPA")
    String txCapa;
    @Column(name = "TX_DIRETOR")
    String nomeDiretor;
    @Column(name = "TX_ELENCO")
    String elenco;
    @Column(name = "TX_DESCRICAO")
    String descricao;
    @Column(name = "NR_AVALIACAO")
    double avaliacao;
    @Column(name = "NR_PRECO")
    double nrPreço;
}
