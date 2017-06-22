package br.isaac.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.getTasks().create("hello", Greeting.class, { task -> 
            task.setMessage("Hello")
            task.setRecipient("World")
        });
    }
}
