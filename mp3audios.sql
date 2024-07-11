-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-07-2024 a las 04:29:18
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mp3audios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `himnos`
--

CREATE TABLE `himnos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `artista` varchar(100) NOT NULL,
  `año` year(4) NOT NULL,
  `album` varchar(50) DEFAULT NULL,
  `duracion` int(11) NOT NULL,
  `ruta` varchar(1024) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `himnos`
--

INSERT INTO `himnos` (`id`, `nombre`, `artista`, `año`, `album`, `duracion`, `ruta`) VALUES
(2, 'Versión Charly García', 'Charly García', '1990', 'Filosofia Barata Y Zapatos De Goma', 276, 'D:\\\\Trayecto_JAVA\\\\JAVA_Tecno_3F\\\\audios_mp3\\\\Charly_Garcia-Himno_ Nacional_Argentino.mp3'),
(3, 'Versión Mercedes Sosa', 'Mercedes Sosa', '2009', 'Cantora 2', 280, 'D:\\\\Trayecto_JAVA\\\\JAVA_Tecno_3F\\\\audios_mp3\\\\Mercedes_Sosa_Cantora_2-Himno_ Nacional_Argentino.mp3'),
(4, 'Versión Ricardo Mollo', 'Ricardo Mollo & Orquesta Filarmónica de Mendoza', '2016', '-', 245, 'D:\\\\Trayecto_JAVA\\\\JAVA_Tecno_3F\\\\audios_mp3\\\\Mollo-Himno_ Nacional_Argentino.mp3'),
(5, 'Versión Los Tekis', 'Los Tekis', '2010', 'Mixtura', 237, 'D:\\\\Trayecto_JAVA\\\\JAVA_Tecno_3F\\\\audios_mp3\\\\Los_Tekis-Himno_ Nacional_Argentino.mp3'),
(6, 'Versión La Mona Jiménez', 'La Mona Jiménez', '2020', '-', 265, 'D:\\\\Trayecto_JAVA\\\\JAVA_Tecno_3F\\\\audios_mp3\\\\La_Mona Jimenez-Himno_ Nacional_Argentino'),
(7, 'Versión Ciro y los Persas', 'Ciro y los Persas', '2019', 'Ciro y los Persas en el Estadio de River', 85, 'D:\\\\Trayecto_JAVA\\\\JAVA_Tecno_3F\\\\audios_mp3\\\\Ciro_y_los Persas-Estadio River-Himno_ Nacional_Argentino.mp3');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `himnos`
--
ALTER TABLE `himnos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `himnos`
--
ALTER TABLE `himnos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
