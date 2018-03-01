package br.unifor.unifor_bank.servico

import br.unifor.unifor_bank.entidades.Conta

class Transferencia(val contaSaida: Conta, val contaEntrada: Conta, val valorTransferido: Double): Servico {
    override fun executar() {
        if (contaSaida.saldo >= valorTransferido) {
            contaSaida.saldo = contaSaida.saldo - valorTransferido
            contaEntrada.saldo = contaEntrada.saldo + valorTransferido

            println("Transferência realizada com sucesso!")
        }else{
            println("Saldo insuficiente para transferência")
        }
    }
}