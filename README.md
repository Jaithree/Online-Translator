Online-Translator

1.Online Translator and Bug Tracking System
This repository hosts two distinct projects:
-> An **Online Translator** built with **Python (Flask)**, a minimal backend, and **HTML/CSS/JavaScript** for the frontend.
->A command-line **Bug Tracking System** built with **Java**.

2. Online Translator Web Application
A simple web application that allows users to translate text into various target languages using the `googletrans` library.
**Technologies Used
  * **Backend:** Python (Flask)
  * **Translation API:** `googletrans` library
  * **Frontend:** HTML5, CSS3, JavaScript (for API calls)
#### Prerequisites
 **Python 3.x** installed.
#### Installation and Setup
1.  **Clone the repository:**
    ```bash
    git clone [YOUR_REPO_URL]
    cd [YOUR_REPO_NAME]
    ```
2.  **Install the required Python packages:**
    The application uses `Flask` for the web server and `googletrans` for the translation functionality.
     ``bash
    pip install Flask googletrans waitress
    ```
3.  **Run the application:**
    The main application logic is in `app1.py`. This file is configured to run using `waitress` (a production-quality WSGI server).
     ``bash
    python app1.py
    ```
4.  **Access the Translator:**
    Open your web browser and navigate to:
    ```
    http://127.0.0.1:5000/
    ```
### Project Files

| File | Description |
| :--- | :--- |
| `app1.py` | The main Flask application file. Defines routes (`/` and `/translate`), handles POST requests, and uses `googletrans` to perform the translation. |
| `index1.html` | The HTML and CSS frontend for the translator. It includes a form for text input and language selection, and uses a JavaScript function to call the `/translate` API endpoint. |
| `good.py` | An alternative, simpler Flask server setup (not currently used in `app1.py`). |

-----
##  Command-Line Bug Tracking System
A basic, file-based bug tracking system implemented in Java. It allows users to file new bugs, change the status of existing bugs, and generate a report (print the file content).
### Technologies Used

  * **Language:** Java
  * **Storage:** Persists bug data by creating and appending to individual `.txt` files.
#### Prerequisites

You need the **Java Development Kit (JDK)** installed.

#### Running the System

1.  **Compile the Java files:**

    ```bash
    javac BugTrackingSystem.java
    ```

    *(Note: `BugTrackingSystem1.java` is a slightly older version of the same program, use the main `BugTrackingSystem.java`.)*

2.  **Run the compiled class:**

    ```bash
    java BugTrackingSystem
    ```

### How to Use

The system will present a menu with the following options:

1.  **FILE A NEW BUG:** Prompts for your name, bug type, priority, description, and initial status. This creates a new text file (e.g., `[YourName]1.txt`).
2.  **CHANGE THE STATUS OF THE BUG:** Prompts for the bug's filename and allows you to append a new status update with a timestamp to that file.
3.  **GET BUG REPORT:** Prompts for the bug's filename and prints the entire content of the bug file to the console.
4.  **EXIT:** Terminates the program.

### Project Files

| File | Description |
| :--- | :--- |
| `BugTrackingSystem.java` | The main Java program containing the `main` method and functions for `fileBug`, `changeStatus`, and `report`. It handles user input, file creation, writing, and reading. |
| `BugTrackingSystem1.java` | An identical or slightly older version of the bug tracking program. |

