package domain

class StateMachine() {

    val eventHandlers = mutableMapOf<EventType, MutableList<Transition>>()

    fun addEventHandler(eventType: EventType, transition: Transition) {
        val transitions = eventHandlers[eventType] ?: mutableListOf<Transition>()
        transitions.add(transition)
        eventHandlers[eventType] = transitions
    }

    fun handleEvent(eventType: EventType, currentState: StateType) : TransitionType {
        val eventHandler: List<Transition> = eventHandlers[eventType] ?: throw IllegalStateException("No event handler found for event ${eventType.name}")

        return eventHandler.first { it.stateType == currentState && it.condition() }.transitionType ?: throw IllegalStateException("No transition found for event ${eventType.name} and state ${currentState.name}")
    }

}