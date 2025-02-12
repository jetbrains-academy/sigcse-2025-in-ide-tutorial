# 🖥️ Code Tasks

**Code tasks** challenge students to solve programming exercises, enabling them to practice and refine their coding skills.

## 🧩 Task Types:

- **Tasks with placeholders**: Students replace a placeholder in the code to make the correct solution.
- **Tasks without placeholders**: Students write their solution, such as implementing a function or a class, in their own way without pointing where exactly to do that.

Code tasks are evaluated using **input-output examples** or custom **test cases** provided by the course creator. 
These tests can be tailored using various approaches and frameworks, providing flexibility for course authors.

---

## 🚀 Example Task: Conditional Operator

In this tutorial, we will create a code task with placeholder and unit tests, where students utilize the **conditional operator** to solve a problem.

## 🗂️ Configuration: `task-info.yaml`

The `task-info.yaml` configuration file for our course looks as follows:

```yaml
type: edu
custom_name: Choose Your Outfit 👕👗
files:
  - name: test/Tests.java
    visible: false
  - name: src/main/java/org/jetbrains/academy/java/template/Main.java
    visible: true
    placeholders:
      - offset: 301
        length: 277
        placeholder_text: return ""; // Write your solution here
  - name: src/main/java/org/jetbrains/academy/java/template/InvisibleFile.java
    visible: false
```

In this file, you need to specify:
- **`type`**: Defines the task type. In this case, it is `edu` for a task with unit tests. If you plan to have task input-output examples instead of tests, you need to use `output` here.
- **`custom_name`**: An optional field defining the task name displayed to students.
- **`files`**: A list of files related to the task, where each file can be marked as:
    - `visible: true` to show the file to students.
    - `visible: false` to hide the file from students.
    - **`placeholders`**: Highlights specific areas in the code where students must write their solutions. Fields within this section include:
      - **`offset`**: The position in the file where the placeholder starts.
      - **`length`**: The length of the placeholder text.
      - **`placeholder_text`**: The default text displayed in the placeholder.
    - Files without placeholders can also be included, allowing students to freely code in those sections.

> **Note:** When adding a new file through the context menu, it is automatically included in the `files` block of the `task-info.yaml` file.
The description of this task can be found in the `task.md` file. You can use mardown formatting here.

---


## 📝 Task Description: `task.md`

The description for this task is stored in the `task.md` file.
You can use **Markdown** formatting for content like code snippets, links, or additional styles.

Here is the example `task.md` file for the conditional operator task:

```text
You're planning your outfit for the
day based on the weather! Write a Java program
that uses the **conditional operator** (`if` expression)
to decide what to wear:

- If the temperature is **above 25**, print: `"It's hot! Wear shorts and a t-shirt."`
- If the temperature is **between 15 and 25 (inclusive)**, print: `"It's mild! Wear jeans and a light sweater."`
- If the temperature is **below 15**, print: `"It's cold! Wear a jacket and long pants."`
```

---


📂 Source and Test Files

The source and test files for this code task can be found in the ready course: 
[link](./../Ready-Courses/Java-Course/courseSection/courseLesson/programmingTask).

---

With this setup, your code task is ready to challenge students and provide them with an engaging learning experience. 
Continue to the next section to explore advanced task options! 🚀  
