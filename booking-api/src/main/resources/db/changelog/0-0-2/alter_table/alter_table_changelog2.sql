--liquibase formatted sql

--changeset alter_table_changelog0-0-2:2

ALTER TABLE Adverts
DROP COLUMN opinionId;