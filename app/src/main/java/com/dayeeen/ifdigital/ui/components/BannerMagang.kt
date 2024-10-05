import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dayeeen.ifdigital.R

@Composable
fun BannerMagang() {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        // Teks judul banner magang
        Text(
            text = stringResource(R.string.section_magang),
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Card yang berisi gambar banner magang
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp) // Bisa tambahkan sudut membulat
        ) {
            Image(
                painter = painterResource(R.drawable.magang),  // Pastikan drawable ada
                contentDescription = "Banner Magang",
                contentScale = ContentScale.Crop,  // Menyesuaikan gambar dengan ukuran card
                modifier = Modifier.fillMaxSize()  // Membuat gambar memenuhi card
            )
        }
    }
}

@Preview
@Composable
fun BannerMagangPreview() {
    BannerMagang()
}
