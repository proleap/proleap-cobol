 IDENTIFICATION DIVISION.
 PROGRAM-ID. RECEIVEINTOSTMT.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 77 SOMECD1 PIC X(10).
 77 SOMEID1 PIC 9(10).
 PROCEDURE DIVISION.
    RECEIVE SOMEID1 MESSAGE INTO SOMECD1
       ON EXCEPTION DISPLAY "Test".