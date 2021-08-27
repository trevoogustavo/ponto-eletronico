package com.gustavo.pontoeletronico.services

import com.gustavo.pontoeletronico.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface ILancamentoService {

    fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento>

    fun buscarPorId(id: String): Lancamento?

    fun persistir(lancamento: Lancamento): Lancamento

    fun remover(id: String)
}