package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose Emanuel",
        cpf = "123.456.789-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}