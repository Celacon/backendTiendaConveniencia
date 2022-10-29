create or replace view VIEW_TIENDA as 
 select 
    t.id_tienda,
    t.tienda,
    u.ubicacion,
    g.gasolinera,
    s.status
from 
    tbl_tienda t,
    tbl_gasolinera g,
    tbl_status s,
    tbl_ubicacion u
where
   t.id_gasolinera = g.id_gasolinera
    and t.id_status = s.id_status
    and g.id_ubicacion = u.id_ubicacion;
    

SELECT * FROM VIEW_TIENDA

SELECT * FROM TBL_TIENDA

CREATE OR REPLACE FORCE EDITIONABLE VIEW "C##TIENDA"."VIEW_SEGURIDAD" ("GRANTEE", "GRANTED_ROLE", "ADMIN_OPTION", "DELEGATE_OPTION", "DEFAULT_ROLE", "COMMON", "INHERITED") AS 
  SELECT
  "GRANTEE","GRANTED_ROLE","ADMIN_OPTION","DELEGATE_OPTION","DEFAULT_ROLE","COMMON","INHERITED"
FROM
  DBA_ROLE_PRIVS  
WHERE
    GRANTEE = 'SPRING'