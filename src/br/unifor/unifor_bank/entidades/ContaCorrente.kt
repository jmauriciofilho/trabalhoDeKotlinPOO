package br.unifor.unifor_bank.entidades

class ContaCorrente(
        id: Long,
        agencia: Agencia,
        cliente: Pessoa,
        numero: Int,
        saldo: Double,
        val limite:Double) : Conta(id, agencia, cliente, numero, saldo) {
}