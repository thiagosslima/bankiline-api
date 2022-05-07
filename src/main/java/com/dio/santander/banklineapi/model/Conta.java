package com.dio.santander.banklineapi.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Conta {

    @Column(name = "conta_numero")
    private Long numero2;

    @Column(name = "conta_saldo")
    private Double saldo;
}
