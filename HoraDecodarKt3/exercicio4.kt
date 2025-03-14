fun main(){
    var soma = 0.0
    var qtd = 0
    var num = 15
    var media : Double

    while(num <= 100){
        soma = soma + num
        qtd = qtd + 1
        num = num + 1
    }
    media = soma / qtd
    println("A média dos números entre 15 e 100 é: $media")
}