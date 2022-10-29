alter session set "_ORACLE_SCRIPT"=true;

-- drop role USUARIO_CONEXION;
CREATE ROLE USUARIO_CONEXION;
GRANT SELECT ON C##TIENDA.TBL_USUARIO TO USUARIO_CONEXION; 
GRANT SELECT ON C##TIENDA.TBL_PERSONA TO USUARIO_CONEXION; 


COMMIT;


-- drop role ningun_privilegio;
create role ningun_privilegio;


-- drop user spring;
CREATE USER spring IDENTIFIED BY boot; --creaci�n
GRANT USUARIO_CONEXION TO spring; -- esto le permitir� al usuario spring realizar una conexi�n por medio del role
GRANT CREATE SESSION TO USUARIO_CONEXION; --crearle sesi�on para poder conectarse
ALTER USER spring DEFAULT ROLE USUARIO_CONEXION; -- se conectga sin ning�n privilegio


--a este punto el servicio est� conectado, pero no tiene permisos de ver las tablas

GRANT vendedor TO spring; 
GRANT ningun_privilegio TO spring; 
GRANT administrador TO spring; 
GRANT cliente TO spring;
GRANT encargado TO spring;


ALTER USER spring DEFAULT ROLE administrador; -- se conectga sin ning�n privilegio

/* pruebas desde el usuario Spring

    SET ROLE ningun_privilegio;
    SET ROLE usuario_conexion;
    SET ROLE vendedor;
    select * from C##TIENDA.TBL_USUARIO;
    
*/


GRANT SELECT ON C##TIENDA.tbl_categoria TO vendedor; 
