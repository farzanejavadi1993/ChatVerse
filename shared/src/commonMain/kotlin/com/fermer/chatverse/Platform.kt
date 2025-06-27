package com.fermer.chatverse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform