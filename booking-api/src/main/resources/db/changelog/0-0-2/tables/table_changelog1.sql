--liquibase formatted sql

--changeset table_changelog0-0-2:1

CREATE TABLE IF NOT EXISTS Adverts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(250) NOT NULL,
    placeId VARCHAR(250) NOT NULL,
    opinionId INT
);

CREATE TABLE IF NOT EXISTS UserOwnerInfo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    company VARCHAR(250),
    firstName VARCHAR(250) NOT NULL,
    lastName VARCHAR(250) NOT NULL
);

CREATE TABLE IF NOT EXISTS Opinions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    advertId INT,
    rating INT NOT NULL,
    comment TEXT,
    FOREIGN KEY (advertId) REFERENCES Adverts(id)
);
