/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     12/1/2018 09:24:42                           */
/*==============================================================*/


drop table if exists CANDIDATO;

drop table if exists VOTACION;

drop table if exists VOTANTE;

/*==============================================================*/
/* Table: CANDIDATO                                             */
/*==============================================================*/
create table CANDIDATO
(
   ID_CANDIDATO         int not null,
   NOMBRE_CANDIDATO     varchar(200) not null,
   APELLIDO_CANDIDATO   varchar(200) not null,
   primary key (ID_CANDIDATO)
);

/*==============================================================*/
/* Table: VOTACION                                              */
/*==============================================================*/
create table VOTACION
(
   ID_VOTACION          int not null,
   ID_CANDIDATO         int not null,
   ID_VOTANTE           int not null,
   FECHA_VOTACION       timestamp not null,
   primary key (ID_VOTACION)
);

/*==============================================================*/
/* Table: VOTANTE                                               */
/*==============================================================*/
create table VOTANTE
(
   ID_VOTANTE           int not null,
   DOC_VOTANTE          int not null,
   NOMBRE_VOTANTE       varchar(200) not null,
   primary key (ID_VOTANTE)
);

alter table VOTACION add constraint FK_RELATIONSHIP_1 foreign key (ID_CANDIDATO)
      references CANDIDATO (ID_CANDIDATO) on delete restrict on update restrict;

alter table VOTACION add constraint FK_RELATIONSHIP_2 foreign key (ID_VOTANTE)
      references VOTANTE (ID_VOTANTE) on delete restrict on update restrict;

