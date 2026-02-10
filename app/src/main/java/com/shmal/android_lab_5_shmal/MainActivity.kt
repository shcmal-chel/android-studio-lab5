package com.shmal.android_lab_5_shmal

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color as ComposeColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//class MainActivity : ComponentActivity() {
//    @OptIn(ExperimentalMaterial3Api::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = { Text(text = "Scaffold example")}
//                    )
//                },
//                floatingActionButton = {
//                    FloatingActionButton(onClick = { } ) {
//                        Text(text = "+")
//                    }
//                }
//            ) { paddingValues ->
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(paddingValues),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ){
//                    Text(text = "Основное содержимое экрана")
//                }
//            }
//        }
//    }
//}

//Column(
//modifier = Modifier
//.fillMaxSize()
//.background(Color.White)
//.padding(16.dp),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//)
//{
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0xFFFF0000))
//    )
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0x80FF0000))
//    )
//}

//val symbols = "Hello world!".filter { it.isLetter() }
//Column(
//modifier = Modifier
//.fillMaxSize()
//.background(color = Color.Green)
//.padding(top = 48.dp, start = 16.dp, end = 16.dp),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        for(char in symbols) {
//            Text(
//                text = char.toString(),
//                fontWeight = FontWeight.ExtraBold,
//                color = Color.Blue,
//                fontSize = 20.sp,
//                letterSpacing = 24.sp
//            )
//        }
//    }
//    Spacer(modifier = Modifier.height(16.dp))
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        for(char in symbols.reversed()) {
//            Text(
//                text = char.toString(),
//                fontWeight = FontWeight.ExtraBold,
//                color = Color.Red,
//                fontSize = 20.sp,
//                letterSpacing = 24.sp
//            )
//        }
//    }
//}

//Самостоятельное задание


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleBlock()
        Spacer(modifier = Modifier.height(32.dp))
        RowOfColorBoxes()
        Spacer(modifier = Modifier.height(32.dp))
        CombinedBlock()
    }
}

@Composable
fun TitleBlock() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Jetpack Compose",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Цветные блоки",
            fontSize = 24.sp,
            color = ComposeColor.Gray
        )
    }
}

@Composable
fun ColorBox(color: ComposeColor) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(color)
    )
}

@Composable
fun RowOfColorBoxes() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceEvenly
    ) {
        ColorBox(color = ComposeColor(Color.rgb(255, 0, 0)))

        ColorBox(color = ComposeColor(Color.argb(128, 0, 255, 0)))

        ColorBox(color = ComposeColor(Color.rgb(0, 0, 255)))
    }
}

@Composable
fun CombinedBlock() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(ComposeColor(Color.rgb(240, 240, 240)))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MaterialTheme {
        MainScreen()
    }
}