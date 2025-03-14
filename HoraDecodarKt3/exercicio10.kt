fun main() {

    var num_tabu: Int

    do {
        println("Digite um valor para N (maior que 0): ")
        num_tabu = readln().toInt()

        if (num_tabu < 0) {
            println("Valor inválido! N deve ser maior que 0.")
        }
    } while (num_tabu < 0)

    println("Tabuadas de 1 até $num_tabu")

    var tabu_atual = 1
    while (tabu_atual <= num_tabu) {
        println("Tabuada do $tabu_atual")

        var mult = 1
        while (mult <= 10) {
            println("$tabu_atual x $mult = ${tabu_atual * mult}")
            mult = mult + 1
        }
        tabu_atual = tabu_atual + 1

    }
}