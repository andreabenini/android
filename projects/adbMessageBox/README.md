# Firestick MessageBox App
This is a very basic Android application designed for Amazon Firestick devices.

## Purpose
The sole purpose of this app is to display a simple, customized message centered on the screen.

## Functionality
- Launches and displays a text message
- Includes a single "OK" button
- Clicking the "OK" button (using the remote) dismisses the message and exits the application.

## Use Case
This app serves as a minimal template or a starting point for developing more complex Firestick
applications, demonstrating the most basic UI and user interaction (displaying text and handling
a button click). It can also be executed from the command line

## Installation
- Install the apk package as usual
- Grant alert window privileges so it can be displayed above the launcher when necessary
```sh
adb install messagebox.apk
adb shell appops set ben.backfire.adbmessagebox SYSTEM_ALERT_WINDOW allow
```

## Invoking from the command line
As simple as:
```sh
adb shell am broadcast -a ben.backfire.adbmessagebox.SHOW_DIALOG -n "ben.backfire.adbmessagebox/.DialogReceiver" --es "title" "The\ Title" --es "message" "Your\ favorite\ message\ here"
```
