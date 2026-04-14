# Java-OOP-Chess-Engine
Bu proje, **Nesne Yönelimli Programlama (OOP)** prensiplerini derinlemesine kavramak ve pratik etmek amacıyla Java kullanılarak geliştirilmiş konsol tabanlı bir satranç motorudur. 

## 🚀 Proje Amacı
Temel düzeyde satranç taşlarının hareket kurallarını matematiksel olarak modellemek ve bir yazılımın mimari tasarımını OOP standartlarına uygun şekilde inşa etmektir. Proje, temiz kod (clean code) ve sürdürülebilirlik ilkeleri gözetilerek yazılmıştır.

## 🛠️ Kullanılan Teknolojiler ve Konseptler
* **Dil:** Java (Core)
* **Mimari Tasarım:**
  * **Kalıtım (Inheritance):** Tüm taşlar ortak özelliklerini `Tas` adlı üst sınıftan alır.
  * **Çok Biçimlilik (Polymorphism):** Her bir taş, hareket kurallarını belirleyen `gecerliHamleMi()` metodunu kendi doğasına göre yeniden yazar (override).
  * **Soyutlama (Abstraction):** Ortak metotlar ve yapılar soyut (abstract) sınıflar üzerinden kurgulanmıştır.
  * **Kapsülleme (Encapsulation):** Veri güvenliği için değişkenler gizlenmiş, erişimler kontrollü metodlar ile sağlanmıştır.

## 🎮 Nasıl Çalıştırılır?
Uygulama şimdilik konsol (CLI) üzerinden etkileşimli olarak çalışmaktadır.
1. Projeyi bilgisayarınıza klonlayın.
2. `Main.java` dosyasını derleyip çalıştırın.
3. Konsoldan mevcut taşın koordinatlarını ve gitmek istediğiniz koordinatları girerek (Örn: `1 1 1 3`) hamlenizi yapın.
