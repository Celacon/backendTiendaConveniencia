------ inicia scrit completo

--------------------------------------------------------
--  DDL for Table TBL_TIPO_UBICACION
--------------------------------------------------------

  CREATE TABLE "C##TIENDA"."TBL_TIPO_UBICACION" 
   (	"ID_TIPO_UBICACION" NUMBER, 
	"TIPO_UBICACION" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TBL_TIPO_UBICACION
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TIENDA"."PK_TBL_TIPO_UBICACION" ON "C##TIENDA"."TBL_TIPO_UBICACION" ("ID_TIPO_UBICACION") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_TIPO_UBICACION
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_TIPO_UBICACION" MODIFY ("ID_TIPO_UBICACION" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIPO_UBICACION" MODIFY ("TIPO_UBICACION" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIPO_UBICACION" ADD CONSTRAINT "PK_TBL_TIPO_UBICACION" PRIMARY KEY ("ID_TIPO_UBICACION")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  
  --+++++++++++++++++++++


-------------------------------------------------------
--  DDL for Table TBL_UBICACION
--------------------------------------------------------

  CREATE TABLE "C##TIENDA"."TBL_UBICACION" 
   (	"ID_UBICACION" NUMBER, 
	"UBICACION" VARCHAR2(50 BYTE), 
	"U_PADRE" NUMBER, 
	"TBL_U_PADRE" NUMBER, 
	"ID_TIPO_UBICACION" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TBL_UBICACION
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TIENDA"."PK_TBL_UBICACION" ON "C##TIENDA"."TBL_UBICACION" ("U_PADRE", "ID_UBICACION") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TIPO_UBICACION_UBICACION_FK
--------------------------------------------------------

  CREATE INDEX "C##TIENDA"."TIPO_UBICACION_UBICACION_FK" ON "C##TIENDA"."TBL_UBICACION" ("ID_TIPO_UBICACION") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index UBICACION_PADRE_HIJO_FK
--------------------------------------------------------

  CREATE INDEX "C##TIENDA"."UBICACION_PADRE_HIJO_FK" ON "C##TIENDA"."TBL_UBICACION" ("TBL_U_PADRE", "U_PADRE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_UBICACION
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_UBICACION" MODIFY ("ID_UBICACION" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_UBICACION" MODIFY ("UBICACION" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_UBICACION" MODIFY ("U_PADRE" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_UBICACION" MODIFY ("TBL_U_PADRE" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_UBICACION" MODIFY ("ID_TIPO_UBICACION" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_UBICACION" ADD CONSTRAINT "PK_TBL_UBICACION" PRIMARY KEY ("U_PADRE", "ID_UBICACION")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TBL_UBICACION
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_UBICACION" ADD CONSTRAINT "FK_TBL_UBIC_TIPO_UBIC_TBL_TIPO" FOREIGN KEY ("ID_TIPO_UBICACION")
	  REFERENCES "C##TIENDA"."TBL_TIPO_UBICACION" ("ID_TIPO_UBICACION") ENABLE;
  ALTER TABLE "C##TIENDA"."TBL_UBICACION" ADD CONSTRAINT "FK_TBL_UBIC_UBICACION_TBL_UBIC" FOREIGN KEY ("TBL_U_PADRE", "U_PADRE")
	  REFERENCES "C##TIENDA"."TBL_UBICACION" ("U_PADRE", "ID_UBICACION") ENABLE;  
      
      
      
      --++++++++++++++++++++++++
      
      
      --------------------------------------------------------
--  DDL for Table TBL_GASOLINERA
--------------------------------------------------------

  CREATE TABLE "C##TIENDA"."TBL_GASOLINERA" 
   (	"ID_GASOLINERA" NUMBER, 
	"U_PADRE" NUMBER, 
	"ID_UBICACION" NUMBER, 
	"GASOLINERA" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TBL_GASOLINERA
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TIENDA"."PK_TBL_GASOLINERA" ON "C##TIENDA"."TBL_GASOLINERA" ("ID_GASOLINERA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index UBICACION_GASOLINERA2_FK
--------------------------------------------------------

  CREATE INDEX "C##TIENDA"."UBICACION_GASOLINERA2_FK" ON "C##TIENDA"."TBL_GASOLINERA" ("U_PADRE", "ID_UBICACION") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_GASOLINERA
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_GASOLINERA" MODIFY ("ID_GASOLINERA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_GASOLINERA" MODIFY ("U_PADRE" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_GASOLINERA" MODIFY ("ID_UBICACION" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_GASOLINERA" MODIFY ("GASOLINERA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_GASOLINERA" ADD CONSTRAINT "PK_TBL_GASOLINERA" PRIMARY KEY ("ID_GASOLINERA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  
--------------------------------------------------------
--  Ref Constraints for Table TBL_GASOLINERA
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_GASOLINERA" ADD CONSTRAINT "FK_TBL_GASO_UBICACION_TBL_UBIC" FOREIGN KEY ("U_PADRE", "ID_UBICACION")
	  REFERENCES "C##TIENDA"."TBL_UBICACION" ("U_PADRE", "ID_UBICACION") ENABLE;
      
      
      
      ---++++++++++++++++++++++++++
      
      
      --------------------------------------------------------
--  DDL for Table TBL_TIENDA
--------------------------------------------------------

  CREATE TABLE "C##TIENDA"."TBL_TIENDA" 
   (	"ID_TIENDA" NUMBER, 
	"TBL_ID_TIENDA" NUMBER, 
	"ID_GASOLINERA" NUMBER, 
	"TIENDA" VARCHAR2(25 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TBL_TIENDA
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TIENDA"."PK_TBL_TIENDA" ON "C##TIENDA"."TBL_TIENDA" ("ID_TIENDA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index RELATIONSHIP_31_FK
--------------------------------------------------------

  CREATE INDEX "C##TIENDA"."RELATIONSHIP_31_FK" ON "C##TIENDA"."TBL_TIENDA" ("TBL_ID_TIENDA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_TIENDA
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_TIENDA" MODIFY ("ID_TIENDA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIENDA" MODIFY ("ID_GASOLINERA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIENDA" MODIFY ("TIENDA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIENDA" ADD CONSTRAINT "PK_TBL_TIENDA" PRIMARY KEY ("ID_TIENDA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TBL_TIENDA
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_TIENDA" ADD CONSTRAINT "FK_TBL_TIEN_GASOLINER_TBL_GASO" FOREIGN KEY ("ID_GASOLINERA")
	  REFERENCES "C##TIENDA"."TBL_GASOLINERA" ("ID_GASOLINERA") ENABLE;
  ALTER TABLE "C##TIENDA"."TBL_TIENDA" ADD CONSTRAINT "FK_TBL_TIEN_RELATIONS_TBL_TIEN" FOREIGN KEY ("TBL_ID_TIENDA")
	  REFERENCES "C##TIENDA"."TBL_TIENDA" ("ID_TIENDA") ENABLE;
      
      
      
      
      
      --+++++++++++++++++++++
      
      
      
/==============================================================/
/* Table: TBL_CATEGORIA                                         */
/==============================================================/
create table TBL_CATEGORIA (
   ID_CATEGORIA         NUMBER                not null,
   CATEGORIA            VARCHAR2(25)          not null
);

alter table TBL_CATEGORIA
   add constraint PK_TBL_CATEGORIA primary key (ID_CATEGORIA);
   
   
   
/==============================================================/
/* Table: TBL_SUB_CATEGORIA                                     */
/==============================================================/
create table TBL_SUB_CATEGORIA (
   ID_SUB_CATEGORIA     NUMBER                not null,
   ID_CATEGORIA         NUMBER                not null,
   SUB_CATEGORIA        VARCHAR2(50)          not null
);

alter table TBL_SUB_CATEGORIA
   add constraint PK_TBL_SUB_CATEGORIA primary key (ID_SUB_CATEGORIA);

alter table TBL_SUB_CATEGORIA
   add constraint FK_TBL_SUB__CATEGORIA_TBL_CATE foreign key (ID_CATEGORIA)
      references TBL_CATEGORIA (ID_CATEGORIA);

/==============================================================/
/* Index: CATEGORIA_SUB_CATEGORIA_FK                            */
/==============================================================/
create index CATEGORIA_SUB_CATEGORIA_FK on TBL_SUB_CATEGORIA (
   ID_CATEGORIA ASC
);
   
   ----------------------------
   
   
   
/==============================================================/
/* Table: TBL_PRESENTACION                                      */
/==============================================================/
create table TBL_PRESENTACION (
   ID_PRESENTACION      INTEGER               not null,
   PRESENTACION         VARCHAR2(50)          not null
);

alter table TBL_PRESENTACION
   add constraint PK_TBL_PRESENTACION primary key (ID_PRESENTACION);


---------------




/==============================================================/
/* Table: TBL_PRODUCTO                                          */
/==============================================================/
create table TBL_PRODUCTO (
   ID_PRODUCTO          NUMBER                not null,
   ID_PRESENTACION      INTEGER               not null,
   ID_SUB_CATEGORIA     NUMBER,
   PRODUCTO             VARCHAR2(100)         not null,
   STS_PRODUCTO         NUMBER                not null,
   PRECIO               NUMBER(8,2)           not null
);

alter table TBL_PRODUCTO
   add constraint PK_TBL_PRODUCTO primary key (ID_PRODUCTO);

/==============================================================/
/* Index: SUB_CATEGORIA_PRODUCTO_FK                             */
/==============================================================/
create index SUB_CATEGORIA_PRODUCTO_FK on TBL_PRODUCTO (
   ID_SUB_CATEGORIA ASC
);

/==============================================================/
/* Index: PRESENTACION_PRODUCTO_FK                              */
/==============================================================/
create index PRESENTACION_PRODUCTO_FK on TBL_PRODUCTO (
   ID_PRESENTACION ASC
);


alter table TBL_PRODUCTO
   add constraint FK_TBL_PROD_PRESENTAC_TBL_PRES foreign key (ID_PRESENTACION)
      references TBL_PRESENTACION (ID_PRESENTACION);

alter table TBL_PRODUCTO
   add constraint FK_TBL_PROD_SUB_CATEG_TBL_SUB_ foreign key (ID_SUB_CATEGORIA)
      references TBL_SUB_CATEGORIA (ID_SUB_CATEGORIA);
-------------------------



/==============================================================/
/* Table: TBL_PERSONA                                           */
/==============================================================/
create table TBL_PERSONA (
   ID_PERSONA           NUMBER                not null,
   PRIMER_NOMBRE        VARCHAR2(50)          not null,
   SEGUNDO_NOMBRE       VARCHAR2(50),
   TERCER_NOMBRE        VARCHAR2(50),
   PRIMERO_APELLIDO     VARCHAR2(50)          not null,
   SEGUNDO_APELLIDO     VARCHAR2(50),
   DOCUMENTO_IDENTIFICACION VARCHAR2(25)          not null,
   NIT                  VARCHAR2(10)          not null,
   FECHA_NACIMIENTO     DATE                  not null,
   SEXO                 VARCHAR2(1)           not null,
   TELEFONO             NUMBER,
   EMAIL                VARCHAR2(100),
   RAZON_SOCIAL         VARCHAR2(250),
   DIRECCION            VARCHAR2(250),
   DIRECCION_FACTURACION VARCHAR2(250)
);

alter table TBL_PERSONA
   add constraint CKC_SEXO_TBL_PERS check (SEXO in ('M','F'));

alter table TBL_PERSONA
   add constraint PK_TBL_PERSONA primary key (ID_PERSONA);

/==============================================================/
/* Index: SEXO_PERSONA2_FK                                      */
/==============================================================/

   /==============================================================/
/* Table: TBL_EMPLEADO                                          */
/==============================================================/
create table TBL_EMPLEADO (
   ID_EMPLEADO          NUMBER                not null,
   ID_PERSONA           NUMBER                not null,
   FECHA_INGRESO        DATE                  not null,
   STS_EMPLEADO         NUMBER                not null
);

alter table TBL_EMPLEADO
   add constraint PK_TBL_EMPLEADO primary key (ID_EMPLEADO);

/==============================================================/
/* Index: EMPLEADO_PERSONA_FK                                   */
/==============================================================/
create index EMPLEADO_PERSONA_FK on TBL_EMPLEADO (
   ID_PERSONA ASC
);  
   
   
   
   ----------------
   
   
   

/==============================================================/
/* Table: TBL_CLIENTE                                           */
/==============================================================/
create table TBL_CLIENTE (
   ID_CLIENTE           NUMBER                not null,
   ID_PERSONA           NUMBER                not null,
   STS_CLIENTE          NUMBER                not null
);

alter table TBL_CLIENTE
   add constraint PK_TBL_CLIENTE primary key (ID_CLIENTE, ID_PERSONA);
/==============================================================/
/* Index: PERSONA_CLIENTE2_FK                                   */
/==============================================================/
create index PERSONA_CLIENTE2_FK on TBL_CLIENTE (
   ID_PERSONA ASC
);

alter table TBL_CLIENTE
   add constraint FK_TBL_CLIE_PERSONA_C_TBL_PERS foreign key (ID_PERSONA)
      references TBL_PERSONA (ID_PERSONA);

-------------------------------




/==============================================================/
/* Table: TBL_USUARIO                                           */
/==============================================================/
create table TBL_USUARIO (
   ID_USUARIO           NUMBER                not null,
   ID_ROL               NUMBER                not null,
   ID_PERSONA           NUMBER                not null,
   USUARIO              VARCHAR2(50)          not null,
   CLAVE                VARCHAR2(25)          not null
);

alter table TBL_USUARIO
   add constraint PK_TBL_USUARIO primary key (ID_USUARIO);

/==============================================================/
/* Index: PERSONA_USUARIO2_FK                                   */
/==============================================================/
create index PERSONA_USUARIO2_FK on TBL_USUARIO (
   ID_PERSONA ASC
);

/==============================================================/
/* Index: ROL_USUARIO_FK                                        */
/==============================================================/
create index ROL_USUARIO_FK on TBL_USUARIO (
   ID_ROL ASC
);


alter table TBL_USUARIO
   add constraint FK_TBL_USUA_PERSONA_U_TBL_PERS foreign key (ID_PERSONA)
      references TBL_PERSONA (ID_PERSONA);
      
      
      -------------
      
      -------------------------------------------------------
--  DDL for Table TBL_ROL
--------------------------------------------------------

  CREATE TABLE "C##TIENDA"."TBL_ROL" 
   (	"ID_ROL" NUMBER, 
	"ROL" VARCHAR2(25 BYTE), 
	"DESCRIPCION" VARCHAR2(250 BYTE), 
	"STS_ROL" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TBL_ROL
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TIENDA"."PK_TBL_ROL" ON "C##TIENDA"."TBL_ROL" ("ID_ROL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_ROL
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_ROL" MODIFY ("ID_ROL" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_ROL" MODIFY ("ROL" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_ROL" MODIFY ("DESCRIPCION" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_ROL" MODIFY ("STS_ROL" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_ROL" ADD CONSTRAINT "PK_TBL_ROL" PRIMARY KEY ("ID_ROL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
      

alter table TBL_USUARIO
   add constraint FK_TBL_USUA_ROL_USUAR_TBL_ROL foreign key (ID_ROL)
      references TBL_ROL (ID_ROL);
      
      
  /* Table: TBL_TIPO_PAGO                                         */
/==============================================================/
create table TBL_TIPO_PAGO (
   ID_TIPO_PAGO         NUMBER                not null,
   TIPO_PAGO            VARCHAR2(25)          not null,
   STS_TIPO_PAGO        INTEGER
);

alter table TBL_TIPO_PAGO
   add constraint PK_TBL_TIPO_PAGO primary key (ID_TIPO_PAGO);


--------------------------------------------------------
--  DDL for Table TBL_SERIE
--------------------------------------------------------

  CREATE TABLE "C##TIENDA"."TBL_SERIE" 
   (	"SERIE" VARCHAR2(3 BYTE), 
	"ID_TIENDA" NUMBER, 
	"SERIE_CORRELATIVO" NUMBER, 
	"STS_SERIE" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TBL_SERIE
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TIENDA"."PK_TBL_SERIE" ON "C##TIENDA"."TBL_SERIE" ("SERIE", "ID_TIENDA", "SERIE_CORRELATIVO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index RELATIONSHIP_25_FK
--------------------------------------------------------

  CREATE INDEX "C##TIENDA"."RELATIONSHIP_25_FK" ON "C##TIENDA"."TBL_SERIE" ("ID_TIENDA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_SERIE
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_SERIE" MODIFY ("SERIE" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_SERIE" MODIFY ("ID_TIENDA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_SERIE" MODIFY ("SERIE_CORRELATIVO" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_SERIE" MODIFY ("STS_SERIE" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_SERIE" ADD CONSTRAINT "PK_TBL_SERIE" PRIMARY KEY ("SERIE", "ID_TIENDA", "SERIE_CORRELATIVO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TBL_SERIE
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_SERIE" ADD CONSTRAINT "FK_TBL_SERI_RELATIONS_TBL_TIEN" FOREIGN KEY ("ID_TIENDA")
	  REFERENCES "C##TIENDA"."TBL_TIENDA" ("ID_TIENDA") ENABLE;
      
      
   -------------------------------
 /==============================================================/
/* Table: TBL_VENTA                                             */
/==============================================================/
create table TBL_VENTA (
   ID_VENTA             NUMBER                not null,
   ID_TIENDA            NUMBER                not null,
   ID_CLIENTE           NUMBER                not null,
   ID_TIPO_PAGO         NUMBER                not null,
   SERIE                VARCHAR2(3)           not null,
   SERIE_CORRELATIVO    NUMBER                not null,
   ID_PERSONA           NUMBER                not null,
   FECHA_FACTURA        DATE                  not null,
   TOTAL_FACTURA        NUMBER(8,2)           not null,
   TIPO_VENTA           VARCHAR2(20)          not null
);

alter table TBL_VENTA
   add constraint PK_TBL_VENTA primary key (ID_VENTA, ID_TIENDA, SERIE);
   
   
   alter table TBL_VENTA
   add constraint FK_TBL_VENT_CLIENTE_F_TBL_CLIE foreign key (ID_CLIENTE, ID_PERSONA)
      references TBL_CLIENTE (ID_CLIENTE, ID_PERSONA);

alter table TBL_VENTA
   add constraint FK_TBL_VENT_SERIE_VEN_TBL_SERI foreign key (SERIE, ID_TIENDA, SERIE_CORRELATIVO)
      references TBL_SERIE (SERIE, ID_TIENDA, SERIE_CORRELATIVO);

alter table TBL_VENTA
   add constraint FK_TBL_VENT_TIPO_PAGO_TBL_TIPO foreign key (ID_TIPO_PAGO)
      references TBL_TIPO_PAGO (ID_TIPO_PAGO);
      
      
 --------------------------------------------------------
--  DDL for Table TBL_TIENDA_PRODUCTO
--------------------------------------------------------

  CREATE TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" 
   (	"ID_PRODUCTO" NUMBER, 
	"ID_TIENDA" NUMBER, 
	"EXISTENCIA" NUMBER, 
	"ID_CATEGORIA" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PRODUCTO_TIENDA_FK
--------------------------------------------------------

  CREATE INDEX "C##TIENDA"."PRODUCTO_TIENDA_FK" ON "C##TIENDA"."TBL_TIENDA_PRODUCTO" ("ID_PRODUCTO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TIENDA_PRODUCTO_FK
--------------------------------------------------------

  CREATE INDEX "C##TIENDA"."TIENDA_PRODUCTO_FK" ON "C##TIENDA"."TBL_TIENDA_PRODUCTO" ("ID_TIENDA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TBL_TIENDA_PRODUCTO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TIENDA"."TBL_TIENDA_PRODUCTO_PK" ON "C##TIENDA"."TBL_TIENDA_PRODUCTO" ("ID_PRODUCTO", "ID_TIENDA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TBL_TIENDA_PRODUCTO
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" MODIFY ("ID_PRODUCTO" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" MODIFY ("ID_TIENDA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" MODIFY ("EXISTENCIA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" MODIFY ("ID_CATEGORIA" NOT NULL ENABLE);
  ALTER TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" ADD CONSTRAINT "TBL_TIENDA_PRODUCTO_PK" PRIMARY KEY ("ID_PRODUCTO", "ID_TIENDA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TBL_TIENDA_PRODUCTO
--------------------------------------------------------

  ALTER TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" ADD CONSTRAINT "FK_TBL_TIEN_PRODUCTO__TBL_PROD" FOREIGN KEY ("ID_PRODUCTO")
	  REFERENCES "C##TIENDA"."TBL_PRODUCTO" ("ID_PRODUCTO") ENABLE;
  ALTER TABLE "C##TIENDA"."TBL_TIENDA_PRODUCTO" ADD CONSTRAINT "FK_TBL_TIEN_TIENDA_PR_TBL_TIEN" FOREIGN KEY ("ID_TIENDA")
	  REFERENCES "C##TIENDA"."TBL_TIENDA" ("ID_TIENDA") ENABLE;     
      

/* Table: TBL_VENTA_DETALLE                                     */
/==============================================================/
create table TBL_VENTA_DETALLE (
   ID_PRODUCTO          NUMBER                not null,
   ID_VENTA             NUMBER                not null,
   SERIE                VARCHAR2(3)           not null,
   ID_CATEGORIA         NUMBER,
   ID_TIENDA            NUMBER                not null,
   CANTIDAD             NUMBER                not null,
   PRECIO               NUMBER(8,2)           not null,
   SUB_TOTAL            NUMBER(8,2)           not null,
   constraint PK_TBL_VENTA_DETALLE primary key (ID_PRODUCTO, ID_VENTA, ID_TIENDA)
);

/==============================================================/
/* Index: FACTURA_ENC_DET_FK                                    */
/==============================================================/
create index FACTURA_ENC_DET_FK on TBL_VENTA_DETALLE (
   ID_VENTA ASC,
   ID_TIENDA ASC,
   SERIE ASC
);


/*==============================================================*/
/* Table: TBL_PEDIDO                                            */
/*==============================================================*/
create table TBL_PEDIDO (
   ID_TIENDA            NUMBER                not null,
   U_PADRE              NUMBER                not null,
   ID_UBICACION         NUMBER                not null,
   ID_VENTA             NUMBER                not null,
   IDICACION_DESPACHO   VARCHAR2(250)         not null,
   OBS_DESPACHO         VARCHAR2(1024),
   STS_DESPACHO         NUMBER                not null,
   constraint PK_TBL_PEDIDO primary key (ID_TIENDA, ID_VENTA)
);

/*==============================================================*/
/* Index: RELATIONSHIP_26_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_26_FK on TBL_PEDIDO (
   U_PADRE ASC,
   ID_UBICACION ASC
);



/*==============================================================*/
/* Table: TBL_KARDEX                                            */
/*==============================================================*/
create table TBL_KARDEX (
   ID_KARDEX            INTEGER               not null,
   ID_PRODUCTO          NUMBER                not null,
   ID_TIPO_MOVIMIENTO   INTEGER               not null,
   FECHA_MOV            DATE                  not null,
   CANT_INGRESO         INTEGER               not null,
   CANT_SALIDA          INTEGER               not null,
   SALDO_ACTUAL         INTEGER               not null,
   constraint PK_TBL_KARDEX primary key (ID_KARDEX)
);

/*==============================================================*/
/* Index: TIPO_MOV_KARDEX_FK                                    */
/*==============================================================*/
create index TIPO_MOV_KARDEX_FK on TBL_KARDEX (
   ID_TIPO_MOVIMIENTO ASC
);

/*==============================================================*/
/* Index: PRODUCTO_KARDEX_FK                                    */
/*==============================================================*/
create index PRODUCTO_KARDEX_FK on TBL_KARDEX (
   ID_PRODUCTO ASC
);

/*==============================================================*/
/* Table: TBL_MOVIMIENTO_INV_DET                                */
/*==============================================================*/
create table TBL_MOVIMIENTO_INV_DET (
   ID_PRODUCTO          NUMBER                not null,
   ID_MOVIMENTO         INTEGER               not null,
   ID_TIENDA            NUMBER                not null,
   CANTIDAD_MOVIMIENTO  INTEGER               not null,
   COSTO_MOVIMIENTO     NUMBER(8,2)           not null,
   constraint PK_TBL_MOVIMIENTO_INV_DET primary key (ID_PRODUCTO, ID_MOVIMENTO, ID_TIENDA)
);

/*==============================================================*/
/* Index: MOVIMIENTO_ENC_MOV_DET_FK                             */
/*==============================================================*/
create index MOVIMIENTO_ENC_MOV_DET_FK on TBL_MOVIMIENTO_INV_DET (
   ID_MOVIMENTO ASC,
   ID_TIENDA ASC
);

/*==============================================================*/
/* Index: PRODUCTO_MOV_DET_FK                                   */
/*==============================================================*/
create index PRODUCTO_MOV_DET_FK on TBL_MOVIMIENTO_INV_DET (
   ID_PRODUCTO ASC
);

/*==============================================================*/
/* Table: TBL_MOVIMIENTO_INV_ENC                                */
/*==============================================================*/
create table TBL_MOVIMIENTO_INV_ENC (
   ID_MOVIMENTO         INTEGER               not null,
   ID_TIENDA            NUMBER                not null,
   ID_TIPO_MOVIMIENTO   INTEGER               not null,
   FECHA_MOVIMIENTO     DATE                  not null,
   TOTAL_MOVIMIENTO     CHAR(10),
   STS_MOVIMIENTO       CHAR(10),
   constraint PK_TBL_MOVIMIENTO_INV_ENC primary key (ID_MOVIMENTO, ID_TIENDA)
);

/*==============================================================*/
/* Index: TIPO_MOVIMIENTO_MOVIMIENTO_ENC                        */
/*==============================================================*/
create index TIPO_MOVIMIENTO_MOVIMIENTO_ENC on TBL_MOVIMIENTO_INV_ENC (
   ID_TIPO_MOVIMIENTO ASC
);

/*==============================================================*/
/* Index: TIENDA_MOV_INV_ENC_FK                                 */
/*==============================================================*/
create index TIENDA_MOV_INV_ENC_FK on TBL_MOVIMIENTO_INV_ENC (
   ID_TIENDA ASC
);



/==============================================================/
/* Table: TBL_TURNO                                             */
/==============================================================/
create table TBL_TURNO (
   ID_TURNO             NUMBER                not null,
   TURNO                VARCHAR2(25)          not null,
   INICIA_TURNO         DATE                  not null,
   FIN_TURNO            DATE                  not null
);

alter table TBL_TURNO
   add constraint PK_TBL_TURNO primary key (ID_TURNO);


/==============================================================/
/* Table: TBL_TURNO_TIENDA                                      */
/==============================================================/
create table TBL_TURNO_TIENDA (
   ID_TURNO             NUMBER                not null,
   ID_TIENDA            NUMBER                not null
);

alter table TBL_TURNO_TIENDA
   add constraint PK_TBL_TURNO_TIENDA primary key (ID_TURNO, ID_TIENDA);
/==============================================================/
/* Index: TURNO_TIENDA_FK                                       */
/==============================================================/
create index TURNO_TIENDA_FK on TBL_TURNO_TIENDA (
   ID_TURNO ASC
);
/==============================================================/
/* Index: TIENDA_TURNO_FK                                       */
/==============================================================/
create index TIENDA_TURNO_FK on TBL_TURNO_TIENDA (
   ID_TIENDA ASC
);

/==============================================================/
/* Table: TBL_TURNO_TIENDA_EMPLEADO                             */
/==============================================================/
create table TBL_TURNO_TIENDA_EMPLEADO (
   ID_EMPLEADO          NUMBER                not null,
   ID_TURNO             NUMBER                not null,
   ID_TIENDA            NUMBER                not null,
   STS_TURNO_TIENDA_EMPLEADO NUMBER                not null
);

alter table TBL_TURNO_TIENDA_EMPLEADO
   add constraint PK_TBL_TURNO_TIENDA_EMPLEADO primary key (ID_TURNO, ID_TIENDA);

/==============================================================/
/* Index: EMPLEADO_TURNO_TIENDA_FK                              */
/==============================================================/
create index EMPLEADO_TURNO_TIENDA_FK on TBL_TURNO_TIENDA_EMPLEADO (
   ID_EMPLEADO ASC
);



/*==============================================================*/
/* Table: TBL_BITACORA                                          */
/*==============================================================*/
create table TBL_BITACORA (
   ID_TRANSACCION       INTEGER               not null,
   BIT_TABLA_PRINCIPAL  VARCHAR2(50)          not null,
   TRN_USUARIO          VARCHAR2(50)          not null,
   TRN_FECHA_HORA       DATE                  not null,
   TRN_LOG              VARCHAR2(1024)        not null,
   constraint PK_TBL_BITACORA primary key (ID_TRANSACCION)
);



/*==============================================================*/
/* Table: TBL_STATUS                                            */
/*==============================================================*/
create table TBL_STATUS (
   ID_STATUS            INTEGER               not null,
   STATUS               VARCHAR2(20)          not null,
   STS_DESCRIPCION      VARCHAR2(250)         not null,
   constraint PK_TBL_STATUS primary key (ID_STATUS)
);




