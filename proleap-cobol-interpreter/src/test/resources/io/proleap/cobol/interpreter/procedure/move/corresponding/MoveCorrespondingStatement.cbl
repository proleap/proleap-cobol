 IDENTIFICATION DIVISION.
 PROGRAM-ID. MOVECORRTOSTMT.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 01 GROUP1.
   05 A PIC 99 VALUE 10.
   05 C PIC 99 VALUE 30.
   05 E PIC 99 VALUE 50.
 01 GROUP2 PIC 9(10).
   05 A PIC 99 VALUE 1.
   05 B PIC 99 VALUE 2.
   05 C PIC 99 VALUE 3.
   05 D PIC 99 VALUE 4.
   05 E PIC 99 VALUE 5.
 PROCEDURE DIVISION.
     MOVE CORRESPONDING GROUP1 TO GROUP2.