# Spring Boot REST API - Data Mahasiswa (Pertemuan 5)

Proyek ini adalah aplikasi **Java Spring Boot** yang dikembangkan untuk memenuhi tugas **Pertemuan 5**. Aplikasi ini menyediakan layanan **REST API** untuk pengelolaan data mahasiswa (CRUD: Create, Read, Update, Delete) dengan menggunakan arsitektur MVC dan JPA (*Java Persistence API*) untuk akses database.

## Identitas Proyek

* **Nama Proyek:** `pert5_50422921_4IA16`
* **NPM:** 50422921
* **Kelas:** 4IA16
* **Framework:** Spring Boot
* **Build Tool:** Maven

## Teknologi yang Digunakan

* **Java Development Kit (JDK)** (Minimal versi 8, disarankan 11 atau 17)
* **Spring Boot** (Web, Data JPA)
* **Maven** (Manajemen Dependensi)
* **Database:** MySQL (Default) atau PostgreSQL
* **IDE:** IntelliJ IDEA, NetBeans, Eclipse, atau VS Code

---

## Panduan Instalasi & Menjalankan Aplikasi

Ikuti langkah-langkah berikut untuk menjalankan aplikasi di mesin lokal Anda.

### 1. Prasyarat
Pastikan perangkat Anda sudah terinstal:
* Java SDK
* Apache Maven
* MySQL Server (atau database lain yang didukung)

### 2. Ekstrak File
Ekstrak arsip `pert5_50422921_4IA16.rar` ke folder tujuan Anda.

### 3. Konfigurasi Database
Buat database baru di MySQL (misalnya `db_mahasiswa`). Kemudian, buka file `src/main/resources/application.properties` dan sesuaikan konfigurasinya:

```properties
# Konfigurasi Koneksi Database MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/db_mahasiswa?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=password_mysql_anda
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Konfigurasi JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

## 4. Menjalankan Aplikasi
Buka terminal atau Command Prompt, arahkan ke direktori proyek, lalu jalankan perintah:
``` 
mvn spring-boot:run
```
Tunggu hingga muncul pesan Tomcat started on port(s): 8080.

## Dokumentasi API (Endpoints)
Aplikasi ini mengekspos endpoint RESTful berikut. Base URL: http://localhost:8080

``
HTTP Method,Endpoint,Deskripsi
GET,/mahasiswa,Menampilkan semua data mahasiswa
GET,/mahasiswa/{id},Menampilkan detail mahasiswa berdasarkan ID
POST,/mahasiswa,Menambahkan data mahasiswa baru
PUT,/mahasiswa/{id},Memperbarui data mahasiswa berdasarkan ID
DELETE,/mahasiswa/{id},Menghapus data mahasiswa berdasarkan ID
``

## Contoh Request Body (JSON)
Gunakan format JSON berikut saat melakukan request POST atau PUT (via Postman/Insomnia).

Tambah / Update Data:
`
{
    "npm": "50422921",
    "nama": "Nama Lengkap Mahasiswa",
    "kelas": "4IA16",
    "jurusan": "Teknik Informatika",
    "ipk": 3.75
}
`
(Catatan: Sesuaikan nama field JSON di atas dengan atribut yang ada pada file ModelMahasiswa.java di dalam kode sumber).


## Struktur Direktori
Berikut adalah gambaran struktur folder utama dalam proyek ini:
``
pert5_50422921_4IA16
├── pom.xml                        # Konfigurasi Dependensi Maven
├── mvnw                           # Maven Wrapper (Opsional)
├── mvnw.cmd                       # Maven Wrapper untuk Windows
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── mycompany
│       │           └── pert5_50422921_4ia16
│       │               ├── controller
│       │               │   └── MahasiswaController.java  # Mengatur request API
│       │               ├── model
│       │               │   └── ModelMahasiswa.java       # Representasi tabel DB
│       │               ├── repository
│       │               │   └── MahasiswaRepository.java  # Interface ke Database
│       │               └── Pertemuan5SpringBootApplication.java # Main Class
│       └── resources
│           ├── application.properties  # Konfigurasi DB & Server
│           ├── static/                 # File statis (jika ada)
│           └── templates/              # Template HTML (jika ada)
``


