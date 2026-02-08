package lesson_5

import io.kotest.matchers.shouldBe
import lesson_4.Person
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("EXTENSION")
class ExtensionFuncTests {

    @Test
    @DisplayName("Строка непустая c extension")
    fun nameSholdNotBeBlanc() {
        val person = Person("Джон Сноу", 25)
        person.name.isNotBlank().shouldBe(true)
    }

    @Test
    @DisplayName("Строка непустая c infix")
    fun nameSholdNotBeBlancInfix() {
        val person = Person("Джон Таргариен", 25)
        person.name isNotBeBlankInfix true shouldBe true
    }

    @Test
    @DisplayName("Строка не в верхнем регистре c extension")
    fun nameSholdNotBeUpperCase() {
        val person = Person("Rajah Сноу", 25)
        person.name.isUpperCase().shouldBe(false)
    }

    @Test
    @DisplayName("Строка не в верхнем регистре c infix")
    fun nameSholdNotBeUpperCaseInfix() {
        val person = Person("настя", 25)
        person.name isUpperCaseInfix false shouldBe true
    }
}