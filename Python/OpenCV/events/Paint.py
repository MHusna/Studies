# -*- coding: utf-8 -*-
"""
Created on Fri Feb  4 10:24:53 2022

@author: mehme
"""

import cv2
import numpy as np

xi, yi = -1, -1
paint = False
mod = False

def draw(event, x, y, flags, param):
    global paint, xi, yi, mod
    
    if event == cv2.EVENT_LBUTTONDOWN:
        xi, yi = x, y
        paint = True
        
    elif event == cv2.EVENT_MOUSEMOVE:
        if paint == True:
            if mod:
                cv2.circle(screen, (xi, yi), 10, (100, 50, 50), -1)
            else:
                cv2.rectangle(screen, (xi, yi), (x, y), (50, 50, 100), -1)
        else: 
            pass
        
    elif event == cv2.EVENT_LBUTTONUP:
        paint = False

screen = np.ones((512, 512, 3), np.uint8)

cv2.namedWindow("Paint")
cv2.setMouseCallback("Paint", draw)

while(1):
    cv2.imshow("Paint", screen)
    if cv2.waitKey(1) & 0xFF == ord("q"):
        break
    if cv2.waitKey(1) & 0xFF == ord("m"):
        mod = not mod
    
    
cv2.destroyAllWindows()