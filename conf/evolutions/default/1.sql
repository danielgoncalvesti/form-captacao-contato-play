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
  conhecimentojava_id           bigint,
  constraint pk_interessado primary key (id)
);

alter table interessado add constraint fk_interessado_conhecimentojava_id foreign key (conhecimentojava_id) references conhecimento_java (id) on delete restrict on update restrict;
create index ix_interessado_conhecimentojava_id on interessado (conhecimentojava_id);


# --- !Downs

alter table if exists interessado drop constraint if exists fk_interessado_conhecimentojava_id;
drop index if exists ix_interessado_conhecimentojava_id;

drop table if exists conhecimento_java cascade;

drop table if exists interessado cascade;

