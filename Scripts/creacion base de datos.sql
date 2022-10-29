/*alter table TBL_CLIENTE
   drop constraint FK_TBL_CLIE_PERSONA_C_TBL_PERS;

alter table TBL_EMPLEADO
   drop constraint FK_TBL_EMPL_EMPLEADO__TBL_PERS;

alter table TBL_EMPLEADO
   drop constraint FK_TBL_EMPL_STATUS_EM_TBL_STAT;

alter table TBL_GASOLINERA
   drop constraint FK_TBL_GASO_UBICACION_TBL_UBIC;

alter table TBL_KARDEX
   drop constraint FK_TBL_KARD_REFERENCE_TBL_TIPO;

alter table TBL_KARDEX
   drop constraint FK_TBL_KARD_REFERENCE_TBL_TIEN;

alter table TBL_PEDIDO
   drop constraint FK_TBL_PEDI_REFERENCE_TBL_VENT;

alter table TBL_PEDIDO
   drop constraint FK_TBL_PEDI_STATUS_PE_TBL_STAT;

alter table TBL_PERSONA
   drop constraint FK_TBL_PERS_PERSONA_D_TBL_TIPO;

alter table TBL_PRODUCTO
   drop constraint FK_TBL_PROD_PRESENTAC_TBL_PRES;

alter table TBL_PRODUCTO
   drop constraint FK_TBL_PROD_REFERENCE_TBL_SUB_;

alter table TBL_PRODUCTO
   drop constraint FK_TBL_PROD_STATUS_PR_TBL_STAT;

alter table TBL_ROL
   drop constraint FK_TBL_ROL_STATUS_RO_TBL_STAT;

alter table TBL_SERIE
   drop constraint FK_TBL_SERI_REFERENCE_TBL_TIEN;

alter table TBL_SERIE
   drop constraint FK_TBL_SERI_STATUS_SE_TBL_STAT;

alter table TBL_SUB_CATEGORIA
   drop constraint FK_TBL_SUB__REFERENCE_TBL_CATE;

alter table TBL_TIENDA
   drop constraint FK_TBL_TIEN_REFERENCE_TBL_GASO;

alter table TBL_TIENDA
   drop constraint FK_TBL_TIEN_STATUS_TI_TBL_STAT;

alter table TBL_TIENDA_PRODUCTO
   drop constraint FK_TBL_TIEN_PRODUCTO__TBL_PROD;

alter table TBL_TIENDA_PRODUCTO
   drop constraint FK_TBL_TIEN_TIENDA_PR_TBL_TIEN;

alter table TBL_TIPO_PAGO
   drop constraint FK_TBL_TIPO_STATUS_TI_TBL_STAT;

alter table TBL_TURNO
   drop constraint FK_TBL_TURN_STATUS_TU_TBL_STAT;

alter table TBL_TURNO_TIENDA
   drop constraint FK_TBL_TURN_REFERENCE_TBL_TURN;

alter table TBL_TURNO_TIENDA
   drop constraint FK_TBL_TURN_REFERENCE_TBL_TIEN;

alter table TBL_TURNO_TIENDA_EMPLEADO
   drop constraint FK_TBL_TURN_REFERENCE_TBL_EMPL;

alter table TBL_TURNO_TIENDA_EMPLEADO
   drop constraint FK_TBL_TURN_REFERENCE_TBL_TURN;

alter table TBL_TURNO_TIENDA_EMPLEADO
   drop constraint FK_TBL_TURN_STATUS_TU_TBL_STAT;

alter table TBL_UBICACION
   drop constraint FK_TBL_UBIC_TIPO_UBIC_TBL_TIPO;

alter table TBL_UBICACION
   drop constraint FK_TBL_UBIC_UBICACION_TBL_UBIC;

alter table TBL_USUARIO
   drop constraint FK_TBL_USUA_PERSONA_U_TBL_PERS;

alter table TBL_USUARIO
   drop constraint FK_TBL_USUA_ROL_USUAR_TBL_ROL;

alter table TBL_USUARIO
   drop constraint FK_TBL_USUA_STATUS_US_TBL_STAT;

alter table TBL_VENTA
   drop constraint FK_TBL_VENT_CLIENTE_F_TBL_CLIE;

alter table TBL_VENTA
   drop constraint FK_TBL_VENT_SERIE_VEN_TBL_SERI;

alter table TBL_VENTA
   drop constraint FK_TBL_VENT_STATUS_VE_TBL_STAT;

alter table TBL_VENTA
   drop constraint FK_TBL_VENT_TIPO_PAGO_TBL_TIPO;

alter table TBL_VENTA_DETALLE
   drop constraint FK_TBL_VENT_TIENDA_PR_TBL_TIEN;

alter table TBL_VENTA_DETALLE
   drop constraint FK_TBL_VENT_VENTA_VEN_TBL_VENT;

drop table TBL_BITACORA cascade constraints;

drop table TBL_CATEGORIA cascade constraints;

drop index PERSONA_CLIENTE2_FK;

drop table TBL_CLIENTE cascade constraints;

drop index STATUS_EMPLEADO_FK;

drop index EMPLEADO_PERSONA_FK;

drop table TBL_EMPLEADO cascade constraints;

drop index UBICACION_GASOLINERA2_FK;

drop table TBL_GASOLINERA cascade constraints;

drop index PRODUCTO_KARDEX_FK;

drop index TIPO_MOV_KARDEX_FK;

drop table TBL_KARDEX cascade constraints;

drop index RELATIONSHIP_21_FK;

drop index STATUS_PEDIDO_FK;

drop index RELATIONSHIP_26_FK;

drop table TBL_PEDIDO cascade constraints;

drop index SEXO_PERSONA2_FK;

drop table TBL_PERSONA cascade constraints;

drop table TBL_PRESENTACION cascade constraints;

drop index STATUS_PRODUCTO_FK;

drop index PRESENTACION_PRODUCTO_FK;

drop index SUB_CATEGORIA_PRODUCTO_FK;

drop table TBL_PRODUCTO cascade constraints;

drop index STATUS_ROL_FK;

drop table TBL_ROL cascade constraints;

drop index STATUS_SERIE_FK;



drop table TBL_SERIE cascade constraints;

drop table TBL_STATUS cascade constraints;



drop table TBL_SUB_CATEGORIA cascade constraints;



drop index STATUS_TIENDA_FK;

drop table TBL_TIENDA cascade constraints;

drop index TIENDA_PRODUCTO_FK;

drop index PRODUCTO_TIENDA_FK;

drop table TBL_TIENDA_PRODUCTO cascade constraints;

drop table TBL_TIPO_DOCUMENTO cascade constraints;

drop table TBL_TIPO_MOVIMIENTO cascade constraints;

drop index STATUS_TIPO_PAGO_FK;

drop table TBL_TIPO_PAGO cascade constraints;

drop table TBL_TIPO_UBICACION cascade constraints;

drop index STATUS_TURNO_FK;

drop table TBL_TURNO cascade constraints;





drop table TBL_TURNO_TIENDA cascade constraints;

drop index STATUS_TURNO_TIENDA_EMPLEADO_F;

drop index EMPLEADO_TURNO_TIENDA_FK;

drop table TBL_TURNO_TIENDA_EMPLEADO cascade constraints;

drop index UBICACION_PADRE_HIJO_FK;

drop index TIPO_UBICACION_UBICACION_FK;

drop table TBL_UBICACION cascade constraints;

drop index STATUS_USUARIO_FK;

drop index ROL_USUARIO_FK;

drop index PERSONA_USUARIO2_FK;

drop table TBL_USUARIO cascade constraints;

drop index STATUS_VENTA_FK;

drop index RELATIONSHIP_22_FK;

drop index CLIENTE_FACTURA_ENC_FK;

drop index SERIE_FACTURA_ENC_FK;

drop table TBL_VENTA cascade constraints;

drop index FACTURA_ENC_DET_FK;

drop table TBL_VENTA_DETALLE cascade constraints;*/

