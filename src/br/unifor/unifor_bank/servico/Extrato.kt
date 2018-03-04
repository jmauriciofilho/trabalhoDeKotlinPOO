package br.unifor.unifor_bank.servico

import br.unifor.unifor_bank.entidades.Conta

class Extrato(val servicos: ArrayList<Servico>, val conta: Conta) :Servico {
    override fun executar() {

        println("Extrato detalhado")
        for (servico: Servico in servicos){
            when(servico){
                is Deposito -> println("Deposito realizado no valor de R$ ${servico.deposito}")
                is Saque -> println("Saque realizado no valor de R$ ${servico.valorSacado}")
                is Transferencia -> println("Tranferência realizada no valor de R$ ${servico.valorTransferido}")
            }
        }
        println("Seu saldo é de R$ ${conta.saldo}")
    }

}