package lesson_4

import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("SCOPE")
class BasicsPartIITests {

    val person = Person("Yana", 32)

    @Test
    @DisplayName("Проверка не null значения полей с использованием Let (scope)")
    fun noNullLetTest() {

        val qa = Qa(person, "A-Team", 33)

        qa.devTeamName?.let {
            println("QA from $it has detected ${qa.bugsFound} bugs")
        } ?: println("Team is unknown")
        qa.devTeamName.shouldNotBeNull()
        qa.devTeamName.shouldContain("Team")
    }

    @Test
    @DisplayName("Проверка null значения полей с использованием Let (scope)")
    fun nullTeamTest() {

        val qa = Qa(person, null, 33)

        qa.devTeamName?.let {
            println("QA from $it has detected ${qa.bugsFound} bugs")
        } ?: println("Team is unknown")
        qa.devTeamName.shouldBeNull()
    }

    @Test
    @DisplayName("Проверка не null значения полей с использованием Apply (scope)")
    fun nullTeamChangeToNoNullTeamByApplyTest() {

        val qa = Qa(person, null, 33)

        qa.apply {
            devTeamName = "B-Team"
        }

        qa.devTeamName.shouldNotBeNull()
        qa.devTeamName.shouldContain("Team")
    }

    @Test
    @DisplayName("Проверка показателя (грейда) по косвенному признаку (найденным багам) с использованием Run (scope)")
    fun nullTeamRunTest() {

        val qa = Qa(person, "D-Team",188)

        val gradeInfo = qa.run {
            val bugsPerMonth = qa.bugsFound / 12
            if (bugsPerMonth >= 15) "Senior" else "Middle"
        }

        qa.bugsFound.shouldBe(188)
        gradeInfo.shouldBe("Senior")
    }
}

