package wizut.tpsi;

public class CalcForm {
    private int x;
    private int y;
    private String action;
    private int result;

    public CalcForm(int x, int y, String action) {
        this.x = x;
        this.y = y;
        this.action = action;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    
    
    public CalcForm() {
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
}
