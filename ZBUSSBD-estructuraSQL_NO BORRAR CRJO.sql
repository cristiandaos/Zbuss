CREATE DATABASE ZBUSSBD;

USE ZBUSSBD;

CREATE TABLE Viajes (
  viaje_cod varchar(10)  PRIMARY KEY,
  viaje_terminal_salida varchar(10) NOT NULL,
  viaje_terminal_llegada varchar(10) NOT NULL,
  viaje_hora_salida varchar(50) NOT NULL,
  viaje_hora_llegada varchar(50) NOT NULL,
  viaje_distancia varchar(50)NOT NULL,
  viaje_asientos_Dispo int NOT NULL,
  viaje_duracion varchar(50) NOT NULL,
  viaje_precio decimal(12,2) NOT NULL,
  viaje_promocion varchar(10),
  viaje_img_Refe blob NOT NULL
);


CREATE TABLE Socios (
  socio_dni char(8) PRIMARY KEY,
  socio_nombre varchar(100) NOT NULL,
  socio_apellido_paterno varchar(20) NOT NULL,
  socio_apellido_materno varchar(20) NOT NULL,
  socio_correo varchar(100) NOT NULL,
  socio_nacimiento varchar(50) NOT NULL,
  socio_numero char(9) NOT NULL,
  socio_contraseña varchar(100) NOT NULL,
  socio_puntos  int NOT NULL
 );


CREATE TABLE Administradores (
  admin_dni char(8) PRIMARY KEY,
  admin_nombre varchar(100) NOT NULL,
  admin_apellido_paterno varchar(100) NOT NULL,
  admin_apellido_materno varchar(100) NOT NULL,
  admin_correo varchar(100) NOT NULL,
  admin_contraseña varchar(100)
 );


CREATE TABLE Ventas (
  venta_ruc char(11) PRIMARY KEY,
  venta_fecha varchar(50) NOT NULL,
  venta_hora varchar(50) NOT NULL,
  venta_viaje_cod char(10) NOT NULL,
  venta_pasajeroPrincipal_dni char(8)  NOT  NULL,
  venta_num_asientos int  NOT NULL,
  venta_asientos varchar(100)  NOT NULL,
  venta_ganancia decimal(12,2) NOT NULL
 );

 CREATE TABLE PasajerosPrincipales (
  pasajeroPrincipal_dni char(8) PRIMARY KEY,
  pasajeroPrincipal_viaje_cod varchar(10) NOT NULL,
  pasajeroPrincipal_nombre varchar(100) NOT NULL,
  pasajeroPrincipal_apellido_paterno varchar(100) NOT NULL,
  pasajeroPrincipal_apellido_materno varchar(100) NOT NULL,
  pasajeroPrincipal_edad int NOT NULL,
  pasajeroPrincipal_asiento varchar(50) NOT NULL
  );
  

  CREATE TABLE Acompañantes(
  acompañante_dni char(8) PRIMARY KEY,
  acompañante_pasajeroPrincipal char(8) NOT NULL,
  acompañante_viaje_cod varchar(10) NOT NULL,
  acompañante_nombre varchar(100) NOT NULL,
  acompañante_apellido_paterno varchar(100) NOT NULL,
  acompañante_apellido_materno varchar(100) NOT NULL,
  acompañante_edad int NOT NULL,
  acompañante_asiento varchar(50) NOT NULL
);


CREATE TABLE Terminales (
  terminal_cod varchar(10) PRIMARY KEY,
  terminal_nombre varchar(50) NOT NULL,
  terminal_dirección varchar(200) NOT NULL,
  terminal_estado varchar(50) NOT NULL
);


