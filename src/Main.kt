//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
//    printPrimes() //1
//    printReverseNumSequence(10) //2
//    diffDeclarationMethod() //3
//    replaceSubstring() //4
//    getAverage(doubleArrayOf(2.5, 1.8, 3.4)) //5
//    println("He was crying very loud".length) //6
//    initArray() //7
}


// 1
fun printPrimes() {
    for (i in 2..100) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }

    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }

    return true
}


// 2
fun printReverseNumSequence(n: Int) {
    if(n < 1) {
        return
    }

    print("$n ")

    printReverseNumSequence(n - 1)
}


/* 3 Это задание я закоменнтировал,
   потому что суть его выполнения подразумевает ошибку компиляции при переназначении переменной,
   объявленной с помощью val. В противном случае проект не скомпилируется */

/*
fun diffDeclarationMethod() {
    var a: String = "A"
    println("Значение переменной \"a\" при инициализации - $a")

    a = "B"
    println("Значение переменной \"a\" после переназначения - $a")

    val c: String = "C"

    c = "D" // Выбросит ошибку ещё на этапе компиляции,
            // поэтому обработать ошибку как я хотел (с помощью try catch) не выйдет
}
*/


// 4
fun replaceSubstring() {
    val s0: String = "He is crying very loud."
    println("Исходная строка - $s0")

    println("Результат замены подстроки - ${s0.replace("is", "was")}")
}


// 5
fun getAverage(arr: DoubleArray) {
    val sum: Double = arr.sum() //тут будет погрешность в связи с использованием типа double
    println("${sum / arr.size}")
}


//7
fun initArray() {
    val arr: Array<Int?> = arrayOfNulls<Int>(10)

    for(i in 0..9) {
        arr[i] = i*2
    }

   arr.map { n: Int? -> print("$n ") }
}