CREATE OR REPLACE PROCEDURE createUser(
	param_usuario IN NVARCHAR2,
	param_clave IN NVARCHAR2) IS
	
	usuario NVARCHAR2(20)  	:= param_usuario;
	clave NVARCHAR2(20) 		:= param_clave;
   	existe_usuario       INTEGER	:= 0;
   	strQuery   VARCHAR2 (1000);
BEGIN
    --tabla de usuario
   	SELECT COUNT (1)
     	INTO existe_usuario
     	FROM tbl_usuario
   	WHERE usuario = usuario;

   	IF existe_usuario != 0
   	THEN
        --envia error de que el usuario ya existe
		insert into tbl_usuario ()
   	END IF;
    
        strQuery := 'CREATE USER ' || usuario || ' IDENTIFIED BY ' || clave || ' DEFAULT TABLESPACE SYSTEM';
	DBMS_OUTPUT.put_line(strQuery);

	EXECUTE IMMEDIATE ( strQuery ); 
                                                
        -- ****** Object: Roles for user ******
	strQuery := 'GRANT RESOURCE, CONNECT TO ' || usuario;

	EXECUTE IMMEDIATE ( strQuery );
                                                
        -- ****** Object: System privileges for user ******
	strQuery := 'GRANT ALTER SESSION,
	       	    	  CREATE ANY TABLE,
	       	    	  CREATE CLUSTER,
	            	  CREATE DATABASE LINK,
	            	  CREATE MATERIALIZED VIEW,
	       		  CREATE SYNONYM,
	       		  CREATE TABLE,
	       		  CREATE VIEW,
	       		  CREATE SESSION,
	       		  UNLIMITED TABLESPACE
	       	    TO ' || usuario;

        EXECUTE IMMEDIATE ( strQuery );
        
	COMMIT;
END createUser;
/