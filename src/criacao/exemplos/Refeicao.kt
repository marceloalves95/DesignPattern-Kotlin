package criacao.exemplos

class Refeicao{

    private val items = mutableListOf<Item>()

    fun addItem(item: Item){
        items.add(item)
    }
    fun getCusto():Float{

        var custo = 0.0f

        items.forEach { item->
            custo += item.preco()
        }
        return custo
    }
    fun mostrarItens(){
        for (item in items){
            println("Item: ${item.nome()}, Embalagem: ${item.embalagem().pacote()}, Preço: ${item.preco()}")
        }
    }

}