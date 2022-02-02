# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 13:31:37 2022

@author: mehme
"""

import cv2
import numpy as np

screen = np.zeros((512, 512, 3), np.uint8)

cv2.ellipse(screen, (256, 256), (100, 50), 0, 0, 360, (255, 100, 0), 3)
cv2.ellipse(screen, (256, 256), (100, 50), 0, 0, 360, (255, 200, 100), -1)

cv2.imshow("Screen", screen)
cv2.waitKey(0)
cv2.destroyAllWindows()