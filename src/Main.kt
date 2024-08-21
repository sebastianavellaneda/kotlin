fun main() {
    var invocar =operaciones(2.0, 2.0)
    val lstop: MutableList<operaciones> = MutableList()

    lstop.add(invocar)
    for (number in lstop){
        println(number)
    }

    /*invocar.suma()
    invocar.resta()
    println("la division es "+invocar.div())
    println("la multiplicacion es "+invocar.mult())
    invocar.raiz(4.0)
    println("el cuadrado es ${invocar.cuadrado(4.0)}")*/
}
/*fun main() {
    val invocar = Operaciones(2.0, 2.0)
    invocar.agregarOperacionBinaria({ a, b -> a + b }, "La suma es")
    invocar.agregarOperacionBinaria({ a, b -> a - b }, "La resta es")
    invocar.agregarOperacionBinaria({ a, b -> a * b }, "La multiplicación es")
    invocar.agregarOperacionBinaria({ a, b -> if (b != 0.0) a / b else Double.NaN }, "La división es")
    invocar.agregarOperacionUnaria({ x -> Math.sqrt(x) }, "La raíz cuadrada es", 4.0)
    invocar.agregarOperacionUnaria({ x -> Math.pow(x, 2.0) }, "El cuadrado es", 4.0)
    invocar.ejecutarOperaciones()
}

*/