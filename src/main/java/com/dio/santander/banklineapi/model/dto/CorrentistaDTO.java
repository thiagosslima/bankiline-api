package com.dio.santander.banklineapi.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CorrentistaDTO {

    private String nome;
    private String cpf;
}
