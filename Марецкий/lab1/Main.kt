

fun main() {
    println("Введите целое число:")
    var number1: Int? = readln().toIntOrNull();
    val a = number1

    println("Введите целое число:")
    var number2: Int? = readln().toIntOrNull();
    val b = number2
    if (a == null || b == null){
        println("Оба значения должны быть целыми числами.")
        return
    }
    if (number1 == null || number2 == null){
        println("Оба значения должны быть целыми числами.")
        return
    }


    while (number1 != 0 && number2 != 0){
        if (number1 > number2){
            number1 %= number2;
        }
        else {
            number2 %= number1
        }
    }
    val rezalt = number1 + number2;
    println("Наибольший общий делитель: ${rezalt}")
    val nok = a * b / rezalt

    println("Наименьшее общее кратное: ${nok}")
}

