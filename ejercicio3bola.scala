println("Descuentos")
println("¿Cùal es el precio de su articulo?")
val precio=readInt()
println("Escoje una bolita para saber tu descuento")
println("-Blanca")
println("-Roja")
println("-Azul")
println("-Verde")
println("-Amarilla")
val bola=readLine()
bola match{
case "blanca" =>{
 println("Lo siento. No se efecutuara descuento alguno.")
 println("Su total a pagar sera de: ")
 print(precio)
 println("")
}
case "roja" =>{
 println("Felicidades se llevara su penda con un descuento de 100%.")
 println("Su total a pagar sera de: ")
 val ptotal=precio-(precio*1)
 print(ptotal)
 println("")
}
case "azul" =>{
 println("Sorprendente, usted tiene un 50/50, se le efectuara un descuento de 50%.")
 println("Su total a pagar sera de: ")
 val ptotal=precio-(precio*.5)
 print(ptotal)
 println("")
}
case "amarilla" =>{
 println("Al menos no es un 10%, obtuvo un descuento de 25%.")
 println("Su total a pagar sera de: ")
 val ptotal=precio-(precio*.25)
 print(ptotal)
 println("")
}
case "verde" =>{
 println("Pudo pagar todo. descuento de 10%.")
 println("Su total a pagar sera de: ")
 val ptotal=precio-(precio*.1)
 print(ptotal)
 println("")
}
case default => println("Bola inexistente. Se perdio la oportunidad de un descuento.")
}
println("Gracias por su compra.")
