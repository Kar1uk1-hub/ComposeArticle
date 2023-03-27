package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    ComposeArticleImage()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleImage() {
    ComposeArticleText(title = stringResource(R.string.compose_title),
        PartOne = stringResource(R.string.PartOne),
        PartTwo = stringResource(R.string.PartTwo),
        imagePainter = painterResource(R.drawable.bg_compose_background)

        )


}
@Composable
private fun ComposeArticleText(title: String,
                               PartOne:String,
                               PartTwo:String,
                               imagePainter: Painter,
                               modifier : Modifier = Modifier,
                               ) {
    Column(modifier = modifier){
        Image(painter = imagePainter, contentDescription = null)
        Text(text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),



        )
        Text(text=PartOne,
            modifier = Modifier.padding(start=16.dp , end=16.dp),
            textAlign = TextAlign.Justify
        )
        Text(text=PartTwo,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        Surface {
            ComposeArticleImage()
        }

    }
}