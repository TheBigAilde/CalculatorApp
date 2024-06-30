package com.example.loginpage

import androidx.compose.foundation.MarqueeSpacing
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage.ui.theme.Orange
import org.w3c.dom.Text

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorActions) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        )
        {
            Text(
                text = state.number1 + (state.operation?.operation ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                style = androidx.compose.ui.text.TextStyle(fontSize = 80.sp),
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(
                    typeOfContent = "AC",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClickAction = {
                        onAction(CalculatorActions.Clear)
                    }
                )
                CalculatorButton(
                    typeOfContent = "Del",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Delete)
                    }
                )
                CalculatorButton(
                    typeOfContent = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Operation(CalculateOperation.Divide))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(
                    typeOfContent = "7",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(7))
                    }
                )
                CalculatorButton(
                    typeOfContent = "8",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(8))
                    }
                )
                CalculatorButton(
                    typeOfContent = "9",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(9))
                    }
                )
                CalculatorButton(
                    typeOfContent = "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Operation(CalculateOperation.Multiply))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(
                    typeOfContent = "4",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(4))
                    }
                )
                CalculatorButton(
                    typeOfContent = "5",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(5))
                    }
                )
                CalculatorButton(
                    typeOfContent = "6",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(6))
                    }
                )
                CalculatorButton(
                    typeOfContent = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Operation(CalculateOperation.Subtract))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(
                    typeOfContent = "1",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(1))
                    }
                )
                CalculatorButton(
                    typeOfContent = "2",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(2))
                    }
                )
                CalculatorButton(
                    typeOfContent = "3",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(3))
                    }
                )
                CalculatorButton(
                    typeOfContent = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Operation(CalculateOperation.Add))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalculatorButton(
                    typeOfContent = "0",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClickAction = {
                        onAction(CalculatorActions.Number(0))
                    }
                )
                CalculatorButton(
                    typeOfContent = ".",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Decimal)
                    }
                )
                CalculatorButton(
                    typeOfContent = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        onAction(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}