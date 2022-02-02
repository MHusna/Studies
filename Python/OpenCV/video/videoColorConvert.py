# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 09:08:53 2022

@author: mehme
"""

import cv2

cam = cv2.VideoCapture(0)

if not cam.isOpened():
    print("Kamera bulunmadı.")
    exit()

while(True):
    ret, frame = cam.read()
    
    frame = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    
    if not ret:
        print("Kameradan görüntü alınamadı.")
        break
    
    cv2.imshow("Camera", frame)
    
    if cv2.waitKey(1) & 0xFF == ord("q"):
        print("Görüntü sonlandırıldı.")
        break

cam.release()
cv2.destroyAllWindows()