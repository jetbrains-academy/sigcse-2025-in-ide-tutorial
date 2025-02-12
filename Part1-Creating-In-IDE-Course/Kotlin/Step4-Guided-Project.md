# 🖥️ Guided Projects

**Guided Projects** are a special type of coding task, designed to be completed in multiple steps. 
In a guided project, you can combine various task types—such as theory, quizzes, and coding 
tasks—to guide students in implementing a larger project step by step.

This format makes it easy to include larger, more comprehensive projects in your course while 
maintaining manageable steps for students.

---

## 🗂️ General Configuration

1. **First Task**:  
   In a guided project, the first task is typically a **theory task** that:
    - Describes the project.
    - Sets up the initial code file(s) students will begin with for their coding journey.

2. **Subsequent Steps**:  
   Starting from the second task, all code files should solve the task for that specific step.
    - Students will **not see the solution** from these steps; instead, they will see the **code they wrote in the previous step**.


---

## 🚀 Example Guided Project: Library Book Search

In this example, we will create a guided project where students implement a simple console application with two functions:
1. Generating random books for a library.
2. Searching through the book collection using a binary search algorithm.


📖 Project Steps

This project consists of three steps:
1. **Step 1**: A **theory task** containing the description of the entire project.
2. **Step 2**: A **coding task** (test-based, without placeholders) to implement the random book generation function.
3. **Step 3**: Another **coding task** (test-based, without placeholders) to implement the binary search functionality for the project.

Below, you’ll find detailed information about each task in this guided project.

---

# First step. Library Book Search 📚

### 🗂️ Configuration: `task-info.yaml`

The `task-info.yaml` configuration file for this step looks as follows:

```yaml
type: theory
custom_name: Library Book Search 📚
files:
  - name: src/org/jetbrains/academy/kotlin/template/Main.kt
    visible: true
```

In this file, you need to specify:
- **`type`**: The type of the task, which, in this case, is `theory`.
- **`custom_name`**: An optional field defining the task name displayed to students.
- **`files`**: A list of files related to the task, where each file can be marked as:
    - `visible: true` to show the file to students.
    - `visible: false` to hide the file from students.

> **Note:** When adding a new file through the context menu, it is automatically included in the `files` block of the `task-info.yaml` file.
The description of this task can be found in the `task.md` file. You can use mardown formatting here.

### 📝 Task Description: `task.md`

The description for this task is stored in the `task.md` file.
You can use **Markdown** formatting for content like code snippets, links, or additional styles.

Here is the example `task.md` file for the first task in the guided project:

```text
Imagine you're creating a system for a library to help readers quickly locate books. 
Each book is assigned a unique **ID** number that’s stored in a list. 
The list of book IDs is **sorted in ascending order**.

Your task is to implement a function that performs 
a **binary search** to determine if a specific book ID exists in the library's collection.

<p align="center">
    <img src="../../../common/src/main/resources/images/game.png" alt="Game picture" width="400"/>
</p>
```

### 📂 Source Files

The source files for this theory task can be found in the ready course:
[link](./../Ready-Courses/Kotlin-Course/courseSection/courseFrameworkLesson/theoryTask).

---

# Second step. Chaos in the Library! 📖

### 🗂️ Configuration: `task-info.yaml`

The `task-info.yaml` configuration file for this step looks as follows:

```yaml
type: edu
custom_name: Chaos in the Library! 📖
files:
  - name: src/org/jetbrains/academy/kotlin/template/Main.kt
    visible: true
  - name: src/org/jetbrains/academy/kotlin/template/InvisibleFile.kt
    visible: false
    propagatable: false
  - name: test/Tests.kt
    visible: false
    propagatable: false
```

