package comportamental.design_patterns

import comportamental.exemplos.CareTaker
import comportamental.exemplos.Originator

/**
 * @author RubioAlves
 * Created 15/06/2021 at 16:38
 */

fun main() {

    val originator = Originator()
    val careTaker = CareTaker()

    originator.state = "State #1"
    originator.state = "State #2"
    careTaker.add(originator.saveStateToMemento())

    originator.state = "State #3"
    careTaker.add(originator.saveStateToMemento())

    originator.state = "State #4"
    println("Current State: ${originator.state}")

    originator.getStateFromMemento(careTaker.getIndex(0))
    println("First saved state: ${originator.state}")
    originator.getStateFromMemento(careTaker.getIndex(1))
    println("Second saved state: ${originator.state}")

    //Saída

    //Current State: State #4
    //First saved state: State #2
    //Second saved state: State #3

}