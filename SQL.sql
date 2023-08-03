-- Role: order_read
-- DROP ROLE IF EXISTS order_read;

CREATE ROLE order_read WITH
  LOGIN
  NOSUPERUSER
  INHERIT
  NOCREATEDB
  NOCREATEROLE
  NOREPLICATION
  ENCRYPTED PASSWORD 'SCRAM-SHA-256$4096:NEtO1y3OqiNoaTMcXvytYg==$Vev9hi1QSm7h9wEU2/C1DF75DXMlXlBYDmuzTrJaFsY=:wjAcT1Ai7NPvpjTAqAGnW31iaOu4ga/40uZMxSpDUVY=';