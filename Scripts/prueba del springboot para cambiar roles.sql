

SET ROLE ningun_privilegio;
SET ROLE usuario_conexion;
SET ROLE vendedor;

SET ROLE administrador;

select * from C##TIENDA.TBL_USUARIO;
select * from C##TIENDA.TBL_PERSONA WHERE ID_PERSONA = 3;


select * from C##TIENDA.TBL_ROL;

INSERT INTO "C##TIENDA"."TBL_USUARIO" (ID_PERSONA, ID_USUARIO, ID_ROL, USUARIO, CLAVE, ID_STATUS) VALUES ('6', '13', '1', 'cajero', 'cajero', '1');
