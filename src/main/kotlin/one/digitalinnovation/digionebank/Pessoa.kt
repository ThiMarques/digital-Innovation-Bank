package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Thiago"

    var cpf: String = "123.456.789-10"
    private set
}

fun main () {
    val thiago = Pessoa()

    println(thiago)
    println(thiago.nome)
    println(thiago.cpf)
}