In this file, you need to specify:
- **`type`**: Defines the task type. In this case, it is `edu` for a task with unit tests. If you plan to have task input-output examples instead of tests, you need to use `output` here.
- **`custom_name`**: An optional field defining the task name displayed to students.
- **`files`**: A list of files related to the task, where each file can be marked as:
    - `visible: true` to show the file to students.
    - `visible: false` to hide the file from students.
    - **`propagatable`**: Specifies if you need to synchronize the changes with the other steps in the project after changes. Default value is `true`, if you want to disable this feature, you need to specify it directly.

> **Note:** When adding a new file through the context menu, it is automatically included in the `files` block of the `task-info.yaml` file.
The description of this task can be found in the `task.md` file. You can use mardown formatting here.

### 📝 Task Description: `task.md`

The description for this task is stored in the `task.md` file.
You can use **Markdown** formatting for content like code snippets, links, or additional styles.

Here is the example `task.md` file for the first task in the guided project:

```text
The library is expanding, and new books keep arriving every day! 
But there’s one problem... the librarian accidentally lost *all* the book ID records! 😱📉 

Your task is to help the library restore order by writing a function that generates a list of random book IDs.


**What You Need to Do:**
You need to implement the function **`generateBookIds`**, which will create a list of **random book IDs** for our library. Each book ID should:
1. Be an integer number between **0 and 500** (inclusive).
2. Be **unique** (no two books should have the same ID).
3. The number of book IDs generated can **vary (e.g., between 5 to 20 books)** each time the function is run. The library has unpredictable needs!
```

### 📂 Source and Test Files

The source and test files for this theory task can be found in the ready course:
[link](./../Ready-Courses/Kotlin-Course/courseSection/courseFrameworkLesson/programmingTask).

---

# Third step. Book Search Implementation 💻

### 🗂️ Configuration: `task-info.yaml`

The `task-info.yaml` configuration file for this step looks as follows:

```yaml
type: edu
custom_name: Book Search Implementation 💻
files:
  - name: src/org/jetbrains/academy/kotlin/template/Main.kt
    visible: true
  - name: src/org/jetbrains/academy/kotlin/template/InvisibleFile.kt
    visible: false
    propagatable: false
  - name: test/Tests.kt
    visible: false
    propagatable: false
```

In this file, you need to specify:
- **`type`**: Defines the task type. In this case, it is `edu` for a task with unit tests. If you plan to have task input-output examples instead of tests, you need to use `output` here.
- **`custom_name`**: An optional field defining the task name displayed to students.
- **`files`**: A list of files related to the task, where each file can be marked as:
    - `visible: true` to show the file to students.
    - `visible: false` to hide the file from students.
    - **`propagatable`**: Specifies if you need to synchronize the changes with the other steps in the project after changes. Default value is `true`, if you want to disable this feature, you need to specify it directly.

> **Note:** When adding a new file through the context menu, it is automatically included in the `files` block of the `task-info.yaml` file.
The description of this task can be found in the `task.md` file. You can use mardown formatting here.

### 📝 Task Description: `task.md`

The description for this task is stored in the `task.md` file.
You can use **Markdown** formatting for content like code snippets, links, or additional styles.

Here is the example `task.md` file for the first task in the guided project:

```text
The library is a bit chaotic today—one of the books has gone **missing**, 
and it's your job to find it! Fortunately, the librarian gave you a **sorted list of book IDs**, 
but it’s **huge,** and manually checking each one would take forever. 
To save the day (and some precious time), you’ll need to use the **binary search algorithm**.

**What You Need to Do:**
You need to implement the function **`binarySearchBook`**, which will searchi for a book in our library:
This function will:
1. Search for the **target book ID** (`targetId`) in the sorted list of book IDs (`bookIds`).
2. If the target ID exists in the list, return the **index** of the book.
3. If the target ID doesn’t exist, return **-1**
```

### 📂 Source and Test Files

The source and test files for this theory task can be found in the ready course:
[link](./../Ready-Courses/Kotlin-Course/courseSection/courseFrameworkLesson/programmingTask2).

---

By following these steps, you can create a cohesive guided project that teaches students 
to build larger applications one step at a time. Continue to explore advanced features to 
enrich your course! 🚀  

 