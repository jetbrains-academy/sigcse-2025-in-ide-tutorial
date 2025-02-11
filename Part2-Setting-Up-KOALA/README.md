# Part 2. Setting Up the KOALA Tool

Welcome to **Part 2** of the **Creating In-IDE Programming Courses Tutorial**!
In this section, we focus on setting up the [**KOALA**](https://github.com/JetBrains-Research/tasktracker-3) tool to
track student behaviour during learning.
After completing this part, you'll have a KOALA configuration to track student behaviour during solving the course.

---

## 🎯 Goal of This Part

The goal of this part is to set up the [**KOALA**](https://github.com/JetBrains-Research/tasktracker-3) tool
and show how it is flexible in the data collection process.

---

## 🗒 Overview of Steps

This part is broken down into the following tasks:

1. **KOALA server**: A basic overview of a server for data collection and storage.
2. **KOALA plugin configuration**:
    * **Task Content**: label the files that directly affect the experiment and from which data should be collected.
    * **Info**: set information about the experiment and associated logs.
    * **Agreements**: Identify agreements for those who will participate in the study.
    * **Settings and Inspections**: Add restrictions or alternatively add additional features for participants in the
      IDE.
    * **Server Error Message and Final Page**: add instructions after the experiment is complete, or if there is an error while interacting with the server.
    * **Surveys**: Add the survey that you would like to use in your experiment. 
    * **Scenario**: Define the scenario in which the tasks will be performed.
3. **KOALA plugin participant view**: look at the plugin from the participant side of the experiment.

All configuration files are language-independent, expect the **Task Content** configuration files which list the files
to track.

---

## 📂 Repository Structure

This repository is organized to make it easy for you to navigate through the steps of setting up the KOALA tool.

```
Part2-Setting-Up-KOALA/
├── Kotlin-Configs/                  # Kotlin-specific config files
├── Java-Configs/                    # Java-specific config files
├── Python-Configs/                  # Python-specific config files
├── Common-Configs/                  # Common config files for all three languages
├── Ready-KOALA/                     # Fully built KOALA tool
└── README.md                        # This documentation file
```

- Each language folder (`Kotlin-Configs/`, `Java-Configs/`, and `Python-Configs/`) contains the same set of
  configuration files, but with **different implementations depending on the targeted course**.
- If you'd like to skip the tutorial steps and go straight to the ready KOALA tool, you can find pre-built tool in the *
  *`Ready-KOALA/`** folder.

---

## 🛠 Getting Started

Before you begin, ensure you have the sources of the KOALA tool on your laptop:

- [KOALA sources](https://github.com/JetBrains-Research/tasktracker-3)

---

🎉 **Let’s start setting up the KOALA tool!** 🚀
