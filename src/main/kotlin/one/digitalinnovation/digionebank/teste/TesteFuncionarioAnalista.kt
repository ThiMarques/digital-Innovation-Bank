package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val joao = Analista("Red Beiramar", "123456789", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}