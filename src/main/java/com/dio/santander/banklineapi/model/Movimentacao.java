package com.dio.santander.banklineapi.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    private String descricao;

    private Double valor;

    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo movimentacaoTipo;

    @Column(name = "id_conta")
    private Integer idConta;
}
