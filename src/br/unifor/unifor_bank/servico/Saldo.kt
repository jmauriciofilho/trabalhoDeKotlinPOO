package br.unifor.unifor_bank.servico

import br.unifor.unifor_bank.entidades.Conta
import br.unifor.unifor_bank.entidades.ContaCorrente
import br.unifor.unifor_bank.entidades.ContaPoupanca
import br.unifor.unifor_bank.entidades.ContaSalario

class Saldo(val conta: Conta):Servico {
    override fun executar() {
        when(conta){
            is ContaCorrente -> println("Saldo: ${conta.saldo + conta.limite}")
            is ContaPoupanca -> println("Saldo: ${conta.saldo}")
            is ContaSalario -> println("Saldo: ${conta.saldo}")
        }

    }

}