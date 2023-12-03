--liquibase formatted sql

--changeset table_changelog1:1

CREATE TABLE IF NOT EXISTS Places (
    id INT AUTO_INCREMENT PRIMARY KEY,
    placeName VARCHAR(250) NOT NULL,
    isAvailable VARCHAR(1) NOT NULL,
    placeDescription TEXT,
    contactDataId INT NOT NULL
);

CREATE TABLE IF NOT EXISTS ContactData (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cityName VARCHAR(250) NOT NULL,
    streetName VARCHAR(250) NOT NULL,
    postalCode VARCHAR(20) NOT NULL,
    streetNum INT NOT NULL,
    apartmentNum INT
);
