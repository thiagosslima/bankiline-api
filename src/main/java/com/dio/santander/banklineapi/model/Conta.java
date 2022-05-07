package com.dio.santander.banklineapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Conta {

    private Long numero;
    private Double saldo;
}
