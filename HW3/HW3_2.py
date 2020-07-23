def report(xs):
    # initialize variables
    numCount = 0
    nameCount = 0
    totalAge = 0
    output = ""

    # loop until the whole list has been processed
    i = 0
    while(i < len(xs)):
        # if element is an int it is added to the total
        if type(xs[i]) == int:
            numCount += 1
            totalAge += xs[i]
        # if the element is a string then enter this if
        elif type(xs[i]) == str:
            nameCount += 1
            #if there is no middle name then add name and age to total
            if type(xs[i+1]) == int and nameCount == 2:
                output += str(xs[i-1]) + ", "
                nameCount = 0
            # if there is a middle name add first and middle name
            elif nameCount == 3:
                output += str(xs[i - 1]) + " " + str(xs[i]) + ", "
                nameCount = 0
        i += 1
    output += "averaged "
    print(output, totalAge/numCount)

report(["Jill", "Johnson", 87, "Billy", "Ray", "Cyrus", 78, "Rita", "Yeats", 94, "Bobbie", "Sue","Palmer", 72])
