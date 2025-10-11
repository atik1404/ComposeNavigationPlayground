package com.playground.navigation.model

import kotlinx.serialization.Serializable

@Serializable
data class CustomData(
    val id: String,
    val name: String
)
