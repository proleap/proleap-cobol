 IDENTIFICATION DIVISION.
 PROGRAM-ID. IDEAO.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
   01 SOMECOND1 PIC 9(20).
   01 SOMECOND2 PIC 9(20).
   01 SOMECOND3 PIC 9(20).
 PROCEDURE DIVISION.
    IF SOMECOND1 = SOMECOND1 OR 1 = 2 THEN
       DISPLAY 'thentext'
       END-IF.
    IF 1 = SOMECOND2 OR SOMECOND2 = 1 THEN
       DISPLAY 'thentext'
       END-IF.
	IF SOMECOND1 = SOMECOND2 OR 1 = SOMECOND3 THEN
       DISPLAY 'thentext'
       END-IF.
   