# A list is symmetric if the first row is the same as the first column,
# the second row is the same as the second column and so on. Write a
# procedure, symmetric, which takes a list as input, and returns the
# boolean True if the list is symmetric and False if it is not.

def symmetric(inL):
    rows = len(inL)

    # If list is not empty
    if not inL:
        return True

    # If number of rows != number of columns
    if rows != len(inL[0]):
        return False

    # Loop through i rows
    for i in range(rows):
        # Loop through columns
        for j in range(i, rows):
            if inL[i][j] != inL[j][i]:
                return False
    return True

print(symmetric([[1, 2, 3],
               [2, 3, 4],
               [3, 4, 1]]))
#>>> True

#print symmetric([["cat", "dog", "fish"],
#                ["dog", "dog", "fish"],
#                ["fish", "fish", "cat"]])
#>>> True

#print symmetric([["cat", "dog", "fish"],
#                ["dog", "dog", "dog"],
#                ["fish","fish","cat"]])
#>>> False

#print symmetric([[1, 2],
#                [2, 1]])
#>>> True

#print symmetric([[1, 2, 3, 4],
#                [2, 3, 4, 5],
#                [3, 4, 5, 6]])
#>>> False

#print symmetric([[1,2,3],
#                 [2,3,1]])
#>>> False