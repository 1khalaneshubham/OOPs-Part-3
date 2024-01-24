import java.util.*;

public class IntefacesCode {
    
    public static void main(String[] args) {
        
        King a = new King();
        a.moves();
        System.out.println("==============================");
        Queen b = new Queen();
        b.moves();
        System.out.println("==============================");
        Rook c = new Rook();
        c.moves();
    }
}

interface ChessPlayer {
    void moves();

}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,Down,left,right,diagonal(In all 4 direaction)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up,Down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up,Down,left,right,diagonal(by 1 steps)");
    }
}

