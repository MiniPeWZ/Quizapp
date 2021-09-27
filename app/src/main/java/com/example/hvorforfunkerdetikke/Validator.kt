package com.example.hvorforfunkerdetikke

object Validator {

    fun validatInput(amount: Int, desc: String): Boolean {
        return !(amount <= 0 || desc.IsEmpty())
    }
}