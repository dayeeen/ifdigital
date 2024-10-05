package com.dayeeen.ifdigital.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.dayeeen.ifdigital.R

data class Menu(
    @DrawableRes val iconMenu: Int,
    @StringRes val titleMenu: Int,
)

val dummyMenu = listOf(
    R.drawable.university to R.string.menu_kuliah,
    R.drawable.quran to R.string.menu_ibtitah,
    R.drawable.mortarboard to R.string.menu_sidang,
    R.drawable.info to R.string.menu_info,
    R.drawable.ranking to R.string.menu_prestasi,
    R.drawable.job to R.string.menu_karir,
    R.drawable.alumni to R.string.menu_alumni,
    R.drawable.grid to R.string.menu_lainnya,
).map {
    // Maksud menu(it.first, it.second itu apa ya?
    // menu(R.drawable.menu_university, R.string.menu_kuliah)
    Menu(it.first, it.second)
}