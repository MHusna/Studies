website = "http://www.facebook.com"
course = "Python Programming: Your Zero To Advice Level Python Programming Guide (40 Hour)"

# 1- How many character does course string has ?
print("Length of Course String: {}".format(len(course)))

# 2- Get 'www' from inside the website string.
print(website[7:10])

# 3- Get 'com' from inside the website string.
lengthOfWebsite = len(website)
print(website[lengthOfWebsite - 3:lengthOfWebsite])

# 4- Get first and last 15 character from inside the course string.
print(course[:15])
lengthOfCourse = len(course)
print(course[lengthOfCourse - 15:lengthOfCourse])

# 5- Print reverse the course string.
print(course[::-1])

# 6- Change 'w' with 'W' inside the 'Hello world.' string.
helloString = 'Hello world.'
helloString = helloString.replace("w", "W")
print(helloString)

# 7- Print 3 times 'abc' string.
print('abc'*3)