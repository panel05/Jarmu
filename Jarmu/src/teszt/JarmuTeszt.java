package teszt;
import jarmu.Auto;
public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }
    
    public JarmuTeszt(){
        muntaSablonTeszt();
        haladAutoBeinditasNLKTezst();
        haladAutoBeinditassalTeszt();
    }

    private void muntaSablonTeszt() {
        int kapott = 7;
        int vart = 4;
        
        
        assert kapott == vart : "nem egyenlőek"; 
    }

    private void haladAutoBeinditasNLKTezst() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        
        assert kapott == vart : "beinditas nélkül is halad";
    }

    private void haladAutoBeinditassalTeszt() {
        Auto auto = new Auto();
        auto.beIndit();
        boolean kapott = auto.halad();
        boolean vart = false;
        
        assert kapott == vart : "nem halad";
    }
}
