
    import kotlin.math.PI
            import kotlin.math.pow
            import kotlin.math.sqrt
    fun main(args: Array<String>) {
        // Задача 1
        val exercises:Int = 13
        var exercisesSolved:Int = 0
        exercisesSolved+=1
        println(exercisesSolved)
        //задача 2
        val age:Int = 18
        exercisesSolved+=1
        println(exercisesSolved)
        //задача 3
        var age2:Double = 18.0
        age2=(18.0+30.0)/2
        exercisesSolved+=1
        println(exercisesSolved)
        println(age2)
        //zadacha4
        val testNumber:Double=22.0
        var evenOdd:Double=testNumber%2
        exercisesSolved+=1
        println(exercisesSolved)
        println(evenOdd)
        //zadacha5
        var ansver:Int=0
        ansver=((((ansver+1)+10)*10)shr 3)
        exercisesSolved+=1
        println(exercisesSolved)
        println(ansver)
        //zadacha6
        exercisesSolved+=1
        println(exercisesSolved)
        println("Использовать var потому что мы изменяем значение переменной ")
        //zadacha7
        val a: Int = 46
        val b: Int = 10
        val answer1: Int = (a * 100) + b
        val answer2: Int = (a * 100) + (b * 100)
        val answer3: Int = (a * 100) + (b / 10)
        exercisesSolved += 1
        println(exercisesSolved)
        println(answer1)
        println(answer2)
        println(answer3)
        //zadacha8
        (5*3)-((4/2)*2)
        exercisesSolved+=1
        println(exercisesSolved)
        //zadacha9
        val a1:Double = 6.0
        val b1:Double= 8.0
        val average:Double = (a1+b1)/2
        exercisesSolved+=1
        println(exercisesSolved)
        println(average)
        //zadacha10
        val fahrenheit:Double = 56.0
        val celcius: Double = (fahrenheit-32)/1.8
        exercisesSolved+=1
        println(exercisesSolved)
        println(celcius)
        //zadacha11
        val position: Int = 54
        val row: Int = position / 8
        val column: Int =  position % 8
        exercisesSolved += 1
        println(exercisesSolved)
        println(row)
        println(column)
        //zadacha12
        val degrees: Double = 230.0
        val radians: Double =  (degrees / 180) * PI
        exercisesSolved += 1
        println(exercisesSolved)
        println(radians)
        //zadacha13
        val x1:Double = 2.0
        val y1:Double = 4.0
        val x2:Double=1.0
        val y2:Double=4.0
        val distance:Double
        distance=sqrt((x2-x1).pow(2)+(y2-y1).pow(2))
        exercisesSolved+=1
        println(exercisesSolved)
        println(distance)
    }
