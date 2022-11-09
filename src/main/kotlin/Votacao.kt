/* 2 - ESCREVA UM PROGRAMA PARA LER O ANO DE NASCIMENTO DE UMA PESSOA E ESCREVER UMA MENSAGEM QUE DIGA
* SE ELA PODERÁ VOTAR OU NÃO ESSE ANO (NÃO É NECESSÁRIO CONSIDERAR O MÊS EM QUE ELA NASCEU.)*/

class Votacao {
    fun anoVotacao(){
        println("Digite o Ano de nascimento:  ")
        val dataNascimento = readln().toInt()

        val resultado = 2022 - dataNascimento

        if(resultado < 16){
            println("Você não poderá votar! Idade inferior")
        }else {
            if (resultado > 70){
                println("Não é obrigatorio o seu voto!")
            }else {
                println("Você pode votar! não deixe de votar! ")
            }
        }
    }
}