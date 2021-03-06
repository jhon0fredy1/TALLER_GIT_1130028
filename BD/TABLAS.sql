﻿CREATE TABLE USUARIO(
login		varchar(15) PRIMARY KEY,
contrasena	varchar(12),
tipo_usuario	varchar(15),
nombre_usuario	varchar(30),
telefono_usuario  varchar(12),
direccion_usuario varchar(30),
tipo_id		varchar(20),
id_usuario	varchar(12)
);

CREATE TABLE CLIENTE(
nombre_cliente 		varchar(30),
tipo_id			varchar(20),
id_cliente		varchar(12) PRIMARY KEY,
telefono_cliente	varchar(12),
direccion_cliente	varchar(30),
fecha_nacimiento_cliente date,
email_cliente		varchar(40)
);

create table venta(
cod_venta	varchar(4) PRIMARY KEY,
fecha		date,
id_usuario	varchar(12),
id_cliente	varchar(12),
subtotal	numeric (10),
iva		numeric (10),
total		numeric (10)
);


CREATE TABLE CATEGORIA(
cod_categoria		varchar(3) PRIMARY KEY,
nombre_categoria	VARCHAR(30)
);


create table producto(
cod_categoria			varchar(3)REFERENCES CATEGORIA(cod_categoria),
cod_producto			varchar(4) PRIMARY KEY,
nombre_producto			varchar(20),
imagen				bytea,
empresa_fabricante		varchar(30),
descripcion_producto		varchar(200),
precio				numeric (10),
porcentaje_iva			numeric(2)
);


CREATE TABLE lineaventa(
cod_venta			varchar(4) REFERENCES VENTA(cod_venta),
cod_producto			varchar(4) REFERENCES PRODUCTO(cod_producto),
cantidad			numeric(3),
descuento			numeric(10),
precio				numeric(10),
PRIMARY KEY(cod_venta, cod_producto)
);


create table pago(
cod_pago			varchar(4) PRIMARY KEY,
cod_venta			varchar(4) REFERENCES VENTA(cod_venta),
valor				numeric(10)
);


create table pagoEfectivo(
cod_pago			varchar(4) REFERENCES PAGO(cod_pago),
cod_pefectivo			varchar(4),
PRIMARY KEY(cod_pago, cod_pefectivo)
);


create table pagotc(
cod_pago			varchar(4) REFERENCES PAGO(cod_pago),
cod_pagotc			varchar(4),
nro_tarjeta			varchar(16),
PRIMARY KEY(cod_pago, cod_pagotc)
);


create table pagotd(
cod_pago			varchar(4) REFERENCES PAGO(cod_pago), 
cod_pagotd			varchar(4),
nro_tarjeta			varchar(16),
nro_cuotas			numeric(2),
PRIMARY KEY(cod_pago, cod_pagotd)
);



create table detallexProducto(
nro_detalle 			varchar(4),
cod_producto			varchar(4) REFERENCES PRODUCTO(cod_producto),
detalle				varchar(50),
PRIMARY KEY(nro_detalle, cod_producto)
);


create table sucursal(
cod_sucursal			varchar(3) PRIMARY KEY,
nombre_sucursal			varchar(20),
direccion			varchar(30),
telefono			varchar(10)
);


create table productosxsucursal(
cod_sucursal			varchar(3) REFERENCES SUCURSAL (cod_sucursal),
cod_producto 			varchar(4) REFERENCES PRODUCTO (cod_producto),
cantidad			numeric(10),
PRIMARY KEY(cod_sucursal, cod_producto)
);

CREATE TABLE DESCUENTO(
cod_categoria		varchar(3) REFERENCES CATEGORIA(cod_categoria),
fecha_inicio		date,
fecha_fin		date,
porcentaje_descuento	numeric(2),
PRIMARY KEY(cod_categoria, fecha_inicio, fecha_fin)
);
