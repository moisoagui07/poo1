var pinos = 8
var oyamel = 15
var cedros = 10

println("Programa de reforestacion.")
println("Ingresa los metros cuadrados a reforestar: ")
val metro2 = readFloat()
val hectarias= metro2/10000
println("Total de metros cuadrados: " + metro2)
println("Equivalente a " + hectarias + "hectarias.")

if(metro2 > 1000000){
	println("Se sembrara de la siguiente manera:  ")
	println("70% pinos.")
	println("20% oyameles")
	println("10% cedros")

	val metrosPino= (metro2*.70)/10
	val metrosOyamel= (metro2*.20)/15
	val metrosCedros= (metro2*.10)/18

	val totalPinos= metrosPino*pinos
	val totalOyamel= metrosOyamel*oyamel
	val totalCedros= metrosCedros*cedros

	println("Pinos. 8 cada 10m2. TOTAL: " + totalPinos)
	println("Oyamel. 15 cada 15m2. TOTAL: " + totalOyamel)
	println("Cedros. 10 cada 18m2. TOTAL: " + totalCedros)
 
 } else if(metro2 <= 1000000){
	println("Se sembrara de la siguiente manera:  ")
	println("50% pinos.")
	println("30% oyameles")
	println("20% cedros")

	val metrosPino= (metro2*.50)/10
	val metrosOyamel= (metro2*.30)/15
	val metrosCedros= (metro2*.20)/18

	val totalPinos= metrosPino*pinos
	val totalOyamel= metrosOyamel*oyamel
	val totalCedros= metrosCedros*cedros

	println("Pinos. 8 cada 10m2. TOTAL: " + totalPinos)
	println("Oyamel. 15 cada 15m2. TOTAL: " + totalOyamel)
	println("Cedros. 10 cada 18m2. TOTAL: " + totalCedros)

 }

