println("Refacciones")
println("Pieza: $50")
println("Ingrese el total de piezas que quiere comprar")
val pieza=readFloat()
println("El valor de la compra es: ")
val tpieza=pieza*50
println(pieza + " = " + tpieza)
if(tpieza >= 500000){
println("Inversion empresa: ")
val iempresa=tpieza*.55
println(" " + iempresa)
println("Prestamo bancario: ")
val ibanco=tpieza*.30
println(" " + ibanco)
println("Credito fabricante: ")
val ifabrica=(tpieza*.15)
println(" " + ifabrica)
println("Credito Fabricante con intereses de '20%': ")
val tifabrica=ifabrica+(ifabrica*.20)
println(" " + tifabrica)
println("Valor neto de la compra: ")
val tcompra=iempresa+ibanco+tifabrica
println(" " + tcompra)
} else{
println("Inversion empresa: ")
val iempresa=tpieza*.70
println(" " + iempresa)
println("Credito fabricante: ")
val ifabrica=(tpieza*.30)
println(" " + ifabrica)
println("Credito Fabricante con intereses de '20%': ")
val tifabrica=ifabrica+(ifabrica*.20)
println(" " + tifabrica)
println("Valor neto de la compra: ")
val tcompra=iempresa+tifabrica
println(" " + tcompra)


}
