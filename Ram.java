import java.util.ArrayList;

public class Ram{
    private String type;
    private int initial_space;
    private int total_space;
    public ArrayList<Program> process; 
    public ArrayList<Program> waitlist;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getInitial_space() {
        return initial_space;
    }
    public void setInitial_space(int initial_space) {
        this.initial_space = initial_space;
    }
    public int getTotal_space() {
        return total_space;
    }
    public void setTotal_space(int total_space) {
        this.total_space = total_space;
    }
    public ArrayList<Program> getProcess() {
        return process;
    }
    public void setProcess(ArrayList<Program> process) {
        this.process = process;
    }
    public ArrayList<Program> getWaitlist() {
        return waitlist;
    }
    public void setWaitlist(ArrayList<Program> waitlist) {
        this.waitlist = waitlist;
    }

}