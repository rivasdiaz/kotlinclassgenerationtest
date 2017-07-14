package kotlinclassgenerationtest

fun main(args: Array<String>) {
    A().test().execute()
}

class A {
    fun test(): B = B(){
        println("hello world")
    }
}

class B(val action:() -> Unit){
    fun execute() = action()
}
