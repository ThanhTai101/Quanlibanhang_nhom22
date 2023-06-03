-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlibanhang
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `account_nv`
--

DROP TABLE IF EXISTS `account_nv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account_nv` (
  `username` varchar(10) NOT NULL,
  `password_a` varchar(10) NOT NULL,
  `MANV` int DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `MANV` (`MANV`),
  CONSTRAINT `account_nv_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_nv`
--

LOCK TABLES `account_nv` WRITE;
/*!40000 ALTER TABLE `account_nv` DISABLE KEYS */;
INSERT INTO `account_nv` VALUES ('111111','tt111',1),('222222','tn222',2),('333333','vn111',3),('444444','tq111',4);
/*!40000 ALTER TABLE `account_nv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chitietdonhang`
--

DROP TABLE IF EXISTS `chitietdonhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdonhang` (
  `Ngaylapdon` date DEFAULT NULL,
  `MADH` int DEFAULT NULL,
  `MASP` varchar(10) DEFAULT NULL,
  `SLsanpham` int DEFAULT NULL,
  `Dongia` float NOT NULL,
  KEY `MADH` (`MADH`),
  KEY `MASP` (`MASP`),
  KEY `FK_1` (`Dongia`),
  CONSTRAINT `chitietdonhang_ibfk_1` FOREIGN KEY (`MADH`) REFERENCES `donhang` (`MADH`),
  CONSTRAINT `chitietdonhang_ibfk_2` FOREIGN KEY (`MASP`) REFERENCES `hanghoa` (`MASP`),
  CONSTRAINT `chitietdonhang_ibfk_3` FOREIGN KEY (`Dongia`) REFERENCES `hanghoa` (`Dongia`),
  CONSTRAINT `FK_1` FOREIGN KEY (`Dongia`) REFERENCES `hanghoa` (`Dongia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhang`
--

LOCK TABLES `chitietdonhang` WRITE;
/*!40000 ALTER TABLE `chitietdonhang` DISABLE KEYS */;
INSERT INTO `chitietdonhang` VALUES ('2022-01-01',1,'TP7',3,143.738),('2022-01-01',2,'S9',3,194.697),('2022-01-01',3,'S1',3,46.078),('2022-01-01',4,'S8',1,70.184),('2022-01-01',5,'S10',1,154.657);
/*!40000 ALTER TABLE `chitietdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang` (
  `MADH` int NOT NULL AUTO_INCREMENT,
  `MANV` int DEFAULT NULL,
  `TENSP` varchar(50) DEFAULT NULL,
  `Tongtien` float(10,2) DEFAULT NULL,
  `Sotiennhan` float(10,2) DEFAULT NULL,
  `Sotienthoi` float(10,2) DEFAULT NULL,
  PRIMARY KEY (`MADH`),
  KEY `MANV` (`MANV`),
  KEY `TENSP` (`TENSP`),
  CONSTRAINT `donhang_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`),
  CONSTRAINT `donhang_ibfk_2` FOREIGN KEY (`TENSP`) REFERENCES `hanghoa` (`MASP`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (1,1,'Pudding         ',NULL,5000.00,NULL),(2,1,'Hóa thân        ',NULL,5000.00,NULL),(3,1,'Không gục ngã   ',NULL,5000.00,NULL),(4,1,'Bột mì vĩnh cửu ',NULL,5000.00,NULL),(5,1,'Chúa ruồi       ',NULL,5000.00,NULL);
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hanghoa`
--

DROP TABLE IF EXISTS `hanghoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hanghoa` (
  `MASP` varchar(10) NOT NULL,
  `TenSP` varchar(50) NOT NULL,
  `Dongia` float NOT NULL,
  PRIMARY KEY (`MASP`),
  KEY `Dongia` (`Dongia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hanghoa`
--

LOCK TABLES `hanghoa` WRITE;
/*!40000 ALTER TABLE `hanghoa` DISABLE KEYS */;
INSERT INTO `hanghoa` VALUES ('DC1','Mô hình xe ô tô địa hình',45.272),('DC10','bộ đồ chơi khủng long bạo chúa',38.537),('DC2','Mô hình xe máy',78.121),('DC3','Bộ đồ chơi xếp hình thông minh',68.944),('DC4','mô hình among us',168.744),('DC5','búp bê',101.898),('DC6','bộ đồ chơi câu cá',148.887),('DC7','thú nhồi bông gấu nâu',12.872),('DC8','thú nhồi bông thỏ trắng',52.18),('DC9','đồ chơi gà la hét',118.979),('GD1','bộ chén trà',112.855),('GD10','quạt trần',90.373),('GD2','bộ muỗng nhôm',114.576),('GD3','bộ đũa nhôm cao cấp',192.728),('GD4','giá gỗ',159.969),('GD5','thớt gỗ',30.976),('GD6','kệ chén dán tường',24.392),('GD7','gương để bàn',109.521),('GD8','máy quạt size nhỏ',199.989),('GD9','máy quạt size lớn',85.934),('MP1','bút kẻ mắt nước',195.423),('MP10','kem dưỡng ẩm da tay',192.434),('MP3','son tint nước nội địa trung',168.575),('MP4','phấn má màu hồng nhạt',35.309),('MP5','phấn má màu đào',29.583),('MP6','phấn má màu cam nhạt',29.522),('MP7','xịt khóa makeup',15.2986),('MP8','mascara',24.819),('MP9','toner cấp ẩm da',12.964),('S1','cây cam ngọt của tôi',46.078),('S10','Đời thay đổi khi chúng ta thay đổi',154.657),('S2','Kể chuyện Bác Hồ(tập 1)',22.229),('S3','Kể chuyện Bác Hồ(tập 2)',101.134),('S4','Kể chuyện Bác Hồ(tập 3)',75.888),('S5','Đắc Nhân Tâm',22.392),('S6','Nhà giả kim',150),('S7','Tội ác và hình phạt',100),('S8','Mỗi lần vấp ngả một lần trưởng thành',70.184),('S9','Tuổi trẻ đáng giá bao nhiêu?',194.697),('TP1','Trứng gà',163.844),('TP10','Sushi',51.786),('TP2','Đậu phộng',132.626),('TP3','Trứng cút',23.061),('TP4','Dâu tây',102.059),('TP5','Sữa tiệt trùng',126.299),('TP6','Bơ',135.005),('TP7','Pudding',143.738),('TP8','Lươn nướng',118.866),('TP9','Pizza',149.115),('U1','BanhU',178.5);
/*!40000 ALTER TABLE `hanghoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MANV` int NOT NULL AUTO_INCREMENT,
  `TenNV` varchar(50) NOT NULL,
  `SDT` varchar(15) NOT NULL,
  PRIMARY KEY (`MANV`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Thanh Tai','111111111'),(2,'Thanh Nhu','222222222'),(3,'Vy Na','333333333'),(4,'Trung Quyen','444444444');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thongke`
--

DROP TABLE IF EXISTS `thongke`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thongke` (
  `MADH` int NOT NULL AUTO_INCREMENT,
  `MANV` int DEFAULT NULL,
  `Tongtien` float(10,2) DEFAULT NULL,
  `Ngaylapdon` date DEFAULT NULL,
  PRIMARY KEY (`MADH`),
  KEY `MANV` (`MANV`),
  CONSTRAINT `thongke_ibfk_1` FOREIGN KEY (`MANV`) REFERENCES `nhanvien` (`MANV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thongke`
--

LOCK TABLES `thongke` WRITE;
/*!40000 ALTER TABLE `thongke` DISABLE KEYS */;
/*!40000 ALTER TABLE `thongke` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-03 18:36:54
