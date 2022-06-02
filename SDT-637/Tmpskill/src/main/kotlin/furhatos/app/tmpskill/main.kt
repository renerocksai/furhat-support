package furhatos.app.tmpskill

import furhatos.app.tmpskill.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class TmpskillSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
