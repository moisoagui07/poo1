var totaltiempo= 0.0
var promediotiempo= 0.0
var carrera= 0.0

println("Reto 5km")
println("Ingresa los minutos que haces")
for(i<-0 to 9){
  println("Que tiempo tardaste dia " + (i+1))
  carrera= readFloat()
  if(carrera>=16){
  println("No eres apto para esto")
  }
  totaltiempo+= carrera
  println("Acumulado del tiempo al dia " + (i+1) + ": " + totaltiempo)
  promediotiempo = totaltiempo/10
}
 println("Su promedio es: " + promediotiempo + "minutos")
 if(promediotiempo>15){
 println("Esta sobre el limite.")
 println("Definitivamente no es apto para esto, mejor ve a programar")
 }
