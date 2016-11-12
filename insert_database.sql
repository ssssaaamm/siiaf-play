
insert into tipo_usuario (codigo,nombre,descripcion) values (1,'Administrador','crea usuarios');
insert into tipo_usuario (codigo,nombre,descripcion) values (2,'Gerente','crea usuarios');
insert into tipo_usuario (codigo,nombre,descripcion) values (3,'Auxiliar Logistica','crea usuarios');


insert into usuario (nombre,username,password,tipo_id) values ('Anonimo','administrador','administrador',1);
insert into usuario (nombre,username,password,tipo_id) values ('Anonimo','gerente','gerente',2);
insert into usuario (nombre,username,password,tipo_id) values ('Anonimo','logistica','logistica',3);



insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('123','Samuel Soul','456896','659879','04899',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('123','Jon Soul','456896','659879','04899',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('123','Pedro Soul','456896','659879','04899',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('123','Raul Soul','456896','659879','04899',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('123','Moises Soul','456896','659879','04899',1);



insert into cabezal (placa,descripcion,activo) values ('00048','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('9876','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('0987928','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('987959','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('111111','Es un cabezal',1);




insert into cliente (nombre,nit,descripcion,activo) values ('Pollo Indio','135165498','transporte de pollos',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Cocacola','135165498','transporte de sodas',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Bimbo','135165498','transporte de pan',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Seabord','135165498','transporte de todo',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Selectos','135165498','transporte de comida',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Agua cristal','135165498','transporte de agua',1);



