fun main(){

    var qtd_num = 10
    var contador_in = 0
    var contador_fo = 0
    var valor : Double

    for(contador in 1 .. qtd_num){
        println("Digite o valor $contador, ")
        valor = readln().toDouble()

        if(valor >= 24.0 && valor <= 42.0){
            contador_in = contador_in + 1
        }
        else{
            contador_fo = contador_fo + 1
        }
    }
    println("A quantidade de números entre 24 e 42 são:  $contador_in, ")
    println("A quantidade de números que não estão entre 24 e 42: $contador_fo ")
}
