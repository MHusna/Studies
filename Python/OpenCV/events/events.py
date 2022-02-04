# -*- coding: utf-8 -*-
"""
Created on Fri Feb  4 10:03:04 2022

@author: mehme
"""

import cv2

#Kullanabileceğimiz event'ler.
for i in dir(cv2):
    if 'EVENT' in i:
        print(i)