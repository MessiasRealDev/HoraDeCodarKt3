fun main(){
    var soma = 0.0
    var qtd = 0
    var media : Double

    println("Descubra a medias entre os 2 números digitados")
    println("Digite o primeiro número")
    var num1 = readln().toInt()

    println("Digite o segundo número")
    var num2 = readln().toInt()

    while (num1 <= num2){
        soma += num1
        qtd += 1
        num1 += 1
    }
    media = soma / qtd
    println("A média dos números digitados: $media")
}