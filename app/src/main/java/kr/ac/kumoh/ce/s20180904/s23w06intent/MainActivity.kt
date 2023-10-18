package kr.ac.kumoh.ce.s20180904.s23w06intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import kr.ac.kumoh.ce.s20180904.s23w06intent.ui.theme.S23W06IntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            S23W06IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context= LocalContext.current

    Column(
        modifier=modifier
    ){
        Button(
            onClick = {
                val uri= Uri.parse("https://www.youtube.com/results?search_query=%EB%89%B4%EC%A7%84%EC%8A%A4+%EB%85%B8%EB%9E%98%EB%B0%A9")
                val intent= Intent(Intent.ACTION_VIEW, uri)
                startActivity(context, intent, null)
            },
            modifier = modifier
                .fillMaxWidth()
        ){
            Text(text = "유튜브 검색")
        }

        Button(
            onClick = {
                val uri= Uri.parse("https://www.instagram.com/newjeans_official/")
                val intent= Intent(Intent.ACTION_VIEW, uri)
                startActivity(context, intent, null)
            },
            modifier = modifier
                .fillMaxWidth()
        ){
            Text(text = "인스타 검색")
        }

        Button(
            onClick = {
                val uri= Uri.parse("https://www.facebook.com/official.newjeans/")
                val intent= Intent(Intent.ACTION_VIEW, uri)
                startActivity(context, intent, null)
            },
            modifier = modifier
                .fillMaxWidth()
        ){
            Text(text = "페이스북 검색")
        }

        Button(
            onClick = {
                val uri= Uri.parse("geo:36.145014, 128.393047?z=17")
                val intent= Intent(Intent.ACTION_VIEW, uri)
                startActivity(context, intent, null)
            },
            modifier = modifier
                .fillMaxWidth()
        ){
            Text(text = "좌죠")
        }

        Button(
            onClick = {
                val uri= Uri.parse("geo:0,0?q=구미 이마트")
                val intent= Intent(Intent.ACTION_VIEW, uri)
                startActivity(context, intent, null)
            },
            modifier = modifier
                .fillMaxWidth()
        ){
            Text(text = "울집")
        }

        Button(
            onClick = {
                val uri= Uri.parse("tel:01083403021")
                val intent= Intent(Intent.ACTION_VIEW, uri)
                startActivity(context, intent, null)
            },
            modifier = modifier
                .fillMaxWidth()
        ){
            Text(text = "전화")
        }

        Button(
            onClick = {
                val uri= Uri.parse("sms:01083403021")
                val intent= Intent(Intent.ACTION_VIEW, uri)
                intent.putExtra("sms_body", "call please")
                startActivity(context, intent, null)
            },
            modifier = modifier
                .fillMaxWidth()
        ){
            Text(text = "message")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S23W06IntentTheme {
        Greeting("Android")
    }
}