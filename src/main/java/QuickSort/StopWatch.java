package QuickSort;

import java.util.Date;

public class StopWatch {
    private double startTime;
    private double endTime;

    StopWatch(){
        Date date = new Date();
        this.startTime = date.getTime();
    };

    public double getStartTime(){
        return this.startTime;
    }
    public double getEndTime(){
        return this.endTime;
    }

    public void start(){
        Date date = new Date();
        this.startTime = date.getTime();
    }
    public void stop(){
        Date date = new Date();
        this.endTime = date.getTime();
    }

    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
