# -*- coding: utf-8 -*-
"""
Created on Fri Feb  4 11:06:57 2022

@author: mehme
"""

import cv2
import numpy as np

def nothing(x):
    pass

screen = np.zeros((512, 512, 3), np.uint8)
cv2.namedWindow("Screen")
cv2.createTrackbar("R", "Screen", 0, 255, nothing)
cv2.createTrackbar("G", "Screen", 0, 255, nothing)
cv2.createTrackbar("B", "Screen", 0, 255, nothing)
cv2.createTrackbar("ON/OFF", "Screen", 0, 1, nothing)

while(1):
    cv2.imshow("Screen", screen)
    
    #27 ==> ESC demek.
    if cv2.waitKey(1) & 0xFF == 27:
        break

    r = cv2.getTrackbarPos("R", "Screen")
    g = cv2.getTrackbarPos("G", "Screen")
    b = cv2.getTrackbarPos("B", "Screen")

    switch = cv2.getTrackbarPos("ON/OFF", "Screen")
    
    if switch: 
        screen[:] = [b,g,r]
    
    else:
        screen[:] = 0
    
cv2.destroyAllWindows()