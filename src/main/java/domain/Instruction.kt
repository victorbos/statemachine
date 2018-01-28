package domain

class Instruction(transitionType: TransitionType, toState: StateType) {

    val commands = mutableListOf<Command>()

    fun addCommand(command: Command) {
        commands.add(command)
    }

}