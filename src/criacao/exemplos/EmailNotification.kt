package criacao.exemplos

class EmailNotification: Notification {
    override fun notifyUser() = println("Sending an e-mail notification")
}