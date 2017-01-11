CREATE SCHEMA "USER";

CREATE TABLE "USER"."Cliente" (
	id INTEGER,
	nombre VARCHAR(50)
);

insert into "USER"."Cliente" (id, nombre) values (1, 'Victor');