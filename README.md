#tugasKelompokPBO

kelompok 3

anggota:
1. Anggara Saputra 5025211241
2. Muhammad Daffa Ashdaqfillah 5025211015
3. Yoel Mountanus Sitorus5025211078

Kel 1 : Seorang Costumer ingin membuat sistem informasi order restoran. Di restoran ada makanan, minuman, snack, dan buah. Harga order masing masing berbeda. Ada diskon jika membeli pada hari-hari tertentu.

Terapkan :
	- Casting/Conversion 	= Biaya makanan, minuman, snack, buah -> dari string ke double
	- Constructor		= Kelas Menu (Makanan, Minuman, Snack, Buah)
	- Overloading		= refill(), refill(persentage)
	- Overriding		= cetakTagihan() -> Makanan cetakTagihan()
	- Encapsulation	= setHarga(), getHarga()
	- Inheritance		= class Menu ke class Makanan, Minuman, Snack, dan Buah
	- Polymorphism	= Menu namaVariabel, melakukan aksi cetak sesuatu (check method overriding)


https://docs.google.com/document/d/1c-G1i7kocBaxlumuVxCnbiWfs5py7zv5QZoNcBaO27k/edit

Menu
Fields	:
Harga - Double
Nama menu - String
Ukuran - String
No pemesanan - int
addOns - Array of String
Deliver - String
Discount - Double
Sudah Dibayar - boolean
	Methods:
addAddOns(string addOns)
hargaAkhir() //yang udah kena diskon
takeaway or dine in
Cetak Harga akhir()
dibayar() //set sudah dibayar true

Child:
Makanan 
Fields	:
levelPedas - int
Method:
encapsulation levelPedas
hargaAkhir() - Override

Minuman
Fields	:
Dingin/Panas - String
takaranGula - String => No, Less, Normal
Method:
refill()
setTakaranGula ()

Snack
Fields : 
Jenis Rasa => Coklat, Vanilla, Red Velvet
Method :
pilih rasa()
Buah
Fields	:
Berat => double (ons)
Topping
Method:
pilih topping()
berat pemesanan()


