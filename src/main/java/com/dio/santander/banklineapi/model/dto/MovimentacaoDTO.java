package com.dio.santander.banklineapi.model.dto;

import com.dio.santander.banklineapi.model.MovimentacaoTipo;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimentacaoDTO {

    private String descricao;
    private Double valor;
    private MovimentacaoTipo movimentacaoTipo;
    private Integer idConta;
}
