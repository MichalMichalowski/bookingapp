--liquibase formatted sql

--changeset views_changelog1:1

CREATE OR REPLACE VIEW Places_V AS

SELECT
	p.id,
	p.placeName,
	p.isAvailable,
	p.placeDescription,
	cd.cityName,
	cd.streetName,
	cd.postalCode,
	cd.streetNum,
	cd.apartmentNum
FROM Places p
LEFT JOIN ContactData cd ON p.contactDataId = cd.id

;
