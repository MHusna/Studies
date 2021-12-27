*&---------------------------------------------------------------------*
*& Report ZMHK_EGT_0002_1
*&---------------------------------------------------------------------*
*&
*&---------------------------------------------------------------------*
REPORT ZMHK_EGT_0002_1.

*Yorum Satýrý Yapma    -> CTRL + <
*Yorum Satýrý Kaldýrma -> CTRL + SHIFT + <

DATA gv_var TYPE n LENGTH 4. "Normalde tek bir numerik karakter tutan n tipine length
                              "ile birden fazla karakter tutabiliyoruz.

gv_var = 1453.
WRITE gv_var.