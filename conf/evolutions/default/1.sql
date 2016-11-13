# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table boleta (
  id                            bigint auto_increment not null,
  codigo                        varchar(255),
  destino                       varchar(255),
  km_asignados                  double,
  tipo_carga                    integer,
  sobrepeso                     tinyint(1) default 0,
  cruce_frontera                tinyint(1) default 0,
  sentido                       integer,
  viaje_id                      bigint,
  constraint pk_boleta primary key (id)
);

create table cabezal (
  id                            bigint auto_increment not null,
  placa                         varchar(255),
  descripcion                   varchar(255),
  activo                        tinyint(1) default 0,
  constraint pk_cabezal primary key (id)
);

create table cliente (
  id                            bigint auto_increment not null,
  nombre                        varchar(255),
  nit                           varchar(255),
  descripcion                   varchar(255),
  activo                        tinyint(1) default 0,
  constraint pk_cliente primary key (id)
);

create table detalle_cobro (
  id                            bigint auto_increment not null,
  total_viajes_locales          integer,
  total_km_sen_locales          double,
  total_km_car_locales          double,
  total_km_vac_locales          double,
  total_km_locales              double,
  total_mont_sen_locales        double,
  total_mont_car_locales        double,
  total_mont_vac_locales        double,
  total_mont_locales            double,
  total_viajes_internacionales  integer,
  total_km_sen_internacionales  double,
  total_km_car_internacionales  double,
  total_km_vac_internacionales  double,
  total_km_internacionales      double,
  total_mont_sen_internacionales double,
  total_mont_car_internacionales double,
  total_mont_vac_internacionales double,
  total_mont_internacionales    double,
  total_cantidad_agregados      integer,
  total_mont_agregados          double,
  total_cobro_periodo           double,
  periodo_facturacion_id        bigint,
  cliente_id                    bigint,
  constraint pk_detalle_cobro primary key (id)
);

create table detalle_pago (
  id                            bigint auto_increment not null,
  total_viajes_locales          integer,
  total_km_locales              double,
  total_monto_locales           double,
  total_viajes_internacionales  integer,
  total_km_internacionales      double,
  total_monto_internacionales   double,
  total_cantidad_agregados      integer,
  total_monto_agregados         double,
  total_cantidad_viaticos_vv    integer,
  total_cantidad_viaticos_vc    integer,
  total_cantidad_viaticos_cc    integer,
  total_cantidad_viaticos       integer,
  total_monto_viaticos_vv       double,
  total_monto_viaticos_vc       double,
  total_monto_viaticos_cc       double,
  total_monto_viaticos          double,
  salario_ganado                double,
  delta_salario_minimo          double,
  bono                          double,
  total_pago_periodo            double,
  isss                          double,
  afp                           double,
  motorista_id                  bigint,
  periodo_planilla_id           bigint,
  constraint pk_detalle_pago primary key (id)
);

create table motorista (
  id                            bigint auto_increment not null,
  codigo                        varchar(255),
  nombre                        varchar(255),
  dui                           varchar(255),
  nit                           varchar(255),
  licencia                      varchar(255),
  activo                        tinyint(1) default 0,
  constraint pk_motorista primary key (id)
);

create table periodo_facturacion (
  id                            bigint auto_increment not null,
  fecha_inicio                  datetime(6),
  fecha_fin                     datetime(6),
  actual                        tinyint(1) default 0,
  politica_cobro_id             bigint,
  constraint pk_periodo_facturacion primary key (id)
);

create table periodo_planilla (
  id                            bigint auto_increment not null,
  fecha_inicio                  datetime(6),
  fecha_fin                     datetime(6),
  actual                        tinyint(1) default 0,
  politica_pago_id              bigint,
  constraint pk_periodo_planilla primary key (id)
);

create table politica_cobro (
  id                            bigint auto_increment not null,
  actual                        tinyint(1) default 0,
  duracion_periodo              integer,
  tarifa_cobro_km_sen           double,
  tarifa_cobro_km_car           double,
  tarifa_cobro_km_vac           double,
  tarifa_sobrepeso              double,
  tarifa_cruce_frontera         double,
  constraint pk_politica_cobro primary key (id)
);

create table politica_pago (
  id                            bigint auto_increment not null,
  actual                        tinyint(1) default 0,
  duracion_periodo              integer,
  salario_minimo                double,
  porcentaje_isss               double,
  porcentaje_afp                double,
  tarifa_pago_km_loc            double,
  tarifa_pago_km_int            double,
  porcentaje_sobrepeso          double,
  tarifa_viatico_vv             double,
  tarifa_viatico_vc             double,
  tarifa_viatico_cc             double,
  constraint pk_politica_pago primary key (id)
);

create table tipo_usuario (
  id                            bigint auto_increment not null,
  codigo                        integer,
  nombre                        varchar(255),
  descripcion                   varchar(255),
  constraint pk_tipo_usuario primary key (id)
);

create table usuario (
  id                            bigint auto_increment not null,
  nombre                        varchar(255),
  username                      varchar(255),
  password                      varchar(255),
  tipo_id                       bigint,
  constraint pk_usuario primary key (id)
);

create table viaje (
  id                            bigint auto_increment not null,
  tipo                          integer,
  fecha_registro                datetime(6),
  total_km                      double,
  viaticos                      tinyint(1) default 0,
  tipo_viatico                  integer,
  periodo_facturacion_id        bigint,
  periodo_planilla_id           bigint,
  motorista_id                  bigint,
  cabezal_id                    bigint,
  cliente_id                    bigint,
  constraint pk_viaje primary key (id)
);

