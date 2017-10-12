CREATE OR REPLACE
PACKAGE BODY PKG_PERFIL AS

 PROCEDURE SP_BUSCARXCRITERIOS(
    P_C_CURSOR  OUT C_CURSOR,
    P_NOMBRE    IN  PERFIL.NOMBRE%TYPE
  )AS
  BEGIN
    OPEN
        P_C_CURSOR
    FOR
        SELECT
            ID_PERFIL,
            NOMBRE
        FROM
            PERFIL
        WHERE
                  UPPER(NOMBRE)    like   '%'||UPPER(P_NOMBRE)||'%'
            AND   ESTADO            =   1
        ORDER BY
            ID_PERFIL;
            
  END SP_BUSCARXCRITERIOS;

END PKG_PERFIL;