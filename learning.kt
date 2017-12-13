// подмассиві в котлине
val table = Array(3, { Array(3, {0}) })
table[0] = arrayOf(1, 2, 3)
table[1] = arrayOf(4, 5, 6)
table[3] = arrayOf(7, 8, 9)

val table = Array(3, { Array(3, {0}) })
table[0][1] = 6  // второй элемент первой строки
val n = table[0][1]     // n = 6


// инкременты и декременты

var x = 5
val y = ++x
println(x)      // x = 6
println(y)      // y = 6

var x = 5
val y = x++
println(x)      // x = 6
println(y)      // y = 5

var x = 5
val y = --x
println(x)      // x = 4
println(y)      // y = 4

var x = 5
val y = x--
println(x)      // x = 4
println(y)      // y = 5

// if else
val a = 10
val b = 20
val c = if (a > b){
    println("a = $a")
    a
} else {
    println("b = $b")
    b
}

// when
val a = 10
when(a){
    10 -> println("a = 10")
    20 -> println("a = 20")
    else -> println("неопределенное значение")
}

//
var a = 10
when(a){
    10 -> {
        println("a = 10")
        a *= 2
    }
    20 -> {
        println("a = 20")
        a *= 5
    }
    else -> { println("неопределенное значение")}
}
println(a)

// 
val a = 10
when(a){
    in 10..19 -> println("a в диапазоне от 10 до 19")
    in 20..29 -> println("a в диапазоне от 20 до 29")
    !in 10..20 -> println("a вне диапазона от 10 до 20")
    else -> println("неопределенное значение")
}

//
val sum = 1000
 
val rate = when(sum){
    in 100..999 -> 10
    in 1000..9999 -> 15
    else -> 20
}
println(rate)       // 15

// таблица умножения
for(i in 1..9){
    for(j in 1..9){
        print("${i * j} \t")
    }
    println()
}

// перебор массива в цикле
val phones: Array<String> = arrayOf("Galaxy S8", "iPhone X", "Motorola C350")
for(phone in phones){
    println(phone)
}

// while , do while
var i = 10
while(i > 0){
    println(i*i)
    i--;
}

var i = -1
do{
    println(i*i)
    i--;
}
while(i > 0)