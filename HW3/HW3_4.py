def isAllowed(board, row, column):
    # check if there is another queen in the column
    for x in range(column):
        if board[row][x] == 1:
            return False
    # check if there is any queens in the diagonals
    for x, y in zip(range(row, -1, -1), range(column, -1, -1)):
        if board[x][y] == 1:
            return False
    for x, y in zip(range(row, 8, 1), range(column, -1, -1)):
        if board[x][y] == 1:
            return False
    return True

# places queens in each column from left to right
def placeQueens(board, column):
    # if all the columns on the board have been filled
    if column == 8:
        return True
    for x in range(0, 8):
        # if the space passes the restrictions place a queen
        if isAllowed(board, x, column):
            board[x][column] = 1
            # use recursion to place the rest of the
            if placeQueens(board, column + 1):
                return True
            # if solution not possible backtrack by removing queen
            board[x][column] = 0
    return False


def main():
    # initialize 8x8 board with zeros
    board = [[0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0],
             [0, 0, 0, 0, 0, 0, 0, 0]]

    # place queens on board
    placeQueens(board, 0)

    # print out board
    for x in range(0, 8):
        for y in range(0, 8):
            print(board[x][y], end=" ")
        print()

main()
