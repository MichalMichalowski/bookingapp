--liquibase formatted sql

--changeset alter_table_changelog1:1

ALTER TABLE Places
ADD CONSTRAINT FK_contactData
FOREIGN KEY (contactDataId)
REFERENCES ContactData(id);
