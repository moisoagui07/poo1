println("Salario semanal")
println("Ingrese sus horas trabajadas en la semana: ")
val horas=readFloat()
val salario=horas*160
println("Su salario sera: ")
if(horas <= 40){
val salario=horas*160
println(" " + salario)
} else{
val salario=(40*160)+((horas-40)*200)
println(" " + salario)
}
