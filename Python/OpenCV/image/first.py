# -*- coding: utf-8 -*-
"""
Created on Tue Feb  1 13:34:25 2022

@author: mehme
"""

import cv2
from matplotlib import pyplot as plt


#0 parametresi, resimi siyah beyaz hale getiriyor.
#image = cv2.imread("kizkulesi.jpg")

image = cv2.imread("kizkulesi.jpg", 0)
cv2.imshow("Image Window",image)

plt.imshow(image, cmap="gray")
plt.show()

key = cv2.waitKey(0)

if(key == 27):
    print("ESC tuşuna basıldı.")

elif(key == ord("q")):
    print("q tuşuna basıldı ve resim kayıt edildi.")
    cv2.imwrite("kizkulesi_gri.jpg",image)
    
cv2.destroyWindow("Image Window")
#cv2.destroyAllWindows() ==> birden fazla resim olsaydı hepsini böyle kapatırdık.