package jarmu;

    public abstract class Jarmu {

    public static void leall() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;
    
    public Jarmu() {
    
    }
    
    public void beIndit() {
        beinditva = true;
    }
    
    public boolean leAllit() {
        beinditva = false;
        return beinditva;
    }
    
    public boolean tankol() {
        if(beinditva) leAllit();
        if(uzemanyag != true) uzemanyag = true;
        return uzemanyag;
    }
    
    public boolean halad() {
        if(!beinditva) beIndit();
        return beinditva;
    }
}

