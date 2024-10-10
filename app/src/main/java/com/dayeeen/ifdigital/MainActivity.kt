package com.dayeeen.ifdigital

import BannerMagang
import MenuItem
import MenuItemHorizontalGrid
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Assignment
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.PhoneEnabled
import androidx.compose.material.icons.rounded.SmartToy
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dayeeen.ifdigital.ui.components.Jadwal
import com.dayeeen.ifdigital.ui.components.Search
import com.dayeeen.ifdigital.ui.model.NavBarItem
import com.dayeeen.ifdigital.ui.model.dummyMenu
import com.dayeeen.ifdigital.ui.theme.IfdigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IfDigitalApp()
        }
    }
}

@Composable
fun IfDigitalApp() {
    Scaffold(
        bottomBar = { BottomBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            Salam()
            Search()
            Jadwal()
            MenuItemHorizontalGrid()
            BannerMagang()
        }
    }
}

@Composable
fun Salam() {
    Text(
        text = stringResource(R.string.section_salam)
        ,
        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )
}


@Composable
fun BottomBar (
    modifier: Modifier = Modifier
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        modifier = modifier.padding(12.dp)
    ) {
        val navigationitems = listOf(
            NavBarItem(
                title = stringResource(R.string.nav_beranda),
                icon = Icons.Rounded.Home
            ),
            NavBarItem(
                title = stringResource(R.string.nav_tugas),
                icon = Icons.Rounded.Assignment
            ),
            NavBarItem(
                title = stringResource(R.string.nav_sisakti),
                icon = Icons.Rounded.SmartToy
            ),
            NavBarItem(
                title = stringResource(R.string.nav_bantuan),
                icon = Icons.Rounded.PhoneEnabled
            ),
            NavBarItem(
                title = stringResource(R.string.nav_profil),
                icon = Icons.Rounded.Person
            )
        )
        navigationitems.map {
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.title
                    )
                },
                label = {
                    Text(it.title)
                },
                selected = it.title == navigationitems[0].title,
                onClick = {}
            )
        }
    }
}



@Preview(showBackground = true, device = Devices.PIXEL_7)
@Composable
fun IFDigitalPreview() {
    IfdigitalTheme {
        IfDigitalApp()
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_7)
@Composable
fun BottomBarPrev() {
    IfdigitalTheme {
        BottomBar()
    }
}