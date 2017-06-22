package br.isaac.greeting

import groovy.transform.CompileStatic
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

@CompileStatic
class Greeting extends DefaultTask {

    String message
    String recipient

    @TaskAction
    void sayGreeting() {
        printf("%s, %s!\n", message, recipient)
        println("My first Gradle plugin.")
    }

}
