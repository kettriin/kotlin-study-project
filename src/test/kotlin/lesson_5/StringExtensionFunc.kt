package lesson_5

// Строка не пустая
fun String.isNotBlank(): Boolean {
    if (this.isBlank()) {
        return false
    }
    return true
}

// Строка содержит подстроку
fun String.containsSubstring(substring: String): Boolean {
    if (!this.contains(substring)) {
        return false
    }
    return true
}

// Строка в UPPER CASE
fun String.isUpperCase(): Boolean {
    if (this != this.uppercase()) {
        return false
    }
    return true
}