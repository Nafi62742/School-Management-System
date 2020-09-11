-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 11, 2020 at 07:27 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

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
  `class` varchar(20) NOT NULL,
  `sec` varchar(20) NOT NULL,
  `teacher_name` varchar(20) NOT NULL,
  `subject` varchar(30) NOT NULL,
  `total_marks` int(11) NOT NULL,
  `post_date` varchar(20) NOT NULL,
  `due_date` varchar(20) NOT NULL,
  `homework_text` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `homework`
--

INSERT INTO `homework` (`class`, `sec`, `teacher_name`, `subject`, `total_marks`, `post_date`, `due_date`, `homework_text`) VALUES
('10', 'a', 'Fahim', 'Physics', 78, '02.09.2020', '10.09.2020', ';llmlmlonilbuybubnnoiniubyibib'),
('10', 'a', 'Fahim', 'Math', 67, '02.09.2020', '18.09.2020', 'onlnlnilbyu 7yfuiyvu6t 7tf6tvyf56tf 7tfytvbygf65fty 7tf7bg7f65');

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
('100.12', '192.168.43.18', 0),
('100.12', '192.168.0.108', 0),
('100.17', '192.168.0.105', 0),
('400.32', '192.168.0.105', 1),
('100.17', '192.168.1.132', 1),
('400.32', '192.168.1.132', 0);

-- --------------------------------------------------------

--
-- Table structure for table `message`
--

CREATE TABLE `message` (
  `teacher_name` varchar(20) NOT NULL,
  `ID` text NOT NULL,
  `message` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `message`
--

INSERT INTO `message` (`teacher_name`, `ID`, `message`) VALUES
('Fahim', '100.12', 'lalaal'),
('Fahim', '100.12', 'whattttttttttt'),
('Fahim', '100.11', 'llllllaallll'),
('Fahim', '100.17', 'Nafi valo kore porashuna korben. >_<');

-- --------------------------------------------------------

--
-- Table structure for table `notice_board`
--

CREATE TABLE `notice_board` (
  `date` text NOT NULL,
  `time` text NOT NULL,
  `teacher_name` varchar(20) NOT NULL,
  `class` varchar(20) NOT NULL,
  `subject` varchar(30) NOT NULL,
  `notice` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `notice_board`
--

INSERT INTO `notice_board` (`date`, `time`, `teacher_name`, `class`, `subject`, `notice`) VALUES
('01.09.2020', '11:41 PM', 'Fahim', '10', 'Math', 'kalke cls off..karor asha lagbe na'),
('02.09.2020', '12:04 AM', 'Fahim', '10', 'Math', 'eto pora lekha kore ki hobe!?');

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE `results` (
  `ID` text NOT NULL,
  `bangla1st` int(11) DEFAULT 0,
  `bangla2nd` int(11) DEFAULT 0,
  `english1st` int(11) DEFAULT 0,
  `english2nd` int(11) DEFAULT 0,
  `math` int(11) DEFAULT 0,
  `science` int(11) DEFAULT 0,
  `religion` int(11) DEFAULT 0,
  `bgs` int(11) DEFAULT 0,
  `ict` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`ID`, `bangla1st`, `bangla2nd`, `english1st`, `english2nd`, `math`, `science`, `religion`, `bgs`, `ict`) VALUES
('100.17', NULL, NULL, NULL, NULL, 100, NULL, NULL, NULL, NULL),
('100.12', NULL, NULL, NULL, NULL, 85, NULL, NULL, NULL, NULL),
('100.17', NULL, NULL, NULL, NULL, 85, NULL, NULL, NULL, NULL),
('100.17', NULL, NULL, NULL, NULL, 70, NULL, NULL, NULL, NULL),
('100.17', NULL, NULL, NULL, NULL, 20, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `student_accounts`
--

CREATE TABLE `student_accounts` (
  `name` text NOT NULL,
  `class` text NOT NULL,
  `sec` text NOT NULL,
  `id` text NOT NULL,
  `phoneNo` text DEFAULT NULL,
  `email` text DEFAULT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_accounts`
--

INSERT INTO `student_accounts` (`name`, `class`, `sec`, `id`, `phoneNo`, `email`, `pass`) VALUES
('Fahim', '10', 'a', '100.12', NULL, NULL, 'MTIzNA=='),
('Pranto', '8', 'b', '100.11', NULL, NULL, 'MTIzNA=='),
('Nafi Ahmed', '10', 'A', '100.17', '01760887296', 'nafiahmed318@gmail.com', 'TmFmaTAwNw=='),
('test1', '10', 'a', '100.15', NULL, NULL, 'MTIzNA=='),
('test2', '10', 'a', '100.14', NULL, NULL, 'MTIzNA=='),
('test3', '10', 'a', '100.16', NULL, NULL, 'MTIzNA==');

-- --------------------------------------------------------

--
-- Table structure for table `student_data`
--

CREATE TABLE `student_data` (
  `name` varchar(20) NOT NULL,
  `id` varchar(20) NOT NULL,
  `class` varchar(10) NOT NULL,
  `sec` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `teacher_accounts`
--

CREATE TABLE `teacher_accounts` (
  `name` varchar(20) NOT NULL,
  `subject` varchar(20) NOT NULL,
  `designation` text NOT NULL,
  `id` text NOT NULL,
  `phoneNo` text DEFAULT NULL,
  `email` text DEFAULT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_accounts`
--

INSERT INTO `teacher_accounts` (`name`, `subject`, `designation`, `id`, `phoneNo`, `email`, `pass`) VALUES
('Fahim', 'Math', 'Senior Teacher', '400.12', NULL, NULL, 'MTIzNA=='),
('Fahim', 'Physics', 'Senior Teacher', '400.13', NULL, NULL, 'MTIzNA=='),
('Dr Sharker Md. Numan', 'Math', 'Professor', '400.32', '01760887297', 'nafiahmed318@gmail.com', 'bnVtYW4='),
('test1', 'math', 'teacher', '400.14', NULL, NULL, 'MTIzNA=='),
('test2', 'kkkj', 'jnonno', '400.15', NULL, NULL, 'MTIzNA==');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student_accounts`
--
ALTER TABLE `student_accounts`
  ADD UNIQUE KEY `id` (`id`) USING HASH;

--
-- Indexes for table `teacher_accounts`
--
ALTER TABLE `teacher_accounts`
  ADD UNIQUE KEY `id` (`id`) USING HASH;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
