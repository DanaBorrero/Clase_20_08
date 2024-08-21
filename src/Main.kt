fun main() {
    val s = Operaciones(7.9,15.6)
    s.suma()
    println(s.res())
    s.div(8.5,15.6)
    println(s.raiz(8.5))

    val s1 = Operaciones(9.8,3.2)
    val s2 = Operaciones(11.2,6.6)
    val s3 = Operaciones(6.3,7.8)
    val s4 = Operaciones(5.8,5.9)
    var listaOperaciones: MutableList<Operaciones> = mutableListOf()
    listaOperaciones.add(s)
    listaOperaciones.add(s1)
    listaOperaciones.add(s2)
    listaOperaciones.add(s3)
    listaOperaciones.add(s4)
    for (item in listaOperaciones) {
        println(item)
    }



}