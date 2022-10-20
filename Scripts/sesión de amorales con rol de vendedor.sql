
--sesión de amorales con rol de vendedor
SET ROLE vendedor; --se setea el rol para tener el acceso a las tablas

--accesddiendo a las tablas
select * from C##TIENDA.TBL_USUARIO;

SET ROLE CLIENTE;
select * from C##TIENDA.TBL_CATEGORIA;




