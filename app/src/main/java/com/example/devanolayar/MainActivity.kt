package com.example.devanolayar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.devanolayar.ui.theme.DevanoLayarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            walpaper()
        }

        }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun walpaper() {
        Box(modifier = Modifier
            .fillMaxSize(),
        ){
            Image(painter = painterResource(id = R.drawable.bg),
                modifier = Modifier.fillMaxSize(),
                contentDescription = "Background",
                contentScale = ContentScale.Crop
            )

        Row (modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(horizontal = 40.dp, vertical = 50.dp),


            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom

            ){
            Image(modifier = Modifier
                .absolutePadding(right = 10.dp)
                .size(70.dp),
                painter = painterResource(id = R.drawable.phone),
                contentDescription = "phone"
                )

            Image(modifier = Modifier
                .size(70.dp),
                painter = painterResource(id = R.drawable.message),
                contentDescription ="pesan"
            )

            Image(modifier = Modifier
                .absolutePadding(left = 10.dp)
                .size(70.dp),
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="kamera"
            )

        }

            Row(modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(bottom = 125.dp),

                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom



            ) {
                Image(modifier = Modifier
                    .alpha(0.5f)
                    .size(15.dp),

                    painter = painterResource(id = R.drawable.bulat),
                    contentDescription = "bulat"
                )

                Image(modifier = Modifier
                    .size(15.dp),
                    painter = painterResource(id = R.drawable.bulat),
                    contentDescription = "bulat"
                )

                Image(modifier = Modifier
                    .alpha(0.5f)
                    .size(15.dp),
                    painter = painterResource(id = R.drawable.bulat),
                    contentDescription = "bulat"
                )

                Image(modifier = Modifier
                    .alpha(0.5f)
                    .size(15.dp),
                    painter = painterResource(id = R.drawable.bulat),
                    contentDescription = "bulat"
                )
            }

            Row (modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .padding(top = 120.dp, start = 20.dp, end = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            )
            {
                Image(modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(60)),
                    painter = painterResource(id = R.drawable.calendar),
                    contentDescription ="kalender"
                )

                Image(modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(60)),
                    painter = painterResource(id = R.drawable.calendar),
                    contentDescription ="kalender 2"
                )

                Image(modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(60)),
                    painter = painterResource(id = R.drawable.gallery),
                    contentDescription ="kalender 2"
                )

                Image(modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(60)),
                    painter = painterResource(id = R.drawable.store),
                    contentDescription ="kalender 2"
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 280.dp)
                    .size(height = 85.dp, width = 320.dp)
                    .padding(top = 30.dp, start = 25.dp, end = 25.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color(0xFF585858).copy(alpha = .9f)),

                )
            {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween



                    ) {
                    Image(
                        modifier = Modifier
                            .size(45.dp)
                            .padding(top = 10.dp, start = 12.dp)
                            .clickable {},
                        painter = painterResource(id = R.drawable.gg),
                        contentDescription = "Google"
                    )

                    Image(modifier = Modifier
                        .size(240.dp)
                        .clickable {}
                        .padding(start = 200.dp)
                        .fillMaxWidth(),

                        painter = painterResource(id = R.drawable.mic),
                        contentDescription ="mic"
                    )

                    Image(modifier = Modifier
                        .size(50.dp)
                        .padding(top = 8.dp, end = 12.dp)
                        .clickable {},
                        painter = painterResource(id = R.drawable.lensa),
                        contentDescription ="mic"
                    )
                    }
            }
        }
}