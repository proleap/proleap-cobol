 IDENTIFICATION DIVISION.
 PROGRAM-ID. ADDSTMT.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 77 TEST2 PIC 9(10) VALUE 42.
 77 TEST3 PIC 9(10) VALUE 23.
 77 TEST4 PIC 9(10) VALUE 1000.
 77 TEST5 PIC 9(10) VALUE 1000.
 PROCEDURE DIVISION.
     ADD 1 2 TO TEST2 TEST3 GIVING TEST4 TEST5.