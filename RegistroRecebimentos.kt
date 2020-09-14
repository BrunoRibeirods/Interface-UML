package br.com.digitalhouse.exercicio

class RegistroRecebimentos{
    var recebimentos = mutableListOf<IRecebivel>()

    fun adicionarRecebimento(vararg recebimento: IRecebivel) = recebimentos.addAll(recebimento)

    fun apresentarRecebimentos(){
        for(recebido in recebimentos){
            println(recebido.ToString())
        }
    }

}