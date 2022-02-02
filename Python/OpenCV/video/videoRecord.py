# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 10:34:34 2022

@author: mehme
"""

import cv2

cam = cv2.VideoCapture(0)
fourcc = cv2.VideoWriter_fourcc(*'XVID')
out = cv2.VideoWriter("record.avi",fourcc,30.0,(640,480))

while cam.isOpened():
    
    ret, frame = cam.read()
    
    if not ret:
        print("Kameradan görüntü alınamadı.")
        break
    
    out.write(frame)
    cv2.imshow("Camera", frame)
    
    if cv2.waitKey(1) & 0xFF == ord("q"):
        print("Videodan ayrıldınız.")
        break

cam.release()
out.release()
cv2.destroyAllWindows()