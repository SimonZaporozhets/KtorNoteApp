package com.szaporozhets.ktornoteapp.data.remote.requests

data class AddOwnerRequest(
    val owner: String,
    val noteID: String
)