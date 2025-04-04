package sudoku

fun main() {

    //http://sudopedia.enjoysudoku.com/Invalid_Test_Cases.html

    // -------------------- invalid cases ---------------------------
    check(
        name = "when board is empty it should be false",
        result = sudokuChecker(listOf()),
        correctResult = false,
    )
    check(
        name = "when rows < 9  it should be false",
        result = sudokuChecker(
            listOf(
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '1', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),

                )
        ),
        correctResult = false,
    )

    check(
        name = "when there is single given it should be false",
        result = sudokuChecker(
            listOf(
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '1', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            )
        ),
        correctResult = false,
    )

    check(
        name = "when there is duplicate  given in one box it should be false",
        result = sudokuChecker(
            listOf(
                listOf('-', '-', '9', '-', '7', '-', '-', '-', '5'),
                listOf('-', '-', '2', '1', '-', '-', '9', '-', '-'),
                listOf('1', '-', '-', '-', '2', '8', '-', '-', '-'),
                listOf('-', '7', '-', '-', '-', '5', '-', '-', '1'),
                listOf('-', '-', '8', '5', '1', '-', '-', '-', '-'),
                listOf('-', '5', '-', '-', '-', '-', '3', '-', '-'),
                listOf('-', '-', '-', '-', '-', '3', '-', '-', '6'),
                listOf('8', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('2', '1', '-', '-', '-', '-', '-', '8', '7'),
            )
        ),
        correctResult = false,
    )

    check(
        name = "when there is duplicate  given in one column it should be false",
        result = sudokuChecker(
            listOf(
                listOf('6', '-', '1', '5', '9', '-', '-', '-', '-'),
                listOf('-', '9', '-', '-', '1', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '4'),
                listOf('-', '7', '-', '3', '1', '4', '-', '-', '6'),
                listOf('-', '2', '4', '-', '-', '-', '-', '-', '5'),
                listOf('-', '-', '3', '-', '-', '-', '-', '1', '-'),
                listOf('-', '-', '6', '-', '-', '-', '-', '-', '3'),
                listOf('-', '-', '-', '9', '-', '2', '-', '4', '-'),
                listOf('-', '-', '-', '-', '-', '1', '6', '-', '-'),
            )
        ),
        correctResult = false,
    )

    check(
        name = "when there is duplicate  given in one row it should be false",
        result = sudokuChecker(
            listOf(
                listOf('-', '4', '-', '1', '-', '-', '3', '5', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '2', '-', '5', '-', '-', '-'),
                listOf('-', '-', '-', '4', '-', '8', '9', '-', '-'),
                listOf('2', '6', '-', '-', '-', '-', '-', '1', '2'), //this row
                listOf('-', '5', '-', '3', '-', '-', '-', '-', '7'),
                listOf('-', '-', '4', '-', '-', '-', '1', '6', '-'),
                listOf('6', '-', '-', '-', '-', '7', '-', '-', '-'),
                listOf('-', '1', '-', '-', '8', '-', '-', '2', '-'),
            )
        ),
        correctResult = false,
    )

    check(
        name = "insert a char it should be false",
        result = sudokuChecker(
            listOf(
                listOf('x', '-', '5', '4', '2', '-', '8', '1', '-'),
                listOf('4', '8', '7', '9', '-', '1', '5', '-', '6'),
                listOf('-', '2', '9', '-', '5', '6', '3', '7', '4'),
                listOf('8', '5', '-', '7', '9', '3', '-', '4', '1'),
                listOf('6', '1', '3', '2', '-', '8', '9', '5', '7'),
                listOf('-', '7', '4', '-', '6', '5', '2', '8', '-'),
                listOf('2', '4', '1', '3', '-', '9', '-', '6', '5'),
                listOf('5', '-', '8', '6', '7', '-', '1', '9', '2'),
                listOf('-', '9', '6', '5', '1', '2', '4', '-', '8'),
            )
        ),
        correctResult = false,
    )
    check(
        name = "insert Zero it should be false",
        result = sudokuChecker(
            listOf(
                listOf('0', '-', '5', '4', '2', '-', '8', '1', '-'),
                listOf('4', '8', '7', '9', '-', '1', '5', '-', '6'),
                listOf('-', '2', '9', '-', '5', '6', '3', '7', '4'),
                listOf('8', '5', '-', '7', '9', '3', '-', '4', '1'),
                listOf('6', '1', '3', '2', '-', '8', '9', '5', '7'),
                listOf('-', '7', '4', '-', '6', '5', '2', '8', '-'),
                listOf('2', '4', '1', '3', '-', '9', '-', '6', '5'),
                listOf('5', '-', '8', '6', '7', '-', '1', '9', '2'),
                listOf('-', '9', '6', '5', '1', '2', '4', '-', '8'),
            )
        ),
        correctResult = false,
    )
// -------------------- valid cases ---------------------------

    check(
        name = "when puzzle is completed it should be true",
        result = sudokuChecker(
            listOf(
                listOf('9', '7', '4', '2', '3', '6', '1', '5', '8'),
                listOf('6', '3', '8', '5', '9', '1', '7', '4', '2'),
                listOf('1', '2', '5', '4', '8', '7', '9', '3', '6'),
                listOf('3', '1', '6', '7', '5', '4', '2', '8', '9'),
                listOf('7', '4', '2', '9', '1', '8', '5', '6', '3'),
                listOf('5', '8', '9', '3', '6', '2', '4', '1', '7'),
                listOf('8', '6', '7', '1', '2', '5', '3', '9', '4'),
                listOf('2', '5', '3', '6', '4', '9', '8', '7', '1'),
                listOf('4', '9', '1', '8', '7', '3', '6', '2', '5'),
            )
        ),
        correctResult = true,
    )

    check(
        name = "when there is last empty square it should be true",
        result = sudokuChecker(
            listOf(
                listOf('2', '5', '6', '4', '8', '9', '1', '7', '3'),
                listOf('3', '7', '4', '6', '1', '5', '9', '8', '2'),
                listOf('9', '8', '1', '7', '2', '3', '4', '5', '6'),
                listOf('5', '9', '3', '2', '7', '4', '8', '6', '1'),
                listOf('7', '1', '2', '8', '-', '6', '5', '4', '9'),
                listOf('4', '6', '8', '5', '9', '1', '3', '2', '7'),
                listOf('6', '3', '5', '1', '4', '7', '2', '9', '8'),
                listOf('1', '2', '7', '9', '5', '8', '6', '3', '4'),
                listOf('8', '4', '9', '3', '6', '2', '7', '1', '5'),
            )
        ),
        correctResult = true,
    )
    check(
        name = "hen a square has only one possible value remaining it should be true",
        result = sudokuChecker(
            listOf(
                listOf('3', '-', '5', '4', '2', '-', '8', '1', '-'),
                listOf('4', '8', '7', '9', '-', '1', '5', '-', '6'),
                listOf('-', '2', '9', '-', '5', '6', '3', '7', '4'),
                listOf('8', '5', '-', '7', '9', '3', '-', '4', '1'),
                listOf('6', '1', '3', '2', '-', '8', '9', '5', '7'),
                listOf('-', '7', '4', '-', '6', '5', '2', '8', '-'),
                listOf('2', '4', '1', '3', '-', '9', '-', '6', '5'),
                listOf('5', '-', '8', '6', '7', '-', '1', '9', '2'),
                listOf('-', '9', '6', '5', '1', '2', '4', '-', '8'),
            )
        ),
        correctResult = true,
    )


}

