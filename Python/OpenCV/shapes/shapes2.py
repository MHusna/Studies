# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 14:09:34 2022

@author: mehme
"""

import cv2
import numpy as np

screen = np.zeros((512, 512, 3), np.uint8)

pts = np.array([[20, 30], [100, 120], [255, 255], [10, 400]], np.int32)
pts2 = pts.reshape(-1, 1, 2)

cv2.polylines(screen, [pts], True, (255, 255, 255), 3)

cv2.imshow("screen", screen)
cv2.waitKey(0)
cv2.destroyAllWindows()