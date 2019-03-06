-- Disable all foreign keys before creating the schema
SET FOREIGN_KEY_CHECKS = 0;

-- Remove all existing tables (inbetween runs)
DROP TABLE IF EXISTS model;
DROP TABLE IF EXISTS company;
DROP TABLE IF EXISTS vehicle_category;

-- Schema for the company table/class
CREATE TABLE company (
    company_id VARCHAR(5),
    company_name VARCHAR(20),
    company_origin VARCHAR(20),
    PRIMARY KEY(company_id)
);

-- Schema for the vehicle_category table/class
CREATE TABLE vehicle_category (
    vehicle_category_id VARCHAR(2),
    vehicle_category_name VARCHAR(20),
    PRIMARY KEY(vehicle_category_id)
);

-- Schema for the vehicle model table/class
CREATE TABLE model (
    model_id VARCHAR(5) NOT NULL,
    company_id VARCHAR(5),
    vehicle_category_id VARCHAR(2),
    name VARCHAR(20) NOT NULL UNIQUE,
    price INT,
    year INT,
    quantity INT,
    PRIMARY KEY(model_id)
);

-- Set company_id as a foreign key of the model table
ALTER TABLE model
ADD FOREIGN KEY(company_id)
REFERENCES company(company_id)
ON DELETE SET NULL;

-- Set vehicle_category_id as a foreign key of the model table
ALTER TABLE model
ADD FOREIGN KEY(vehicle_category_id)
REFERENCES vehicle_category(vehicle_category_id)
ON DELETE SET NULL;