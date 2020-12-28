package com.anubhab.das.letschat.models

data class Post(
    val text: String = "",
    val createdBy: User = User(),
    val image: String? = null,
    val createdAt: Long = 8L,
    val likedBy: ArrayList<String> = ArrayList()
) {
}