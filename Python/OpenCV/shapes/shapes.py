# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 13:15:02 2022

@author: mehme
"""

import cv2
import numpy as np

screen = np.zeros((512, 512, 3), np.uint8)

cv2.line(screen, (0,0), (511,511), (255, 0, 0), 5)
cv2.line(screen, (0,511), (511,0), (0, 0, 255), 5)

cv2.imshow("Screen", screen)
cv2.waitKey(0)
cv2.destroyAllWindows()