import java.util.*

class CalculoDePeso {
    fun pesoIdeal() {
        println("Quer saber seu peso ideal?")
        println("Digite sua altura: ")
        val altura = readln().toDouble()

        println("Digite seu sexo, para masculino (M), para feminino (F): ")
        val sexo= readln().uppercase() // aqui estou usando o uppercase não dar erro se o usuario digitar
        //uma letra minuscula

        if (sexo == "M") {
            val pesoMasc = (72.7 * altura) - 58
            println("Seu peso ideal é $pesoMasc kg")
        } else {
            if (sexo == "F") {
                val pesoFemi = (62.1 * altura) - 44.7
                println("Seu peso ideal é $pesoFemi kg")
            } else {
                println("Digite ou M ou F")
            }
        }


    }
}