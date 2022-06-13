package ss4_OOP.bai_tap;

import sun.security.mscapi.CPublicKey;

import java.util.Date;

public class Watch {
    private Date startTime;
    private Date endTime;
    public Watch () {
        this.startTime = new Date();
        this.endTime = new Date();
    }
    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start(){ //phuong thuc der set thoi gian
        this.startTime = new Date();
    }
    public void stop(){
        this.endTime=new Date();
    }
    public long getElapsedTime (){
        return endTime.getTime() - startTime.getTime();
    }
}
