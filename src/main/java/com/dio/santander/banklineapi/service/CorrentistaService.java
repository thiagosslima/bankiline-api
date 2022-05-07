package com.dio.santander.banklineapi.service;

import com.dio.santander.banklineapi.model.Conta;
import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.model.dto.CorrentistaDTO;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(CorrentistaDTO correntistaDTO) {
        Correntista correntista = new Correntista().builder()
                .nome(correntistaDTO.getNome())
                .cpf(correntistaDTO.getCpf())
                .conta(new Conta().builder()
                        .saldo(0.0)
                        .numero(new Date().getTime())
                        .build())
                .build();

        correntistaRepository.save(correntista);
    }
}
