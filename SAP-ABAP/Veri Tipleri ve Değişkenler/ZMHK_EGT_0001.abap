*&---------------------------------------------------------------------*
*& Report ZMHK_EGT_0001
*&---------------------------------------------------------------------*
*&
*&---------------------------------------------------------------------*
REPORT ZMHK_EGT_0001.

DATA: gv_var1 TYPE p DECIMALS 2,
      gv_var2 TYPE int4,
      gv_var3 TYPE n,
      gv_var4 TYPE c,
      gv_var5 TYPE string.

gv_var1 = '14.53'.
gv_var2 = 1453.
gv_var3 = 5.
gv_var4 = 'M'.
gv_var5 = 'Mehmet Hüsna Kýþla.'.

WRITE: 'Variable 1: ',gv_var1,
       /'Variable 2: ',gv_var2,
       /'Variable 3: ',gv_var3,
       /'Variable 4: ',gv_var4,
       /'Variable 5: ',gv_var5.