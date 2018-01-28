import domain.*

fun main(args: Array<String>) {
    val sm = StateMachine()

    sm.addEventHandler(
            EventType.STRIKE_CALCULATION,
            Transition(StateType.NOT_MONITORED, TransitionType.START_MONITORING,
                    { true })
    )

    val t = sm.handleEvent(EventType.STRIKE_CALCULATION, StateType.NOT_MONITORED)
    print(t.name)
}
