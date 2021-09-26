### Nama Aplikasi : 
Co-track Apps

### Deskripsi Aplikasi : 
Aplikasi pemantau lokasi teman, keluarga atau rekan kerja berbasis android 

### Spesifikasi Platform : 
Android minimal SDK 16 

### Fitur Aplikasi : 
  - Subcribe account that want to track 
  - Define apps behavior based gps and network state
  - Push notification account state
  - Login account based device id
  - Show subcribed accounts location

### Skema Aplikasi : 
- Halaman login
- Halaman daftar dengan builder
- Halaman utama navbar (profil, list user, sucribed user), profil (edit profile), list user (list view with search feature), subcribed (list view with confirmation status, state status of sucribed user)
- Halaman peta lokasi

### Progress Aplikasi : 
- Server DB with api
- UI
- Daftar & edit profile with builder pattern
- Get gps state with observer pattern
- Network class with singleton pattern
- Get sucribed user status with command pattern
- User app behavior depend gps state with strategy pattern
