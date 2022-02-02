# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 13:24:40 2022

@author: mehme
"""

import cv2
import numpy as np

screen = np.zeros((512, 512, 3), np.uint8)

cv2.rectangle(screen, (100, 100), (400, 400), (0, 0, 255), 5)
cv2.rectangle(screen, (150, 150), (350, 350), (255, 215, 155), -1)

cv2.imshow("Screen", screen)
cv2.waitKey(0)
cv2.destroyAllWindows()