package domain


interface Command {

    fun execute() : Boolean
}