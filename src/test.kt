import kotlin.math.absoluteValue

fun main() {


    /*
        val listOfSalary = listOf(
            listOf(10, 20, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        )
        for (i in listOfSalary.indices) {
            loopa@ for (j in listOfSalary.indices) {
                print(listOfSalary[i][j])
                break@loopa
            }
            print("\n")
        }
    }

    fun checkTemperatureUsingWhen(temperature: Float): String {
        return when (temperature) {
            in Float.NEGATIVE_INFINITY..0f -> "freezing"
            in 0f..10f -> "cold"
            in 10f..20f -> "cool"
            in 20f..30f -> "warm"
            in 30f..40f -> "hot"
            else -> {
                "error"
            }
        }
    }

    fun checkTemperature(temperature: Float): String {
        return if (temperature <= 0) {
            "freezing"
        } else if (temperature in 0f..10f) {
            "cold"
        } else if (temperature in 10f..20f) {
            "cool"
        } else if (temperature in 20f..30f) {
            "warm"
        } else if (temperature in 30f..40f) {
            "hot"
        } else if (temperature in 'a'.code.toFloat()..'z'.code.toFloat()) {
            "ascii"
        } else {
            return "error"
        }*/
    /*
    sudoku.check(
        name = "number is dividable on 3 , should return fizz",
        result = fizzBuzzNum(9),
        correctResult = "fizz"

    )
    sudoku.check(
        name = "number is dividable on 5 , should return fizz",
        result = fizzBuzzNum(20),
        correctResult = "buzz"

    )
    sudoku.check(
        name = "number is dividable on 3 and 5  , should return fizz buzz",
        result = fizzBuzzNum(15),
        correctResult = "fizz buzz"

    )
    sudoku.check(
        name = "if i enterd 11  , should return 1",
        result = fizzBuzzNum(1),
        correctResult = "1"

    )
    fizzBuzz(20)*/
    /* sudoku.check(
         name = "there is no even number in list so should return -1",
         result = findEvenNum(listOf(1, 3, 5, 7, 9)),
         correctResult = -1
     )
     sudoku.check(
         name = "there is a even number in list so should return it ",
         result = findEvenNum(listOf(1, 2, 3, 5, 7, 9)),
         correctResult = 2
     )
     sudoku.check(
         name = "there is a more one even number in list so should return first one",
         result = findEvenNum(listOf(1, 2, 3, 4, 5, 7, 9)),
         correctResult = 2
     )
     sudoku.check(
         name = "if list is empty will return -1",
         result = findEvenNum(listOf()),
         correctResult = -1
     )*/
    /*
        sudoku.check(
            name = "list is empty so it will return 0",
            result = isExit(listOf(), 1),
            correctResult = 0
        )
        sudoku.check(
            name = "is not exit so it will return 0",
            result = isExit(listOf(0, 2, 3, 4, 5, 6, 7), 1),
            correctResult = 0
        )
        sudoku.check(
            name = "is exit once so it will return 1",
            result = isExit(listOf(1, 2, 3, 4, 5, 6, 7), 1),
            correctResult = 1
        )
        sudoku.check(
            name = "is exit 3 times so it will return 3",
            result = isExit(listOf(1, 2, 3, 4, 5, 1, 6, 7, 1), 1),
            correctResult = 3
        )*/
    /*
    check1(
        name = "there is a duplicate? so it should return true",
        result = anyDuplicate(listOf(1, 2, 3, 4, 1)),
        correctResult = true
    )
    check1(
        name = "there is no duplicate? so it should return false",
        result = anyDuplicate(listOf(1, 2, 3, 4, 5)),
        correctResult = false
    )
    check1(
        name = "list is empty? so it should return false",
        result = anyDuplicate(listOf()),
        correctResult = false
    )
    check1(
        name = "list have one num? so it should return false",
        result = anyDuplicate(listOf(1)),
        correctResult = false
    )
    check1(
        name = "list have duplicate but different sign? so it should return true",
        result = anyDuplicate(listOf(1, 2, 3, 4, 5, 6, 7, 8, -1)),
        correctResult = true
    )*/

    check1(
        name = "word is level? so it should return true",
        result = palindrome("level"),
        correctResult = true
    )
    check1(
        name = "word is Level? so it should return true",
        result = palindrome("Level"),
        correctResult = true
    )
    check1(
        name = "word is aba? so it should return true",
        result = palindrome("aba"),
        correctResult = true
    )
    check1(
        name = "word is space? so it should return true",
        result = palindrome("  "),
        correctResult = true
    )
    check1(
        name = "one char? so it should return true",
        result = palindrome("a"),
        correctResult = true
    )
    check1(
        name = "word is ahmed? so it should return false",
        result = palindrome("ahmed"),
        correctResult = false
    )


}

fun palindrome(word: String): Boolean {
    val lowerCaseWord = word.lowercase()
    var leftHand: Int = 0
    var righHand: Int = lowerCaseWord.length - 1
    while (leftHand < righHand) {
        if (lowerCaseWord[leftHand] != lowerCaseWord[righHand]) {
            return false
        }
        leftHand++
        righHand--
    }
    return true
}

fun anyDuplicate(list: List<Int>): Boolean {
    val seen = mutableListOf<Int>()
    list.forEach { value ->
        val absValue = value.absoluteValue
        if (absValue in seen) {
            return true
        } else {
            seen.add(absValue)
        }
    }
    return false

}

fun isExit(list: List<Int>, num: Int): Int {
    var counter: Int = 0
    list.forEach { value ->
        if (value == num) {
            counter++
        }
    }
    return counter
}

fun findEvenNum(list: List<Int>): Int {
    list.forEach { value ->
        if (value % 2 == 0) {
            return value
        }
    }
    return -1
}


fun fizzBuzz(num: Int) {
    val listOfNums: MutableList<String> = mutableListOf()
    for (index in 1..num)
        listOfNums.add(fizzBuzzNum(index))

    println(listOfNums)
}

fun fizzBuzzNum(num: Int): String {
    return when {
        (num % 5 == 0 && num % 3 == 0) -> "fizz buzz"
        (num % 3 == 0) -> "fizz"
        (num % 5 == 0) -> "buzz"
        else -> {
            num.toString()
        }
    }
    return "error"
}

fun check1(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")

    }
}