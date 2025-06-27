package com.fermer.chatverse.data.firebase



import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.firestore.firestore
import kotlinx.datetime.Clock

object FireStoreService {
    suspend fun sendTestMessage() {
        val message = mapOf(
            "text" to "Hello from KMP!",
            "timestamp" to Clock.System.now().toEpochMilliseconds()
        )

        Firebase.firestore
            .collection("messages")
            .add(message)
    }
}