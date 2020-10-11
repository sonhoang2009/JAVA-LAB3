package lab31;

public class VD12 {
    int rollNo;
    String Name;
    String Address;
    float marks;

    public VD12(){
        rollNo = 0;
        Name="";
        Address="";
        marks=0;
    }

    public VD12(int rNo,String sname){
        rollNo=rNo;
        Name=sname;
    }

    public VD12(int rNo,float score){
        rollNo=rNo;
        marks=score;
    }

    public VD12(String sname, String addr){
        Name=sname;
        Address=addr;
    }

    public VD12(int rNo, String sname, float score){
        rollNo=rNo;
        Name=sname;
        marks=score;
    }

    public void displayDetail(){
        System.out.println("Rollno"+rollNo);
        System.out.println("Student Name"+Name);
        System.out.println("Address "+Address);
        System.out.println("Score"+marks);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        VD12 objSutID = new VD12("David","302,Washington Street");
        objSutID.displayDetail();

        VD12 objStuID2 = new VD12(103,46);
        objStuID2.displayDetail();

        VD12 objStuID3 = new VD12(104,"Roger",50);
        objStuID3.displayDetail();
    }
}
