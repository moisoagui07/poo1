var opcion= "si"
println("¿Quisieras volver al menu? si/no. ")
opcion= readLine()
do{

	println("Estos son los cuatro problemas del primer examen. ")
	println("Por favor selecciona uno. ")
	println("1) Problema 1. Numeros. ")
	println("2) Problema 2. Calificaciones. ")
	println("3) Problema 3. Reloj. ")
	println("4) Problema 4. Tienda de Naranjas. ")
    
    var seleccion= readInt()
    seleccion match {
    	case 1 => examen1numeros()
    	case 2 => examen1calificacion()
    	case 3 => examen1reloj()
    	case 4 => examen1naranjas()
    	case default => println("Problema inexistente")     
    }
       


   def examen1numeros(){
  	 println("Este es el problema 1. ")
     var numero= 0
     var cantidadPositivos= 0
     var cantidadNegativos= 0
     var cantidadNeutros= 0

    for( i <- 1 to 20) {
	    println("Ingresa un numero " + (i))
	    numero = readInt()
	    if(numero > 0){
		    cantidadPositivos += 1
	    } else if(numero < 0){
	        cantidadNegativos += 1
	    } else{
		    cantidadNeutros += 1
	    }
	
    }

    println("Numeros positivos: " + cantidadPositivos)
    println("Numeros negativos: " + cantidadNegativos)
    println("Numeros neutros: " + cantidadNeutros)

  }

  def examen1calificacion(){
  	println("Este es el problema 2. ")
  	var menor=11.0
    var calificacion=0.0
    for(i <- 1 to 40){
         println("Ingresa tu calificacion " + (i) + ":")
         calificacion=readFloat()
    if(calificacion<menor){
        menor=calificacion
        }
    }
    println("La calificacion menor es: " + menor)


  }

  def examen1reloj(){
    println("Este es el poblema 3.  ")
    for(horas <- 0 to 23) {
	    for(minutos <- 0 to 59){
		    for( segundos <- 0 to 59) {

			println(horas + ":" + minutos + ":" + segundos)
		    }
	    }
	
    }

  }

  def examen1naranjas(){
       println("Este es el problema 4. ")
    var kilos = 0.0
    var totalCliente= 0.0 
    var totalTienda= 0.0

    println("Ingrese el precio del kilo de naranja: ")
    val precioKilo= readFloat()
    for( i <- 1 to 15) {
	   println("Cliente " + (i))
	   println("¿Cuantos kilos llevas? ")
	   kilos= readFloat()
	   totalCliente= precioKilo * kilos
	   if(kilos > 10){
		   totalCliente= totalCliente * 0.85
	
	    }

	   totalTienda += totalCliente
	   println("Tu total a pagar es de: " + totalCliente)
    }
    println("ingresos de la tienda: " + totalTienda)
  	
  }

} while(opcion == "si")