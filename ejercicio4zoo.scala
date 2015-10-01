var edad01=0
var edad12=0
var edad3mas=0
println("Que animal quieres examinar. Escoje entre a, b o c.")
println("a) Elefantes.")
println("b) Jirafas.")
println("c) Chimpances.")
val animal= readLine()
animal match{
  case "a" => {
      println("Elefantes.")
      for(i <- 1 to 20){
         println("La edad del Elefante " + (i) + " es de: ")
         val edad= readInt()
         println(edad)
         if(edad >= 0 && edad <= 1){
          edad01 = edad01 + 1
         }
         if(edad > 1 && edad < 3){
          edad12 = edad12 + 1
         }
         if(edad >= 3){
          edad3mas = edad3mas + 1
         }
      }
      val porcentaje01=(edad01*100)/20
      println("Elefantes de 0 a 1 año: " + porcentaje01 + "%")
      val porcentaje12=(edad12*100)/20
      println("Elefantes de 1 a 3 años: " + porcentaje12 + "%")
      val porcentaje3mas=(edad3mas*100)/20
      println("Elefantes de 3 o mas: " + porcentaje3mas + "%")

    }
  case "b" => {
        println("Jirafas.")
        for(i <- 1 to 15){
           println("La edad de la Jirafa " + (i) + " es de: ")
           val edad= readInt()
           println(edad)
           if(edad >= 0 && edad <= 1){
            edad01 = edad01 + 1
           }
           if(edad > 1 && edad < 3){
            edad12 = edad12 + 1
           }
           if(edad >= 3){
            edad3mas = edad3mas + 1
           }
        }
        val porcentaje01=(edad01*100)/15
        println("Jirafas de 0 a 1 año: " + porcentaje01 + "%")
        val porcentaje12=(edad12*100)/15
        println("Jirafas de 1 a 3 años: " + porcentaje12 + "%")
        val porcentaje3mas=(edad3mas*100)/15
        println("Jirafas de 3 o mas: " + porcentaje3mas + "%")
      }
    case "c" => {
          println("Chimpances.")
          for(i <- 1 to 40){
             println("La edad del Chimpance " + (i) + " es de: ")
             val edad= readInt()
             println(edad)
             if(edad >= 0 && edad <= 1){
              edad01 = edad01 + 1
             }
             if(edad > 1 && edad < 3){
              edad12 = edad12 + 1
             }
             if(edad >= 3){
              edad3mas = edad3mas + 1
             }
          }
          val porcentaje01=(edad01*100)/40
          println("Chimpances de 0 a 1 año: " + porcentaje01 + "%")
          val porcentaje12=(edad12*100)/40
          println("Chimpances de 1 a 3 años: " + porcentaje12 + "%")
          val porcentaje3mas=(edad3mas*100)/40
          println("Chimpances de 3 o mas: " + porcentaje3mas + "%")
        }

}
