package com.dio.santander.banklineapi.service;

import com.dio.santander.banklineapi.model.Conta;
import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.model.Movimentacao;
import com.dio.santander.banklineapi.model.MovimentacaoTipo;
import com.dio.santander.banklineapi.model.dto.CorrentistaDTO;
import com.dio.santander.banklineapi.model.dto.MovimentacaoDTO;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import com.dio.santander.banklineapi.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(MovimentacaoDTO movimentacaoDTO) {
        Double valorAtual = movimentacaoDTO.getMovimentacaoTipo() == MovimentacaoTipo.RECEITA
                ? movimentacaoDTO.getValor()
                : movimentacaoDTO.getValor() - 1;
        Movimentacao movimentacao = new Movimentacao().builder()
                .descricao(movimentacaoDTO.getDescricao())
                .valor(valorAtual)
                .movimentacaoTipo(movimentacaoDTO.getMovimentacaoTipo())
                .idConta(movimentacaoDTO.getIdConta())
                .build();

        Correntista correntista = correntistaRepository.findById(movimentacaoDTO.getIdConta()).orElse(null);
        if(correntista != null){
            correntista.getConta().setSaldo(correntista.getConta().getSaldo()+ valorAtual);
            correntistaRepository.save(correntista);
        }

        movimentacaoRepository.save(movimentacao);
    }
}
