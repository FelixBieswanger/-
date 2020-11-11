import math


a = [[1, 2, 3], [99, 100, 101], [50, 100, 150], [1, 100, 199]]


def mittelwert(array):
    sum = 0
    for el in array:
        sum += el
    return sum/len(array)


def varianz(array):
    abweich = 0
    mittel = mittelwert(array)
    for el in array:
        abweich += math.pow(abs(el-mittel), 2)

    return abweich/(len(array)-1)


def standardabweichung(array):
    return math.sqrt(varianz(array))


def norm_stand(array):
    return standardabweichung(array)/mittelwert(array)


for el in a:
    print(el)
    print("=====")
    print("mittel", mittelwert(el))
    print("varianz", varianz(el))
    print("stand", standardabweichung(el))
    print("nord_stand", norm_stand(el))
    print()
    print()
    print()
