package com.example.myarsitektur.view.uicontroller

import android.R
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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
        topBar = { TopAppBar(title = { Text(text = stringResource(id = "Form Pendaftaran"), color = Color.White ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.purple_500))

        )
        }){isiRuang ->
        Column (
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arragement.SpaceBetween,
            horizontalAligment = Alignment.CenterHorizontally
        ){
            OutlinedTextField()
        }
    }
}