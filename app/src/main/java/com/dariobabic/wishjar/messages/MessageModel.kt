package com.dariobabic.wishjar.messages

data class MessageModel(
    val senderName: String,
    val text: String,
    val time: String,
    val isFromMe: Boolean
)

fun getMessages(): List<MessageModel> {
    val message1 = MessageModel("marko markovic", "abcd", "now", false)
    val message2 = MessageModel("marko markovic", "abcd", "now", false)
    val message3 = MessageModel("pero peric", "abcd", "now", true)
    val message4 = MessageModel("marko markovic", "abcd", "now",false)
    return listOf(message1, message2, message3, message4)
}