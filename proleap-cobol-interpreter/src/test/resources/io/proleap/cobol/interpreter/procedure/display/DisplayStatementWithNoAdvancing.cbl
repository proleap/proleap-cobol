 IDENTIFICATION DIVISION.
 PROGRAM-ID. Calc.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 01  Num1 PIC 9  VALUE ZEROS.
 01  Num2 PIC 9  VALUE ZEROS.
 01  Result PIC 99 VALUE ZEROS.
 PROCEDURE DIVISION.
    DISPLAY "Enter first number: " WITH NO ADVANCING.
    ACCEPT Num1.
    DISPLAY "Enter second number: " WITH NO ADVANCING.
    ACCEPT Num2.
    MULTIPLY Num1 BY Num2 GIVING Result.
    DISPLAY "Result: ", Result.
    STOP RUN.
