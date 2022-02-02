# -*- coding: utf-8 -*-
"""
Created on Wed Feb  2 14:17:17 2022

@author: mehme
"""

import cv2
import numpy as np

screen = np.zeros((512, 512, 3), np.uint8)

font = cv2.FONT_HERSHEY_COMPLEX
cv2.putText(screen, "MHusna", (0, 200), font, 2, (0, 0, 255), 2, cv2.LINE_AA)

cv2.imshow("Screen", screen)
cv2.waitKey(0)
cv2.destroyAllWindows()