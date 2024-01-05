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


