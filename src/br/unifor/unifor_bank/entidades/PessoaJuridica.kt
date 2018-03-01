package br.unifor.unifor_bank.entidades

class PessoaJuridica(
        id: Long,
        nome: String,
        email: String,
        senha: String,
        contas: List<Conta>,
        val cnpj:String) : Pessoa(id, nome, email, senha, contas) {
}