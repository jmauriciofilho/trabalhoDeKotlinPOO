package br.unifor.unifor_bank

import br.unifor.unifor_bank.entidades.*
import br.unifor.unifor_bank.servico.*

fun main(args: Array<String>) {
    val agencia = Agencia(1, "BB", 1234)
    val correntista = PessoaFisica(1, "Jose", "jose@email.com", "default", "03739802308")
    val conta = ContaCorrente(1, agencia, correntista, 123456, 100.00, 100.00)
    val contaPoupanca = ContaPoupanca(3, agencia, correntista, 456789, 50.00)

    val agencia2 = Agencia(2, "BB", 5678)
    val correntista2 = PessoaFisica(2, "Paulo", "paulo@email.com", "default", "03456702406")
    val conta2 = ContaCorrente(2, agencia2, correntista2, 234567, 100.00, 100.00)
    val contaSalario = ContaSalario(4, agencia2, correntista2, 456789, 50.00)

    val atm = ATM()
    atm.executarATM(agencia, conta, conta2)
}
