# -*- coding: utf-8 -*-
"""
Created on Fri Feb  4 10:06:52 2022

@author: mehme
"""

import cv2
import numpy as np

def draw(event, x, y, flags, param):
    
    if event == cv2.EVENT_LBUTTONDBLCLK:
        cv2.circle(screen, (x, y), 50, (255, 0, 0), 3)

screen = np.ones((512, 512, 3), np.uint8)

cv2.namedWindow("Paint")
cv2.setMouseCallback("Paint", draw)

while(1):
    cv2.imshow("Paint", screen)
    if cv2.waitKey(1) & 0xFF == ord("q"):
        break
    
cv2.destroyAllWindows()