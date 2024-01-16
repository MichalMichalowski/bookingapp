--liquibase formatted sql

--changeset alter_table_changelog0-0-2:1

ALTER TABLE Places
ADD COLUMN ownerDataId INT NOT NULL;

ALTER TABLE Places
DROP COLUMN isAvailable;

ALTER TABLE Places
ADD CONSTRAINT FK_ownerData
FOREIGN KEY (ownerDataId)
REFERENCES Owners(id);
