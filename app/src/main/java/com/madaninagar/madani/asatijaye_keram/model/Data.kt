package com.madaninagar.madani.asatijaye_keram.model

data class Data(
    val id: Int,
    val name: String,
    val phone: String,
    val address: String,
    val village: String,
    val postOffice: String,
    val thana: String,
    val zilla: String,
    var isExpanded: Boolean
)
