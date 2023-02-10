package com.example.bussinesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
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
fun ContactOptions(){
    Column(
        // Outer Main Column
        modifier = Modifier
            .fillMaxSize()
            .background(color=Color.DarkGray)
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            // Inner Column
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ){
            // Upper Elements
            Image(
                painter = painterResource(R.drawable.rohan_dp),
                contentDescription = null,
                modifier = Modifier.shadow(
                    elevation = 15.dp,
                    shape = RoundedCornerShape(80.dp),
                    clip = true)
            )
            Text(
                text = "Rohan Rudra",
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                color = Color.White
            )
            Text(
                text = "Student | Android Developer",
                color = Color.White
            )
        }
        Column(
            // Inner Column
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Bottom,
        ){
            // Lower Elements
            Row(
                modifier = Modifier
                    .padding(all = 10.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_phone_white_24dp),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "+916296140248",
                    color = Color.White,
                    modifier = Modifier.padding(start = 10.dp),
                    fontStyle = FontStyle.Italic
                )
            }
            Row(
                modifier = Modifier.padding(all = 10.dp)
            ){
                Icon(
                    painter = painterResource(R.drawable.baseline_chat_white_48dp),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(25.dp)

                )
                Text(
                    text = "7029925977",
                    color = Color.White,
                    modifier = Modifier.padding(start = 10.dp),
                    fontStyle = FontStyle.Italic
                )
            }
            Row(
                modifier = Modifier.padding(all = 10.dp)
            ){
                Icon(
                    painter = painterResource(R.drawable.baseline_email_white_48dp),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(25.dp)
                )
                Text(
                    text = "rohanrudra55@gmail.com",
                    color = Color.White,
                    modifier = Modifier.padding(start = 10.dp),
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BussinessCardTheme {
        ContactOptions()
    }
}