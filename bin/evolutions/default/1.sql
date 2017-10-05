# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table conhecimento_java (
  id                            bigserial not null,
  descricao                     varchar(255),
  constraint pk_conhecimento_java primary key (id)
);

create table interessado (
  id                            bigserial not null,
  nome                          varchar(255),
  email                         varchar(255),
  constraint pk_interessado primary key (id)
);


# --- !Downs

drop table if exists conhecimento_java cascade;

drop table if exists interessado cascade;

