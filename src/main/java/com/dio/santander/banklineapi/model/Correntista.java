package com.dio.santander.banklineapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Correntista {

    private Integer id;
    private String cpf;
    private String nome;
    private Conta conta;
}
