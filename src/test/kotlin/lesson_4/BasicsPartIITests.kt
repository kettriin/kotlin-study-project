package lesson_4

import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BasicsPartIITests {

    val person = Person("Yana", 32)

    @Test
    @DisplayName("Let noNull Team Test")
    fun noNullLetTest() {

        val qa = Qa(person, "A-Team", 33)

        qa.devTeamName?.let {
            println("QA from $it has detected ${qa.bugsFound} bugs")
        } ?: println("Team is unknown")
        qa.devTeamName.shouldNotBeNull()
        qa.devTeamName.shouldContain("Team")
    }

    @Test
    @DisplayName("Let null Team test")
    fun nullTeamTest() {

        val qa = Qa(person, null, 33)

        qa.devTeamName?.let {
            println("QA from $it has detected ${qa.bugsFound} bugs")
        } ?: println("Team is unknown")
        qa.devTeamName.shouldBeNull()
    }

    @Test
    @DisplayName("Apply null Team test")
    fun nullTeamChangeToNoNullTeamByApplyTest() {

        val qa = Qa(person, null, 33)

        qa.apply {
            devTeamName = "B-Team"
        }

        qa.devTeamName.shouldNotBeNull()
        qa.devTeamName.shouldContain("Team")
    }

    @Test
    @DisplayName("Run use with null test")
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

