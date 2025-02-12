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
  - name: main.py
    visible: true
    placeholders:
      - offset: 140
        length: 240
        placeholder_text: "# Implement your solution here"
  - name: invisible_main.py
    visible: false
  - name: tests/test.py
    visible: false
  - name: __init__.py
    visible: false
  - name: tests/__init__.py
    visible: false
```

The `md` file:

```text
You're planning your outfit for the 
day based on the weather! Write a Python program 
that uses the **conditional operator** (`if` expression) 
to decide what to wear:

- If the temperature is **above 25**, return: `"It's hot! Wear shorts and a t-shirt."`
- If the temperature is **between 15 and 25 (inclusive)**, return: `"It's mild! Wear jeans and a light sweater."`
- If the temperature is **below 15**, return: `"It's cold! Wear a jacket and long pants."`
```

Source files can be found in the ready course: [link](./../Ready-Courses/Python-Course/course_section/course_lesson/programming_task)
