package lesson_3

import io.kotest.matchers.equals.shouldBeEqual
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.random.Random

@Tag("BASIC")
class KotlinBasicsTests {

    @Test
    @DisplayName("Массив пустой")
    fun arrayIsEmptyTest() {
        val noNumbers = arrayOfNulls<String>(3)

        noNumbers.isEmpty()
    }

    @Test
    @DisplayName("Массив НЕ пустой")
    fun ArrayIsNotEmptyTest() {
        val numbers = arrayOfNulls<Int>(4)
        var counter = 0

        while (counter < numbers.size) {
            numbers[counter] = Random.nextInt(10)
            counter++
        }

        numbers.isNotEmpty()
    }

    @Test
    @DisplayName("Первый элемент массива всегда равен 192")
    fun maskArrayFirstElementTest() {
        val mask = arrayOf(192, 168, 0, 1)

        mask[0].shouldBeEqual(192)
    }


}