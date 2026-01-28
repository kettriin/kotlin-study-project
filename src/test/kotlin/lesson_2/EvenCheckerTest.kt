package lesson_2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag

@Feature("Even numbers")
@Story("Number games")
class EvenCheckerTest {

    @Test
    @DisplayName("Отображаются только чётные числа из заданного массива")
    @Tag("NUMBERS")
    fun evenChecker() {
        val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val s = 2 + 4 + 6 + 8 + 10
        var sPossible = 0

        for (n in numbers) {
            if (n % 2 == 0) sPossible += n
        }

        sPossible shouldBe s
    }
}