alter table boleta add constraint fk_boleta_viaje_id foreign key (viaje_id) references viaje (id) on delete restrict on update restrict;
create index ix_boleta_viaje_id on boleta (viaje_id);

alter table detalle_cobro add constraint fk_detalle_cobro_periodo_facturacion_id foreign key (periodo_facturacion_id) references periodo_facturacion (id) on delete restrict on update restrict;
create index ix_detalle_cobro_periodo_facturacion_id on detalle_cobro (periodo_facturacion_id);

alter table detalle_cobro add constraint fk_detalle_cobro_cliente_id foreign key (cliente_id) references cliente (id) on delete restrict on update restrict;
create index ix_detalle_cobro_cliente_id on detalle_cobro (cliente_id);

alter table detalle_pago add constraint fk_detalle_pago_motorista_id foreign key (motorista_id) references motorista (id) on delete restrict on update restrict;
create index ix_detalle_pago_motorista_id on detalle_pago (motorista_id);

alter table detalle_pago add constraint fk_detalle_pago_periodo_planilla_id foreign key (periodo_planilla_id) references periodo_planilla (id) on delete restrict on update restrict;
create index ix_detalle_pago_periodo_planilla_id on detalle_pago (periodo_planilla_id);

alter table periodo_facturacion add constraint fk_periodo_facturacion_politica_cobro_id foreign key (politica_cobro_id) references politica_cobro (id) on delete restrict on update restrict;
create index ix_periodo_facturacion_politica_cobro_id on periodo_facturacion (politica_cobro_id);

alter table periodo_planilla add constraint fk_periodo_planilla_politica_pago_id foreign key (politica_pago_id) references politica_pago (id) on delete restrict on update restrict;
create index ix_periodo_planilla_politica_pago_id on periodo_planilla (politica_pago_id);

alter table usuario add constraint fk_usuario_tipo_id foreign key (tipo_id) references tipo_usuario (id) on delete restrict on update restrict;
create index ix_usuario_tipo_id on usuario (tipo_id);

alter table viaje add constraint fk_viaje_periodo_facturacion_id foreign key (periodo_facturacion_id) references periodo_facturacion (id) on delete restrict on update restrict;
create index ix_viaje_periodo_facturacion_id on viaje (periodo_facturacion_id);

alter table viaje add constraint fk_viaje_periodo_planilla_id foreign key (periodo_planilla_id) references periodo_planilla (id) on delete restrict on update restrict;
create index ix_viaje_periodo_planilla_id on viaje (periodo_planilla_id);

alter table viaje add constraint fk_viaje_motorista_id foreign key (motorista_id) references motorista (id) on delete restrict on update restrict;
create index ix_viaje_motorista_id on viaje (motorista_id);

alter table viaje add constraint fk_viaje_cabezal_id foreign key (cabezal_id) references cabezal (id) on delete restrict on update restrict;
create index ix_viaje_cabezal_id on viaje (cabezal_id);

alter table viaje add constraint fk_viaje_cliente_id foreign key (cliente_id) references cliente (id) on delete restrict on update restrict;
create index ix_viaje_cliente_id on viaje (cliente_id);


# --- !Downs

alter table boleta drop foreign key fk_boleta_viaje_id;
drop index ix_boleta_viaje_id on boleta;

alter table detalle_cobro drop foreign key fk_detalle_cobro_periodo_facturacion_id;
drop index ix_detalle_cobro_periodo_facturacion_id on detalle_cobro;

alter table detalle_cobro drop foreign key fk_detalle_cobro_cliente_id;
drop index ix_detalle_cobro_cliente_id on detalle_cobro;

alter table detalle_pago drop foreign key fk_detalle_pago_motorista_id;
drop index ix_detalle_pago_motorista_id on detalle_pago;

alter table detalle_pago drop foreign key fk_detalle_pago_periodo_planilla_id;
drop index ix_detalle_pago_periodo_planilla_id on detalle_pago;

alter table periodo_facturacion drop foreign key fk_periodo_facturacion_politica_cobro_id;
drop index ix_periodo_facturacion_politica_cobro_id on periodo_facturacion;

alter table periodo_planilla drop foreign key fk_periodo_planilla_politica_pago_id;
drop index ix_periodo_planilla_politica_pago_id on periodo_planilla;

alter table usuario drop foreign key fk_usuario_tipo_id;
drop index ix_usuario_tipo_id on usuario;

alter table viaje drop foreign key fk_viaje_periodo_facturacion_id;
drop index ix_viaje_periodo_facturacion_id on viaje;

alter table viaje drop foreign key fk_viaje_periodo_planilla_id;
drop index ix_viaje_periodo_planilla_id on viaje;

alter table viaje drop foreign key fk_viaje_motorista_id;
drop index ix_viaje_motorista_id on viaje;

alter table viaje drop foreign key fk_viaje_cabezal_id;
drop index ix_viaje_cabezal_id on viaje;

alter table viaje drop foreign key fk_viaje_cliente_id;
drop index ix_viaje_cliente_id on viaje;

drop table if exists boleta;

drop table if exists cabezal;

drop table if exists cliente;

drop table if exists detalle_cobro;

drop table if exists detalle_pago;

drop table if exists motorista;

drop table if exists periodo_facturacion;

drop table if exists periodo_planilla;

drop table if exists politica_cobro;

drop table if exists politica_pago;

drop table if exists tipo_usuario;

drop table if exists usuario;

drop table if exists viaje;

