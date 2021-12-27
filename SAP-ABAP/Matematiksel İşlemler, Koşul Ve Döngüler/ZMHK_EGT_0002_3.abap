*&---------------------------------------------------------------------*
*& Report ZMHK_EGT_0002_3
*&---------------------------------------------------------------------*
*&
*&---------------------------------------------------------------------*
REPORT ZMHK_EGT_0002_3.

DATA: gv_var1 TYPE int1,
      gv_var2 TYPE int1,
      gv_sonuc TYPE int1.

gv_var1 = 10.
gv_var2 = 2.

"Toplama Ýþlemi
gv_sonuc = gv_var1 + gv_var2.
WRITE: gv_var1, ' + ',gv_var2,' = ',gv_sonuc.

"Çýkartma Ýþlemi
gv_sonuc = gv_var1 - gv_var2.
WRITE: / gv_var1, ' - ',gv_var2,' = ',gv_sonuc.

"Çarpma Ýþlemi
gv_sonuc = gv_var1 * gv_var2.
WRITE: / gv_var1, ' * ',gv_var2,' = ',gv_sonuc.

"Bölme Ýþlemi
gv_sonuc = gv_var1 / gv_var2.
WRITE: / gv_var1, ' / ',gv_var2,' = ',gv_sonuc.