# Movies Collection

## Persyaratan Prasyarat

Sebelum Anda dapat menjalankan proyek ini di lingkungan lokal Anda, pastikan Anda memiliki hal-hal berikut:

- **Java Development Kit (JDK)**: Pastikan Anda telah menginstal JDK versi [17] atau yang lebih baru. Anda dapat memeriksa versi Java dengan menjalankan perintah `java -version` di terminal.

- **Manajer Dependensi**: Proyek ini menggunakan [Maven] sebagai manajer dependensi. Pastikan Anda telah menginstalnya di komputer Anda.

## Panduan Menjalankan Proyek

Berikut adalah langkah-langkah untuk menjalankan proyek Spring Boot di lingkungan lokal Anda:

1. **Unduh Proyek**: Unduh proyek ini atau klon repositori dari [tautan repositori GitHub] jika Anda belum melakukannya.

2. **Impor ke IDE (Opsional)**: Jika Anda menggunakan Integrated Development Environment (IDE) seperti IntelliJ IDEA atau Eclipse, Anda dapat mengimpor proyek ini ke dalam IDE Anda.

3. **Konfigurasi Database (Opsional)**: Jika proyek ini mengharuskan koneksi ke database, pastikan Anda telah mengonfigurasi sumber data di file `application.properties` atau `application.yml` sesuai dengan pengaturan database Anda.

4. **Jalankan Aplikasi**:

    - Menggunakan Maven:
      ```shell
      mvn spring-boot:run
      ```

    - Menggunakan Gradle:
      ```shell
      gradle bootRun
      ```

5. **Akses Aplikasi**: Setelah aplikasi berhasil dijalankan, Anda dapat mengaksesnya melalui peramban web dengan membuka `http://localhost:8081` atau URL lainnya sesuai dengan konfigurasi Anda.