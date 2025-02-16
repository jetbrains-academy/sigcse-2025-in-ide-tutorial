# Common Configs for the TaskTracker Tool

This folder contains common configuration files for setting up the [**TaskTracker**](https://github.com/JetBrains-Research/tasktracker-3) tool. 
These configs are **language-independent**, meaning they can be used for courses in Kotlin, Java, or Python.

This section describes each configuration file and its purpose.

---

## 📝 Scenario Config

The **Scenario Config** is a crucial part of the TaskTracker tool. It defines the sequence of events, also known as a "_scenario_," such as:
- The order of tasks and surveys.
- The information displayed to students.

The scenario config dictates how the education process is structured and presented to the student.

In cases where we only need to track students' actions throughout the course, a simple config like the one below is sufficient:

```yaml
scenario:
  steps:
    - units:
        - !<Task>
          id: "main"
```

In this example:
- Only one main task (`id: "main"`) is defined.
- The task starts at the beginning of the data collection process and remains active until the experiment ends.

> You can find this configuration in the [`scenario_default.yaml`](./scenario_default.yaml) file.

---

## 🔧 IDE Settings Config

The **IDE Settings Config** specifies the IDE settings to be enabled or disabled while students work on tasks. Examples of IDE settings include:
- Enabling or disabling **automatic code completion**.
- Enabling or disabling **IDE Zen mode**.
- Changing the **editor theme** (e.g., light or dark mode).

For this tutorial, we will use the default configuration:

```yaml
enableCodeCompletion: DEFAULT
enableZenMode: DEFAULT
theme: DEFAULT
```

In this setup:
- **enableCodeCompletion**: Controls code suggestion behavior in the IDE (`DEFAULT` keeps it enabled).
- **enableZenMode**: Determines if Zen mode is enabled, which provides a distraction-free workspace (`DEFAULT` keeps it disabled).
- **theme**: Sets the IDE color theme (`DEFAULT` uses the IDE’s standard theme).

> You can find this configuration in the [`settings_default.yaml`](./settings_default.yaml) file.


---

## 💡 Inspection Config

The **Inspection Config** allows you to enable or disable specific **code quality inspections** by their names.

For example, you might configure it to enable hints about potential issues, such as division by zero.


For this tutorial, we will use the default configuration, what will enable only default inspections:

```yaml
mode: DEFAULT
```


> You can find this configuration in the [`inspection_default.yaml`](./inspection_default.yaml) file.


---

## 📋 Survey Config

The **Survey Config** defines surveys that can be included in your course scenario.  
Surveys can contain:
- Single-choice, multiple-choice, or open-ended questions.
- Required questions that students must complete to proceed.

For this tutorial, we will create one question per each question type:

```yaml
surveys:
  - id: default
    htmlQuestions:
      - !<Input>
        text: How difficult was this course for you? (1 - Too easy, 5 - Just right, 10 - Too difficult)
        type: number
        min: 1
        max: 10
        elementId: difficult
        required: true
      - !<Checkbox>
        text: What challenges did you face during the course?
        elementId: challenges
        required: true
        info:
          - id: pace
            value: Keeping up with the pace
          - id: explanations
            value: Difficult topics/lack of explanations
          - id: debugging
            value: Debugging issues
          - id: transitions
            value: Unclear transitions between topics
          - id: practice
            value: Not enough practice tasks
          - id: other
            value: "Other"
      - !<Textarea>
        text: If you have chosen 'Other', please write your answer here.
        elementId: challengesOther
        rows: 5
        cols: 50
      - !<Textarea>
        text: Which topic was the most difficult for you?
        elementId: topicDifficult
        required: true
        rows: 5
        cols: 50
      - !<Radio>
        text: Would you be interested in participating in future research studies?
        elementId: participating
        required: true
        info:
          - id: yes
            value: Yes
          - id: no
            value: No
      - !<Textarea>
        text: How would you improve this course?
        elementId: improve
        rows: 5
        cols: 50

```

> You can find this configuration in the [`survey_default.yaml`](./survey_default.yaml) file.


## ℹ️ Additional Static Information Configurations

In addition to the main configs above, you can provide static information for students to see before, 
during, or after their learning process. These include:

1. **Research Agreement**:  
   Add a link to the research agreement students must read before joining the experiment.
    - Example configuration: [`agreement_default.yaml`](./agreement_default.yaml)

2. **Task Solving Information**:  
   Provide information to display to students while solving tasks (e.g., guidance or tips).
    - Example configuration: [`info_default.yaml`](./info_default.yaml)

3. **Final Page Message**:  
   Include a final message to display when students finish the course and submit their data to the server.
    - Example configuration: [`final_page_default.yaml`](./final_page_default.yaml)

4. **Error Message**:  
   Specify an error message to display to students if there’s an issue with the server.
    - Example configuration: [`server_error_default.yaml`](./server_error_default.yaml)

---  

## 🚀 Next Steps

Explore and customize these configuration files as needed for your course. 
These settings work across languages and courses, enabling you to adapt them to your specific needs!  