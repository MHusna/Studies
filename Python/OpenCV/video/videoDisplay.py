# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 10:08:31 2022

@author: mehme
"""

import cv2

cam = cv2.VideoCapture("Car.mp4")

while(cam.isOpened()):
    
    ret, frame = cam.read()
    frame = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    
    if not ret: 
        print("Kameradan görüntü okunamıyor.")
        break
    
    cv2.imshow("Video", frame)
    
    if cv2.waitKey(1) & 0xFF == ord("q"):
        print("Video kapatıldı.")
        break
    
cam.release()
cv2.destroyAllWindows()