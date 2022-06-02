package furhatos.app.tmpskill.flow

import furhatos.app.tmpskill.flow.main.Idle
import furhatos.app.tmpskill.setting.distanceToEngage
import furhatos.app.tmpskill.setting.maxNumberOfUsers
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice

val Init : State = state() {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(distanceToEngage, maxNumberOfUsers)
        furhat.voice = Voice("Matthew")
        /** start the interaction */
        goto(Idle)
    }
}
