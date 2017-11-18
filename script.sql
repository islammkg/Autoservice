CREATE TABLE `Client` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`first_name` varchar(255) NOT NULL,
	`last_name` varchar(255) NOT NULL,
	`address` varchar(255) NOT NULL,
	`phone_number` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Auto` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`client_id` INT NOT NULL,
	`model` varchar(255) NOT NULL,
	`year` varchar(255) NOT NULL,
	`capacity` varchar(255) NOT NULL,
	`gov_num` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Address` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`city` varchar(255) NOT NULL,
	`street` varchar(255) NOT NULL,
	`building_num` varchar(255) NOT NULL,
	`postcode` INT NOT NULL,
	`phone_num` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Service` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`address_id` INT(255) NOT NULL,
	`client_id` INT NOT NULL,
	`auto_id` INT NOT NULL,
	`employer_id` INT NOT NULL,
	`repair_type` varchar(255) NOT NULL,
	`price` INT(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Employer` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`first_name` varchar(255) NOT NULL,
	`last_name` varchar(255) NOT NULL,
	`phone_number` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Auto` ADD CONSTRAINT `Auto_fk0` FOREIGN KEY (`client_id`) REFERENCES `Client`(`id`);

ALTER TABLE `Service` ADD CONSTRAINT `Service_fk0` FOREIGN KEY (`address_id`) REFERENCES `Address`(`id`);

ALTER TABLE `Service` ADD CONSTRAINT `Service_fk1` FOREIGN KEY (`client_id`) REFERENCES `Client`(`id`);

ALTER TABLE `Service` ADD CONSTRAINT `Service_fk2` FOREIGN KEY (`auto_id`) REFERENCES `Auto`(`id`);

ALTER TABLE `Service` ADD CONSTRAINT `Service_fk3` FOREIGN KEY (`employer_id`) REFERENCES `Employer`(`id`);

