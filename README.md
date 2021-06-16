# **Design Pattern**

| Creational Patterns | Structural Patterns |   Behavioral Patterns   |
| :-----------------: | :-----------------: | :---------------------: |
|  Abstract Factory   |       Adapter       | Chain of Responsibility |
|       Builder       |       Bridge        |         Command         |
|   Factory Method    |      Composite      |       Interpreter       |
|     Object Pool     |      Decorator      |        Iterator         |
|      Prototype      |       Facade        |        Mediator         |
|      Singleton      |      Flyweight      |       Null Object       |
|                     | Private Class Data  |        Observer         |
|                     |        Proxy        |          State          |
|                     |                     |        Strategy         |
|                     |                     |     Template Method     |
|                     |                     |         Visitor         |

## Creational Patterns

### Abstract Factory

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Builder

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Factory Method

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Object Pool

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Prototype

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Singleton

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

## Structural Patterns

### Adapter

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Bridge

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Composite

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Decorator

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Facade

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Flyweight

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Private Class Data

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Proxy

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

## Behavioral Patterns

### Chain of Responsibility

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Command

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Interpreter

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Iterator

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Mediator

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Null Object

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Observer

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

##### State

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Strategy

**Definição**

> *Define uma família de algoritmos, encapsular cada uma delas e as torna intercambiáveis. Esse padrão permite que o algoritmo varie independentemente dos clientes que o utilizam.*

O Strategy é um padrão que deve ser utilizado quando ***uma classe possuir diversos algoritmos que possam ser utilizados de forma intercambiável***. A solução proposta pelo padrão consiste em delegar a execução do algoritmo para uma instância que compõe a classe principal. Dessa forma, quando a funcionalidade for invocada, no momento da execução do algoritmo, será invocado um método da instância que a compõe.

**Veja um exemplo:**

##### Diagrama de Classe - Strategy

| ![](src/uml/Strategy.png) |
| :-----------------------: |

##### Classe Strategy

```kotlin
class Strategy {

    abstract class Felino(private val correrStrategy:CorrerStrategy){

        abstract fun display()
        abstract fun rugir()
        fun perfomarCorrer() = correrStrategy.correr()
        fun getCorrerStrategy(correrStrategy:CorrerStrategy) = correrStrategy.correr()

    }

    class Leao:Felino(CorrerCurtaDistancia()) {

        override fun display() = println("Leão a vista")
        override fun rugir() = println("Urghhhhh!")

    }
    class Leopardo:Felino(CorrerLongaDistancia()){

        override fun display() = println("Leopardo a vista")
        override fun rugir() = println("Arghh!")

    }
    interface CorrerStrategy{
        fun correr()
    }
    class CorrerCurtaDistancia:CorrerStrategy{
        override fun correr() = println("Correr curta distância, porém com o objetivo bem próximo.")
    }
    class CorrerLongaDistancia:CorrerStrategy{
        override fun correr() = println("Correr longa distância, caso necessário.")
    }

}
```

#### **Pontos Positivos**

- **Leitura mais eficiente:** quando usamos esse padrão em nosso projeto, ou em parte dele, isso torna o nosso *código mais legível e organizado*.
- **Reutilização de código:**  isso é bem evidente nesse padrão de projeto, sendo que as famílias de algoritmos podem ser *utilizadas por outras classes com diversos contextos diferentes*.
- **Evolução eficiente no seu projeto:** Isso é possível porque o foco aqui é a **composição**. Isso *evita que as classes e subclasses sejam alteradas caso novas funcionalidades sejam adicionadas ou atualizadas*. 

- **O algoritmo pode ser alterado sem a modificação da classe:** a partir dessa estrutura, *novas implementações dele podem ser criadas e introduzidas posteriormente*.
- **A lógica condicional na classe principal é reduzida:** como a escolha do algoritmo está na implementação do objeto que está compondo a classe, isso *elimina a necessidade de ter condicionais para selecionar a lógica a ser executada*. 
- **A implementação pode ser trocada em tempo de execução:** isso faz com que o *comportamento da classe possa ser trocado dinamicamente*. Além disso, o seu projeto se *torna mais dinâmico permitindo assim mais opções de funcionalidades*.

> **Composição (de Objetos):** em ciência da computação, composição de objetos é uma maneira de se combinar objetos simples ou tipos de dados em objetos mais complexos. Ela costuma ser usada como alternativa ao uso de **Herança**.

> **Herança:** é um mecanismo que permite que características comuns a diversas classes sejam fatoradas em uma classe base, ou superclasse. Esse importante conceito possibilita que as classes compartilhem seus atributos, métodos e outros membros da classe entre si. Para a ligação entre as classes, a herança adota um relacionamento esquematizado hierarquicamente. Na Herança temos dois tipos principais de classe:
>
> - **Classe Base**: a classe que concede as características a uma outra classe.
> - **Classe Derivada**: a classe que herda as características da classe base.

#### **Pontos Negativos**

- **Complexidade na criação do objeto:** a instância da dependência *precisa ser criada e configurada*. Caso o atributo seja nulo, *a classe pode apresentar um comportamento inesperado*. 
- **Aumento no número de classes:** há uma para cada algoritmo, criando uma *maior dificuldade em seu gerenciamento*. Isso pode ser muito ruim, se houverem muitas funcionalidades que não podem ser implementadas por classes de uma mesma família de classes Strategy.
- **Complexidade do projeto:** o projeto pode ficar mais *complexo caso uma solução com herança seja mais simples de implementar e manter*.

### Template Method

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

### Visitor

**Veja um exemplo:**

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

## Fontes

**Livro:** Design Patterns com Java - Projeto orientado a objetos guiados por padrões - Eduardo Guerra

https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia

https://sourcemaking.com/design_patterns/strategy
