package br.unifor.unifor_bank.servico

import br.unifor.unifor_bank.entidades.Agencia
import br.unifor.unifor_bank.entidades.Conta

class ATM {
    fun executarATM(agencia : Agencia, conta: Conta, conta2: Conta) {
        var x = 0
        println("Olá, seja bem vindo ao BB!")
        do{
            println("Por favor, informe o numero da sua âgencia:")
            val numeroAgencia = readLine()?.toInt()
            println("Informe o numero da sua conta:")
            val numeroConta = readLine()?.toInt()
            if (numeroAgencia == agencia.numero && numeroConta == conta.numero){
                println("Informe sua senha:")
                val senha = readLine()
                if (senha == conta.cliente.senha){
                    do {
                        println("Selecione entre as seguintes opções: 1 - Saque, 2 - Tranferencia, 3 - Deposito, 4 - Saldo, 0 - sair")
                        val opcao = readLine()?.toInt()
                        var y = 0
                        when (opcao){
                            1 -> {
                                println("Informe o valor que deseja sacar:")
                                val valorSacado = readLine()?.toDouble()
                                if (valorSacado != null){
                                    val saque = Saque(conta, valorSacado)
                                    saque.executar()
                                    x = 5
                                    y = 5
                                }else{
                                    println("Erro na operação!")
                                    println("Tente novamente!")
                                    x = 5
                                    y = 5
                                }
                            }
                            2 -> {
                                println("Informe o valor da transferencia:")
                                val valorTransferencia = readLine()?.toDouble()
                                if (valorTransferencia != null){
                                    val transferencia = Transferencia(conta, conta2, valorTransferencia)
                                    transferencia.executar()
                                    x = 5
                                    y = 5
                                }else{
                                    println("Erro na operação!")
                                    println("Tente novamente!")
                                    x = 5
                                    y = 5
                                }
                            }
                            3 -> {
                                println("Informe o valor à depositar:")
                                val valorDeposito = readLine()?.toDouble()
                                if (valorDeposito != null){
                                    val deposito = Deposito(conta, valorDeposito)
                                    deposito.executar()
                                    x = 5
                                    y = 5
                                }else{
                                    println("Erro na operação!")
                                    println("Tente novamente!")
                                    x = 5
                                    y = 5
                                }
                            }
                            4 -> {
                                val saldo = Saldo(conta)
                                saldo.executar()
                                x = 5
                                y = 5
                            }
                            0 -> {
                                x = 0
                                y = 0
                            }
                        }
                    }while (y != 0)
                }else{
                    println("Dados incorretos!")
                    println("Tente novamente!")
                    x = 1
                }
            }else{
                println("Conta não encontrada!")
                println("Tente novamente!")
                x = 1
            }
        }while (x != 0)

        println("Bye, até a próxima!")
    }
}