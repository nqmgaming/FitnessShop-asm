package com.nqmgaming.fitnessshop.presentation.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nqmgaming.fitnessshop.R
import com.nqmgaming.fitnessshop.core.common.components.ArrowButton
import com.nqmgaming.fitnessshop.core.common.components.SpacerHeight

@Composable
fun SplashScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(
                    id = R.string.app_name
                ),
                modifier = Modifier
                    .padding(top = 200.dp)
                    .size(100.dp)
            )

            Text(
                text = stringResource(id = R.string.welcome_to_fitness_clother),
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Normal,
                    fontSize = 30.sp,
                    lineHeight = 35.sp
                ),
                textAlign = TextAlign.Center
            )
            SpacerHeight(20.dp)
            ArrowButton(
                modifier = Modifier
                    .size(60.dp)

            )
        }

    }
}

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen()
}