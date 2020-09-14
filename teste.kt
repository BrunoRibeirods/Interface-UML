package br.com.digitalhouse.exercicio

fun main() {
    val celular = ItemVenda("Celular", 2, 1500.0)
    val televisao = ItemVenda("Televisao", 1, 3000.0)

    val eletricista = Servico("Eletricista", 4, 60.0)
    val hospedagem = Servico("Hospedagem", 15, 15.0)

    val registro = RegistroRecebimentos()
    registro.adicionarRecebimento(celular, televisao, eletricista, hospedagem)
    registro.apresentarRecebimentos()

}