-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2020 at 10:31 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `homework`
--

CREATE TABLE `homework` (
  `class` int(11) NOT NULL,
  `homeworkGiven` text NOT NULL,
  `section` text NOT NULL,
  `isComplete` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login_info`
--

CREATE TABLE `login_info` (
  `id` text NOT NULL,
  `ip_address` text NOT NULL,
  `state` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_info`
--

INSERT INTO `login_info` (`id`, `ip_address`, `state`) VALUES
('100.12', '192.168.0.107', 0);

-- --------------------------------------------------------

--
-- Table structure for table `student_accounts`
--

CREATE TABLE `student_accounts` (
  `name` text NOT NULL,
  `class` text NOT NULL,
  `sec` text NOT NULL,
  `id` text NOT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_accounts`
--

INSERT INTO `student_accounts` (`name`, `class`, `sec`, `id`, `pass`) VALUES
('Fahim', '10', 'a', '100.12', 'MTIzNA==');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_accounts`
--

CREATE TABLE `teacher_accounts` (
  `name` text NOT NULL,
  `class` text NOT NULL,
  `sec` text NOT NULL,
  `id` text NOT NULL,
  `uname` text NOT NULL,
  `pass` text NOT NULL,
  `active` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_accounts`
--

INSERT INTO `teacher_accounts` (`name`, `class`, `sec`, `id`, `uname`, `pass`, `active`) VALUES
('Karim', 'Math', 'lecturer', '420.19', 'Karim', 'S2FyaW0=', 1),
('asdfg', 'asdas', 'asdasa', 'asdas', 'asdfg', 'YXNkZmc=', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `homework`
--
ALTER TABLE `homework`
  ADD PRIMARY KEY (`class`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
