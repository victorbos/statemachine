package commands

import domain.Command
import domain.Context

class StartMonitoring(private val context: Context) : Command {
    override fun execute(): Boolean {

        println("Creating monitor period for ${context.sellerId} starting ${context.date.toString()}")
        return true
    }
}