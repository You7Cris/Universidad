-- MySQL dump 10.16  Distrib 10.1.31-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: carrito_compras
-- ------------------------------------------------------
-- Server version	10.1.31-MariaDB

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
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `id_producto` int(10) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(60) COLLATE utf16_bin NOT NULL,
  `descripcion` varchar(120) COLLATE utf16_bin NOT NULL,
  `foto` varchar(150) COLLATE utf16_bin NOT NULL,
  `cantidad` int(10) DEFAULT '0',
  `valor` int(10) NOT NULL,
  PRIMARY KEY (`id_producto`),
  UNIQUE KEY `nombre` (`nombre_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf16 COLLATE=utf16_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'manzana','manzana roja jugoza','../Public/imagenes/Productos/18_10_20_00_19_26_manzana.jpg',50,2000),(2,'Pera','pera jugoza','../Public/imagenes/Productos/18_10_19_22_36_03_pera.jpg',15,2000),(3,'cereza','cerezas rojas ','../Public/imagenes/Productos/18_10_22_20_02_29_cerezas.png',20,2500),(4,'PiÃ±a','PiÃ±a de buena calidad','../Public/imagenes/Productos/18_10_22_20_04_11_piÃ±a.jpg',15,1500),(5,'mango','mango delicioso','../Public/imagenes/Productos/18_10_23_01_23_12_mango.jpg',25,2500),(6,'banano','banano amarillo','../Public/imagenes/Productos/18_10_23_01_24_14_banano.jpg',20,1200);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usuario` int(10) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(60) COLLATE utf16_bin NOT NULL,
  `direccion` varchar(120) COLLATE utf16_bin NOT NULL,
  `telefono` varchar(10) COLLATE utf16_bin NOT NULL,
  `email` varchar(60) COLLATE utf16_bin NOT NULL,
  `password` varchar(150) COLLATE utf16_bin NOT NULL,
  `foto` varchar(150) COLLATE utf16_bin NOT NULL,
  `rol` varchar(13) COLLATE utf16_bin NOT NULL DEFAULT 'cliente',
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `telefono` (`telefono`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf16 COLLATE=utf16_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Prueba','Cra 10 #20-30','123456789','prueba@prueba.com','12345','','cliente'),(2,'Edwin','Cra 1 #2-3','3152004570','correo@correo.com','$2y$10$i5sP87yIIQtWMdFX6VBl0OFy1tpGqXPC7wI7BA6t4HfERcUA4Qq5u','../Public/imagenes/Usuarios/18_10_22_19_17_59_CF8.jpg','administrador'),(3,'prueba admin','11','22','TuCorre@correo.com','$2y$10$EVjYlYCSO8C1bU.5qsQp4.a9ZVnRF2/DofIygi5iXKRKSM6YshXAq','../Public/imagenes/Usuarios/18_10_22_23_43_11_3A0.jpg','cliente'),(4,'prueba','3','13131','usuario2@correo.com','$2y$10$cKzEzcSGwA9./aDCD0UmYuWH2LcfjBrL51sebMiVXuZpmTJtdV49q','../Public/imagenes/Usuarios/18_10_23_01_20_45_pera.jpg','cliente'),(5,'otra manzana','125','1157','cliente@cliente.com','$2y$10$1J3qGFRLB/MXrXg4gKEDB.LtEseQCyO92itaZcVHpQ0LP5QgpPSY6','../Public/imagenes/Usuarios/18_10_23_01_21_13_manzana.jpg','cliente'),(6,'usuario2','44','454545','admin@admin.com','$2y$10$6g9c7rg8Q9hsfHOBmCOSM.sGjGHNIqjUTkHjyWoMl5R7IwQ.OxVXa','../Public/imagenes/Usuarios/18_10_23_01_21_41_piÃ±a.jpg','cliente');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-23  8:21:04
