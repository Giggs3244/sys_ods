create table ciudad (idciudad number(10, 0) not null, codigo varchar(255) not null, nombre varchar(255) not null, iddepartamento number(10, 0), idindicedllohumano number(10, 0), primary key (idciudad));

create table departamento (iddpto number(10, 0) not null, codigo varchar(255) not null, nombre varchar(255) not null, idindicedllohumano number(10, 0), primary key (iddpto));

create table id_gen (GEN_NAME varchar(255) not null, GEN_VAL number(10, 0), primary key (GEN_NAME));

create table indicedllohumano (idindicedllohumano number(10, 0) not null, grado varchar(255) not null, primary key (idindicedllohumano));

create table niveleducacion (ideducacion number(10, 0) not null, titulo varchar(255) not null, primary key (ideducacion));

create table objetivo (idobjetivo number(10, 0) not null, descripcion varchar(255) not null, titulo varchar(255) not null, primary key (idobjetivo));

create table objetivofundamental (idobjetivofundamental number(10, 0) not null, idobjetivo number(10, 0), idpersona number(10, 0), primary key (idobjetivofundamental));

create table percepcion_objetivo (id_percepcion_objetivo number(10, 0) not null, descripcion varchar(255), id_objetivo number(10, 0), id_persona number(10, 0), primary key (id_percepcion_objetivo));

create table persona (idpersona number(10, 0) not null, apellidos varchar(60) not null, fechanacimiento timestamp not null, identificacion varchar(15) not null, nombres varchar(60) not null, sexo varchar(10) not null, idciudad number(10, 0), iddepartamento number(10, 0), ideducacion number(10, 0), idtipoid number(10, 0), primary key (idpersona));

create table tipoidentificacion (idtipoid number(10, 0) not null, texto varchar(255) not null, valor varchar(255) not null, primary key (idtipoid));

alter table ciudad add constraint FKgw4gea23qxv2ao7l6q4elejj6 foreign key (iddepartamento) references departamento;

alter table ciudad add constraint FK7ache279ojqaq35mbx3jlv9em foreign key (idindicedllohumano) references indicedllohumano;

alter table departamento add constraint FK6v7kyc8osq6n131jy0uvpjx86 foreign key (idindicedllohumano) references indicedllohumano;

alter table objetivofundamental add constraint FKrwjh25otmsrivqgpvbqiplwov foreign key (idobjetivo) references objetivo;

alter table objetivofundamental add constraint FKsupy0heqvxmqgxts0bl672usw foreign key (idpersona) references persona;

alter table percepcion_objetivo add constraint FKqlm9eoahv63pijnpx68i6vmah foreign key (id_objetivo) references objetivo;

alter table percepcion_objetivo add constraint FKgt38xh6mucnk8b9950h9x0tbi foreign key (id_persona) references persona;

alter table persona add constraint FKkofew1po2j73yb77t0rnl9cv foreign key (idciudad) references ciudad;

alter table persona add constraint FK8akvmpaph20oxtooigo9cm56f foreign key (iddepartamento) references departamento;

alter table persona add constraint FKiuf5g0nn4ask91bxsph2xux13 foreign key (ideducacion) references niveleducacion;

alter table persona add constraint FKlf9ime068jymo7t1sp50r80f1 foreign key (idtipoid) references tipoidentificacion;