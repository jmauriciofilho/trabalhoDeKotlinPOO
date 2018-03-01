package br.unifor.unifor_bank.servico

import br.unifor.unifor_bank.entidades.Conta

class Saque(val conta: Conta, val valorSacado: Double): Servico {
    override fun executar() {
        if (conta.saldo >= valorSacado) {
            conta.saldo = conta.saldo - valorSacado
            println("Saque realizado com sucesso!")
        }else {
            println("Saldo insuficiente para saque!")
        }
    }
}