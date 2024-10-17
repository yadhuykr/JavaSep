package assignments.arrays.classroomattendancetracker;

public class Attendance {
    String[] names=new String[5];

    public void find(String name){
        boolean attended=false;
        for(String nm:names){
            if(nm.equalsIgnoreCase(name)){
                attended=true;
                break;
            }
        }
        if(attended){
            System.out.println(name+" attended the class today");
        }
        else{
            System.out.println(name+" did not attend the class today");
        }
    }

}
