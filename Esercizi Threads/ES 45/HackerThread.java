public class HackerThread extends Thread {

    int pass_code;

    public HackerThread(int ThePass_code) {
        this.pass_code = ThePass_code;
    }
    
    public int getPass_code() {
        return pass_code;
    }

    public void setPass_code(Vault ThePass_code) {
        this.pass_code = ThePass_code.getPass_code();
    }

}
