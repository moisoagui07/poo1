println("¿Asì que se quiere jubilar? Dime tu nombre: ")
val name= readLine()
println("Hola " + name + " ahora necesitamos saber su edad: ")
val edad=readFloat()
if (edad<60){
 println("Necesitamos saber su antiguedad en la empresa para contiunuar el proceso: ")
 val anti=readFloat()
 if(anti>=25){
    println(name + " sus datos proporcionados son los siguientes: ")
    println("Edad: " + edad + " Antigüedad: " + anti)
    println("A usted le corresponde la jubilacion por: Antigüedad Joven. ")
  } else {
    println("No cumple con la edad o antiüedad requerida para la jubilacion.")
    val ftiempo=25-anti
    val fedad=60-edad
    println("Requeriria " + fedad + " años o " + ftiempo + " de antigüedad. ")
  }
} else {
 println("Ahora ingrese su antigüedad: ")
 val anti=readFloat()
 if(anti>=25){
  println(name + " sus datos proporcionados son los siguientes: ")
  println("Edad: " + edad + " Antigüedad: " + anti)
  println("A usted le corresponde la jubilacion por: Antigüedad Adulta. ")
 } else {
  println(name + " sus datos proporcionados son los siguientes: ")
  println("Edad: " + edad + " Antigüedad: " + anti)
  println("A usted le corresponde la jubilacion por: Edad. ")
 }
}
