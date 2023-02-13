package teszt;
import jarmu.Auto;
import jarmu.Jarmu;

class Hajo extends Jarmu{
    
}
public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }
    
    public JarmuTeszt(){
        muntaSablonTeszt();
        haladAutoBeinditasNLKTezst();
        haladAutoBeinditassalTeszt();
        haladJarmuBeinditassalTeszt();
        AutoTank();
        JarmuLeall();
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

    private void haladJarmuBeinditassalTeszt() {
       Hajo hajo = new Hajo();
       hajo.beIndit();
       
     boolean kapott = hajo.halad();
     boolean vart = true;
     
     assert kapott == vart : "Nem halad";
    }

    private void AutoTank() {
        Auto auto = new Auto();
        auto.tankol();
        boolean kapott = auto.tankol();
        boolean vart = false;
        
        assert kapott == vart : "Nem tankol ";
    }

    private void JarmuLeall() {
        Hajo hajo = new Hajo();
        hajo.leAllit();
        boolean kapott =hajo.leAllit();
        boolean vart = false;
        
        assert kapott == vart : "Nem áll le";
    }
}
