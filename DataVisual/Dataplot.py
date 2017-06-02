import matplotlib.pyplot as plt
#I made my own data set it is small but it works
age = [16,20,25, 35, 45, 55, 65]
income = [420, 528, 758, 950, 962, 954, 888]
plt.title('Average income per age')
plt.xlabel('Age in Years')
plt.ylabel('Income in Dollars')
plt.plot(age, income, color = 'red')
plt.axes([16, 65, 400, 1000])
plt.show()


