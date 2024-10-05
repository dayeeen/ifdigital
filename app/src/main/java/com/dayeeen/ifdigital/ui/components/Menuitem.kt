import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dayeeen.ifdigital.R
import com.dayeeen.ifdigital.ui.model.Menu
import com.dayeeen.ifdigital.ui.model.dummyMenu

@Composable
fun MenuItem(
    menu: Menu,
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(8.dp)
            .width(70.dp)
            .height(55.dp)
            .border(1.dp, MaterialTheme.colorScheme.primary, MaterialTheme.shapes.medium)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center, // Ini akan menengahkannya secara vertikal
            modifier = Modifier
                .fillMaxSize() // Mengisi seluruh ruang yang tersedia di Card
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(menu.iconMenu),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
            )
            Text(
                text = stringResource(menu.titleMenu),
                fontSize = 12.sp,
                modifier = Modifier
                    .paddingFromBaseline(top = 16.dp, bottom = 8.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MenuItemHorizontalGrid() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth() // Menambahkan fillMaxWidth agar kolom menyesuaikan lebar layar
    ) {
        Text(
            text = stringResource(R.string.section_menu),
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
        )

        // Baris pertama (4 item pertama)
        LazyRow(
            modifier = Modifier.fillMaxWidth(), // Tambahkan fillMaxWidth di LazyRow
            horizontalArrangement = Arrangement.SpaceBetween // Atur jarak antar item
        ) {
            items(dummyMenu.take(4)) { menu ->
                MenuItem(menu)
            }
        }

        // Baris kedua (4 item berikutnya)
        LazyRow(
            modifier = Modifier.fillMaxWidth(), // Tambahkan fillMaxWidth di LazyRow
            horizontalArrangement = Arrangement.SpaceBetween // Atur jarak antar item
        ) {
            items(dummyMenu.drop(4)) { menu ->
                MenuItem(menu)
            }
        }
    }
}
