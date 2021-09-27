package com.example.hvorforfunkerdetikke

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org. junit.runners.JUnit4

@RunWith(JUnit4::class)
 class ValidatorTest{


    @Test
    fun whenInputIsInvalid(){
        val amount = 0
        val desc = "some random desc"
        val result = Validator.validateInput(amount, desc)
        assertThat(result).isEqualTo(false)
    }

}