package LeetCode;

/**
 * Created by deepaksharma on 12/21/17.
 */
public class StudentAttendanceRecord {

    public boolean checkRecord(String s) {
        if(s == null || s.length() == 0){
            return false;
        }

        if(s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL")){
            return false;
        }

        return true;
    }
}
