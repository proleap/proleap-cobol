 IDENTIFICATION DIVISION.
 PROGRAM-ID. EVALSTMT.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 01 ITEMS.
 	02 ITEM1 PICTURE X(10).
 	02 ITEM2 PICTURE X(10).
 	02 ITEMOCC PICTURE X(10) OCCURS 5 TIMES.
 	02 ITEMUSA PIC X(10) USAGE IS DATE.
 	02 ITEMRED REDEFINES ITEM1 PIC X(5).
 PROCEDURE DIVISION.
 IF ITEM1 = 1 OR
 ITEM2 = 2 OR
 ITEMRED = 3
 END-IF.
 IF ITEM1 = 1 OR
 ITEM2 = 2 OR
 ITEMRED = 3 OR
 ITEMUSA = 4
 END-IF.
 IF ITEM1 = 1 OR
 ITEM2 = 2 OR
 ITEMRED = 3 OR
 ITEMOCC(1) = 4
 END-IF.
 IF ITEM1 = 1 OR
 ITEM2 = 2 OR
 ITEMOCC(3) = 3
 END-IF.
 IF ITEM1 = 1 OR
 ITEM2 = 2 OR
 ITEMOCC(3) = 3 OR
 ITEMOCC(4) = 4
 END-IF.   