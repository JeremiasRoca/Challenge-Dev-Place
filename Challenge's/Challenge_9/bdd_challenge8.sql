-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-04-2022 a las 05:56:13
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
-- Base de datos: `bdd_challenge8`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` varchar(12) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `idFacturacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `apellido`, `dni`, `fechaNacimiento`, `idFacturacion`) VALUES
(1, 'PEPE', 'lopez', '42546876', '2000-05-10', 1),
(2, 'jere', 'roca', '42630125', '2021-05-10', 1);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `clientecona`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `clientecona` (
`idCliente` int(11)
,`nombre` varchar(45)
,`apellido` varchar(45)
,`dni` varchar(12)
,`fechaNacimiento` date
,`idFacturacion` int(11)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturacion`
--

CREATE TABLE `facturacion` (
  `idFacturacion` int(11) NOT NULL,
  `nroFactura` int(11) NOT NULL,
  `fechaCompra` date NOT NULL,
  `clienteCompra` varchar(45) NOT NULL,
  `vendedorFactura` varchar(45) NOT NULL,
  `detalleProductos` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Disparadores `facturacion`
--
DELIMITER $$
CREATE TRIGGER `modificaProducto` AFTER INSERT ON `facturacion` FOR EACH ROW UPDATE productos SET productos.stockMinimo = productos.stockMinimo-productosvendidos
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idProductos` int(11) NOT NULL,
  `codigoProducto` varchar(45) NOT NULL,
  `precioUnitario` double NOT NULL,
  `cantidad` int(11) NOT NULL,
  `stockMinimo` int(11) NOT NULL,
  `idFacturacion` int(11) NOT NULL,
  `vendido` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProductos`, `codigoProducto`, `precioUnitario`, `cantidad`, `stockMinimo`, `idFacturacion`, `vendido`) VALUES
(1, '123asd', 12.5, 2, 100, 1, 0),
(2, '321dfg', 10.5, 5, 150, 2, 0),
(3, '147ttt', 52.5, 10, 100, 3, 0),
(4, '999jhg', 92.5, 3, 1000, 1, 0),
(5, '123asd', 12.5, 2, 100, 1, 0),
(6, '321dfg', 10.5, 5, 150, 2, 0),
(7, '147ttt', 52.5, 10, 100, 3, 0),
(8, '999jhg', 92.5, 3, 1000, 1, 0),
(9, '888www', 10.5, 3, 1000, 2, 0),
(10, '777ggg', 60.5, 3, 1000, 3, 0),
(11, '989uuu', 50.5, 3, 1000, 1, 0),
(12, '111ooo', 40.5, 3, 1000, 2, 0),
(13, '222ppp', 11.5, 3, 1000, 3, 0),
(14, '555ñññ', 5.5, 3, 1000, 1, 0);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `productosvendidos`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `productosvendidos` (
`idProductos` int(11)
,`codigoProducto` varchar(45)
,`precioUnitario` double
,`cantidad` int(11)
,`stockMinimo` int(11)
,`idFacturacion` int(11)
,`vendido` tinyint(1)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `idVendedor` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` varchar(12) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `salario` double NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `idFacturacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `ventasvendedor`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `ventasvendedor` (
`nombre` varchar(45)
,`apellido` varchar(45)
,`dni` varchar(12)
,`direccion` varchar(45)
,`salario` double
,`fechaNacimiento` date
,`nroFactura` int(11)
,`fechaCompra` date
,`detalleProductos` varchar(120)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `clientecona`
--
DROP TABLE IF EXISTS `clientecona`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `clientecona`  AS SELECT `cliente`.`idCliente` AS `idCliente`, `cliente`.`nombre` AS `nombre`, `cliente`.`apellido` AS `apellido`, `cliente`.`dni` AS `dni`, `cliente`.`fechaNacimiento` AS `fechaNacimiento`, `cliente`.`idFacturacion` AS `idFacturacion` FROM `cliente` WHERE `cliente`.`nombre` like '%a%' ;

-- --------------------------------------------------------

--
-- Estructura para la vista `productosvendidos`
--
DROP TABLE IF EXISTS `productosvendidos`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `productosvendidos`  AS SELECT `productos`.`idProductos` AS `idProductos`, `productos`.`codigoProducto` AS `codigoProducto`, `productos`.`precioUnitario` AS `precioUnitario`, `productos`.`cantidad` AS `cantidad`, `productos`.`stockMinimo` AS `stockMinimo`, `productos`.`idFacturacion` AS `idFacturacion`, `productos`.`vendido` AS `vendido` FROM `productos` WHERE `productos`.`vendido` = 1 ;

-- --------------------------------------------------------

--
-- Estructura para la vista `ventasvendedor`
--
DROP TABLE IF EXISTS `ventasvendedor`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ventasvendedor`  AS SELECT `v`.`nombre` AS `nombre`, `v`.`apellido` AS `apellido`, `v`.`dni` AS `dni`, `v`.`direccion` AS `direccion`, `v`.`salario` AS `salario`, `v`.`fechaNacimiento` AS `fechaNacimiento`, `f`.`nroFactura` AS `nroFactura`, `f`.`fechaCompra` AS `fechaCompra`, `f`.`detalleProductos` AS `detalleProductos` FROM (`vendedor` `v` join `facturacion` `f` on(`f`.`vendedorFactura` = `v`.`nombre`)) ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `facturacion`
--
ALTER TABLE `facturacion`
  ADD PRIMARY KEY (`idFacturacion`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProductos`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`idVendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `facturacion`
--
ALTER TABLE `facturacion`
  MODIFY `idFacturacion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idProductos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `idVendedor` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
