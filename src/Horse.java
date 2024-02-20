public class Horse extends ChessPiece{
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(toLine) && checkPos(toColumn)) {
            if (line == toLine || column == toColumn)
                return false;
            if (chessBoard.board[toLine][toColumn].color.equals(this.color)) {
                return false;
            }
            if ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 2))
                return true;

            return Math.abs(toLine - line) == 2 && Math.abs(toLine - line) == 1;
        }
        return false;
    }


    @Override
    public String getSymbol() {
        return "H";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

}
