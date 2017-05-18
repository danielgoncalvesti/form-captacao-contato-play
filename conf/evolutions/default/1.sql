# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table conhecimento_java (
  id                            integer auto_increment not null,
  descricao                     varchar(255),
  constraint pk_conhecimento_java primary key (id)
);

create table interessado (
  id                            bigint auto_increment not null,
  nome                          varchar(255),
  email                         varchar(255),
  conhecimento_java_id          integer,
  constraint pk_interessado primary key (id)
);

alter table interessado add constraint fk_interessado_conhecimento_java_id foreign key (conhecimento_java_id) references conhecimento_java (id) on delete restrict on update restrict;
create index ix_interessado_conhecimento_java_id on interessado (conhecimento_java_id);


# --- !Downs

alter table interessado drop constraint if exists fk_interessado_conhecimento_java_id;
drop index if exists ix_interessado_conhecimento_java_id;

drop table if exists conhecimento_java;

drop table if exists interessado;

