

create view view_seguridad as
-- validar los privilegios brindados al usuario Spring
SELECT
  *
FROM
  DBA_ROLE_PRIVS  
WHERE
    GRANTEE = 'SPRING';