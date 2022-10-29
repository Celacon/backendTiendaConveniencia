GRANT SELECT, INSERT ON c##tienda.tbl_categoria TO encargado;

GRANT SELECT, INSERT ON c##tienda.view_tienda TO encargado;

GRANT SELECT, INSERT ON c##tienda.tbl_tienda TO administrador;

GRANT SELECT, INSERT ON c##tienda.tbl_gasolinera TO administrador;

GRANT SELECT, INSERT ON c##tienda.tbl_ubicacion TO administrador;

GRANT administrad TO spring;

COMMIT;