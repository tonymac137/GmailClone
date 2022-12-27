package uk.co.antmobileapps.gmailclone.model

data class MailData(
    val mailId:Int,
    val userName: String,
    val subject: String,
    val body: String,
    val timestamp: String = ""
)
