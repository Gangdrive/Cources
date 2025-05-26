package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.data.Datasource
import com.example.courses.model.Information
import com.example.courses.ui.theme.CoursesTheme
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    InformationApp()
                }
            }
        }
    }
}

@Composable
fun InformationApp() {
    InformationList(
        informationList = Datasource().loadInformation(),
    )
}

@Composable
fun InformationList(informationList: List<Information>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
    ) {
        items(informationList) { information ->
            InformationCard(
                information = information,
                modifier = Modifier
            )
        }
    }
}

@Composable
fun InformationCard(information: Information, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(start = 8.dp, end = 8.dp, top = 8.dp, bottom = 8.dp)
            .fillMaxSize()
            .fillMaxWidth()
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = modifier
                    .size(68.dp, 68.dp),
                painter = painterResource(information.image),
                contentDescription = stringResource(information.courseName),
            )
            Column {
                Text(
                    text = LocalContext.current.getString(information.courseName),
                    modifier = modifier
                        .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp),
                    fontSize = 14.sp
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.baseline_blur_on_24),
                        contentDescription = stringResource(information.courseName),
                        modifier = modifier
                            .padding(start = 16.dp)
                    )
                    Text(
                        text = LocalContext.current.getString(information.numberOfAssociatedCourses),
                        modifier = modifier
                            .padding(start = 8.dp),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InformationCardPreview() {
    InformationCard(
        Information(
            R.drawable.architecture,
            R.string.architecture,
            R.string.architectureInt
        )
    )
}