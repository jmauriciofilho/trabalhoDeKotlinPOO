package br.unifor.unifor_bank.servico

import br.unifor.unifor_bank.entidades.Conta

class Deposito(var conta: Conta, var deposito: Double): Servico {
    override fun executar() {
        conta.saldo = conta.saldo + deposito
    }
}