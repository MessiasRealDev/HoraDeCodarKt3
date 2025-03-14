fun main(){

    var N : Int

    println("Digite um valor para N (maior que 0): ")
    N = readln().toInt()

    println("Valores inteiros de 1 até  $N, :")
    for ( i in 1..N)
    {
        println(i)
    }
}