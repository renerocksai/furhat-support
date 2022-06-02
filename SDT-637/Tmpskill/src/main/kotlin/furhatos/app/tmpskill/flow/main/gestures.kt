package gestures

import furhatos.gestures.BasicParams
import furhatos.gestures.defineGesture

/*
        NECK_TILT to -50.0    // head : -..up, +..down
        NECK_PAN to -10.0     // head : -..right, +..left
        NECK_TILT             // head : -..left, +..right
        GAZE_TILT to -10.0    // eyes : -..right, +..left
        GAZE_PAN to -10.0     // eyes : -..up, +..down
*/

var headDown = defineGesture() {
    frame(0.0, 0.8) {
        BasicParams.NECK_TILT to 10
    }
    frame(0.8, 1.4) {
        BasicParams.NECK_TILT to 10
    }
    reset(1.8)
}

var headUp = defineGesture() {
    frame(0.0, 0.8) {
        BasicParams.NECK_TILT to -6
    }
    frame(0.8, 1.4) {
        BasicParams.NECK_TILT to -6
    }
    reset(1.8)
}


var headLeft = defineGesture() {
    frame(0.0, 0.8) {
        BasicParams.NECK_PAN to 20
    }
    frame(1.5) {
        BasicParams.NECK_PAN to 0
    }
    reset(1.8)
}

var headRight = defineGesture() {
    frame(0.0, 0.8) {
        BasicParams.NECK_PAN to -20
    }
    frame(1.5) {
        BasicParams.NECK_PAN to 0
    }
    reset(1.8)
}
