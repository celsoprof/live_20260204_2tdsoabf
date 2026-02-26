package br.com.fiap.imc.ui.telas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.imc.calcularImc
import br.com.fiap.imc.ui.telas.componentes.Formulario
import br.com.fiap.imc.ui.telas.componentes.PainelResultado
import br.com.fiap.imc.ui.telas.componentes.Titulo
import br.com.fiap.imc.ui.theme.IMCTheme

@Composable
fun TelaImc() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFD4D99B))
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Titulo(texto = "Calculadora de IMC")
            Formulario(aoCalcular = { imc ->
                println("Botão foi clicado")
                val imc = calcularImc(78, 1.78)
                println("Seu IMC é: $imc")
            })
            PainelResultado()
        }
    }

}

@Preview(showSystemUi = true)
@Composable
private fun TelaImcPreview() {
    IMCTheme {
        TelaImc()
    }
}