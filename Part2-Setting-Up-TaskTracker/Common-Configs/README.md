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

The **IDE Settings Config** specifies the IDE settings to be enabled while students work on tasks. Examples of IDE settings include:
- Enabling or disabling specific **code quality inspections**.
- Enabling or disabling **automatic code completion**.
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

## 📋 Survey Config

The **Survey Config** defines surveys that can be included in your course scenario.  
Surveys can contain:
- Single-choice, multiple-choice, or open-ended questions.
- Required questions that students must complete to proceed.

For this tutorial, we will create one question per each question type:

TODO

> You can find this configuration in the [`survey_default.yaml`](./survey_default.yaml) file.


---

## 📊 Activity Tracking/Code Tracking Configs

TODO: Add information about activity tracking and code tracking configurations here.

---

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