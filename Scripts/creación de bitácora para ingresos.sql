create or replace trigger trg_bef_upKardex_existencias
before insert
   on c##tienda.tbl_kardex
    for each row

begin
     SELECT json_object(
    *)
  FROM tbl_producto
 
       
 
end;



  
  