package com.fermer.chatverse.domain.model


data class Message(
    val id: String,
    val text: String,
    val senderId: String,
    val timestamp: Long,
    val type: MessageType = MessageType.TEXT,
    val replyTo: String? = null
)
enum class MessageType {
    TEXT, STICKER
}