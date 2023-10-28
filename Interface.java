public class Interface {
    public static void main(String[] args) {
        Rook q = new Rook();
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); // by default : public, abstract
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal(in all 4 dir)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal(in all 4 dir by 1 step)");
    }
}