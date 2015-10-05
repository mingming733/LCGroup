class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        # validate rows
        for i in xrange(9):
            if board[i].count('.') + len(set(board[i])) - 1 != 9: # set(list) deletes all duplicates in the list and includes the element ".", that is why "- 1"
                return False
        # validate columns
        for i in xrange(9):
            col = [board[j][i] for j in xrange(9)]
            if col.count('.') + len(set(col)) - 1 != 9: 
                return False
        # validate 3x3 squares
        for i in (0, 3, 6): # for horizontal traversal
            for j in (0, 3, 6): # for vertical traversal  
                square = []
                for m in (0, 1, 2):
                    for n in (0, 1, 2):
                        square.append(board[i + m][j + n])
                # square = [board[i + m][j + n] for m in (0, 1, 2) for n in (0, 1, 2)]
                if square.count('.') + len(set(square)) - 1 != 9: 
                    return False
        return True 

board = [".87654321", "2........", "3........", "4........", "5........", "6........", "7........", "8........", "9........"]
i = Solution()
print i.isValidSudoku(board)

    