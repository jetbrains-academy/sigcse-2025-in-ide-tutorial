**Quiz tasks**,  which are also theory-based, require students to complete a quiz to complete the task. 
Quizzes can be designed as a single or multiple-choice, and error messages can be customized depending on the learner's chosen option.

In this tutorial we will create a task about conditional operator.

The `yaml` config:

```yaml
type: choice
is_multiple_choice: false
options:
  - text: X is greater
    is_correct: false
  - text: Y is greater or equal
    is_correct: true
  - text: The code will produce an error
    is_correct: false
message_incorrect: You could copy this code to the code editor to check the actual
  result.
files:
  - name: src/main/kotlin/org/jetbrains/academy/kotlin/template/Main.kt
    visible: true
custom_name: Quiz 🧐🤓
local_check: true
```

The `md` file:

```text
What will the following Kotlin code snippet print if `x = 5` and `y = 10`? 

```kotlin
if (x > y) { 
    println("X is greater")
} else {
    println("Y is greater or equal")
}
```
