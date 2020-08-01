# General

The *index.** file is mandatory as stated in the web.xml from Tomcat config.

Found at path:
>C:\Program Files\Apache Software Foundation\Tomcat 9.0\conf

The *index.jsp* redirects to path defined in @RequestMapping("/home")

# Settings for WAR Archive or WAR exploded


>File > Project Structure > Problems
 
Usually IntelliJ gives the option to *Fix Problems*.

However you can add them manually under the tab:
>File > Project Structure > Artifacts

Additional settings can be found in the *Run/Debug Configurations* menu.
In the tab **Deployment*  you can change the root-URL by changing the field next to *Application context*.

# Project settings
Tomcat  : 9.0.37
OpenJDK : 14.0.1
IntelliJ: 2020.1
Spring: : 5.2.3
