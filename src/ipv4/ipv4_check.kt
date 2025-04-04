fun main() {
    // ----------------- invalid cases ---------------------------
    test(
        name = "when number is out of range > 255  it should return false",
        result = ipv4checker("192.168.300.1"),
        correctResult = false,
    )
    test(
        name = "there is more than 4 segments  it should return false",
        result = ipv4checker("192.168.1.1.2"),
        correctResult = false,
    )
    test(
        name = "there is less than 4 segments  it should return false",
        result = ipv4checker("192.168.1"),
        correctResult = false,
    )
    test(
        name = "there is a negative number,  it should return false",
        result = ipv4checker("192.168.1.-5"),
        correctResult = false,
    )
    test(
        name = "there is a leading zero,  it should return false",
        result = ipv4checker("192.168.01.2"),
        correctResult = false,
    )
    test(
        name = "there is a char,  it should return false",
        result = ipv4checker("192.168.01.a2"),
        correctResult = false,
    )

    // ----------------- valid cases ---------------------------

    test(
        name = "when all is zero  it should return true",
        result = ipv4checker("0.0.0.0"),
        correctResult = true,
    )
    test(
        name = "when it is max number 255  it should return true",
        result = ipv4checker("255.255.255.255"),
        correctResult = true,
    )
    test(
        name = "when all numbers between 0 and  255  and three dots (4 segments ) it should return true",
        result = ipv4checker("192.168.1.7"),
        correctResult = true,
    )
}

fun ipv4checker(ip: String): Boolean {
    val segments = ip.split(".")

    if (segments.size != 4) {
        return false
    }

    for (part in segments) {
        if (part.isEmpty()) {
            return false
        }
        if (!part.all { it.isDigit() }) {
            return false
        }
        val number = part.toInt()

        if (number < 0 || number > 255) {
            return false
        }
        if (part.length > 1 && part.startsWith("0")) {
            return false
        }
    }

    return true
}


fun test(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")

    }
}