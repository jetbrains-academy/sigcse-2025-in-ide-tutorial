# Building Your Kotlin Course

Follow these steps to create your Kotlin course.

## 🛠 Step 1: Download the Kotlin Course Template

As the first step, download the [Kotlin course template](https://github.com/jetbrains-academy/kotlin-course-template/tree/main) from GitHub.
This template contains examples of all the supported task types that we’ll be working on during this tutorial.

**Prerequisite**: To build the template, ensure you have **JDK 17** installed on your system.

---

## 📂 Course Structure

Each course follows a standardized structure, as outlined below:


```
Kotlin-Course-Root/
├── Build System Files/           # Files related to the build system, e.g., Gradle:
│   ├── settings.gradle.kts       # Gradle settings file  
│   ├── gradlew.bat               # Gradle wrapper for Windows  
│   ├── gradlew                   # Gradle wrapper for Unix/Linux  
│   ├── gradle.properties         # Gradle property configurations  
│   └── build.gradle.kts          # Gradle build script  
├── course-info.yaml/             # The main file to describe the course structure  
├── common/                       # Module for common resources (e.g., utilities for tests or images)  
├── courseSection/                # Module containing files for one section of the course  
└── others/                       # Additional files like README, Gradle wrapper, etc.
```


---

## 📜 Key File: `course-info.yaml`

The `course-info.yaml` file holds all the essential details about the course. Below is an example used in this tutorial:


```yaml  
type: marketplace  
title: Creating In-IDE Programming Courses Tutorial – SIGCSE 2025  
language: English  
summary: '<p>This course demonstrates JetBrains Academy course creation process.  
More about this course can be found in <a href="https://github.com/jetbrains-academy/sigcse-2025-in-ide-tutorial/tree/main/Part1-Creating-In-IDE-Course">this  
repository</a>.</p>'  
programming_language: Kotlin  
content:
- courseSection  
environment_settings:  
  jvm_language_level: JDK_17  
yaml_version: 2
```



🔑 Required Fields in `course-info.yaml`:

1. **`title`**: The title of the course.
2. **`language`**: The language of the course content (e.g., English).
3. **`summary`**: A short description of the course or additional details, often in HTML format.
4. **`programming_language`**: The programming language for the course (e.g., Kotlin).

> **Note:** When adding a new section through the context menu, it will automatically be included in the `content` block of the `course-info.yaml` file.
 
---

## 📂 Lesson structure

In each section, you can create multiple lessons that combine theory, quizzes, and coding tasks.
This information is stored in the `section-info.yaml` file, as shown below:

```yaml
custom_name: in-IDE course Tutorial
content:
  - courseLesson
  - courseFrameworkLesson
```

> **Note:** When adding a new lesson through the context menu, it will automatically be included in the `content` block of the `section-info.yaml` file.

---

## 📂 Task structure

To learn more about the task structure, please proceed to the next step of this tutorial.

---  

Now you’re fully equipped to begin building your Kotlin course! 🎉   
 