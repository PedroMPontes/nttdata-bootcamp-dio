package dio

/*FUNÇÕES

fun main(){
    printMessage("Olá, mundo")
    printMessageWithPrefix("Olá")
    println(sum(2,2))
    println(multiply(2,5))
}

fun multiply(x: Int, y:Int) = x * y /*Inline Function, função definida em uma única linha. e vai retornar
o produto, outra maneira de retornar valor*/

fun sum(numero1: Int, numero2: Int) : Int {
    return numero1 + numero2

    //Função que recebe dois inteiros como parametro e retorna um inteiro (a soma deles)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("$prefix $message")

    //O Parametro "prefix" tem um valor padrão "Info", não caso nessa passado nenhum valor
    // No println é usado a interpolação de strings, usando "$" antes das váriaves que queremos imprimir
}

fun printMessage(message: String): Unit{
    println(message)

   /* O "UNIT" é o tipo de retorno dessa função, nesse caso não retorna nada, não é necessário colocar
   "UNIT quando não retorna nada"*/
} */

// FUNÇÕES COM PARAMETROS "vararg"

/* fun main(){
    // No KOtlin, você pode definir uma funçoes dentro do espoco de outra função

    fun printAll(vararg messages: String){
        for(m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", prefix = "Greeting: "
    )
    //Aqui foi usado um argumento nomeado "prefix = "Greeting:" para definir o prefix

    fun Log (vararg entries: String){
        printAll(*entries)
    }

// "varags" indica que vamos passar uma quantidade indefinida de um determinado tipo
// Os valores passados serão tipo uma array
} */

/*
fun main(){
    //VARIAVEIS VAR E VAL

    var a: String = "Initial"
    println(a)

    val b: Int = 1
    println(b)

    val c = 3
    println(c)

    // O "var" uma váriavel mutável, ou seja, pode mudar

    // o "val" é imutavel, ou seja, não pode mudar

    /*O tipo da váriavel pode ou não ser declarada, caso não seja será usada a inferencia de tipo, o proprio
    compilador vai definir */

}
*/

/*
fun main(){

    //NULL SAFETY

    //Nesse casso não pode ser nulo porque eu estou falando que é uma string
    var neverNull: String = "This can't be null"
    neverNull = null

    //A "?" faz com que minha variavel aceite nulo
    var nullable: String? = "You can keep a null here"
    nullable = null

    //Aqui o compilador vai assumir que é um string, por tanto não pode ser nulo
    var inferreNonNull = "The compiler assumes non-null"
    inferreNonNull = null


    fun strLenght(notNull: String): Int {
        return notNull.length
    }

    strLenght(neverNull)
    strLenght(nullable)


    fun describeString(maybeString: String?): String{
        if (maybeString != null && maybeString.length > 0){
            return "String of leght: ${maybeString.length}"
        } else {
            return "Empty or null string"
        }

    }

    println(describeString("null"))

}
*/

/*
// CLASSES

class Custumer //Declaração da classe "Custumer", uma classe simples

class Contact (val id: Int, var email: String) //Classe "Contact", que recebe dois parametros de construção

fun main(){

    val custumer1 = Custumer() //Instanciando a classe "Custumer"
    val contact1 = Contact(1, "mary@gmail.com") //Instanciando a classe "Contact"

    println(contact1.id)
    contact1.email = "jane@gmail.com"
}
*/





