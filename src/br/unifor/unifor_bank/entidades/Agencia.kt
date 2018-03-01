package br.unifor.unifor_bank.entidades

data class Agencia(
        val id:Long,
        val nome:String,
        val numero:Int,
        val contas:List<Conta>)