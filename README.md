# MBD-Kelompok3

## Anggota kelompok
- Dian Hasna
- Dwi Bagia Santosa
- Haikal Azhar

## Dokumentasi CRUD dengan Spring boot RESTful API HSQLDB

###### 1. Download eclipse IDE di [Sini](https://www.postman.com/downloads/)
###### 2. Download postman desktop di [Sini](https://www.postman.com/downloads/) Kemudian Install
###### 3. Generate project dan sesuaikan dependencies nya pake website spring initializr di [Sini](https://start.spring.io/)
###### ![gambar1](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/WhatsApp%20Image%202022-12-16%20at%205.17.58%20PM.jpeg)
###### 4. kemudian buka IDE eclipse yang sudah diinstall dan import file project yang sudah di extract 
###### ![gambar2](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/eclipse.png)
###### 5. kemudian pada src/main/java buat package baru bernama controller, exception, model dan repository
###### ![gambar3](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/buatpackage.png)
###### 6. pada package controller buat java class untuk membuat endpoint seperti gambar di bawah
###### ![gambar4](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/package%20controller.png)
###### 7. kemudian pada package exception buat java class untuk meng handle error seperti gambar dibawah
###### ![gambar5](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/package%20exception.png)
###### 8. kemudian pada package model buat java class untuk membuat table ke database
###### ![gambar6](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/package%20model.png)
###### 9. kemudian pada package repository buat java interface yang berisi seperti gambar di bawah
###### ![gambar9](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/gambar9.png)
###### 10. kemudian buka net.kelompok3.springboot.crudrestfulwebservice, lalu klik kanan kemudian run as java application
###### ![gambar10](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/gambar10.png)
###### 11. setelah di run akan muncul console seperti gambar di bawah
###### ![gambar11](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/gambar11.png)
###### 12. jika sudah jalan, selanjutnya kita buka postman yang sudah diinstall, lalu buat http request baru
###### ![gambar12](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/gambar12.png)
###### 13. selanjutnya masukan endpoint yang sudah dibuat ke dalam postman
- endpoint untuk mengambil data di database
###### ![gambar](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/endpoin%20get%20tabel.png)
- endpoint untuk mengirim data ke database
###### ![gambar13](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/endpoin%20post%20ke%20tabel.png)
- endpoint untuk menghapus data di database
###### ![gambar14](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/endpoin%20del%20data%20tabel.png)
- endpoint untuk mengupdate data di database
###### ![gambar15](https://github.com/DwiBagiaSantosa/MBD-Kelompok3/blob/main/Dokumentasi/endpoin%20updt%20tabel.png)
