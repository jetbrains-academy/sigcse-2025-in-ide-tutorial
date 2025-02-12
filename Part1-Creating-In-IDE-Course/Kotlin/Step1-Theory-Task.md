# 📘 Theory Tasks

**Theory tasks** represent the theory portion of a course and typically do not require any coding activities. 
These tasks are displayed in the **Task Panel** and may include text, diagrams, figures, and links. 
To complete a theory task, students must read the provided content and then proceed to the next task.

## 🔧 Example Task: Conditional Operator

In this tutorial, we will create a theory task about the **conditional operator**.

## 🗂️ Configuration: `task-info.yaml`

The `task-info.yaml` configuration file for our course looks as follows:

```yaml
type: theory
custom_name: Definition
files:
  - name: src/main/kotlin/org/jetbrains/academy/kotlin/template/Main.kt
    visible: true
  - name: src/main/kotlin/org/jetbrains/academy/kotlin/template/InvisibleFile.kt
    visible: false
```

In this file, you need to specify:
- **`type`**: The type of the task, which, in this case, is `theory`.
- **`custom_name`**: An optional field defining the task name displayed to students.
- **`files`**: A list of files related to the task, where each file can be marked as:
    - `visible: true` to show the file to students.
    - `visible: false` to hide the file from students.

> **Note:** When adding a new file through the context menu, it is automatically included in the `files` block of the `task-info.yaml` file.
The description of this task can be found in the `task.md` file. You can use mardown formatting here.

---


## 📝 Task Description: `task.md`

The description for this task is stored in the `task.md` file. 
You can use **Markdown** formatting for content like code snippets, links, or additional styles.

Here is the example `task.md` file for the conditional operator task:

```text
The conditional operator (the [`if`](https://kotlinlang.org/docs/control-flow.html#if-expression) expression)
is used when the program has some choice.
For example, if the variable contains a positive number, display it on the screen,
otherwise do nothing.
Or, if the guess matches the secret, end the game.

Consider the following example:
    ```kotlin
    if (y > 0) {
        println(y)
    }
    ```
Another example:
    ```kotlin
    if (x > y) {
        println(x)
    } else {
        // The opposite condition: x <= y
        println(y)
    }
    ```

For the `else` branch, the reverse of the original condition is used: for example,
for `x > y`, the opposite condition is `x <= y`.
```

---

With this structure, you’ve successfully set up a theory task that introduces students 
to the conditional operator in Kotlin. Continue to the next step to explore more task types! 🚀   