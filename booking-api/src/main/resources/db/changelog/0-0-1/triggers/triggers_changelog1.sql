--liquibase formatted sql

--changeset triggers_changelog1:1 dbms:mysql splitStatements:false

CREATE TRIGGER check_isAvailable BEFORE INSERT ON Places FOR EACH ROW
IF NEW.isAvailable NOT IN ('Y', 'N') THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Invalid value for isAvailable, only N or Y is allowed';
END IF;