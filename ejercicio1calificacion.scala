
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
