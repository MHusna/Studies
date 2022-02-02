# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 13:28:12 2022

@author: mehme
"""

import cv2
import numpy as np

screen = np.zeros((512, 512, 3), np.uint8)

cv2.circle(screen, (255, 255), 60, (120, 90, 150), 3)
cv2.circle(screen, (255, 255), 30, (200, 200, 230), -1)

cv2.imshow("Screen", screen)
cv2.waitKey(0)
cv2.destroyAllWindows()