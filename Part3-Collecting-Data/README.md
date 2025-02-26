# Part 3. Data Collection & Analysis

In this part, you will learn the practical steps involved in:

1. **Data Collection**:
    - Using the [**TaskTracker**](https://github.com/JetBrains-Research/tasktracker-3) to collect data during the task-solving process.
    - Viewing the solving process from the student's perspective.

2. **Data Analysis**:
    - Downloading the collected data from a remote server.
    - Converting the data into the [ProgSnap2](https://dl.acm.org/doi/10.1145/3341525.3387373) format for standardization.
    - Performing a basic analysis of the gathered data.

---

## 📊 Data Collection

Follow these steps to collect data for your course:

1. **Create a Course Archive**:
    - Right-click in the course context menu.
    - Navigate to:

```plaintext  
Course Creator -> Create Course Archive
```

2. **Install the Course**:
    - Open the IDE.
    - Navigate to:

```plaintext  
File -> Learn and Teach -> Browse Courses -> My Courses -> Open Course from Disk
```

3. **Install the TaskTracker Plugin**:
    - Open the IDE’s settings.
    - Navigate to:

```plaintext  
IDE Settings -> Plugins -> Install Plugin from Disk
```

4. **Solve the Course Tasks**:
   - Work through and complete every task in your course as a student would.

5. **Complete Surveys in TaskTracker**:
    - Open TaskTracker and fill out all the surveys we’ve provided in the course.

6. **Send Data to the Remote Server**:
    - Navigate to the **TaskTracker panel** in the IDE.
    - Use the "Finish" button to send the collected data to the server.

> **Note**: We will guide you through this process thoroughly during a live session.

---

## 📊 Data Analysis

Follow these steps for analyzing the collected data:

1. **Download the Gathered Data**:
    - Follow [website](https://workshop-server.labs.jb.gg/) for collecting data.
    - Set **ResearchId** you defined in **TaskTracker** and download data from this research.

2. **Convert Data to [ProgSnap2](https://dl.acm.org/doi/10.1145/3341525.3387373) Format**:
    - ProgSnap2 is a widely used format for storing and analyzing education-related programming data.
    - We’ve developed a converter to help automate this conversion.
    - To initiate the data conversion process got to TaskTracker repository and run:
       `./gradlew processing:execute -PexecArgs="path_to_the_directory_with_csv_fiels:destination_for_progsnap2_format" `

3. **Perform a Basic Analysis**:
    - Follow [website](https://vis-server.labs.jb.gg) for processing analysis with collected data.
    - Upload zip archive with collected data.
    - Wait for loading your data and start making analysis.

More details will be provided and demonstrated during the live session.
