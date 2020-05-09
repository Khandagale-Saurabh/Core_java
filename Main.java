import java.io.File;




import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

 class Main{
    public static void main(String args[]){
        File f = new File("emp.txt");
        String data;
        String[] mon = new String[] {"January","February","March","April","May","June","July","August","Septembe","October","November","December"};
        Scanner sc;
        String[] group = new String[] {"","","","","","","","","","","",""};
        int[] cnt = new int[] {0,0,0,0,0,0,0,0,0,0,0,0};
        if(!f.exists()){
            System.out.println("The File does not exists..");
            return;
        }
        else{
            try{
            System.out.println("Reading from the file : " + f.getName());
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                String[] spt = data.split(" ");
                for(int i = 0; i < 12; i++){
                    if(mon[i].equals(spt[2])){
                        group[i] += "Name : " + spt[1] + ", Employee ID : " + spt[0] + "\n";
                        cnt[i] += 1;
                        break;
                    }
                }

            }
            sc.close();
            }
            catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
            for(int i= 0; i < 12; i++ ){
                System.out.println("The numbers of employees joined in " + mon[i] + " : " + cnt[i]);
                System.out.println(group[i] + "\n");
            }
        }
    }
}
