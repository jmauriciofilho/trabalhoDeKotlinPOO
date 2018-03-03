package br.unifor.unifor_bank

import br.unifor.unifor_bank.entidades.Agencia
import br.unifor.unifor_bank.entidades.ContaCorrente
import br.unifor.unifor_bank.entidades.PessoaFisica
import br.unifor.unifor_bank.servico.Saldo
import br.unifor.unifor_bank.servico.Saque

fun main(args: Array<String>) {
    val agencia = Agencia(1, "BB", 1234)
    val correntista = PessoaFisica(1, "Jose", "jose@email.com", "default", "03739802308")
    val conta = ContaCorrente(1, agencia, correntista, 123456, 100.00, 100.00)


    aplicacao(agencia, conta)

}

fun aplicacao(agencia :Agencia, conta: ContaCorrente){
    println("Olá, seja bem vindo ao BB!")
    println("Por favor, informe o numero da sua âgencia:")
    val numeroAgencia = readLine()?.toInt()
    println("Informe o numero da sua conta:")
    val numeroConta = readLine()?.toInt()
    if (numeroAgencia == agencia.numero && numeroConta == conta.numero){
        println("Informe sua senha:")
        val senha = readLine()
        if (senha == conta.cliente.senha){
            println("Selecione entre as seguintes opções: 1 - Saque, 2 - Tranferencia, 3 - Deposito, 4 - Saldo")
            val opcao = readLine()?.toInt()
            when (opcao){
                1 -> {
                    println("Informe o valor que deseja sacar:")
                    val valorSacado = readLine()?.toDouble()
                    if (valorSacado != null){
                        val saque = Saque(conta, valorSacado)
                        saque.executar()
                    }else{
                        println("Erro na operação!")
                    }
                }
            }
        }else{
            println("Dados incorretos!")
        }
    }else{
        println("Conta não encontrada!")
    }
}