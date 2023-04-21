create table if not exists animal (animalid integer not null, animaldescripcion varchar(100), primary key (animalid));
CREATE TABLE if not exists `doctor` (
                          `doctorid` int NOT NULL AUTO_INCREMENT,
                          `doctornombre` varchar(45) DEFAULT NULL,
                          `doctorapepaterno` varchar(45) DEFAULT NULL,
                          `doctorapematerno` varchar(45) DEFAULT NULL,
                          `doctordireccion` varchar(45) DEFAULT NULL,
                          `doctortelefono` varchar(45) DEFAULT NULL,
                          `doctoremail` varchar(45) DEFAULT NULL,
                          PRIMARY KEY (`doctorid`)
);
CREATE TABLE if not exists `dueno` (
                         `duenoid` int NOT NULL AUTO_INCREMENT,
                         `duenonombre` varchar(45) DEFAULT NULL,
                         `duenoapepaterno` varchar(45) DEFAULT NULL,
                         `duenoapematerno` varchar(45) DEFAULT NULL,
                         `duenodireccion` varchar(45) DEFAULT NULL,
                         `duenotelefono` varchar(45) DEFAULT NULL,
                         `duenoemail` varchar(45) DEFAULT NULL,
                         PRIMARY KEY (`duenoid`)
);
CREATE TABLE if not exists `mascota` (
                           `mascotaid` int NOT NULL AUTO_INCREMENT,
                           `mascotanombre` varchar(45) DEFAULT NULL,
                           `mascotaanios` int DEFAULT NULL,
                           `animalid` int NOT NULL,
                           `mascotaraza` varchar(45) DEFAULT NULL,
                           `duenoid` int DEFAULT NULL,
                           PRIMARY KEY (`mascotaid`),
                           KEY `mascota-animal_idx` (`animalid`),
                           KEY `mascota-dueno_idx` (`duenoid`),
                           CONSTRAINT `mascota-animal` FOREIGN KEY (`animalid`) REFERENCES `animal` (`animalid`),
                           CONSTRAINT `mascota-dueno` FOREIGN KEY (`duenoid`) REFERENCES `dueno` (`duenoid`)
);
CREATE TABLE if not exists `historia` (
                            `historiaid` int NOT NULL AUTO_INCREMENT,
                            `duenoid` int NOT NULL,
                            `mascotaid` int NOT NULL,
                            `historiadesc` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`historiaid`),
                            KEY `historia-duenio_idx` (`duenoid`),
                            KEY `historia-mascota_idx` (`mascotaid`),
                            CONSTRAINT `historia-duenio` FOREIGN KEY (`duenoid`) REFERENCES `dueno` (`duenoid`),
                            CONSTRAINT `historia-mascota` FOREIGN KEY (`mascotaid`) REFERENCES `mascota` (`mascotaid`)
);
CREATE TABLE if not exists `consulta` (
                            `consultaid` int NOT NULL AUTO_INCREMENT,
                            `historiaid` int NOT NULL,
                            `doctorid` int NOT NULL,
                            `consultadesc` varchar(45) DEFAULT NULL,
                            `consultafa` datetime DEFAULT NULL,
                            PRIMARY KEY (`consultaid`),
                            KEY `consulta-historia_idx` (`historiaid`),
                            KEY `consulta-doctor_idx` (`doctorid`),
                            CONSTRAINT `consulta-doctor` FOREIGN KEY (`doctorid`) REFERENCES `doctor` (`doctorid`),
                            CONSTRAINT `consulta-historia` FOREIGN KEY (`historiaid`) REFERENCES `historia` (`historiaid`)
);