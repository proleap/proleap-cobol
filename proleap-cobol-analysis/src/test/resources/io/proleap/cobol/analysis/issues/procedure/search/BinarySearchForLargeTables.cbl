 IDENTIFICATION DIVISION.
 PROGRAM-ID. BINARY-SEARCH.
 DATA DIVISION.
 WORKING-STORAGE SECTION.
 77 SOME-TABLE1 OCCURS 100
 		INDEXED BY TAB-INDEX.
 01 SOME-TABLE2 OCCURS 600
 		INDEXED BY TAB-INDEX.
 01 TAB-INDEX PIC 9(7).
 PROCEDURE DIVISION.
 SEARCH SOME-TABLE1
 	AT END DISPLAY 'END'
 	WHEN SOMECOND1 DISPLAY 'TEXT'
 END-SEARCH.
 SEARCH ALL SOME-TABLE2
 	AT END DISPLAY 'END'
 	WHEN SOMECOND1 DISPLAY 'TEXT'
 END-SEARCH.