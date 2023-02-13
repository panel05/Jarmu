package jarmu;

    public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;
    
    public Jarmu() {
    
    }
    
    public void beIndit() {
        beinditva = true;
    }
    
    public void leAllit() {
        beinditva = false;
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

