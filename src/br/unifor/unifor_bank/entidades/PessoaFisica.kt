package br.unifor.unifor_bank.entidades

class PessoaFisica(
        id: Long,
        nome: String,
        email: String,
        senha: String,
        val cpf:String) : Pessoa(id, nome, email, senha)