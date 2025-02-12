# 🧩 Quiz Tasks

**Quiz tasks** are a subset of theory-based tasks that require students to complete a quiz to proceed.
These quizzes can consist of single or multiple-choice questions.
Additionally, you can provide customized error messages depending on the learner's selected answers.  
In this tutorial we will create a task about conditional operator.

---

## 🚀 Example Task: Conditional Operator Quiz

In this tutorial, we will create a quiz task about the **conditional operator**.

## 🗂️ Configuration: `task-info.yaml`

The `task-info.yaml` configuration file for our course looks as follows:

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
  - name: main.py
    visible: true
  - name: __init__.py
    visible: true
custom_name: Quiz 🧐🤓
```

In this file, you need to specify:
- **`type`**: Defines the task type. In this case, it is `choice`.
- **`is_multiple_choice`**: Specifies whether the quiz allows more than one correct answer (`true` or `false`).
- **`custom_name`**: An optional field defining the task name displayed to students.
- **`files`**: A list of files related to the task, where each file can be marked as:
    - `visible: true` to show the file to students.
    - `visible: false` to hide the file from students.
- **`message_incorrect`**: A message that will be shown to students if they select an incorrect answer.
- **`options`**: A list of quiz options:
    - **`text`**: The text of the quiz answer option.
    - **`is_correct`**: Indicates if the answer is correct (`true`) or incorrect (`false`).

> **Note:** When adding a new file through the context menu, it is automatically included in the `files` block of the `task-info.yaml` file.
The description of this task can be found in the `task.md` file. You can use mardown formatting here.

---


## 📝 Task Description: `task.md`

The description for this task is stored in the `task.md` file.
You can use **Markdown** formatting for content like code snippets, links, or additional styles.

Here is the example `task.md` file for the conditional operator task:

```text
What will the following Python code snippet print if `x = 5` and `y = 10`? 

    ```python
    if x > y:  
        print("X is greater")  
    else:  
        print("Y is greater or equal") 
    ```
```

---

With these configurations, the quiz task is set up and ready to enhance students’
learning through interactive quiz-based problem-solving activities.
Continue to the next section for additional task types! 🚀  
