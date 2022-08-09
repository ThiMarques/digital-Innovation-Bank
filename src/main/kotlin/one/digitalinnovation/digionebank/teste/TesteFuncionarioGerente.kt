package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista

fun main() {
    val mario = Analista("Paulo Plinio", "123456789", 5000.0)
    ImprimeRelatorioFuncionario.imprime(mario)
}

