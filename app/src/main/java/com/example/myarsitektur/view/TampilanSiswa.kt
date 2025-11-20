package com.example.myarsitektur.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.myarsitektur.R
import com.example.myarsitektur.model.Siswa

@Composable
fun TampilSiswa(

    statusUISiswa: Siswa,
    onBackButtonClicked: () -> Unit
){
    val items = listOf(
        Pair(stringResource("Nama Lengkap"), statusUISiswa.nama),
        Pair(stringResource(id = "Jenis Kelamin"), statusUISiswa.gender),
        Pair(stringResource("Alamat"), statusUISiswa.alamat)
    )
}