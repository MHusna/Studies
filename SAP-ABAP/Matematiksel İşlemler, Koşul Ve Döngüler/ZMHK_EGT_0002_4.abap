*&---------------------------------------------------------------------*
*& Report ZMHK_EGT_0002_4
*&---------------------------------------------------------------------*
*&
*&---------------------------------------------------------------------*
REPORT ZMHK_EGT_0002_4.

DATA: gv_var1 TYPE int1,
      gv_var2 TYPE int1.

gv_var1 = 10.
gv_var2 = 15.

IF gv_var1 > gv_var2.
  WRITE: gv_var1,' > ', gv_var2.
ELSEIF gv_var2 > gv_var1.
  WRITE: gv_var1,' < ', gv_var2.
ELSE.
  WRITE: gv_var1,' = ', gv_var2.
ENDIF.

"Büyüktür küçüktür iþaretlerinin yerine kullanýlabilecek ifadeler.
*=  --> EQ (equal)
*<  --> LT (less than)
*>  --> GT (greater than)
*<= --> LE (less than equal)
*>= --> GE (greater than equal)