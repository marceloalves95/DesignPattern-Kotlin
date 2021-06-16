# DesignPattern-Kotlin
> Projeto de estudo baseado nos conceitos das Design Pattern aplicados em Kotlin. 

Projeto em construção.

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

> *Defini famílias de algoritmos implementados por uma hierarquia de classes onde os objetos dessas classes são utilizados em objetos de classes clientes por meio de composição, permitindo assim a mudança de comportamento dos objetos clientes pelo intercâmbio de objetos de estratégia.*

O Strategy é um padrão que deve ser utilizado quando ***uma classe possuir diversos algoritmos que possam ser utilizados de forma intercambiável***. A solução proposta pelo padrão consiste em delegar a execução do algoritmo para uma instância que compõe a classe principal. Dessa forma, quando a funcionalidade for invocada, no momento da execução do algoritmo, será invocado um método da instância que a compõe.

**Veja um exemplo:**

##### Diagrama de Classe - Strategy

|      |
| :--: |

##### Classe Strategy

```kotlin
class Strategy {

    abstract class Felino(private val correrStrategy:CorrerStrategy){

        abstract fun display()
        abstract fun rugir()
        fun perfomarCorrer() = correrStrategy.correr()
        fun getCorrerStrategy(correrStrategy:CorrerStrategy) = correrStrategy.correr()

    }

    class Leao: Felino(CorrerCurtaDistancia()) {

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

### 

#### **Pontos Positivos**

#### **Pontos Negativos**

#### Diagrama de Classe

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
