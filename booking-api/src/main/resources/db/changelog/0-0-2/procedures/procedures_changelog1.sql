--liquibase formatted sql

--changeset procedures_changelog0-0-2:1 dbms:mysql splitStatements:false
--rollback DROP PROCEDURE IF EXISTS addAdvert;

CREATE PROCEDURE addAdvert(
	IN userId INT,
    IN placeName VARCHAR(250),
    IN placeDescription TEXT,
    IN cityName VARCHAR(250),
    IN streetName VARCHAR(250),
    IN postalCode VARCHAR(20),
    IN streetNum INT,
    IN apartmentNum INT,
    OUT newAdvertId INT
    )

BEGIN

	DECLARE ownerDataId INT;
	DECLARE newPlaceId INT;
	DECLARE newContactDataId INT;

	DECLARE vCompany VARCHAR(250);
	DECLARE vFirstName VARCHAR(250);
	DECLARE vLastName VARCHAR(250);

	SELECT oi.id INTO ownerDataId FROM UserOwnerInfo oi WHERE oi.userId = userId;

	IF ownerDataId IS NOT NULL THEN

		INSERT INTO ContactData (cityName, streetName, postalCode, streetNum, apartmentNum)
		VALUES (cityName, streetName, postalCode, streetNum, apartmentNum);

		SET newContactDataId = LAST_INSERT_ID();

		INSERT INTO Places (placeName, placeDescription, contactDataId, ownerDataId)
		VALUES (placeName, placeDescription, newContactDataId, ownerDataId);

		SET newPlaceId = LAST_INSERT_ID();

		INSERT INTO Adverts (userId, placeId) VALUES (userId, newPlaceId);

		SET newAdvertId = LAST_INSERT_ID();

	ELSE

		SET newAdvertId = -1;

    END IF;


END;