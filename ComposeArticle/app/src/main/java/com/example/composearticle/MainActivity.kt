package com.example.composearticle

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppViewPage(h1 = getString(R.string.Header1), b1 = getString(R.string.Body1), b2 = getString(R.string.Body2))
                }
            }
        }
    }
}
@Composable
fun AppBackground(){
    val image = painterResource(R.drawable.bg_compose_background)
    androidx.compose.foundation.Image(
        painter = image,
        contentDescription = "Background Image",
        modifier = Modifier.fillMaxWidth(),
//        contentScale = ContentScale.Crop
        )
}

@Composable
fun AppViewPage(h1 : String, b1 : String, b2 : String){
    Column {
        AppBackground()
        Text(
            text = h1,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(all = 16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
        Text(
            text = b1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
        )
        Text(
            text = b2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(all = 16.dp)
            )
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        AppViewPage("H1", b1 = "Body", b2 = "Body")
    }
}