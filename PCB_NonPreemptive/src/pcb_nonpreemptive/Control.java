package pcb_nonpreemptive;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import javax.swing.JTable;
import java.util.Timer;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Control {

    PCB obj;
    
    ArrayList<PCB> JOBQueue = new ArrayList<PCB>();
    ArrayList<PCB> ReadyQueue = new ArrayList<PCB>();
    ArrayList<PCB> IOQueue = new ArrayList<PCB>();
    ArrayList<PCB> CDQueue = new ArrayList<PCB>();
    ArrayList<PCB> USBQueue = new ArrayList<PCB>();
    ArrayList<PCB> TerminateQueue = new ArrayList<PCB>();

    int clock = 0;
    int timeburst;
    int ioT = 0;
    int i;
    int processID = 1;
    int avgWa = 0;
    int avgT = 0;
    int pri = 0;

    Control() {

    }

    void addProcess(int count) {
        obj = new PCB(processID, 0, (int) (Math.random() * (21) + 10), count, (int) (Math.random() * (21) + 10), 0);
        processID++;
        JOBQueue.add(obj);
        ReadyQueue.add(obj);
        IOQueue.add(obj);
    }

    String showJobQ() {
        String row = "";
        for (int index = 0; index < JOBQueue.size(); index++) {
            row = row + JOBQueue.get(index).getProcessID() + " ";
            row = row + JOBQueue.get(index).getStatus() + " ";
            row = row + JOBQueue.get(index).getPriority() + " ";
            row = row + JOBQueue.get(index).getArrivalTime() + " ";
            row = row + JOBQueue.get(index).getBurstTime() + " ";
            row = row + JOBQueue.get(index).getWating_Time() + " ";
            row = row + ",";
        }
        return row;
    }

    String showReadyQueue() {

        String row = "";
        for (int index = 0; index < ReadyQueue.size(); index++) {
            row = row + ReadyQueue.get(index).getProcessID() + " ";
            row = row + ReadyQueue.get(index).getStatus() + " ";
            row = row + ",";
        }
        return row;
    }

    String showTerminateQueue() {
        String row = "";
        for (int index = 0; index < TerminateQueue.size(); index++) {
            row = row + TerminateQueue.get(index).getProcessID() + " ";
            row = row + TerminateQueue.get(index).getStatus() + " ";
            row = row + ",";
        }
        return row;
    }

    String showCDQueue() {
        String row = "";
        for (int index = 0; index < CDQueue.size(); index++) {
            row = row + CDQueue.get(index).getProcessID() + " ";
            row = row + CDQueue.get(index).getStatus() + " ";
            row = row + CDQueue.get(index).getIoTime() + " ";
            row = row + ",";
        }
        return row;
    }

    String showUSBQueue() {
        String row = "";
        for (int index = 0; index < USBQueue.size(); index++) {
            row = row + USBQueue.get(index).getProcessID() + " ";
            row = row + USBQueue.get(index).getStatus() + " ";
            row = row + USBQueue.get(index).getIoTime() + " ";
            row = row + ",";
        }
        return row;
    }

    void waitting(int count) {
        for (int i = 0; i < JOBQueue.size(); i++) {
            if (JOBQueue.get(i).getStatus() != "Running" && JOBQueue.get(i).getStatus() != "Waiting" && JOBQueue.get(i).getStatus() != "Terminate") {
                if (JOBQueue.get(i).getBurstTime() >= 1) {
                    JOBQueue.get(i).setWating_Time(count - JOBQueue.get(i).getArrivalTime());
                }
            }
        }
    }

    void ioCD(int count) {
        try {
            for (int i = 0; i < JOBQueue.size(); i++) {
                if (CDQueue.get(i).getStatus() == "Waiting") {                  //if CDQueue = "Waiting"
                    CDQueue.get(i).setIoTime(CDQueue.get(i).getBurstTime());    //set io++ follow bursttime
                    if(JOBQueue.get(i).getBurstTime() < 1)
                        {
                            JOBQueue.remove(0);
                            TerminateQueue.add(CDQueue.get(i));
                        }
                }
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    void ioUSB(int count) {
        try {
            for (int i = 0; i < JOBQueue.size(); i++) {
                if (USBQueue.get(i).getStatus() == "Waiting") {                  //if USBQueue = "Waiting"
                    USBQueue.get(i).setIoTime(USBQueue.get(i).getBurstTime());   //set io++ follow bursttime
                }
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    void Cpuscheduler(int count) {
        try {
            for (int i = 0; i < JOBQueue.size(); i++) {
                if (ReadyQueue.get(0) == JOBQueue.get(i)) {
                    JOBQueue.get(i).setStatus(2);                   //running
                    timeburst = JOBQueue.get(i).getBurstTime();
                    timeburst = timeburst - 1;                      //timeburst droptime
                    JOBQueue.get(i).setBurstTime(timeburst);        //show timeburst at BurstTime
                    if (timeburst < 1) {           
                        JOBQueue.get(i).setStatus(4);               //terminate
                        removeQueue(i, count);
                        endCD(i);
                    } else if (timeburst < 0) {
                        removeQueue(i, count);                      //terminate out
                        endCD(i);                                   
                        endUSB(i);
                        //removeWaitingQueue(i, count);
                        /*
                        if(JOBQueue.get(i).getStatus() == "Waiting" && timeburst < 1)
                        {
                            removeWaitingQueue(i, count);
                            //JOBQueue.remove(i);
                        }*/
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }

    void usingCD() {
        try {
            for (int i = 0; i < JOBQueue.size(); i++) {
                int io = CDQueue.get(i).getBurstTime();
                io = io - 1;                                    //IO downtime
                CDQueue.get(i).setBurstTime(io);                //show IOtime at BurstTime
                if (io < 0) {
                    CDQueue.get(i).setStatus(4);                //terminate
                    TerminateQueue.add(CDQueue.get(i));         //table terminate add CDQueue
                    CDQueue.remove(0);                          //CDQueue out
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }

    void usingUSB() {
        try {
            for (int i = 0; i < JOBQueue.size(); i++) {
                int io = USBQueue.get(i).getBurstTime();
                io = io - 1;                                    //IO downtime
                USBQueue.get(i).setBurstTime(io);               //show IOtime at BurstTime
                if (io < 0) {
                    USBQueue.get(i).setStatus(4);               //terminate
                    TerminateQueue.add(USBQueue.get(i));        //table terminate add USBQueue
                    USBQueue.remove(0);                         //USBQueue out
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }

    void nextProcess() {
        for (i = 0; i < JOBQueue.size(); i++) {
            if (JOBQueue.get(i).getProcessID() == 1) {

            } else {
                if (JOBQueue.get(i).getBurstTime() == 0) {
                    JOBQueue.get(i).setStatus(4);               //terminate
                } else {
                    JOBQueue.get(i).setStatus(1);               //Ready
                }
            }
        }
    }

    void removeQueue(int count) {                                    //Terminatr JOBQ press button
        for (int i = 0; i < JOBQueue.size(); i++) {
            if (ReadyQueue.get(0) == JOBQueue.get(i)) {
                JOBQueue.get(i).setStatus(4);
                TerminateQueue.add(JOBQueue.get(i));
                avgWatime(JOBQueue.get(i).getWating_Time());
                avgTurntime(count - JOBQueue.get(i).getArrivalTime());
                JOBQueue.remove(i);
                ReadyQueue.remove(0);
                break;
            }
        }
    }

    void removeQueue(int i, int count) {                            //Remove prcess JOBQ don't button
        JOBQueue.get(i).setStatus(4);
        TerminateQueue.add(JOBQueue.get(i));
        avgWatime(JOBQueue.get(i).getWating_Time());
        avgTurntime(count - JOBQueue.get(i).getArrivalTime());
        JOBQueue.remove(i);
        ReadyQueue.remove(0);
    }

    void Algorithm() {
        int a, b;
        PCB object = new PCB();
        for (a = 1; a < ReadyQueue.size(); ++a) {     // 1 1<0 1 2 ++1
            for (b = 1; b < ReadyQueue.size() - 1; ++b) {
                if (ReadyQueue.get(b).getPriority() < ReadyQueue.get(b + 1).getPriority()) {
                    object = ReadyQueue.get(b);
                    ReadyQueue.set(b, ReadyQueue.get(b + 1));
                    ReadyQueue.set(b + 1, object);
                }
            }
        }
    }

    void avgWatime(int avgWat) {
        avgWa = avgWa + avgWat;
    }

    void avgTurntime(int count) {
        avgT = count;
    }

    String showWatime() {
        try {
            int avg;
            avg = avgWa / TerminateQueue.size();
            return avg + " ";
        } catch (ArithmeticException e) {

        }
        return null;
    }

    String turnAround() {

        try {
            int turn;
            turn = avgT / TerminateQueue.size();

            return turn + " ";

        } catch (ArithmeticException e) {

        }
        return null;
    }

    void addCD(int count) {
        for (int i = 0; i < JOBQueue.size(); i++) {
            //if (ReadyQueue.get(0) == JOBQueue.get(i)) {
                JOBQueue.get(i).setStatus(3);
                CDQueue.add(JOBQueue.get(i));
                avgTurntime(count - JOBQueue.get(i).getArrivalTime());
                //JOBQueue.remove(i);
                ReadyQueue.remove(0);
                break;
            //}
        }
    }

    void endCD(int count) {
        for (int i = 0; i < JOBQueue.size(); i++) {
            JOBQueue.get(i).setStatus(1); //ready
            CDQueue.get(i).setStatus(1);
            ReadyQueue.add(CDQueue.get(i));
            CDQueue.remove(0);
            
            /*JOBQueue.add(CDQueue.get(i));
            ReadyQueue.add(CDQueue.get(i));
            CDQueue.get(i).setStatus(1);
            avgTurntime(count - JOBQueue.get(i).getArrivalTime());
            CDQueue.remove(0);*/
            break;
        }
    }

    void endCD(int i,int count) {
        TerminateQueue.add(CDQueue.get(i));
        CDQueue.get(i).setStatus(4);
        avgTurntime(count - JOBQueue.get(i).getArrivalTime());
        CDQueue.remove(0);
    }

    void addUSB() {
        for (int i = 0; i < JOBQueue.size(); i++) {
            if (ReadyQueue.get(0) == JOBQueue.get(i)) {
                JOBQueue.get(i).setStatus(3);
                USBQueue.add(JOBQueue.get(i));
                JOBQueue.remove(i);
                ReadyQueue.remove(0);
                break;
            }
        }
    }

    void endUSB() {
        for (int i = 0; i < JOBQueue.size(); i++) {
            JOBQueue.add(USBQueue.get(i));
            ReadyQueue.add(USBQueue.get(i));
            USBQueue.get(i).setStatus(1);
            USBQueue.remove(0);
            break;
        }
    }

    void endUSB(int i) {
        TerminateQueue.add(USBQueue.get(i));
        USBQueue.get(i).setStatus(4);
        USBQueue.remove(0);
    }
}
