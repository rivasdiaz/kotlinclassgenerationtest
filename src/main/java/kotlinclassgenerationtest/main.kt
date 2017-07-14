package kotlinclassgenerationtest

fun main(args: Array<String>) {
    Container().action().execute()
}

class Container {

    fun action(): Function = Function() {
        println("hello world")
    }
}

class Function(val block:() -> Unit){

    fun execute() = block()
}
