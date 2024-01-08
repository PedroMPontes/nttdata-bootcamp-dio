/* WHEN Statement
fun main() {
    cases("Hello")
    cases(1)
    cases(0L) // O "L" representa que é long
    cases("hello")

}

fun cases(obj: Any){ //O tipo "Any" recebe qualquer coisa

   when(obj){

       1 -> println("One")
       "Hello" -> println("Greeting")
       is Long -> println("Long")
       !is String -> println("Não é um String")
       else -> println("Unknow") //Nesse caso o else é como o "default"
   }

} */

/* WHEN EXPRESSION
fun main(){

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))

}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }

    return result
    // Nesse caso, o when é usado para atribuir um valor ao "val result"
}
*/

/* LOOP FOR
fun main(){

    // CRIA UMA LISTA DE STRINGS
    val cakes = listOf("carrot", "cheese", "chocolate")

    // FOR PERCORRE A LISTA
    for (cake in cakes){
        println("Cakes: $cake")
    }

}
*/

/* LOOP WHILE E DO WHILE
fun main(){

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5){

        eatACake()
        cakesEaten++

    }

    do {

        bakeCake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}

fun eatACake() = println("Eat a Cake")
fun bakeCake() = println("Bake a Cake")
*/

/* LOOP Iterators

class Animal (val name: String)
class Zoo(val animals: List<Animal>) {

    //OPERATOR FUN é uma função que cria em uma classe a possibilidade de fazer uma repetição

        operator fun iterator(): Iterator<Animal>{
            return animals.iterator()
        }
}

fun main(){

    val animals = listOf(Animal("Zebra"), Animal("Lion"));

    for (animal in animals){

        println(animal.name)

    }

}
*/

/* RANGES: LOOP COM INT

fun main(){

    for (i in 0..3){
        println(i)
        // Nesse caso vai de zero até 03 inclusive
    }

    println("")

    for (i in 0 until 3){
        println(i)
        //Nesse caso é de 0 a 3 exclusive, o três não vai ser imprimido
    }

    println("")

    for (i in 2..8 step 2){
        println(i)
        // De 2 até 8 de dois em dois
    }

    println("")

    for(i in 3 downTo 0){
        println(i)
        // de 3 a 0, decrescente
    }

}

*/

/* RANGES: Ifs e Loops com Char

fun main(){

    for(i in 'a'..'d'){
        println(i)
        // vai de a até d
    }

    println("")

    for (i in 'z' downTo 's' step 2){
        println(i)
        // Decremetanta de 2 em dois
    }

    println("")

    val numero = 2

    if (numero in 1..5){
        println("$numero is in range from 1 to 5")
    }

    if (numero !in 6..10){
        println("$numero is not in range from 6 to 10")
    }

}

*/

/* VERIFICAÇÃO DE IGUALDADE == e ===

fun main(){

    // o set é uma lista não aceita registros duplicados
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // vai retornar true porque o "==" é uma comparação estrutural

    println(authors === writers) // retorna false porque o "===" é uma comparação referencial

}

*/

/* Expressão condicional (If else mais simples)

fun main(){

    fun maior(numero1: Int, numero2: Int) = if (numero1 > numero2) numero1 else numero2

    println(maior(99,-3))

}

*/

/* Listas List

// Uma list é uma estrutura de dados ordenada, e pode ser uma lista imutavel ou mutavel
// A função listOf() cria uma lista "read-only", ou seja, uma lista imutavel
// O mutableListOf() cria suma lista mutavel


val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int){
    systemUsers.add(newUser)
}
fun getSysSudoers(): List<Int>{
    return sudoers
}
fun main(){

    addSystemUser(4)
    println("Total sudoers: ${getSysSudoers().size}" )

    getSysSudoers().forEach{
        i -> println("Soma useful info on user $i")
    }
}

*/

/* CONJUNTOS (SET)
// São similares as lista, a diferença é que a lista de dados "SET" não são ordenados e não permitem duplicados
// set() cria uma lista imutavel
// mutableSetOf() cria uma lista mutavel

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
fun addIssue(uniqueDescr: String): Boolean{
    return openIssues.add(uniqueDescr)
}
fun getStatus(isAdded: Boolean): String {

    return if (isAdded) "registered correctly." else "marked as duplicate and rejected"
}

fun main(){

    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatus(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatus(addIssue(anIssueAlreadyIn))}")
}

*/

/* MAPAS (Map)
//mapOf e multableMapOf() funciona igual as os outros tipos de listas

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int){

    if (EZPassAccounts.containsKey(accountId)){
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("ERROR: Trying to update a non-existing account (id: $accountId)")
    }

}

fun accountsReport(){
    println("EZ-Pass report:")
    EZPassAccounts.forEach {
        k,v -> println("ID $k: credit $v")
    }
}

fun main(){

    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}

*/

// FUNÇÕES UTEIS

/* filter -> filtra os elementos dentro de uma coleção com base em uma condiçaõ

fun main(){

    val numbers = listOf(1, 2, 3, -4, 5, -6)
    val positives = numbers.filter { it > 0 }
    val negatives = numbers.filter { it < 0 }

    println("Numbers: $numbers")
    println("Postives: $positives")
    println("Negatives: $negatives")
}
*/

/* map -> usado para fazer uma transformação de dados

fun main(){

    val numbers = listOf(1, 2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 } // Multiplica todos os numeros pode dois
    val triple = numbers.map { it * 3 } // multiplica todos po 3

    println("Numbers: $numbers")
    println("Postives: $doubled")
    println("Negatives: $triple")

}
*/

// flatMap

fun main(){

    val fruitsBag = listOf("Apple", "Orange", "Banana", "Grapes")
    val clothesBag = listOf("Shirts", "Pants", "Jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val floatMapBag = cart.flatMap { it } // o flatMap vai unir as duas listas

    println("Your bags are: $mapBag")
    println("The things you bought are: $floatMapBag")

}







