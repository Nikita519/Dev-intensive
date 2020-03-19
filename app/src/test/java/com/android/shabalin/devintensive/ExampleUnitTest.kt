package com.android.shabalin.devintensive

import com.android.shabalin.devintensive.models.User
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance() {

        val user2 = User("2", "John", "Cena")


    }

    @Test
    fun testFactory(){
        //val user = User.makeUser("John Cena")
        //val user2 = User.makeUser("John Doe")
        val user = User.makeUser("John Wick")
        val user2 = user.copy(id="2", lastName = "Cena")

    }
}
