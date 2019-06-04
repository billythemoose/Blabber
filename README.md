# Blabber

Blabber chat application for Bellevue College CS 410. It is a Java based application that utilizes Openfire (open source, real time XMPP server) with the Smack API (open source XMPP Java client library). 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

In order to complete the installation, you will need the following:
* Computer capable of hosting an Openfire server 
* Raspberry pi *(optional) Skip the first installation section if using a different device*

## Installation

### Raspberry Pi Setup

If the raspberry pi has not been imaged, use the following link to download and install NOOBS:
* [Raspberry Pi OS Images](https://www.raspberrypi.org/documentation/installation/installing-images/)

Follw the installation and onscreen instructions until you reach the home screen 

Change the default password and enable SSH for remote work inside of raspi-config. Changing the password is in the main menu and SSH settings are inside *Interfacing Options* 
```
sudo raspi-config
```

Then, check to see if there are pending updates
```
sudo apt full-upgrade
```

### Openfire Installation 


### Building Blabber


## Troubleshooting 



## Built With

* [Openfire](https://www.igniterealtime.org/projects/openfire/) - XMPP Server
* [NetBeans Apache](https://netbeans.apache.org/) - UI design
* [Jetbrains IntelliJ](https://www.jetbrains.com/idea/) - Java IDE 
* [Maven](https://maven.apache.org/) - Dependency Management
* [Smack](https://www.igniterealtime.org/projects/smack/index.jsp) - Java XMPPclient library 
* [Raspberry Pi](https://www.raspberrypi.org/) - Physical server 
* [Pidgin](https://pidgin.im/) - XMPP Client (testing and validation) 

## Authors

* **Mathhew Clark** - [everdein](https://github.com/everdein)
* **Brandae Grein** - [BrandaeGrein](https://github.com/BrandaeGrein)
* **Alex Kourkoumelis** - [akourk](https://github.com/akourk)
* **Jordi Monterrubio**
* **Michael Thomas** - [billythemoose](https://github.com/billythemoose)

## Acknowledgments

* [README Templating](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2#file-readme-template-md) 
