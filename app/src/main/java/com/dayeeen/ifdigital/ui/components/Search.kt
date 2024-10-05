package com.dayeeen.ifdigital.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dayeeen.ifdigital.ui.theme.IfdigitalTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier = Modifier) {
    SearchBar(
        query = "",
        onQueryChange = {},
        onSearch = {},
        active = false,
        onActiveChange = {},
        // Leading icon merupakan slot yang dapat diisi dengan composable function lain seperti icon
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        // Placeholder sama seperti hint pada view XML
        // Text yang ditampilkan pada TextField
        placeholder = {
            Text("Cari informasi tentang perkuliahan?")
        },
        // Shape berfungsi mengatur bentuk komponen
        // Efek lengkungan pada setiap sisi sebesar 16dp
        shape = MaterialTheme.shapes.large,
        // Colors digunakan untuk mengubah warna searchbar.
        colors = SearchBarDefaults.colors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            // HeightIn digunakan untuk menentukan tinggi minimal dari SearchBar
            .heightIn(min = 48.dp)
    ) {
    }
}

@Preview(showBackground = false)
@Composable
fun SearchPreview() {
    IfdigitalTheme {
        Search()
    }
}