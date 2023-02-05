package com.natiqhaciyef.noteapp_jetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.natiqhaciyef.noteapp_jetpackcompose.model.NoteModel
import com.natiqhaciyef.noteapp_jetpackcompose.ui.theme.*
import java.text.SimpleDateFormat
import java.util.*

@Preview
@Composable
fun HomeScreen(noteList: MutableList<NoteModel> = mutableListOf()) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        floatingActionButton = {
            Box(
                modifier = Modifier
                    .size(55.dp)
                    .clip(shape = CircleShape)
                    .background(Aquatic),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Note Buttonn",
                    modifier = Modifier.size(32.dp),
                    tint = Color.Black
                )
            }
        }
    ) {
        LazyColumn {
            items(items = noteList) { selectedItem ->
                LazyColumnRows(selectedItem) {

                }
            }
        }
    }
}

@Preview
@Composable
fun LazyColumnRows(note: NoteModel =
                       NoteModel(id= 0 , "Text","desc intro bust","21-01-2023"),
                   content: () -> Unit = { }) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(horizontal = 10.dp, vertical = 7.dp)
            .clickable {
                content()
            },
        shape = RoundedCornerShape(12.dp),
        elevation = 5.dp,
        backgroundColor = LightBrown,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = note.title,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 3.dp)
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = note.description,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 3.dp)
            )
        }
    }
}


// Will add in view-model
fun calendarFormatter(calendar: Calendar): String {
    val format = "dd-MM-yyyy"
    val sdf = SimpleDateFormat(format, Locale.UK)
    return sdf.format(calendar.time)
}


// Will add in view-model
fun calendarFormatterForWeekly(calendar: Calendar): String =
    calendar.get(Calendar.DAY_OF_WEEK).toString()

