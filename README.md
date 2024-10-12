# Java Login Applicatio

font color hashmap jframe actionevent jbutton actionlistener jlabel jpasswordfield jtextfield 

This is a simple Java login application that demonstrates how to create a graphical user interface (GUI) for user authentication using `JFrame`, `JButton`, `JTextField`, `JPasswordField`, and `JLabel`.

[![Static Badge](https://img.shields.io/badge/java.util.HashMap-orange)](https://mvnrepository.com/artifact/java.util.HashMap)
[![Static Badge](https://img.shields.io/badge/java.awt.Color-black)](https://mvnrepository.com/artifact/java.awt.Color)
[![Static Badge](https://img.shields.io/badge/java.awt.Font-pink)](https://mvnrepository.com/artifact/java.awt.Font)
[![Static Badge](https://img.shields.io/badge/java.awt.event.ActionEvent-red)](https://mvnrepository.com/artifact/java.awt.event.ActionEvent)
[![Static Badge](https://img.shields.io/badge/java.awt.event.ActionListener-purple)](https://mvnrepository.com/artifact/java.awt.event.ActionListener)
[![Static Badge](https://img.shields.io/badge/java.util.HashMap-red)](https://mvnrepository.com/artifact/java.util.HashMap)
[![Static Badge](https://img.shields.io/badge/javax.swing.JButton-orange)](https://mvnrepository.com/artifact/javax.swing.JButton)
[![Static Badge](https://img.shields.io/badge/javax.swing.JFrame-gray)](https://mvnrepository.com/artifact/javax.swing.JFrame)
[![Static Badge](https://img.shields.io/badge/javax.swing.JLabel-blue)](https://mvnrepository.com/artifact/javax.swing.JLabel)
[![Static Badge](https://img.shields.io/badge/javax.swing.JPasswordField-purple)](https://mvnrepository.com/artifact/javax.swing.JPasswordField)
[![Static Badge](https://img.shields.io/badge/javax.swing.JTextField-purple)](https://mvnrepository.com/artifact/javax.swing.JTextField)

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
