# Java Login Application

[![font](https://img.shields.io/badge/font-brightgreen)](https://docs.oracle.com/javase/8/docs/api/java/awt/Font.html)
[![color](https://img.shields.io/badge/color-yellow)](https://docs.oracle.com/javase/8/docs/api/java/awt/Color.html)
[![hashmap](https://img.shields.io/badge/hashmap-blue)](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
[![jframe](https://img.shields.io/badge/jframe-orange)](https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html)
[![actionevent](https://img.shields.io/badge/actionevent-red)](https://docs.oracle.com/javase/8/docs/api/java/awt/event/ActionEvent.html)
[![jbutton](https://img.shields.io/badge/jbutton-purple)](https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html)
[![actionlistener](https://img.shields.io/badge/actionlistener-pink)](https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html)
[![jlabel](https://img.shields.io/badge/jlabel-pink)](https://docs.oracle.com/javase/8/docs/api/javax/swing/JLabel.html)
[![jpasswordfield](https://img.shields.io/badge/jpasswordfield-pink)](https://docs.oracle.com/javase/8/docs/api/javax/swing/JPasswordField.html)
[![jtextfield](https://img.shields.io/badge/jtextfield-pink)](https://docs.oracle.com/javase/8/docs/api/javax/swing/JTextField.html)

font color hashmap jframe actionevent jbutton actionlistener jlabel jpasswordfield jtextfield 

This is a simple Java login application that demonstrates how to create a graphical user interface (GUI) for user authentication using `JFrame`, `JButton`, `JTextField`, `JPasswordField`, and `JLabel`.

## Table of Contents

- [About](#about)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## About

This Java login application demonstrates creating a graphical user interface (GUI) for user authentication using `JFrame`, `JButton`, `JTextField`, `JPasswordField`, and `JLabel`.

## Features

The project consists of the following classes:

1. **main**
   - The entry point of the application. It initializes the `authorisation` class and opens the `loginForm`.

2. **loginForm**
   - This class creates the GUI for the login form. It contains `JFrame`, `JButton`, `JTextField`, `JPasswordField`, and `JLabel` components.
   - It also handles the login and reset actions through the `ActionListener` interface.

3. **authorisation**
   - This class contains a `HashMap` to store login credentials and provides a method to retrieve the login information.

4. **userPage**
   - A placeholder class that represents the user's page after successful login.


## Installation


## Usage

1. Compile all the Java files:
   ```sh
   javac main.java loginForm.java authorisation.java userPage.java

## Contributing

We welcome contributions to this project! To contribute, please follow these steps:

1. **Fork the repository**: Click the "Fork" button at the top right corner of this repository to create your own copy of the project.

2. **Clone your fork**: Clone your forked repository to your local machine.
   ```sh
   git clone https://github.com/your-username/your-forked-repo.git


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
