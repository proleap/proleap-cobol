 IDENTIFICATION DIVISION.
 PROGRAM-ID. IDEAO.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
   01 SOMECOND1 PIC 9(2)V9(2) COMP-3.
   01 SOMECOND2 PIC 9(20)V9(2) COMP-3.
   01 SOMECOND3 PIC 9(20)V9(2) COMP-4.
 PROCEDURE DIVISION.
    IF SOMECOND1 > SOMECOND2 THEN
       DISPLAY 'thentext'
       END-IF.
    IF SOMECOND1 = SOMECOND3 THEN
       DISPLAY 'thentext'
       END-IF.
	IF SOMECOND2 = SOMECOND3 THEN
       DISPLAY 'thentext'
       END-IF.