*&---------------------------------------------------------------------*
*& Report ZMHK_EGT_0002_5
*&---------------------------------------------------------------------*
*&
*&---------------------------------------------------------------------*
REPORT ZMHK_EGT_0002_5.

DATA gv_var1 type STRING.

gv_var1 = 'Monday'.

CASE gv_var1.
  WHEN 'Monday'.
    WRITE 'Today is 1st day of the week.'.
  WHEN 'Tuesday'.
    WRITE 'Today is 2nd day of the week.'.
  WHEN 'Wednesday'.
    WRITE 'Today is 3rd day of the week.'.
  WHEN 'Thursday'.
    WRITE 'Today is 4th day of the week.'.
  WHEN 'Friday'.
    WRITE 'Today is 5th day of the week.'.
  WHEN 'Saturday'.
    WRITE 'Today is 6th day of the week.'.
  WHEN 'Sunday'.
    WRITE 'Today is 7th day of the week.'.
  WHEN OTHERS.
    WRITE 'This day not defined.'.
ENDCASE.