 IDENTIFICATION DIVISION.
 PROGRAM-ID. OPENSTMT.
 ENVIRONMENT DIVISION.
    INPUT-OUTPUT SECTION.
       FILE-CONTROL.
          SELECT SOMEFILE1 ASSIGN TO 'somefile1.txt'.
 PROCEDURE DIVISION.
    OPEN INPUT SOMEFILE1 WITH NO REWIND.