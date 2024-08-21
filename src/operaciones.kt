class operaciones(var n1:Double, var n2:Double) {
    fun suma(){
        var suma = n1+n2
        println("la suma es ${suma}")
    }
    fun resta(){
        var resta = n1-n2
        println("la resta es ${resta}")
    }
    fun div():Double{
        return n1/n2
    }
    fun mult():Double{
        return n1*n2
    }
    fun raiz(x:Double){
        var r= Math.sqrt(x)
        println("la raiz cuadrada es $r")
    }
    fun cuadrado(c:Double):Double{
        return Math.pow(c,2.0)
    }
    }
   /*class Operaciones(var n1: Double, var n2: Double) {
       private val operaciones: MutableList<() -> Unit> = mutableListOf()
       fun agregarOperacionBinaria(operacion: (Double, Double) -> Double, descripcion: String) {
           operaciones.add {
               val resultado = operacion(n1, n2)
               println("$descripcion: $resultado")
           }
       }
       fun agregarOperacionUnaria(operacion: (Double) -> Double, descripcion: String, valor: Double) {
           operaciones.add {
               val resultado = operacion(valor)
               println("$descripcion: $resultado")
           }
       }
       fun ejecutarOperaciones() {
           for (operacion in operaciones) {
               operacion()
           }
       }
   }

*/
