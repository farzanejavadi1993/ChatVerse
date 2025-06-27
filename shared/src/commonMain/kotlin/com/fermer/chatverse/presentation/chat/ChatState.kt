package com.fermer.chatverse.presentation.chat

import com.fermer.chatverse.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)