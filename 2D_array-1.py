# Created by : Sidney Kang
# Created on : 20 Nov. 2017
# Created for : ICS3UR
# Daily Assignment - Unit5-05
# This program

from numpy import random

numbers = []
numbers.append([])
numbers.append([])


def calculate_average(numbers):
    
    average = float((sum(numbers[0]) + sum(numbers[1])) / (len(numbers[0]) + len(numbers[1])))
    
    return average

length_of_first_column = raw_input("How long do you want the first array to be? ")
length_of_first_column = int(length_of_first_column)
length_of_second_column = raw_input("How long do you want the second array to be? ")
length_of_second_column = int(length_of_second_column)


for how_long_first_column in range(length_of_first_column):
    numbers[0].append(random.randint(1,50))
for how_long_secind_column in range(length_of_second_column):
    numbers[1].append(random.randint(1,50))
    
print(numbers)

calculate_average(numbers)  
	
print_average = calculate_average(numbers)
print("The average is: " + str(print_average))
