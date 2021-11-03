package ss4_lop_va_doi_tuong_trong_java.bai_tap.lop_stop_watch;

import java.util.Date;

public class StopWatch {
    private double startTime, endTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

       public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapedTime(){
        return this.endTime - this.startTime;
    }



}
