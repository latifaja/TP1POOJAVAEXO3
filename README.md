String Manipulation Program
In this exercise, the Main class contains the program's main menu, while a second class, Traitement, is responsible for various string operations. This program allows the user to perform simple operations on a string, such as reversing it, counting words, and displaying the entered string.

Implementation Details
Main Class and Options Menu:

The Main class initializes an instance of Traitement, passing a Scanner instance for input.
A menu with multiple options is displayed:


1: Enter a string
2: Display the string
3: Reverse the string
4: Count the number of words in the string
5: Exit the program
Each option calls a method in the Traitement class via a switch statement, allowing flexible user input management.
Traitement Class and Operation Management:

The Traitement class handles the input and processing of the string. Key methods include:
SaisirChaine(): Reads and stores the string in a variable chaine.
AfficherChaine(): Displays the string if it has been entered; otherwise, it shows a message indicating no string is present.
InverserChaine(): Uses StringBuilder to reverse and display the string.
NbreMots(): Counts the number of words in the string using split("\\s+"), which detects spaces and other separators to delimit words.
A private method RetourAuMenu() waits for the user to press a key to return to the main menu.
Validation and Return to Menu:

Each method in Traitement verifies if the string has been entered before performing an operation and displays an error message if it is empty.
After each operation, the user is prompted to return to the menu by pressing a key.
