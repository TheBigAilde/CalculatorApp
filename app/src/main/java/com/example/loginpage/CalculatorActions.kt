package com.example.loginpage

sealed class CalculatorActions {
    data class Number(val pressedNumber: Int) : CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operation: CalculateOperation): CalculatorActions()

}
