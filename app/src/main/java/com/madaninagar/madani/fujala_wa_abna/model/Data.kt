package com.madaninagar.madani.fujala_wa_abna.model

data class Data(
    val name: String,
    val phone: String,
    val address: String,
    val village: String,
    val postOffice: String,
    val thana: String,
    val zilla: String,
    var isExpanded: Boolean
)
