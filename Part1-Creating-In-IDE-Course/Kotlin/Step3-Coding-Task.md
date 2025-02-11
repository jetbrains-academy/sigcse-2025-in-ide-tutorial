**Code tasks** require students to solve programming exercises. 
Several options can be used. In a simple case, students only need to replace a placeholder 
with the correct code to complete the task. In a more difficult case, students must implement 
a function or a class in their own way. 
These tasks are tested by input-output examples or provided test cases by the course author and can be customized with different approaches and frameworks. 

In this tutorial we will create a task about conditional operator.

The `yaml` config:

```yaml
type: edu
custom_name: Choose Your Outfit 👕👗
files:
  - name: test/Tests.kt
    visible: false
  - name: src/main/kotlin/org/jetbrains/academy/kotlin/template/Main.kt
    visible: true
    placeholders:
      - offset: 96
        length: 244
        placeholder_text: TODO("Implement this function)
  - name: src/main/kotlin/org/jetbrains/academy/kotlin/template/InvisibleFile.kt
    visible: false
```

The `md` file:

```text
You're planning your outfit for the 
day based on the weather! Write a Kotlin program 
that uses the **conditional operator** (`if` expression) 
to decide what to wear:

- If the temperature is **above 25**, print: `"It's hot! Wear shorts and a t-shirt."`
- If the temperature is **between 15 and 25 (inclusive)**, print: `"It's mild! Wear jeans and a light sweater."`
- If the temperature is **below 15**, print: `"It's cold! Wear a jacket and long pants."`
```

Source files can be found in the ready course: [link](./../Ready-Courses/Kotlin-Course/courseSection/courseLesson/programmingTask)
