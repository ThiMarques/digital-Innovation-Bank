package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val mario = Gerente("Paulo Plinio", "123456789", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(mario)

    TesteAutenticacao().autentica(mario)
}

