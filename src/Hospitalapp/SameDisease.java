package Hospitalapp;
import java.util.*;
/*Hospital record:
Create a patients record which includes name, number of days admitted, illness occurred, bill amount, doctor treated.
1. Add incoming patients
2. Delete outgoing patients
3. Display patients treated by particular doc
4. Display patients having same illness.
5. Display patient name who have billed lowest.
6. Exit*/
class patient
{
    String pname;
   String disease;

    public patient(String pname,String disease) {
        this.pname = pname;
        this.disease=disease;
    }


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
public class SameDisease
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        String name=ip.nextLine();
        String disease=ip.nextLine();

     /*   for(int i=0;i<n;i++)
        {
            arr[i]=ip.setPname();
        }*/
        patient p1=new patient(name,disease);
        patient p2=new patient("nandhu","headache");
        patient p3=new patient("nrmadha","headache");
        patient p4=new patient("padma","ulcer");
        patient p5=new patient("raj","throat pain");
        patient arr[]={p1,p2,p3,p4,p5};
        String arr2[]=new String[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i].getDisease()==arr[j].getDisease())
                {
                    arr2[i]=arr[i].getPname();
                    arr2[i]=arr[i].getDisease();

                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}

