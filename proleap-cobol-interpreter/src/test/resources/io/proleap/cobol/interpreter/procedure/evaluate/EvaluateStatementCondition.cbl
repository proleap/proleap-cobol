 IDENTIFICATION DIVISION.
 PROGRAM-ID. EVALSTMT.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 77 SOMEID1 PIC 9(10) VALUE 2.
 77 SOMEID2 PIC 9(10).
 PROCEDURE DIVISION.
    EVALUATE SOMEID1
       WHEN 1 MOVE 10 TO SOMEID2
       WHEN 2 MOVE 20 TO SOMEID2
    END-EVALUATE.