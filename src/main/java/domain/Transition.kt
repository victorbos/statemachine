package domain

class Transition(val stateType: StateType,
                 val transitionType: TransitionType,
                 val condition: () -> Boolean) {
}