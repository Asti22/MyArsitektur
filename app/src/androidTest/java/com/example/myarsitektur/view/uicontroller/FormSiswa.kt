package com.example.myarsitektur.view.uicontroller

import android.R
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource

@Composable
fun FormSiswa(
    pilihanJK: List<String> ,
    onSubmitButtonClicked:(MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
){
    var txtNama by rememberSaveable { mutableStateOf(value = "") }
    var txtAlamat by remember {mutableStateOf(value = "")}
    var txtGender by remember { mutableStateOf(value ="") }
    var listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)

    scaffold(modifier = Modifier,
        topBar = { TopAppBar(title = { Text(text = stringResource(id = "Form Pendaftaran"), color = Color.White ) }

        ) })
}