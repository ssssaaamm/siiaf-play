insert into tipo_usuario (codigo,nombre,descripcion) values (1,'Administrador','crea usuarios');
insert into tipo_usuario (codigo,nombre,descripcion) values (2,'Gerente','crea usuarios');
insert into tipo_usuario (codigo,nombre,descripcion) values (3,'Auxiliar Logistica','crea usuarios');

insert into usuario (nombre,username,password,tipo_id) values ('Miguel Alejandro','administrador','administrador',1);
insert into usuario (nombre,username,password,tipo_id) values ('Cristian Eliseo','gerente','gerente',2);
insert into usuario (nombre,username,password,tipo_id) values ('Manuel Garcia','logistica','logistica',3);
insert into usuario (nombre,username,password,tipo_id) values ('Carlos Evaristo','Evaristo','administrador',1);
insert into usuario (nombre,username,password,tipo_id) values ('Samuel Alvarez','gerente','Samuel',2);
insert into usuario (nombre,username,password,tipo_id) values ('Jonatan Garcia','Jonatan','logistica',3);

insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('123','Samuel Garcia','45689698-0','9811-121291-011-9','9811-121291-011-9',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('134','Jon Soul','09354215-6','9811-121291-000-9','9811-121291-000-9',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('156','Pedro Emanuel','09805234-7','9527-280975-000-9','9527-280975-000-9',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('167','Raul Soul','85347256-9','0765-090988-000-9','0765-090988-000-9',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('178','Moises Soul','17462486-9','0989-061090-079-8','0989-061090-079-8',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('126','Pedro Soul','09845234-7','9527-240765-000-9','9527-240765-000-9',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('137','Carlos Soul','85347297-9','0765-081073-000-9','0765-081073-000-9',1);
insert into motorista (codigo,nombre,dui,nit,licencia,activo) values ('148','Moises Torres','98532476-9','0989-090379-079-8','0989-090379-079-8',1);

insert into cabezal (placa,descripcion,activo) values ('C 324-098','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('C 984-953','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('C 094-23','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('C 657-456','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('C 985-342','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('C 034-233','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('C 007-446','Es un cabezal',1);
insert into cabezal (placa,descripcion,activo) values ('C 905-362','Es un cabezal',1);


insert into cliente (nombre,nit,descripcion,activo) values ('Pollo Indio','9812-121291-080-9','transporte de pollos',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Cocacola','6531-211261-000-9','transporte de sodas',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Bimbo','3456-121291-000-9','transporte de pan',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Seabord','7611-121134-000-9','transporte de todo',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Selectos','9761-300654-000-9','transporte de comida',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Agua cristal','9819-121291-000-9','transporte de agua',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Rico Pollo','9861-121291-080-9','transporte de pollos',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Salva cola','6539-211261-000-9','transporte de sodas',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Lido','3456-080934-000-9','transporte de pan',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Despensa','7611-040187-000-9','transporte de todo',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Wallmark','9765-300654-000-9','transporte de comida',1);
insert into cliente (nombre,nit,descripcion,activo) values ('Fud','9811-120756-000-9','transporte de embutidos',1);


INSERT INTO politica_cobro (id, actual, duracion_periodo, tarifa_cobro_km_sen, tarifa_cobro_km_car, tarifa_cobro_km_vac, tarifa_sobrepeso, tarifa_cruce_frontera) VALUES (NULL, 1, 30, 0.1, 0.2, 0.3, 0.5, 0.6);


INSERT INTO politica_pago (id, actual, duracion_periodo, salario_minimo, porcentaje_isss, porcentaje_afp, tarifa_pago_km_loc, tarifa_pago_km_int, porcentaje_sobrepeso, tarifa_viatico_vv, tarifa_viatico_vc, tarifa_viatico_cc) VALUES (NULL, 1, 30, 200, 0.0625, 0.0775, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7);

INSERT INTO periodo_planilla (id, fecha_inicio, fecha_fin, actual, politica_pago_id) VALUES (NULL, '2016-11-21 00:00:00.000000', '2016-11-30 00:00:00.000000', 0, 1);

INSERT INTO periodo_facturacion (id, fecha_inicio, fecha_fin, actual, politica_cobro_id) VALUES (NULL, '2016-11-13 00:00:00.000000', '2016-11-20 00:00:00.000000', 0, 1);

INSERT INTO viaje (id, tipo, fecha_registro, total_km, viaticos, tipo_viatico, periodo_facturacion_id, periodo_planilla_id, motorista_id, cabezal_id, cliente_id) VALUES (NULL, 1, '2016-11-13 00:00:00.000000', 100, 0, 1, 1, 3, 5, 6, 11);


