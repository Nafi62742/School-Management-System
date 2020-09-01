-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 01, 2020 at 03:55 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
('100.12', '192.168.0.107', 0),
('100.17', '192.168.0.105', 0),
('400.420', '192.168.0.105', 1);

-- --------------------------------------------------------

--
-- Table structure for table `notice_table`
--

CREATE TABLE `notice_table` (
  `notice` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
('Fahim', '10', 'a', '100.12', 'MTIzNA=='),
('Nafi', '5', 'A', '100.17', 'TmFmaTAwNw==');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_accounts`
--

CREATE TABLE `teacher_accounts` (
  `name` text NOT NULL,
  `class` text NOT NULL,
  `sec` text NOT NULL,
  `id` text NOT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_accounts`
--

INSERT INTO `teacher_accounts` (`name`, `class`, `sec`, `id`, `pass`) VALUES
('Karim', 'Math', 'lecturer', '420.19', 'S2FyaW0='),
('asdfg', 'asdas', 'asdasa', 'asdas', 'YXNkZmc='),
('Md Karim', 'Math', 'lecturer', '100.420', 'a2FyaW0='),
('Md Karim', 'Math', 'lecturer', '400.420', 'a2FyaW0=');

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
