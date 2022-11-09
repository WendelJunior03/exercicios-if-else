/*VALIDAÇÃO DE SENHA SENHA VÁLIDA É "1234" FAZER UM PROGRAMA QUE VALIDE A SENHA E E DIZ ACESSO PERMITIDO
* ACESSO NEGADO*/

class Validacao {
    fun validacaoSenha(){
        print("Para abrir o armário digite a senha: ")
        val autenti = readln().toInt()

        val senha = 1234

        if (autenti == senha )
            println("ACESSO PERMITIDO! Senha Válida!")
        else
            println("ACESSO NEGADO! Senha inválida!")
    }
}