
--inicializando catálogo de tbl_tienda_producto

--select * from tbl_producto
-- select * from tbl_tienda_producto where id_producto = 3
-- trigger en la tabla tbl_tienda que integra los productos del catáloto
-- a una tienda nueva, esto con existencia cero, listas para tener ingresos

create or replace trigger trg_af_ins_Tienda_catalogo_tienda_producto
after insert
   on c##tienda.tbl_tienda
    for each row
declare 
   --pragma autonomous_transaction;
begin
    insert into c##tienda.tbl_tienda_producto (id_tienda,id_producto,existencia)
    select
        :new.id_tienda,
        id_producto,
        0 existencia
    from                
        c##tienda.tbl_producto; 
end;
/


delete from tbl_tienda_producto where id_tienda = 6;
delete from tbl_tienda where id_tienda = 6;
commit;

insert into tbl_tienda (id_tienda,id_status,id_gasolinera,tienda) values (6,1,2,'LA dos');

select * from tbl_tienda_producto where id_tienda = 6;

select ID_TIENDA, COUNT(ID_PRODUCTO) from tbl_tienda_producto GROUP BY ID_TIENDA

-- trigger en la tabla tbl_producto que integra el producto nuevo a las tiendas
-- con existencia cero, listas para ingresos de inventario

create or replace trigger trg_af_ins_Producto_catalogo_tienda_producto
after insert  
   on c##tienda.tbl_producto
    for each row
declare 
    --pragma autonomous_transaction;
begin
    insert into c##tienda.tbl_tienda_producto (id_tienda,id_producto,existencia)
    select
        id_tienda,
        :new.id_producto,
        0 existencia
    from                
        c##tienda.tbl_tienda; 
end ;
/


select * from tbl_tienda_producto where id_producto = 104;

INSERT INTO "C##TIENDA"."TBL_PRODUCTO" (ID_PRODUCTO, ID_PRESENTACION, PRODUCTO, PRECIO, ID_STATUS, ID_SUB_CATEGORIA)
VALUES ('104', '1', 'test del ciento cuatro', '5', '1', '8')



-- procedimento para actualizar existencias
create or replace procedure proc_upd_tienda_producto_existencia (idTienda in number, idProducto in number, stock in number) is
begin
    update tbl_tienda_producto 
    set existencia = stock
    where id_tienda = idTienda and id_producto = idProducto;
end;
   

-- trigger en la tabla tbl_kardex cuando se inserta un movimiento
-- se debe actualizar la existencia y el saldo en la tabla tbl_tienda_producto

create or replace trigger trg_bef_upKardex_existencias
before insert
   on c##tienda.tbl_kardex
    for each row
declare 
    operacion number;
    existencia number;
begin
    select suma_resta into operacion from tbl_tipo_movimiento where id_tipo_movimiento = :new.id_tipo_movimiento;
    select existencia into existencia from tbl_tienda_producto where id_tienda = :new.id_tienda and id_producto = :new.id_producto;
    
     --actualizando saldo_actual según tipo de transacción
    if operacion = 0 then
        :new.saldo_actual := existencia - :new.cant_mov;  
    else
        :new.saldo_actual := existencia + :new.cant_mov;  
    end if;   
    
    update tbl_tienda_producto set existencia = :new.saldo_actual where id_tienda = :new.id_tienda and id_producto = :new.id_producto;
end;
/



