package com.madaninagar.madani.madani_committee.model

data class Data(val id: Int, val committeeRank: String, val data: List<CommitteeMemberData>, var isExpanded: Boolean)
