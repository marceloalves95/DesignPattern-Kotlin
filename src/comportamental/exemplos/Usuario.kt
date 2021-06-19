package comportamental.exemplos

class Usuario(val nome:String){

    fun enviarMensagem(message: String){
        ChatRoom().mostrarMensagem(this, message)
    }
}