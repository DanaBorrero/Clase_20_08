class Operaciones(var n1: Double, var n2: Double) {

    fun suma(){
        var op = this.n1 + this.n2
        println("La suma de ${this.n1} y ${this.n2} es: $op")
    }
    fun res():Double{
        println("La resta de ${this.n1} y ${this.n2} es: ")
        return this.n1 - this.n2
    }
    fun div(n1: Double, n2: Double){
        var res = this.n1/this.n2
        println("La division de ${this.n1} y ${this.n2} es: $res")
    }
    fun raiz(d1: Double): Double{
        println("La raiz de ${n1} es: ")
        return Math.sqrt(d1)
    }

    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }


}
