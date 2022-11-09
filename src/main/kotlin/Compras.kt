/* 4 - AS MAÇAS CUSTAM R$0,30 CADA SE FOREM COMPRADAS MENOS DO QUE UMA DÚZIA, E R$0,25 SE FOREM COMPRADAS
* PELO MENOS DOZE. ESCREVA UM PROGRAMAQUE LEIA O NÚMERO DE MAÇÃS COMPRADAS, CALCULE E ESCREVA O VALOR
* TOTAL DA COMPRA*/

class Compras {
    fun macas(){
        println("Atenção!!! Caso compre mais de 6 unidades as maças de R$0,30 passa a ser R$0,25 ")
        println("Digite a quantidade de maças que deseja: ")
        val quantidadeMacas = readln().toInt()

        val valorMacasSemDesconto = 0.30
        val valorMacasComDesconto = 0.25

        if (quantidadeMacas <= 6){
            val totalMacaSemDesconto = quantidadeMacas * valorMacasSemDesconto
            println("O valor total da compra ficou em R$$totalMacaSemDesconto")
        } else{
            val totalMacasComDesconto = quantidadeMacas * valorMacasComDesconto
            println("O valor total da compra ficou em R$$totalMacasComDesconto")
        }

    }
}