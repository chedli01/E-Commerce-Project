package Final;

import java.util.ArrayList;

public class AdminList {
    static ArrayList<Admin> admins=new ArrayList<>();

    public static void showAdmins(){
        for (int i=0;i<admins.size();i++){
            System.out.println("Admin  "+i+" : "+admins.get(i).getUsername());
        }
    }
    public static void addAdmin(Admin admin){
        admins.addLast(admin);
    }
    public static boolean searchAdmin(Admin admin){
        int i=0;
        while (i< admins.size()){
            if ((admins.get(i).getUsername().equals(admin.getUsername()))&&(admins.get(i).getPassword().equals(admin.getPassword()))){
                return true;
            }
            i++;
        }
        return false;
    }
}
