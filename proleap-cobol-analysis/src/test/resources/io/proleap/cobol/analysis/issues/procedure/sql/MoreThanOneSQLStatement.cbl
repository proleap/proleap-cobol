 IDENTIFICATION DIVISION.
 PROGRAM-ID. ExecSql.
 PROCEDURE DIVISION.
 
 SOME-SECTION-A SECTION.
  EXEC SQL CONNECT :UID IDENTIFIED BY :PASS END-EXEC.
  EXEC SQL USE tempdb END-EXEC.   
  EXEC SQL
    SELECT   SALARY  
        INTO  :HV-SALARY
      FROM EMPLOYEE
        WHERE EMPNAME = 'XXXXXXX'
  END-EXEC.
 SOME-SECTION-B SECTION.
 
 MAIN_PARAGRAPH.
  
 LOAD_SALARY.
 EXIT.
 LOAD_SALARY.
  EXEC SQL CONNECT :UID IDENTIFIED BY :PASS END-EXEC.
  EXEC SQL USE tempdb END-EXEC.   
  EXEC SQL
    SELECT   SALARY  
        INTO  :HV-SALARY
      FROM EMPLOYEE
        WHERE EMPNAME = 'XXXXXXX'
  END-EXEC.
  EXIT.