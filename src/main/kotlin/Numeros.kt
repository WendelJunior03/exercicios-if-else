/*Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever
* o maior deles*/

class Numeros {

    fun doisNumeros(){
        println("Digite um numero: ")
        val num1 = readln().toInt()

        println("Digite outro número: ")
        val num2 = readln().toInt()

        if (num1 == num2){
            println("Os numeros são iguais, favor digitar numero diferentes.")
        } else {
        if (num1 > num2){
            println("o número $num1 (primeiro número digitado) é maior que o número $num2 ")
        } else{
            println("O número $num2 (segundo número digitado) é maior que o número $num1")
        }
        }
    }
}