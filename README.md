
[![MineSweeper Game'i](/readmeAssets/mine.png "MineSweeperLogo'i")](https://github.com/doguscetinoglu/doguscetinoglu)




# Mayın Tarlası Oyunu

Bu proje, bir mayın tarlası oyununu Java programlama diliyle oluşturmayı amaçlamaktadır. Oyun, kullanıcının mayınların yerini tahmin ederek oynaması gereken klasik bir strateji oyunudur.

## Kullanım

1. MineSweeper` sınıfını çalıştırarak oyunu başlatın.
2. Oyun, kullanıcıdan satır ve sütun girişi alacak ve kullanıcının girdiği koordinatlardaki hücreleri kontrol edecektir.
3. Kullanıcı, hücrelerin altında mayın olup olmadığını bulmaya çalışırken, oyun devam eder.
4. Kullanıcı, mayına rastladığında veya tüm güvenli hücreler keşfedildiğinde oyun sonlanır.

# Mayın Tarlası Oyunu Teknik detayları

Bu proje, Java programlama dili (JDK 21 ) kullanılarak geliştirilmiş bir mayın tarlası oyununu içerir.

## Kullanılan Teknolojiler

- **Java:** Proje Java programlama dili kullanılarak geliştirilmiştir.
- **Java.util.Random:* Rastgele sayı üretmek için kullanılmıştır.
- **Java.util.Scanner:* Kullanıcı girişi almak için kullanılmıştır.

## Sınıflar ve Metodlar

### MineSweeper Sınıfı

Bu sınıf, oyunun mantığını içerir.

#### Değişkenler

- `mineMap[][]`: Mayınların tutulduğu matris.
- `playerMap[][]`: Oyuncunun oynadığı alanın tutulduğu matris.
- `row`: Oyun alanının satır sayısı.
- `column`: Oyun alanının sütun sayısı.
- `area`: Oyun alanının toplam hücre sayısı.
- `checkCounter`: Oyuncunun seçtiği hücrenin etrafındaki mayın sayısını tutar.

#### Metodlar

- `MineSweeper(int row, int column)`: Oyun alanını başlatan constructor.
- `map(String[][] map)`: Oyun alanlarını ekrana yazdıran metot.
- `run()`: Oyunu başlatan ve oyun akışını yöneten metot.
- `mineAdd()`: Mayınları rastgele yerleştiren metot.
- `checkMine(int checkRow, int checkCol)`: Oyuncunun seçtiği hücrenin etrafındaki mayınları kontrol eden ve oyuncuya bilgi veren metot.
- `mineInfo(int row, int col)`: Oyuncunun seçtiği hücrenin etrafındaki mayınları yazdıran metot.

### İletişim

[![Doğuş Çetinoğlu'i](/readmeAssets/logo.png "D & C Linkedin Logo'i")](https://www.linkedin.com/in/doguscetinoglu/)

Doğuş Çetinoğlu - [doguscetinoglu@gmail.com]