CREATE TABLE Asientos(
  asientos_viaje_cod varchar(10) NOT NULL,
  A01 varchar(40) NOT NULL,
  A02 varchar(40) NOT NULL,
  A03 varchar(40) NOT NULL,
  A04 varchar(40) NOT NULL,
  A05 varchar(40) NOT NULL,
  A06 varchar(40) NOT NULL,
  A07 varchar(40) NOT NULL,
  A08 varchar(40) NOT NULL,
  A09 varchar(40) NOT NULL,
  A10 varchar(40) NOT NULL,
  A11 varchar(40) NOT NULL,
  A12 varchar(40) NOT NULL,
  A13 varchar(40) NOT NULL,
  A14 varchar(40) NOT NULL,
  A15 varchar(40) NOT NULL,
  A16 varchar(40) NOT NULL,
  A17 varchar(40) NOT NULL,
  A18 varchar(40) NOT NULL,
  A19 varchar(40) NOT NULL,
  A20 varchar(40) NOT NULL,
  A21 varchar(40) NOT NULL,
  A22 varchar(40) NOT NULL,
  A23 varchar(40) NOT NULL,
  A24 varchar(40) NOT NULL,
  A25 varchar(40) NOT NULL,
  A26 varchar(40) NOT NULL,
  A27 varchar(40) NOT NULL,
  A28 varchar(40) NOT NULL,
  A29 varchar(40) NOT NULL,
  A30 varchar(40) NOT NULL,
  A31 varchar(40) NOT NULL,
  A32 varchar(40) NOT NULL,
  A33 varchar(40) NOT NULL,
  A34 varchar(40) NOT NULL,
  A35 varchar(40) NOT NULL,
  A36 varchar(40) NOT NULL,
  A37 varchar(40) NOT NULL,
  A38 varchar(40) NOT NULL,
  A39 varchar(40) NOT NULL,
  A40 varchar(40) NOT NULL
);


CREATE TABLE Promociones(
  promocion_cod varchar(10)PRIMARY KEY,
  promocion_descuento DECIMAL(5,2) NOT NULL,
  promocion_descripción varchar(200) NOT NULL
);



ALTER TABLE Asientos
ADD CONSTRAINT FK_asientos_viaje FOREIGN KEY(asientos_viaje_cod) REFERENCES Viajes(viaje_cod) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE Viajes
ADD CONSTRAINT FK_viaje_terminal_salida FOREIGN KEY(viaje_terminal_salida) REFERENCES Terminales(terminal_cod) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT FK_viaje_terminal_llegada FOREIGN KEY(viaje_terminal_salida) REFERENCES Terminales(terminal_cod) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT FK_viaje_promocion FOREIGN KEY(viaje_promocion) REFERENCES Promociones(promocion_cod) ON DELETE SET NULL;

ALTER TABLE Ventas
ADD CONSTRAINT FK_venta_pasajeroPrincipal FOREIGN KEY(venta_pasajeroPrincipal_dni) REFERENCES PasajerosPrincipales(pasajeroPrincipal_dni) ON DELETE NO ACTION,
ADD CONSTRAINT FK_venta_viaje FOREIGN KEY(venta_viaje_cod) REFERENCES Viajes(viaje_cod) ON DELETE NO ACTION;

ALTER TABLE PasajerosPrincipales
ADD CONSTRAINT FK_pasajeroPrincipal_viaje FOREIGN KEY(pasajeroPrincipal_viaje_cod) REFERENCES Viajes(viaje_cod) ON DELETE CASCADE;

ALTER TABLE Acompañantes
ADD CONSTRAINT FK_acompañante_pasajeroPrincipal FOREIGN KEY(acompañante_pasajeroPrincipal) REFERENCES PasajerosPrincipales(pasajeroPrincipal_dni) ON DELETE CASCADE,
ADD CONSTRAINT FK_acompañante_viaje FOREIGN KEY(acompañante_viaje_cod) REFERENCES Viajes(viaje_cod) ON DELETE CASCADE;

insert into Administradores(
admin_dni,
admin_nombre,
admin_apellido_paterno,
admin_apellido_materno,
admin_correo,
admin_contraseña
)VALUES('12345678','Administrador','Apellido1','Apellido2','admin@zbuss.com','12345')

CREATE UNIQUE INDEX idx_correo_unico ON Socios (socio_correo);