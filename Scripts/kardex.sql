create or replace view view_kardex --select * from view_kArdex
as
select
    ROW_NUMBER() OVER (ORDER BY k.id_tienda, k.id_kardex) AS id_vista_kardex,
    k.id_tienda,
    k.id_kardex,
    t.tienda,
    p.id_producto,
    p.producto,
    k.fecha_mov,
    tm.tipo_movimiento,
    k.cant_mov,
    k.saldo_actual
from
    tbl_kardex k -- select * from tbl_kardex
    inner join tbl_producto p
        on k.id_producto = p.id_producto
    inner join tbl_tienda t
        on k.id_tienda = t.id_tienda
    inner join tbl_tipo_movimiento tm
        on k.id_tipo_movimiento = tm.id_tipo_movimiento
order by
    k.id_tienda,
    k.id_kardex;
