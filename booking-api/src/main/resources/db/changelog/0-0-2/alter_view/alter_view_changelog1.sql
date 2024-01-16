--liquibase formatted sql

--changeset alter_view_changelog0-0-2:1

ALTER VIEW Places_V AS

SELECT
	p.id,
	p.placeName,
	p.placeDescription,
	o.firstName,
	o.lastName,
	o.company,
	cd.cityName,
	cd.streetName,
	cd.postalCode,
	cd.streetNum,
	cd.apartmentNum
FROM Places p
LEFT JOIN ContactData cd ON p.contactDataId = cd.id
LEFT JOIN UserOwnerInfo o ON p.ownerDataId = o.id

;
