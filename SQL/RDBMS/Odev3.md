##### **1-)** country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.

  ###### **Solution:**  SELECT * FROM COUNTRY WHERE country LIKE 'A%a'
<br/>

##### **2-)** country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.

###### **Solution:**  SELECT * FROM COUNTRY WHERE country LIKE '%n' AND CHAR_LENGTH(country) >= 6;
<br/>

##### **3-)** film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.

###### **Solution:**  SELECT title FROM film WHERE title ILIKE '%t%t%t%t%';
<br/>

##### **4-)** film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.

###### **Solution:**  SELECT * FROM film WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;
<br/>