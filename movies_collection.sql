-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Sep 2023 pada 20.03
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movies_collection`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblmovies`
--

CREATE TABLE `tblmovies` (
  `id` bigint(20) NOT NULL,
  `director` varchar(100) DEFAULT NULL,
  `genres` varchar(100) DEFAULT NULL,
  `summary` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tblmovies`
--

INSERT INTO `tblmovies` (`id`, `director`, `genres`, `summary`, `title`) VALUES
(16, 'Eiichiro Oda', 'sciFi/ animation', 'Cartoon', 'Tanah Merah Nantinya'),
(18, 'Chris Buck', 'Action/Sci-fi', 'Elsaaaaa', 'Dragon Ball'),
(33, 'Eiichiro Oda', 'drama/ sciFi/ animation', 'Cartoon', 'One Pouch Man'),
(38, 'Eiichiro Oda', 'drama/ animation', 'film pendek', 'Indonesia Pusaka'),
(39, 'Chris Coi', 'drama/ animation/ action', 'film pendek', 'Menjadi Manusia');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tblmovies`
--
ALTER TABLE `tblmovies`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tblmovies`
--
ALTER TABLE `tblmovies`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
