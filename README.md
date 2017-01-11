# Early Access User Test
This user test will be conducted to provide insight into the usability of MontiSecArc in an IntelliJ IDEA environment. Because the tools are in an early development stage this user test will be **moderated**. Furthermore, this user test will only tackle the usability of the MontiSecArc language plugin to keep the complexity to a minimum and introduce more advanced concepts in a subsequent user test.

## Installation
As the product is deeply integrated into the IntelliJ IDEA the user needs to install the latest version of the [IDE](https://www.jetbrains.com/idea/download/). The free Community Edition is sufficient. The Plugins are tested with Version 2016.x.

If the IDE was not installed before you will be greeted by a welcome dialog.
![Bildschirmfoto_2016-11-30_um_14.12.31](/uploads/d4e340dce985c550bb087fed7924003b/Bildschirmfoto_2016-11-30_um_14.12.31.png)
If the IDE was already installed the last project will be opened and you have to go to the preferences and locate the Plugins section:
![Bildschirmfoto_2016-11-30_um_14.58.39](/uploads/daf0e1ffff8aef1198c0ad95207b0c36/Bildschirmfoto_2016-11-30_um_14.58.39.png)
Now select "Install plugin from disk..." and add the [MontiSecArc Language Plugin](http://138.68.65.103:8081/artifactory/intellij_plugins_snapshot_local/de/monticore/lang/montisecarc/plugin/IntelliJ_MSA_Language/0.8.9.SNAPSHOT/IntelliJ_MSA_Language-0.8.9.SNAPSHOT.zip). After that the IDE needs to be restarted.

## Introduction
- Close all currently opened projects in IntelliJ IDEA. 
- Click on "Check out from Version Control" and select Git. 
- Set https://git.rwth-aachen.de/ma_buning/user_test_sample_project.git for Git Repository URL and choose a parent directory.

### Basic MontiArc concepts 
Go to src/de/monticore/lang/montisecarc/simple/arc to find example components
- Basic component usage
 - definition `component A a { }` with direct instantiation
- Basic connection
 - `connect a -> b` where instances can be connected

### Introducing security features
Go to src/de/monticore/lang/montisecarc/simple/secarc to find example components
- Introduce trustlevels
- `identity weak a -> b`between component instances
- `connect encrypted a -> b`
- `connect a -[HTTPS]->b`

## Task
Model the architecture presented in the scenario below with the MontiSecArc language and IntelliJ IDEA. Create a new package for the architecture files.

### Scenario
Your company was approached by a new client to develop a new mobile app for iOS and Android. The app shall present company information to customers and present sales personal with information to internal projects and other restricted information. The client has a high security standard which is defined in a security policy.

The client has an internal authentication service that runs on location and has to be used for authenticating the sales personal. The other service needed to achieve the functionality can be deployed anywhere. 

You are approached as a software architect to create a secure architecture description that represents the requirements to check against the clients security policy and present a starting point for further developments.

## Evaluation
- Discussion of the results of the scenario
- Are there suggestions and improvements
- Which concepts seem "natural" which are difficult

## Results
1. [SLau](early-access-test-slau)