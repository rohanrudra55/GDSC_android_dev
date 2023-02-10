package com.example.composequadrant

import android.hardware.camera2.params.ColorSpaceTransform
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TextCard(h1 : String, b1: String, cardColor : Color, modifier : Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .background(color = cardColor)
            .padding(all = 16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = h1,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = b1,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun QuadrantPageView() {
    Column(Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            TextCard(
                h1 = stringResource(R.string.FirstQuadHeader),
                b1 = stringResource(R.string.FirstQuadBody),
                cardColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            TextCard(
                h1 = stringResource(R.string.SecondQuadHeader),
                b1 = stringResource(R.string.SecondQuadBody),
                cardColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            TextCard(
                h1 = stringResource(R.string.ThirdQuadHeader),
                b1 = stringResource(R.string.ThirdQuadBody),
                cardColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            TextCard(
                h1 = stringResource(R.string.FourthQuadHeader),
                b1 = stringResource(R.string.FourthQuadBody),
                cardColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        QuadrantPageView()
    }
}