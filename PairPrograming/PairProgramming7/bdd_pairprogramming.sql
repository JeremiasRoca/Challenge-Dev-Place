-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-04-2022 a las 23:17:33
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdd_pairprogramming`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE `carrera` (
  `idCarrera` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `idUniversidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carrera`
--

INSERT INTO `carrera` (`idCarrera`, `nombre`, `idUniversidad`) VALUES
(4, 'programacion', 1),
(6, 'derecho', 1),
(7, 'economia', 1),
(8, 'sociales', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `idEstudiante` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `idCarrera` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`idEstudiante`, `nombre`, `fechaNacimiento`, `idCarrera`) VALUES
(2, 'pepe', '2000-05-10', 4),
(3, 'juana', '0000-00-00', 6),
(4, 'oscar', '0000-00-00', 8),
(5, 'juan', '2000-04-10', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `legajo`
--

CREATE TABLE `legajo` (
  `idLegajo` int(11) NOT NULL,
  `nro` int(11) NOT NULL,
  `idEstudiante` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `legajo`
--

INSERT INTO `legajo` (`idLegajo`, `nro`, `idEstudiante`) VALUES
(2, 1, 4),
(3, 54, 2),
(4, 520, 3),
(5, 520, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `idProfesor` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `materia` varchar(45) NOT NULL,
  `idCarrera` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`idProfesor`, `nombre`, `fechaNacimiento`, `materia`, `idCarrera`) VALUES
(1, 'horacio', '0000-00-00', 'programacion', 1),
(2, 'osvaldo', '0000-00-00', 'economia', 2),
(3, 'sergio', '0000-00-00', 'sociales', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `universidad`
--

CREATE TABLE `universidad` (
  `idUniversidad` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `universidad`
--

INSERT INTO `universidad` (`idUniversidad`, `nombre`) VALUES
(1, 'UNMDP');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD PRIMARY KEY (`idCarrera`),
  ADD KEY `idUniversidad` (`idUniversidad`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`idEstudiante`),
  ADD KEY `idCarrera` (`idCarrera`);

--
-- Indices de la tabla `legajo`
--
ALTER TABLE `legajo`
  ADD PRIMARY KEY (`idLegajo`),
  ADD KEY `idEstudiante` (`idEstudiante`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`idProfesor`);

--
-- Indices de la tabla `universidad`
--
ALTER TABLE `universidad`
  ADD PRIMARY KEY (`idUniversidad`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carrera`
--
ALTER TABLE `carrera`
  MODIFY `idCarrera` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `idEstudiante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `legajo`
--
ALTER TABLE `legajo`
  MODIFY `idLegajo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `idProfesor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `universidad`
--
ALTER TABLE `universidad`
  MODIFY `idUniversidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD CONSTRAINT `idUniversidad` FOREIGN KEY (`idUniversidad`) REFERENCES `universidad` (`idUniversidad`);

--
-- Filtros para la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD CONSTRAINT `idCarrera` FOREIGN KEY (`idCarrera`) REFERENCES `carrera` (`idCarrera`);

--
-- Filtros para la tabla `legajo`
--
ALTER TABLE `legajo`
  ADD CONSTRAINT `idEstudiante` FOREIGN KEY (`idEstudiante`) REFERENCES `estudiante` (`idEstudiante`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
