 IDENTIFICATION DIVISION.
 PROGRAM-ID. IFSTMT.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 77 SOMEID1 PIC 9(10) VALUE 1000.
 77 SOMEID2 PIC 9(10).
 PROCEDURE DIVISION.
    IF SOMEID1 = 1 THEN
       MOVE 2 TO SOMEID2
    ELSE
       MOVE 3 TO SOMEID2
    END-IF.