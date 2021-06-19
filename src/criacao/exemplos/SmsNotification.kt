package criacao.exemplos

class SmsNotification: Notification {
    override fun notifyUser() = println("Sending an SMS notification")
}