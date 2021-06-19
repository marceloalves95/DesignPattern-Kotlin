package criacao.design_patterns

import criacao.exemplos.*

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:33
 */
fun main() {

    val notificationFactory = NotificationFactory()
    val notification = notificationFactory.createNotification("SMS")
    notification?.notifyUser()

    //Saída
    //Sending an SMS notification

    /*
    val notification = notificationFactory.createNotification("EMAIL")
    notification?.notifyUser()

    //Saída
    //Sending an e-mail notification

    val notification = notificationFactory.createNotification("PUSH")
    notification?.notifyUser()

    //Saída
    //Sending a push notification
    */

}