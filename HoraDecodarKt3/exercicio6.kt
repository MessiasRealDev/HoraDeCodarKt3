fun main(){
    var media : Double
    var aprovados = 0
    var resposta ="S"

    while(resposta == "S" || resposta == "s"){
        println("Digite a primeira nota")
        var nota1 = readln().toDouble()

        println("Digite a segunda nota")
        var nota2 = readln().toDouble()

        media = (nota1 + nota2) / 2
        println("Media final é: $media")

        if(media >= 9.5){
            println("Aluno aprovado")
            aprovados += 1
        }else{
            println("Aluno reprovado")
        }
        println("Calcular a média de outro aluno? (S/N):")
        resposta = readln()
    }
}