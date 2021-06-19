package comportamental.exemplos

import java.time.LocalDateTime

class ChatRoom{

    fun mostrarMensagem(usuario: Usuario, message:String){
        val hoje = LocalDateTime.now().toString()
        println("$hoje [${usuario.nome}]: $message")
    }
}