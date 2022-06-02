package furhatos.app.tmpskill.flow.main

import furhatos.flow.kotlin.*
import gestures.*
import furhatos.records.Location

val Idle: State = state {

    init {
        furhat.attend(Location(0.0,0.0,1.0))
    }

    onButton("look straight") {
        furhat.attend(Location(0.0,0.0,1.0))
    }

    onButton("left") {
        furhat.gesture(headLeft)
    }

    onButton("right") {
        furhat.gesture(headRight)
    }

    onButton("up") {
        furhat.gesture(headUp)
    }

    onButton("down") {
        furhat.gesture(headDown)
    }
    onUserEnter { }
}
