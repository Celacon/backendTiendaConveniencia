SHOW PARAMETER AUDIT

ALTER SYSTEM SET audit_trail=db SCOPE=SPFILE;


--reiniciar sevicios desde SERVICES

alter session set "_ORACLE_SCRIPT"=true;

CREATE USER audit_spring IDENTIFIED BY boot
  DEFAULT TABLESPACE users
  TEMPORARY TABLESPACE temp
  QUOTA UNLIMITED ON users;
  
  

GRANT connect TO audit_spring;
GRANT create table, create procedure TO audit_spring;


AUDIT ALL BY audit_spring BY ACCESS;
AUDIT SELECT TABLE, UPDATE TABLE, INSERT TABLE, DELETE TABLE BY audit_spring BY ACCESS;
AUDIT EXECUTE PROCEDURE BY audit_spring BY ACCESS;



SELECT view_name
FROM   dba_views
WHERE  view_name LIKE 'DBA%AUDIT%'
ORDER BY view_name;


select * from DBA_AUDIT_SESSION


AUDIT INSERT, UPDATE, DELETE ON sys.aud$ BY ACCESS; --desde pl/sql

SELECT username,
       extended_timestamp,
       owner,
       obj_name,
       action_name
FROM   dba_audit_trail
--WHERE  owner = 'SPRING'
ORDER BY extended_timestamp DESC;