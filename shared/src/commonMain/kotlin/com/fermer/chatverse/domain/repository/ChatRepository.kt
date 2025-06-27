package com.fermer.chatverse.domain.repository

import com.fermer.chatverse.domain.model.Message


interface ChatRepository {
    suspend fun sendMessage(message: Message)
    //fun getMessages(): Flow<List<Message>>
}