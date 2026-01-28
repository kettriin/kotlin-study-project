package lesson_2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag

@Feature("Strings basic")
@Story("Char games")
class StringCompairTest {

    @Test
    @DisplayName("Ответ пользователя совпадает с ответом в системе")
    @Tag("WORDS")
    fun answerChecker() {
        val userAnswer = "Котик"
        val systemAnswer = "котик"
        val ifWinner = userAnswer.compareTo(systemAnswer, true)

        ifWinner shouldBe 0
    }
}