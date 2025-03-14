fun main(){
    var soma = 0.0
    var nota : Double
    var quantidade_notas = 6
    var media : Double

    for(contador in 1..quantidade_notas){
        do{
            println("Digite a nota $contador (entre 0 e 10): ")
            nota = readln().toDouble()

            if (nota >= 0.0 && nota <= 10.0)
            {
                soma = soma + nota
            }
            else
            {
                println("Nota inválida digite um valor entre 0 e 10. ")
            }
        }
        while(nota < 0.0 || nota > 10.0)
    }
    media = soma / quantidade_notas
    println("A média das , $quantidade_notas notas é: , $media ")
}