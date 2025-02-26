# ⚙️ Setting Up IDE Settings

When your course is complete, you can enhance it further by configuring **IDE settings** to apply them automatically for students.

One useful feature is **configuring code quality inspections**:
- Enable or disable specific inspections.
- Define the inspection type (e.g., warning or error).
- Customize how inspections are highlighted in the IDE.

This part of the tutorial will guide you through setting up code quality inspections for your course.

---

## 🗂️ Inspection Profile

In JetBrains IDEs, you can manage all IDE settings and store them in the `.idea` folder as configuration files.

To set up inspections for your course, you need to:
1. Create or use an existing **`inspectionProfiles`** folder inside your course's `.idea` directory.
2. Add the following file to the **`inspectionProfiles`** folder:
   - **`Project_Default.xml`**: Contains the list of inspections along with their settings (enabled/disabled, severity, highlighting, etc.).

🔗 Example Files

You can find an example of these configuration files in the ready Python course:  
[Ready Python Course - Inspection Profiles](./../Ready-Courses/Python-Course/.idea/inspectionProfiles)

---

## 🔍 Easy Access to All Inspections

To explore and customize all available inspections or automatically generate the **`Project_Default.xml`** file, follow these steps:

1. **Go to IDE Settings**:  
   Navigate to:

```plaintext  
IDE Settings -> Editor -> Inspections
```

2. **Configure the Profile**:
    - Select or create a new profile.
    - Enable or disable inspections depending on your course requirements.
    - Configure how inspections should behave (e.g., as a warning, error, or typo).

3. **Preview Highlighting**:  
   The settings window also displays how different severity levels (Error, Warning, Typo, etc.) appear in the IDE, giving you a clear preview of the final setup.

---

## 🚀 Next Steps

By setting up IDE settings, you can provide a tailored experience for students,
ensuring they follow best coding practices while working through your course.
Explore the inspection profiles and customize them as needed to enhance your course!

In the next step of this tutorial, we’ll focus on **setting up the TaskTracker tool** to monitor and track students'
progress as they solve tasks.
