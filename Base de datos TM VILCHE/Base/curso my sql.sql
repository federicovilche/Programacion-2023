CREATE DATABASE  IF NOT EXISTS `cursomysql` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `cursomysql`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cursomysql
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `amigos`
--

DROP TABLE IF EXISTS `amigos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `amigos` (
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amigos`
--

LOCK TABLES `amigos` WRITE;
/*!40000 ALTER TABLE `amigos` DISABLE KEYS */;
INSERT INTO `amigos` VALUES ('Juan','Gardoni'),('Diego','Novoa'),('Laura','Lopez'),('Mario','Mendez'),('Marcela','Gonzalez'),('Juan','Novoa'),('Marcelo','Galván'),('María','Guerra'),('Marcela','Nuñez'),('Analía','Ponce'),('Mario','Fernández'),('Juana','Fernández'),('Sol','Toaz'),('Fernando','Voz'),('Fernando','Lopez'),('Marina','Fernández'),('Luján','Tucci'),('Gabriel','Strauss');
/*!40000 ALTER TABLE `amigos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `articulos`
--

DROP TABLE IF EXISTS `articulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articulos` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  `stockMinimo` smallint(6) NOT NULL,
  `stockMaximo` smallint(6) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulos`
--

LOCK TABLES `articulos` WRITE;
/*!40000 ALTER TABLE `articulos` DISABLE KEYS */;
INSERT INTO `articulos` VALUES (1,'alfajorcito',1000,2,10,100),(2,'papitas',1500,20,10,100),(3,'caramelos',100,2000,10,100),(4,'agua',500,50,10,100),(5,'gaseosa',1200,200,10,100),(6,'galletitas de agua',1000,500,10,100),(7,'galletitas dulces',2500,1000,10,100),(8,'tostadas',1500,600,10,100),(9,'dulce de leche',4500,3,10,100),(10,'yerba',25000,100,10,100),(11,'cigarrillos',70000,3000,10,100),(12,'panchos',1200,200,10,100),(13,'chupetín',500,700,10,100),(14,'sube',1000,10000,10,100);
/*!40000 ALTER TABLE `articulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `dni` char(8) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Juan','Gardoni','12555777','Paso 1523'),(2,'Diego','Novoa','22333444','Libertad 555'),(3,'Laura','Lopez','15888999','España 222'),(4,'Mario','Mendez','99888777','Peña 345'),(6,'Juan','Novoa','12345678','Belgrano 2033'),(7,'Marcelo','Galván','11235466','Freire 154'),(8,'María','Guerra','69687563','Soler 41'),(9,'Marcela','Nuñez','22333444','San Martín 455'),(10,'Analía','Ponce','88777666','Salta 789'),(11,'Mario','Fernández','99666111',''),(12,'Juana','Fernández','98888111',NULL),(13,'Sol','Toaz','89562314',''),(14,'Fernando','Voz','89562315',NULL),(15,'Fernando','Lopez','89562315',NULL),(16,'Juan Pablo','Guerra','77777799',NULL);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes_2`
--

DROP TABLE IF EXISTS `clientes_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes_2` (
  `codigo` int(11) NOT NULL DEFAULT 0,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `dni` char(8) NOT NULL,
  `direccion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes_2`
--

LOCK TABLES `clientes_2` WRITE;
/*!40000 ALTER TABLE `clientes_2` DISABLE KEYS */;
INSERT INTO `clientes_2` VALUES (1,'Juan','Gardoni','12555777','Paso 1523'),(2,'Diego','Novoa','22333444','Libertad 555'),(3,'Laura','Lopez','15888999','España 222'),(4,'Mario','Mendez','99888777','Peña 345'),(5,'Marcela','Gonzalez','56568568','Lima 2042'),(6,'Juan','Novoa','12345678','Belgrano 2033'),(7,'Marcelo','Galván','11235466','Freire 154'),(8,'María','Guerra','69687563','Soler 41'),(9,'Marcela','Nuñez','22333444','San Martín 455'),(10,'Analía','Ponce','88777666','Salta 789'),(11,'Mario','Fernández','99666111',''),(12,'Juana','Fernández','98888111',NULL),(13,'Sol','Toaz','89562314',''),(14,'Fernando','Voz','89562315',NULL),(15,'Fernando','Lopez','89562315',NULL);
/*!40000 ALTER TABLE `clientes_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturas` (
  `letra` enum('A','B','C') NOT NULL,
  `numero` int(10) unsigned NOT NULL,
  `fecha` date NOT NULL,
  `monto` double NOT NULL,
  PRIMARY KEY (`letra`,`numero`),
  CONSTRAINT `CONSTRAINT_1` CHECK (`letra` in ('A','B','C'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` VALUES ('A',1,'2023-10-31',12500),('A',2,'2023-10-31',12500),('B',1,'2023-10-31',12500),('B',2,'2023-01-19',1500),('B',3,'2023-01-19',1500),('C',1,'2023-09-04',50000);
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nombres`
--

DROP TABLE IF EXISTS `nombres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nombres` (
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nombres`
--

LOCK TABLES `nombres` WRITE;
/*!40000 ALTER TABLE `nombres` DISABLE KEYS */;
INSERT INTO `nombres` VALUES ('Juan'),('Diego'),('Laura'),('Mario'),('Marcela'),('Marcelo'),('María'),('Analía'),('Juana'),('Sol'),('Fernando');
/*!40000 ALTER TABLE `nombres` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-31 12:42:05
