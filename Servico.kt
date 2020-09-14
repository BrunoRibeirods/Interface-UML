package br.com.digitalhouse.exercicio

class Servico(private val descricao: String, private var horas: Int, private var precoHora: Double): IRecebivel {

    override fun totalizarReceita(): Double {
        return precoHora * horas
    }

    override fun ToString(): String{
       return "O serviço $descricao foi realizado por $horas horas, total: ${totalizarReceita()}"
    }

}