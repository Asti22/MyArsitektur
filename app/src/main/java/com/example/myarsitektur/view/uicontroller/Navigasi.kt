package com.example.myarsitektur.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myarsitektur.view.FormSiswa
import com.example.myarsitektur.view.TampilSiswa
import com.example.myarsitektur.ViewModel.SiswaViewModel
import com.example.myarsitektur.model.DataJK

enum class Navigasi {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->

        val uiState = viewModel.statusUI.collectAsState()

        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(Navigasi.Formulir.name) {
                val context = LocalContext.current

                FormSiswa(
                    pilihanJK = DataJK.JenisK.map { id -> context.getString(id) },
                    onSubmitButtonClicked = {
                        viewModel.setSiswa(it)
                        navController.navigate(Navigasi.Detail.name)
                    }
                )

            }

            composable(Navigasi.Detail.name) {
                TampilSiswa(
                    statusUISiswa = uiState.value,
                    onBackButtonClicked = {
                        navController.popBackStack(
                            Navigasi.Formulir.name,
                            inclusive = false
                        )
                    }
                )
            }
        }
    }
}
