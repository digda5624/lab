package digda.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class DigdaTask: DefaultTask() {

    init {
        group = "digda-task"
    }

    @TaskAction
    fun defaultTask() {
        println("Hello, Digda!")
    }
}
