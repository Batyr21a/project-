Project Report: Number to Text Converter
Project Overview
The "Number to Text Converter" is a Java program designed to convert integers from 0 to 9999 into their Russian text equivalents.
The program allows users to input numbers repeatedly until they choose to exit, providing a user-friendly interface with clear feedback.

Functionality
Input: Users enter a number between 0 and 9999. The program runs in a loop, prompting for input until the user enters -1 to exit.
Conversion: The program converts the input number into Russian words, handling:
Units (0–9): e.g., "один", "два".
Teens (10–19): e.g., "десять", "одиннадцать".
Tens (20–90): e.g., "двадцать", "тридцать".
Hundreds (100–900): e.g., "сто", "двести".
Thousands (1000–9000): e.g., "тысяча", "тысячи", "тысяч" with correct grammatical forms.
Output: The converted text is printed clearly, ensuring grammatically correct Russian usage. The program handles edge cases like zero ("ноль") and validates input ranges.
Design Choices
Modular Design: The code is split into methods for clarity:
thousandForms: Determines the correct form of "тысяча" (e.g., "тысяча" for 1, "тысячи" for 2–4, "тысяч" for 5–9).
numberToText: Orchestrates the conversion by breaking the number into thousands, hundreds, tens, and units.
Arrays for Words: Predefined arrays (UNITS, TEENS, TENS, HUNDREDS, THOUSANDS) store Russian number words, making the code maintainable and readable.
Loop for User Interaction: A while (true) loop with an exit condition (-1) allows continuous input until the user chooses to stop.
Input Validation: Ensures numbers are within 0–9999, providing error messages for invalid inputs.
Challenges Encountered
Russian Grammar: Handling the correct forms of "тысяча" (singular, plural, genitive) required careful logic to avoid errors, such as ensuring "один" becomes "одна" before "тысяча".
Edge Cases: Managing zero and ensuring no extra spaces in output (using trim()) was initially tricky but resolved with testing.
User Experience: Balancing continuous input with clear prompts and exit conditions required a simple but effective loop design.
Conclusion
The program successfully converts numbers into idiomatic Russian text, meeting all functional requirements. It is efficient, user-friendly,
and extensible for larger numbers or different languages. The use of arrays and modular methods ensures maintainability, while the loop structure enhances usability. 
Future improvements could include handling larger numbers (e.g., up to 999999) or adding support for other languages.
