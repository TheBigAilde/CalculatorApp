package com.example.loginpage

sealed class CalculateOperation (val operation: String) {
    object Add: CalculateOperation("+")
    object Subtract: CalculateOperation("-")
    object Multiply: CalculateOperation("*")
    object Divide: CalculateOperation("/")
}
