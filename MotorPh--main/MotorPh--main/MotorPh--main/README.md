MotorPh Employee Management System – Installation Guide
Requirements

MotorPh Employee Management System (downloaded from GitHub).

DB Browser for SQLite – version 3.12.2 (64-bit).

Download DB Browser for SQLite

Java IDE – NetBeans (recommended), IntelliJ, or Eclipse.

Step 1: Download and Extract the Project

Go to the GitHub repository for MotorPh Employee Management System.

Click Code → Download ZIP.

Extract the ZIP file to a folder, e.g., C:\MotorPH-for-IAS-2-main.

Step 2: Install DB Browser for SQLite

Open the installer DB.Browser.for.SQLite-3.12.2-win64.msi.

Follow the installation prompts to complete setup.

Step 3: Open and Edit the Database (Optional)

Launch DB Browser for SQLite.

Click File → Open Database.

Navigate to:

MotorPH-for-IAS-2-main\Employee Payroll System\Database\


Select mydata.sqlite and click Open.

You can now view or edit records.

Tip: Always back up mydata.sqlite before editing.

Step 4: Default Users

The system comes with pre-configured users:

Role	Username	Password
Admin	Admin	pass
Employee	Juan	123

Use these credentials to log in immediately after running the program.

You can add or edit users in the database via DB Browser if needed.

Step 5: Open the Project in Your IDE

Launch your Java IDE (NetBeans recommended).

Click File → Open Project (or Open Existing Project).

Navigate to:

MotorPH-for-IAS-2-main\Employee Payroll System\


Select the folder and open it as a project.

Step 6: Run the Program

Once the project is open in your IDE, click Run (or press F6 in NetBeans).

The program will launch and connect to the mydata.sqlite database automatically.

Log in using the default credentials above.

You can now use the Employee Management System to manage employees and payroll.
