package criacao.exemplos

class NotificationFactory{

    fun createNotification(channel:String): Notification? {

        if (channel.isEmpty()){
            return null
        }
        when (channel) {
            "SMS" -> {
                return SmsNotification()
            }
            "EMAIL" -> {
                return EmailNotification()
            }
            "PUSH" -> {
                return PushNotification()
            }
        }

        return null

    }
}