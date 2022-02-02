# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 08:57:08 2022

@author: mehme
"""

import cv2

cam = cv2.VideoCapture(0)

if not cam.isOpened():
    print("Kamera tanınmadı.")
    exit()
    
while(True):
    ret, frame = cam.read()
    
    if not ret:
        print("Kameradan görüntü okunamıyor.")
        break
    
    cv2.imshow("camera",frame)
    
    if cv2.waitKey(1) & 0xFF == ord("q"):
        print("Görüntü sonlandırıldı.")
        break

cam.release()
cv2.destroyAllWindows()