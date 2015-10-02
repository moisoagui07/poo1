def ejercicio1calificacion(){
 println("Calificacion de Algoritmos")
 println("Favor de incluir la calificacion de sus examenes parciales. ")
 println("Primera calificacion: ")
 val c1= readFloat()
 println("Segunda calificacion: ")
 val c2= readFloat()
 println("Tercera calificacion: ")
 val c3= readFloat()
 println("Examen final")
 val ef= readFloat()
 println("Calificacion trabajo final")
 val tf= readFloat()
 val promexpar= (c1 + c2 + c3)/3
 val cfinal= promexpar * .55 + ef * .3 + tf * .15
 println("Calificacion final: " + cfinal)

}

def ejercicio1hospital(){
 println("Hospital publico")
 println("Ingrese el monto a repartir")
 val monto=readFloat()
 println("De la siguiente manera se distrubuira el dinero")
 println("Ginecologia 40%")
 val gine=(monto/100)*40
 println(" " + gine)
 println("Traumatologia 30%")
 val traumat=(monto/100)*30
 println(" " + traumat)
 println("Pediatria 30%")
 val pediatria=(monto/100)*30
 println(" " + pediatria)

}
def ejercicio1porcentaje(){
 println("Cantidad 1")
 val cantidad1=readFloat()
 println("Cantidad 2")
 val cantidad2=readFloat()
 println("Cantidad 3")
 val cantidad3=readFloat()
 val ctotal=cantidad1+cantidad2+cantidad3
 println("Porcentaje 1")
 val p1=cantidad1*100/ctotal
 println("  " + p1)
 println("Porcentaje 2")
 val p2=cantidad2*100/ctotal
 println(" " + p2)
 println("Porcentaje 3")
 val p3=cantidad3*100/ctotal
 println("  " + p3) 

 }

 println("¿Qué aplicacion quieres ejecutar? ...")
 println("1) Ejercicio 1.1. Calificacio de Algoritmos. ")
 println("2) Ejercicio 1.2. Presupuesto para el hospital. ")
 println("3) Ejercicio 1.3. Porcentaje.")
 val opcion=readInt()

 opcion match {
 	case 1 => ejercicio1calificacion()
 	case 2 => ejercicio1hospital()
 	case 3 => ejercicio1porcentaje()
	case default => println("Aplicacion no no exixtente. ")
}
