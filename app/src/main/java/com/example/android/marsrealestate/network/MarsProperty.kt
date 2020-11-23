package com.example.android.marsrealestate.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MarsProperty(
        @Json(name = "fichaVendaSituacaoDescricao")
        val fichaVendaSituacaoDescricao: String = "",
        @Json(name = "fichaVendaSituacaoId")
        val fichaVendaSituacaoId: String = "",
        @Json(name = "fichaVendaId")
        val fichaVendaId: Int = 0,
        @Json(name = "vendedorNome")
        val vendedorNome: String = "",
        @Json(name = "unidadeId")
        val unidadeId: Int = 0,
        @Json(name = "unidadeDescricao")
        val unidadeDescricao: String = "",
        @Json(name = "veiculoPlaca")
        val veiculoPlaca: String = "",
        @Json(name = "veiculoModelo")
        val veiculoModelo: String = "",
        @Json(name = "clienteId")
        val clienteId: Int = 0,
        @Json(name = "clienteNome")
        val clienteNome: String = "",
        @Json(name = "CPFCNPJ")
        val CPFCNPJ: String = "",
        @Json(name = "vendedorId")
        val vendedorId: Int = 0
//        @Json(name = "fichaVendaDataCriacao")
//        val fichaVendaDataCriacao: Int = 0
)