/*==============================================================*/
/* Table: TBL_BITACORA                                          */
/*==============================================================*/
create table TBL_BITACORA (
   ID_TRANSACCION       INTEGER               not null,
   BIT_TABLA_PRINCIPAL  VARCHAR2(50)          not null,
   TRN_USUARIO          VARCHAR2(50)          not null,
   TRN_FECHA_HORA       DATE                  not null,
   TRN_LOG              VARCHAR2(4000)        not null,
   constraint PK_TBL_BITACORA primary key (ID_TRANSACCION)
);

/*==============================================================*/
/* Table: TBL_CATEGORIA                                         */
/*==============================================================*/
create table TBL_CATEGORIA (
   ID_CATEGORIA         NUMBER                not null,
   CATEGORIA            VARCHAR2(100)         not null,
   constraint PK_TBL_CATEGORIA primary key (ID_CATEGORIA)
);

/*==============================================================*/
/* Table: TBL_CLIENTE                                           */
/*==============================================================*/
create table TBL_CLIENTE (
   ID_PERSONA           NUMBER                not null,
   ID_CLIENTE           NUMBER                not null,
   constraint PK_TBL_CLIENTE primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Index: PERSONA_CLIENTE2_FK                                   */
/*==============================================================*/
create index PERSONA_CLIENTE2_FK on TBL_CLIENTE (
   ID_PERSONA ASC
);

/*==============================================================*/
/* Table: TBL_EMPLEADO                                          */
/*==============================================================*/
create table TBL_EMPLEADO (
   ID_PERSONA           NUMBER                not null,
   ID_EMPLEADO          NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   FECHA_INGRESO        DATE                  not null,
   constraint PK_TBL_EMPLEADO primary key (ID_EMPLEADO)
);

/*==============================================================*/
/* Index: EMPLEADO_PERSONA_FK                                   */
/*==============================================================*/
create index EMPLEADO_PERSONA_FK on TBL_EMPLEADO (
   ID_PERSONA ASC
);

/*==============================================================*/
/* Index: STATUS_EMPLEADO_FK                                    */
/*==============================================================*/
create index STATUS_EMPLEADO_FK on TBL_EMPLEADO (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_GASOLINERA                                        */
/*==============================================================*/
create table TBL_GASOLINERA (
   ID_UBICACION         NUMBER                not null,
   ID_GASOLINERA        NUMBER                not null,
   GASOLINERA           VARCHAR2(50)          not null,
   constraint PK_TBL_GASOLINERA primary key (ID_GASOLINERA)
);

/*==============================================================*/
/* Index: UBICACION_GASOLINERA2_FK                              */
/*==============================================================*/
create index UBICACION_GASOLINERA2_FK on TBL_GASOLINERA (
   ID_UBICACION ASC
);

/*==============================================================*/
/* Table: TBL_KARDEX                                            */
/*==============================================================*/
create table TBL_KARDEX (
   ID_TIENDA            NUMBER                not null,
   ID_KARDEX            INTEGER               not null,
   ID_TIPO_MOVIMIENTO   INTEGER,
   ID_PRODUCTO          NUMBER,
   FECHA_MOV            DATE                  not null,
   CANT_MOV             INTEGER               not null,
   SALDO_ACTUAL         INTEGER               not null,
   PRECIO               NUMBER(8,2),
   NUM_MOV              INTEGER,
   constraint PK_TBL_KARDEX primary key (ID_TIENDA, ID_KARDEX)
);

/*==============================================================*/
/* Index: TIPO_MOV_KARDEX_FK                                    */
/*==============================================================*/


/*==============================================================*/
/* Index: PRODUCTO_KARDEX_FK                                    */
/*==============================================================*/


/*==============================================================*/
/* Table: TBL_PEDIDO                                            */
/*==============================================================*/
create table TBL_PEDIDO (
   ID_TIENDA            NUMBER                not null,
   SERIE                VARCHAR2(3)           not null,
   SERIE_CORRELATIVO    NUMBER                not null,
   ID_CLIENTE           NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   DIRECCIONENTREGA     VARCHAR2(250)         not null,
   OBS_DESPACHO         VARCHAR2(1024),
   constraint PK_TBL_PEDIDO primary key (ID_TIENDA, ID_CLIENTE, SERIE, SERIE_CORRELATIVO)
);

/*==============================================================*/
/* Index: RELATIONSHIP_26_FK                                    */
/*==============================================================*/


/*==============================================================*/
/* Index: STATUS_PEDIDO_FK                                      */
/*==============================================================*/
create index STATUS_PEDIDO_FK on TBL_PEDIDO (
   ID_STATUS ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_21_FK                                    */
/*==============================================================*/


/*==============================================================*/
/* Table: TBL_PERSONA                                           */
/*==============================================================*/
create table TBL_PERSONA (
   ID_PERSONA           NUMBER                not null,
   ID_TIPO_DOCUMENTO    Integer               not null,
   PRIMER_NOMBRE        VARCHAR2(50)          not null,
   SEGUNDO_NOMBRE       VARCHAR2(50),
   TERCER_NOMBRE        VARCHAR2(50),
   PRIMERO_APELLIDO     VARCHAR2(50)          not null,
   SEGUNDO_APELLIDO     VARCHAR2(50),
   DOCUMENTO            VARCHAR2(25)          not null,
   NIT                  VARCHAR2(10)          not null,
   FECHA_NACIMIENTO     DATE                  not null,
   SEXO                 VARCHAR2(1)           not null
      constraint CKC_SEXO_TBL_PERS check (SEXO in ('M','F')),
   TELEFONO             NUMBER,
   EMAIL                VARCHAR2(100),
   RAZON_SOCIAL         VARCHAR2(250),
   DIRECCION            VARCHAR2(250),
   constraint PK_TBL_PERSONA primary key (ID_PERSONA)
);


/*==============================================================*/
/* Table: TBL_PRESENTACION                                      */
/*==============================================================*/
create table TBL_PRESENTACION (
   ID_PRESENTACION      INTEGER               not null,
   PRESENTACION         VARCHAR2(50)          not null,
   constraint PK_TBL_PRESENTACION primary key (ID_PRESENTACION)
);

/*==============================================================*/
/* Table: TBL_PRODUCTO                                          */
/*==============================================================*/
create table TBL_PRODUCTO (
   ID_PRODUCTO          NUMBER                not null,
   ID_PRESENTACION      INTEGER               not null,
   PRODUCTO             VARCHAR2(100)         not null,
   PRECIO               NUMBER(8,2)           not null,
   ID_STATUS            INTEGER               not null,
   ID_SUB_CATEGORIA     NUMBER,
   constraint PK_TBL_PRODUCTO primary key (ID_PRODUCTO)
);


/*==============================================================*/
/* Index: PRESENTACION_PRODUCTO_FK                              */
/*==============================================================*/
create index PRESENTACION_PRODUCTO_FK on TBL_PRODUCTO (
   ID_PRESENTACION ASC
);

/*==============================================================*/
/* Index: STATUS_PRODUCTO_FK                                    */
/*==============================================================*/
create index STATUS_PRODUCTO_FK on TBL_PRODUCTO (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_ROL                                               */
/*==============================================================*/
create table TBL_ROL (
   ID_ROL               NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   ROL                  VARCHAR2(25)          not null,
   DESCRIPCION          VARCHAR2(250)         not null,
   constraint PK_TBL_ROL primary key (ID_ROL)
);

/*==============================================================*/
/* Index: STATUS_ROL_FK                                         */
/*==============================================================*/
create index STATUS_ROL_FK on TBL_ROL (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_SERIE                                             */
/*==============================================================*/
create table TBL_SERIE (
   ID_TIENDA            NUMBER                not null,
   SERIE                VARCHAR2(3)           not null,
   SERIE_CORRELATIVO    NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   constraint PK_TBL_SERIE primary key (ID_TIENDA, SERIE)
);



/*==============================================================*/
/* Index: STATUS_SERIE_FK                                       */
/*==============================================================*/
create index STATUS_SERIE_FK on TBL_SERIE (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_STATUS                                            */
/*==============================================================*/
create table TBL_STATUS (
   ID_STATUS            INTEGER               not null,
   STATUS               VARCHAR2(20)          not null,
   STS_DESCRIPCION      VARCHAR2(250)         not null,
   TBL_USO              VARCHAR2(50),
   constraint PK_TBL_STATUS primary key (ID_STATUS),
   constraint AK_UNIQUE_STATUS_TBL_STAT unique (STATUS)
);

/*==============================================================*/
/* Table: TBL_SUB_CATEGORIA                                     */
/*==============================================================*/
create table TBL_SUB_CATEGORIA (
   ID_SUB_CATEGORIA     NUMBER                not null,
   ID_CATEGORIA         NUMBER,
   SUB_CATEGORIA        VARCHAR2(150)         not null,
   constraint PK_TBL_SUB_CATEGORIA primary key (ID_SUB_CATEGORIA)
);


/*==============================================================*/
/* Table: TBL_TIENDA                                            */
/*==============================================================*/
create table TBL_TIENDA (
   ID_TIENDA            NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   ID_GASOLINERA        NUMBER,
   TIENDA               VARCHAR2(25)          not null,
   constraint PK_TBL_TIENDA primary key (ID_TIENDA)
);

/*==============================================================*/
/* Index: STATUS_TIENDA_FK                                      */
/*==============================================================*/
create index STATUS_TIENDA_FK on TBL_TIENDA (
   ID_STATUS ASC
);



/*==============================================================*/
/* Table: TBL_TIENDA_PRODUCTO                                   */
/*==============================================================*/
create table TBL_TIENDA_PRODUCTO (
   ID_TIENDA            NUMBER                not null,
   ID_PRODUCTO          NUMBER                not null,
   EXISTENCIA           NUMBER                not null,
   constraint PK_TBL_TIENDA_PRODUCTO primary key (ID_PRODUCTO, ID_TIENDA)
);

/*==============================================================*/
/* Index: PRODUCTO_TIENDA_FK                                    */
/*==============================================================*/
create index PRODUCTO_TIENDA_FK on TBL_TIENDA_PRODUCTO (
   ID_PRODUCTO ASC
);

/*==============================================================*/
/* Index: TIENDA_PRODUCTO_FK                                    */
/*==============================================================*/
create index TIENDA_PRODUCTO_FK on TBL_TIENDA_PRODUCTO (
   ID_TIENDA ASC
);

/*==============================================================*/
/* Table: TBL_TIPO_DOCUMENTO                                    */
/*==============================================================*/
create table TBL_TIPO_DOCUMENTO (
   ID_TIPO_DOCUMENTO    INTEGER               not null,
   TIPO_DOCUMENTO       VARCHAR2(100)         not null,
   constraint PK_TBL_TIPO_DOCUMENTO primary key (ID_TIPO_DOCUMENTO)
);

/*==============================================================*/
/* Table: TBL_TIPO_MOVIMIENTO                                   */
/*==============================================================*/
create table TBL_TIPO_MOVIMIENTO (
   ID_TIPO_MOVIMIENTO   INTEGER               not null,
   TIPO_MOVIMIENTO      VARCHAR2(50)          not null,
   SUMA_RESTA           INTEGER,
   constraint PK_TBL_TIPO_MOVIMIENTO primary key (ID_TIPO_MOVIMIENTO)
);

/*==============================================================*/
/* Table: TBL_TIPO_PAGO                                         */
/*==============================================================*/
create table TBL_TIPO_PAGO (
   ID_TIPO_PAGO         NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   TIPO_PAGO            VARCHAR2(25)          not null,
   constraint PK_TBL_TIPO_PAGO primary key (ID_TIPO_PAGO)
);

/*==============================================================*/
/* Index: STATUS_TIPO_PAGO_FK                                   */
/*==============================================================*/
create index STATUS_TIPO_PAGO_FK on TBL_TIPO_PAGO (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_TIPO_UBICACION                                    */
/*==============================================================*/
create table TBL_TIPO_UBICACION (
   ID_TIPO_UBICACION    NUMBER                not null,
   TIPO_UBICACION       VARCHAR2(50)          not null,
   constraint PK_TBL_TIPO_UBICACION primary key (ID_TIPO_UBICACION)
);

/*==============================================================*/
/* Table: TBL_TURNO                                             */
/*==============================================================*/
create table TBL_TURNO (
   ID_TURNO             NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   TURNO                VARCHAR2(25)          not null,
   INICIA_TURNO         INTERVAL DAY(2) TO SECOND(6)  not null,
   FIN_TURNO            INTERVAL DAY(2) TO SECOND(6)  not null,
   constraint PK_TBL_TURNO primary key (ID_TURNO)
);

/*==============================================================*/
/* Index: STATUS_TURNO_FK                                       */
/*==============================================================*/
create index STATUS_TURNO_FK on TBL_TURNO (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_TURNO_TIENDA                                      */
/*==============================================================*/
create table TBL_TURNO_TIENDA (
   ID_TIENDA            NUMBER                not null,
   ID_TURNO             NUMBER                not null,
   constraint PK_TBL_TURNO_TIENDA primary key (ID_TIENDA, ID_TURNO)
);


/*==============================================================*/
/* Table: TBL_TURNO_TIENDA_EMPLEADO                             */
/*==============================================================*/
create table TBL_TURNO_TIENDA_EMPLEADO (
   ID_TIENDA            NUMBER                not null,
   ID_TURNO             NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   ID_EMPLEADO          NUMBER,
   constraint PK_TBL_TURNO_TIENDA_EMPLEADO primary key (ID_TIENDA, ID_TURNO, ID_EMPLEADO)
);


/*==============================================================*/
/* Index: STATUS_TURNO_TIENDA_EMPLEADO_F                        */
/*==============================================================*/
create index STATUS_TURNO_TIENDA_EMPLEADO_F on TBL_TURNO_TIENDA_EMPLEADO (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_UBICACION                                         */
/*==============================================================*/
create table TBL_UBICACION (
   ID_UBICACION         NUMBER                not null,
   UBICACION            VARCHAR2(50)          not null,
   U_PADRE              NUMBER                not null,
   ID_TIPO_UBICACION    NUMBER                not null,
   constraint PK_TBL_UBICACION primary key (ID_UBICACION)
);

/*==============================================================*/
/* Index: TIPO_UBICACION_UBICACION_FK                           */
/*==============================================================*/
create index TIPO_UBICACION_UBICACION_FK on TBL_UBICACION (
   ID_TIPO_UBICACION ASC
);

/*==============================================================*/
/* Index: UBICACION_PADRE_HIJO_FK                               */
/*==============================================================*/
create index UBICACION_PADRE_HIJO_FK on TBL_UBICACION (
   U_PADRE ASC
);

/*==============================================================*/
/* Table: TBL_USUARIO                                           */
/*==============================================================*/
create table TBL_USUARIO (
   ID_PERSONA           NUMBER                not null,
   ID_USUARIO           NUMBER                not null,
   ID_ROL               NUMBER                not null,
   USUARIO              VARCHAR2(50)          not null,
   CLAVE                VARCHAR2(25)          not null,
   ID_STATUS            INTEGER               not null,
   constraint PK_TBL_USUARIO primary key (ID_PERSONA, ID_USUARIO)
);

/*==============================================================*/
/* Index: PERSONA_USUARIO2_FK                                   */
/*==============================================================*/
create index PERSONA_USUARIO2_FK on TBL_USUARIO (
   ID_PERSONA ASC
);

/*==============================================================*/
/* Index: ROL_USUARIO_FK                                        */
/*==============================================================*/
create index ROL_USUARIO_FK on TBL_USUARIO (
   ID_ROL ASC
);

/*==============================================================*/
/* Index: STATUS_USUARIO_FK                                     */
/*==============================================================*/
create index STATUS_USUARIO_FK on TBL_USUARIO (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_VENTA                                             */
/*==============================================================*/
create table TBL_VENTA (
   ID_TIENDA            NUMBER                not null,
   ID_CLIENTE           NUMBER                not null,
   SERIE                VARCHAR2(3)           not null,
   SERIE_CORRELATIVO    NUMBER                not null,
   FECHA_FACTURA        DATE                  not null,
   ID_TIPO_PAGO         NUMBER                not null,
   ID_STATUS            INTEGER               not null,
   TOTAL_FACTURA        NUMBER(8,2)           not null,
   TIPO_VENTA           VARCHAR2(20)          not null,
   constraint PK_TBL_VENTA primary key (ID_TIENDA, ID_CLIENTE, SERIE, SERIE_CORRELATIVO)
);

/*==============================================================*/
/* Index: SERIE_FACTURA_ENC_FK                                  */
/*==============================================================*/
create index SERIE_FACTURA_ENC_FK on TBL_VENTA (
   ID_TIENDA ASC,
   SERIE ASC
);

/*==============================================================*/
/* Index: CLIENTE_FACTURA_ENC_FK                                */
/*==============================================================*/
create index CLIENTE_FACTURA_ENC_FK on TBL_VENTA (
   ID_CLIENTE ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_22_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_22_FK on TBL_VENTA (
   ID_TIPO_PAGO ASC
);

/*==============================================================*/
/* Index: STATUS_VENTA_FK                                       */
/*==============================================================*/
create index STATUS_VENTA_FK on TBL_VENTA (
   ID_STATUS ASC
);

/*==============================================================*/
/* Table: TBL_VENTA_DETALLE                                     */
/*==============================================================*/
create table TBL_VENTA_DETALLE (
   ID_TIENDA            NUMBER                not null,
   SERIE                VARCHAR2(3)           not null,
   SERIE_CORRELATIVO    NUMBER                not null,
   ID_CLIENTE           NUMBER                not null,
   ID_PRODUCTO          NUMBER                not null,
   CANTIDAD             NUMBER                not null,
   PRECIO               NUMBER(8,2)           not null,
   SUB_TOTAL            NUMBER(8,2)           not null,
   constraint PK_TBL_VENTA_DETALLE primary key (ID_CLIENTE, SERIE, SERIE_CORRELATIVO, ID_TIENDA)
);

/*==============================================================*/
/* Index: FACTURA_ENC_DET_FK                                    */
/*==============================================================*/
create index FACTURA_ENC_DET_FK on TBL_VENTA_DETALLE (
   ID_TIENDA ASC,
   ID_CLIENTE ASC,
   SERIE ASC,
   SERIE_CORRELATIVO ASC
);

alter table TBL_CLIENTE
   add constraint FK_TBL_CLIE_PERSONA_C_TBL_PERS foreign key (ID_PERSONA)
      references TBL_PERSONA (ID_PERSONA);

alter table TBL_EMPLEADO
   add constraint FK_TBL_EMPL_EMPLEADO__TBL_PERS foreign key (ID_PERSONA)
      references TBL_PERSONA (ID_PERSONA);

alter table TBL_EMPLEADO
   add constraint FK_TBL_EMPL_STATUS_EM_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_GASOLINERA
   add constraint FK_TBL_GASO_UBICACION_TBL_UBIC foreign key (ID_UBICACION)
      references TBL_UBICACION (ID_UBICACION);

alter table TBL_KARDEX
   add constraint FK_TBL_KARD_REFERENCE_TBL_TIPO foreign key (ID_TIPO_MOVIMIENTO)
      references TBL_TIPO_MOVIMIENTO (ID_TIPO_MOVIMIENTO);

alter table TBL_KARDEX
   add constraint FK_TBL_KARD_REFERENCE_TBL_TIEN foreign key (ID_PRODUCTO, ID_TIENDA)
      references TBL_TIENDA_PRODUCTO (ID_PRODUCTO, ID_TIENDA);

alter table TBL_PEDIDO
   add constraint FK_TBL_PEDI_REFERENCE_TBL_VENT foreign key (ID_CLIENTE, SERIE, SERIE_CORRELATIVO, ID_TIENDA)
      references TBL_VENTA_DETALLE (ID_CLIENTE, SERIE, SERIE_CORRELATIVO, ID_TIENDA);

alter table TBL_PEDIDO
   add constraint FK_TBL_PEDI_STATUS_PE_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_PERSONA
   add constraint FK_TBL_PERS_PERSONA_D_TBL_TIPO foreign key (ID_TIPO_DOCUMENTO)
      references TBL_TIPO_DOCUMENTO (ID_TIPO_DOCUMENTO);

alter table TBL_PRODUCTO
   add constraint FK_TBL_PROD_PRESENTAC_TBL_PRES foreign key (ID_PRESENTACION)
      references TBL_PRESENTACION (ID_PRESENTACION);

alter table TBL_PRODUCTO
   add constraint FK_TBL_PROD_REFERENCE_TBL_SUB_ foreign key (ID_SUB_CATEGORIA)
      references TBL_SUB_CATEGORIA (ID_SUB_CATEGORIA);

alter table TBL_PRODUCTO
   add constraint FK_TBL_PROD_STATUS_PR_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_ROL
   add constraint FK_TBL_ROL_STATUS_RO_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_SERIE
   add constraint FK_TBL_SERI_REFERENCE_TBL_TIEN foreign key (ID_TIENDA)
      references TBL_TIENDA (ID_TIENDA);

alter table TBL_SERIE
   add constraint FK_TBL_SERI_STATUS_SE_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_SUB_CATEGORIA
   add constraint FK_TBL_SUB__REFERENCE_TBL_CATE foreign key (ID_CATEGORIA)
      references TBL_CATEGORIA (ID_CATEGORIA);

alter table TBL_TIENDA
   add constraint FK_TBL_TIEN_REFERENCE_TBL_GASO foreign key (ID_GASOLINERA)
      references TBL_GASOLINERA (ID_GASOLINERA);

alter table TBL_TIENDA
   add constraint FK_TBL_TIEN_STATUS_TI_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_TIENDA_PRODUCTO
   add constraint FK_TBL_TIEN_PRODUCTO__TBL_PROD foreign key (ID_PRODUCTO)
      references TBL_PRODUCTO (ID_PRODUCTO);

alter table TBL_TIENDA_PRODUCTO
   add constraint FK_TBL_TIEN_TIENDA_PR_TBL_TIEN foreign key (ID_TIENDA)
      references TBL_TIENDA (ID_TIENDA);

alter table TBL_TIPO_PAGO
   add constraint FK_TBL_TIPO_STATUS_TI_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_TURNO
   add constraint FK_TBL_TURN_STATUS_TU_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_TURNO_TIENDA
   add constraint FK_TBL_TURN_REFERENCE_TBL_TURN foreign key (ID_TURNO)
      references TBL_TURNO (ID_TURNO);

alter table TBL_TURNO_TIENDA
   add constraint FK_TBL_TURN_REFERENCE_TBL_TIEN foreign key (ID_TIENDA)
      references TBL_TIENDA (ID_TIENDA);

alter table TBL_TURNO_TIENDA_EMPLEADO
   add constraint FK_TBL_TURN_REFERENCE_TBL_EMPL foreign key (ID_EMPLEADO)
      references TBL_EMPLEADO (ID_EMPLEADO);

alter table TBL_TURNO_TIENDA_EMPLEADO
   add constraint FK_TBL_TURN_REFERENCE_TBL_TURN2 foreign key (ID_TIENDA, ID_TURNO)
      references TBL_TURNO_TIENDA (ID_TIENDA, ID_TURNO);

alter table TBL_TURNO_TIENDA_EMPLEADO
   add constraint FK_TBL_TURN_STATUS_TU_TBL_STAT2 foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_UBICACION
   add constraint FK_TBL_UBIC_TIPO_UBIC_TBL_TIPO foreign key (ID_TIPO_UBICACION)
      references TBL_TIPO_UBICACION (ID_TIPO_UBICACION);

alter table TBL_UBICACION
   add constraint FK_TBL_UBIC_UBICACION_TBL_UBIC foreign key (U_PADRE)
      references TBL_UBICACION (ID_UBICACION);

alter table TBL_USUARIO
   add constraint FK_TBL_USUA_PERSONA_U_TBL_PERS foreign key (ID_PERSONA)
      references TBL_PERSONA (ID_PERSONA);

alter table TBL_USUARIO
   add constraint FK_TBL_USUA_ROL_USUAR_TBL_ROL foreign key (ID_ROL)
      references TBL_ROL (ID_ROL);

alter table TBL_USUARIO
   add constraint FK_TBL_USUA_STATUS_US_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_VENTA
   add constraint FK_TBL_VENT_CLIENTE_F_TBL_CLIE foreign key (ID_CLIENTE)
      references TBL_CLIENTE (ID_CLIENTE);

alter table TBL_VENTA
   add constraint FK_TBL_VENT_SERIE_VEN_TBL_SERI foreign key (ID_TIENDA, SERIE)
      references TBL_SERIE (ID_TIENDA, SERIE);

alter table TBL_VENTA
   add constraint FK_TBL_VENT_STATUS_VE_TBL_STAT foreign key (ID_STATUS)
      references TBL_STATUS (ID_STATUS);

alter table TBL_VENTA
   add constraint FK_TBL_VENT_TIPO_PAGO_TBL_TIPO foreign key (ID_TIPO_PAGO)
      references TBL_TIPO_PAGO (ID_TIPO_PAGO);

alter table TBL_VENTA_DETALLE
   add constraint FK_TBL_VENT_TIENDA_PR_TBL_TIEN foreign key (ID_PRODUCTO, ID_TIENDA)
      references TBL_TIENDA_PRODUCTO (ID_PRODUCTO, ID_TIENDA);

alter table TBL_VENTA_DETALLE
   add constraint FK_TBL_VENT_VENTA_VEN_TBL_VENT foreign key (ID_TIENDA, ID_CLIENTE, SERIE, SERIE_CORRELATIVO)
      references TBL_VENTA (ID_TIENDA, ID_CLIENTE, SERIE, SERIE_CORRELATIVO);
