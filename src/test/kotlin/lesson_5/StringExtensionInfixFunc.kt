package lesson_5

// Infix строка не пустая
infix fun String.isNotBeBlankInfix(expected: Boolean): Boolean {
    val ifIsBlank = this.isBlank()
    return expected != ifIsBlank
}

// Infix строка содержит подстроку
infix fun String.shouldContainInfix(substring: String): Boolean {
    return this.contains(substring)
}

// Infix строка в UPPER CASE
infix fun String.isUpperCaseInfix(expected: Boolean): Boolean {
    return expected == (this == this.uppercase())
}