# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table interessado (
  id                            bigint not null,
  nome                          varchar(255),
  email                         varchar(255),
  conhecimento_java             integer,
  constraint pk_interessado primary key (id)
);
create sequence interessado_seq;


# --- !Downs

drop table if exists interessado;
drop sequence if exists interessado_seq;

