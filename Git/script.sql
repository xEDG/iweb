CREATE DATABASE  IF NOT EXISTS `iweb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `iweb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: iweb
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `entrega`
--

DROP TABLE IF EXISTS `entrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrega` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anotacion` varchar(255) DEFAULT NULL,
  `fecha_entrega` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrega`
--

LOCK TABLES `entrega` WRITE;
/*!40000 ALTER TABLE `entrega` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `has_entrega`
--

DROP TABLE IF EXISTS `has_entrega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `has_entrega` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idSerie` int(11) NOT NULL,
  `idEntrega` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_has_entrega_serie_idx` (`idSerie`),
  KEY `FK_has_entrega_entrega_idx` (`idEntrega`),
  CONSTRAINT `FK_has_entrega_entrega` FOREIGN KEY (`idEntrega`) REFERENCES `entrega` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_has_entrega_serie` FOREIGN KEY (`idSerie`) REFERENCES `serie` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `has_entrega`
--

LOCK TABLES `has_entrega` WRITE;
/*!40000 ALTER TABLE `has_entrega` DISABLE KEYS */;
/*!40000 ALTER TABLE `has_entrega` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serie`
--

DROP TABLE IF EXISTS `serie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `serie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) NOT NULL,
  `categoria` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `valoracion` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serie`
--

LOCK TABLES `serie` WRITE;
/*!40000 ALTER TABLE `serie` DISABLE KEYS */;
/*!40000 ALTER TABLE `serie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


INSERT INTO `iweb`.`serie` (`id`, `titulo`, `categoria`, `descripcion`, `valoracion`) VALUES ('2', 'Hulk', 'Acción', '¿Será capaz Hulk de hacer frente a Loki?', '7');
INSERT INTO `iweb`.`serie` (`id`, `titulo`, `categoria`, `descripcion`, `valoracion`) VALUES ('3', 'TinTin', 'Aventuras', 'TinTin se adentrará en la base espacial de la URSS', '7');
INSERT INTO `iweb`.`serie` (`id`, `titulo`, `categoria`, `descripcion`, `valoracion`) VALUES ('4', 'Batman', 'Acción', 'El Caballero Oscuro ha vuelto', '10');
INSERT INTO `iweb`.`serie` (`id`, `titulo`, `categoria`, `descripcion`, `valoracion`) VALUES ('5', 'Oliver y Benji', 'Deportes', '¿Meterán gol por fin?', '3');

INSERT INTO `iweb`.`serie` (`id`, `titulo`, `categoria`, `descripcion`, `valoracion`) VALUES ('1', 'Spiderman', 'Acción', 'El hombre que araña', '7');

INSERT INTO `iweb`.`serie` (`id`, `titulo`, `categoria`, `descripcion`, `valoracion`) VALUES ('6', 'Deadpool', 'Antihéroes', 'El antihéroe más enfermo de todos', '8');
INSERT INTO `iweb`.`serie` (`id`, `titulo`, `categoria`, `descripcion`, `valoracion`) VALUES ('7', 'Mortadelo y Filemón', 'Comedia', 'La T.I.A está corrupta', '5');




INSERT INTO `iweb`.`entrega` (`id`, `anotacion`, `fecha_entrega`) VALUES ('1', 'Venom', '1996-10-10');
INSERT INTO `iweb`.`entrega` (`id`, `anotacion`, `fecha_entrega`) VALUES ('2', 'La venganza de Milú', '2005-08-05');
INSERT INTO `iweb`.`entrega` (`id`, `anotacion`, `fecha_entrega`) VALUES ('3', 'Los Vengadores', '2018-11-03');
INSERT INTO `iweb`.`entrega` (`id`, `anotacion`, `fecha_entrega`) VALUES ('4', 'Robin el torpe', '2009-07-12');

INSERT INTO `iweb`.`entrega` (`id`, `anotacion`, `fecha_entrega`) VALUES ('5', 'Sketch Mortadelo ', '2018-11-23');
INSERT INTO `iweb`.`entrega` (`id`, `anotacion`, `fecha_entrega`) VALUES ('6', 'Mortadelo Disfrazado', '2017-04-01');


INSERT INTO `iweb`.`has_entrega` (`id`, `idSerie`, `idEntrega`) VALUES ('1', '1', '1');
INSERT INTO `iweb`.`has_entrega` (`id`, `idSerie`, `idEntrega`) VALUES ('2', '3', '2');
INSERT INTO `iweb`.`has_entrega` (`id`, `idSerie`, `idEntrega`) VALUES ('3', '2', '3');
INSERT INTO `iweb`.`has_entrega` (`id`, `idSerie`, `idEntrega`) VALUES ('4', '4', '4');

INSERT INTO `iweb`.`has_entrega` (`id`, `idSerie`, `idEntrega`) VALUES ('5', '7', '5');
INSERT INTO `iweb`.`has_entrega` (`id`, `idSerie`, `idEntrega`) VALUES ('6', '7', '6');

-- Dump completed on 2018-11-13 19:51:46


