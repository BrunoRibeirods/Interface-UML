package br.com.digitalhouse.exercicio

class ItemVenda(private val produto: String, private var quantidade: Int, private var valor: Double): IRecebivel {

    override fun totalizarReceita(): Double {
        return valor * quantidade
    }

    override fun ToString(): String{
        return "${quantidade}x de $produto total: ${totalizarReceita()}"
    }

}