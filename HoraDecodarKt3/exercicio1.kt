fun main(){
    var num2 : Double
    var resu : Double
    println("Digite o primeiro valor: ")
    var num1 = readln().toDouble()

    do{
        println("Digite o segundo valor (deve ser maior que zero): ")
        num2 = readln().toDouble()

        if (num2 <= 0)
        {
            println("Valor inválido! O segundo valor deve ser maior que zero.\n")
        }
    }
    while(num2 <= 0)

    resu = num1 / num2
    println("O resultado da divisão de $num1 por $num2 é $resu")
}

