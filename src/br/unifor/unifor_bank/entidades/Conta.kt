package br.unifor.unifor_bank.entidades

abstract class Conta(
        val id:Long,
        val agencia: Agencia,
        val cliente: Pessoa,
        val numero: Int,
        var saldo:Double)