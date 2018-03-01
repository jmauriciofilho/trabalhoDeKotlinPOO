package br.unifor.unifor_bank.entidades

abstract class Pessoa(
        val id:Long,
        val nome:String,
        val email:String,
        val senha:String,
        val contas:List<Conta>) {
}