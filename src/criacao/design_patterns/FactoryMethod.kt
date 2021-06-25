package criacao.design_patterns

import criacao.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:33
 */
class FactoryMethod{

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
fun main() {

    val factoryMethod = FactoryMethod()

    val notification = factoryMethod.createNotification("SMS")
    notification?.notifyUser()

    //Saída
    //Sending an SMS notification

    /*
    val notification = factoryMethod.createNotification("EMAIL")
    notification?.notifyUser()

    //Saída
    //Sending an e-mail notification

    val notification = factoryMethod.createNotification("PUSH")
    notification?.notifyUser()

    //Saída
    //Sending a push notification
    */

}