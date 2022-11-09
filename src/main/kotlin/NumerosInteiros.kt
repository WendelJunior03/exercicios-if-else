class NumerosInteiros {
    fun numeros(){
        println("Escreva 3 numeros: ")
        println("Escreva o primeiro número: ")
        val num1 = readln().toInt()

        println("Escreva o segundo número: ")
        val num2 = readln().toInt()

        println("Escreva o terceiro número: ")
        val num3 = readln().toInt()

        if (num1 > num2 && num1 > num3 && num2 > num3 ){
            println("$num3, $num2, $num1")
        }else
            if (num2 > num1 && num2 > num3)
                println("$num3, $num1, $num2")
        else
            if (num3 > num1 && num3 > num2)
                println("$num1, $num2, $num3")
        else
            if (num1 == num2 || num1 == num3 || num2 == num3)
                println("Não pode ser digitado numeros iguais, favor digitar novamente! ")

    }

}