CREATE TABLE PERFIL(
  ID_PERFIL NUMERIC(4)NOT NULL PRIMARY KEY,
  NOMBRE VARCHAR2(180) NOT NULL UNIQUE,
  ESTADO CHAR(1) NOT NULL
);

