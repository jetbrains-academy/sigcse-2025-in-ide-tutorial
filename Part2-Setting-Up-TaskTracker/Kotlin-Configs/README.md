# Kotlin Configs for the TaskTracker Tool

This folder contains Kotlin-specific configuration files for setting up the [**TaskTracker**](https://github.com/JetBrains-Research/tasktracker-3) tool. 
Unlike the common configurations, these settings are tailored specifically for Kotlin courses.

---

## 🗂️ Task Content Config

The **Task Content Config** is the key file for specifying the files in which students will solve their assignments.

🔑 Key Features:
- **File Management**: All file paths are configured relative to the root of the current project in the IDE. This ensures personal user information is not collected.
- **Internal Files**: Files marked as `internal` are not created if they already exist, allowing the configuration to accommodate files from third-party plugins or educational tools.
- **File Creation**: If a file doesn’t exist, it will be created with content specified in the configuration, or it will remain empty if no template is provided.

---

📋 Example Configuration

For this tutorial, the following `Task Content Config` file lists all possible locations for the course files:

```yaml
tasks:
  - description: "Take the kotlin course, and after that, press the next button."
    files:
      - extension: KOTLIN
        filename: Main
        isInternal: false
        relativePath: courseSection/courseFrameworkLesson/task/src/org/jetbrains/academy/kotlin/template
        sourceSet: SRC
      - extension: KOTLIN
        filename: Main
        isInternal: false
        relativePath: courseSection/courseLesson/programmingTask/src/main/kotlin/org/jetbrains/academy/kotlin/template
        sourceSet: SRC
    id: main
    name: "Kotlin Course"
```

> You can find this configuration in the [`task_content_default.yaml`](./task_content_default.yaml) file.

---

📝 Field Descriptions

- **`tasks`**: A list of defined tasks.
- **`description`**: A brief description of the task to help guide students during their learning process.
- **`files`**: A collection of files associated with the task. Each file has the following fields:
    - **`extension`**: The file’s programming language or format (e.g., `KOTLIN`).
    - **`filename`**: The file's name.
    - **`isInternal`**: Indicates if the file should be replaced with a new one if they are already exist.
    - **`relativePath`**: The file’s location relative to the project root.
    - **`sourceSet`**: Defines the source set for the file location (e.g., `SRC`).
- **`id`**: The task id is from the *Scenario config*.
- **`name`**: The name of the task as displayed in the course interface.

--- 

## 🚀 Summary

The **Task Content Config** is essential for defining associated files with each scenario task in a Kotlin course. 
By configuring file paths, descriptions, and privacy settings, you can ensure tasks are organized, and secure.

This configuration is tailored specifically for Kotlin projects, 
but the structure can also be adapted to other compatible programming languages supported by the TaskTracker tool.