fun sudokuChecker(sudokuBoard: List<List<Char>>): Boolean {
    if (sudokuBoard.size != 9) {
        return false
    }

//check row
    for (row in sudokuBoard) {
        if (row.size != 9) {
            return false
        }
        val seen = mutableListOf<Char>()

        row.forEach { currentChar ->
            if (currentChar != '-') {
                if (currentChar in seen) {
                    return false
                } else {
                    seen.add(currentChar)
                }
            }
        }


    }

    //check col
    for (col in sudokuBoard.indices) {
        val colSeen = mutableListOf<Char>()
        for (row in sudokuBoard.indices) {
            val currentChar = sudokuBoard[row][col]
            if (currentChar != '-') {
                if (currentChar in colSeen) {
                    return false
                } else {
                    colSeen.add(currentChar)
                }
            }
        }
    }
//check grids
    for (startRow in 0..6 step 3) {
        for (startCol in 0..6 step 3) {
            val seen = mutableListOf<Char>()

            for (row in startRow until startRow step 3) {
                for (col in startCol until startCol step 3) {
                    val currentChar = sudokuBoard[row][col]

                    if (currentChar != '-') {
                        if (currentChar in seen) {
                            return false
                        }
                        seen.add(currentChar)
                    }
                }
            }
        }
    }


    return true
}

fun check(name: String, result: Boolean, correctResult: Boolean) {

    if (result == correctResult) {
        println("success - $name")
    } else {
        println("failed - $name")
    }
}