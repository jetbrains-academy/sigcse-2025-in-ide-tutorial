# Part 2. Setting Up the KOALA Tool

Welcome to **Part 2** of the **Creating In-IDE Programming Courses Tutorial**!
In this section, we focus on setting up the [**KOALA**](https://github.com/JetBrains-Research/tasktracker-3) tool to track student behaviour during learning.
After completing this part, you'll have a KOALA configuration to track student behaviour during solving the course.

---

## 🎯 Goal of This Part

The goal of this part is to set up the [**KOALA**](https://github.com/JetBrains-Research/tasktracker-3) tool 
and show how it is flexible in the data collection process.

---

## 🗒 Overview of Steps

This part is broken down into the following tasks:

1. **Deploying KOALA server**: Start deploy of a remote server to collect the data. **TODO: should we keep it here?**
2. **TODO**

All configuration files are language-independent, expect the **TODO** configuration files which list the files to track.

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

- Each language folder (`Kotlin-Configs/`, `Java-Configs/`, and `Python-Configs/`) contains the same set of configuration files, but with **different implementations depending on the targeted course**.
- If you'd like to skip the tutorial steps and go straight to the ready KOALA tool, you can find pre-built tool in the **`Ready-KOALA/`** folder.

---

## 🛠 Getting Started

Before you begin, ensure you have the sources of the KOALA tool on your laptop:

- [KOALA sources](https://github.com/JetBrains-Research/tasktracker-3)

---

🎉 **Let’s start setting up the KOALA tool!** 🚀
