import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class utama {
    protected int pil;
    protected String kel;
    protected String orang;
    protected String name;
    protected String email;
    protected String gender;
    protected String city;
    protected String phone;

    public utama(int pil){
        this.pil = pil;
    }
    public utama(String orang){
        this.orang = orang;
    }
    public void setPil(int pil){
        this.pil = pil;
    }
    public int getPil(){
        return pil;
    }
    public void setKel(String kel){
        this.kel = kel;
    }
    public String getKel(){
        return kel;
    }
    public void setOrang(String orang){
        this.orang = orang;
    }
    public String getOrang(){
        return orang;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

    public static void main(String[]args){	
        //Scanner scan = new Scanner(System.in);
        int pil;
        utama fjr = new utama("satu");
        fjr.setName("DWI NUR FAJAR");
        fjr.setEmail("dwinurfajar05@gmail.com");
        fjr.setGender("Male");
        fjr.setCity("");
        fjr.setPhone("0857 5053 2336");
        
        utama gt = new utama("dua");
        gt.setName("GITA ISMADIANTI");
        gt.setEmail("ismadiantigita@gmail.com");
        gt.setGender("Female");
        gt.setCity("");
        gt.setPhone("0857 4843 9765");
        
        utama rna = new utama("tiga");
        rna.setName("RIANA WIDYANTI");
        rna.setEmail("riana.widianty@gmail.com");
        rna.setGender("Female");
        rna.setCity("");
        rna.setPhone("0856 4999 6109");
        
        utama ay = new utama("empat");
        ay.setName("AYU PURWANINGSIH");
        ay.setEmail("lunaayu5@gmail.com");
        ay.setGender("Female");
        ay.setCity("");
        ay.setPhone("0857 8520 3133");

        ArrayList<String> org = new ArrayList<String>();
        org.add("Nama    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nHP      : "+fjr.getPhone());
        org.add("Nama    : "+gt.getName()+"\nE-mail  : "+gt.getEmail()+"\nGender  : "+gt.getGender()+"\nHP      : "+gt.getPhone());
        
        ArrayList<String> klg = new ArrayList<String>();
        klg.add("Nama    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nHP      : "+fjr.getPhone());
        klg.add("Nama    : "+ay.getName()+"\nE-mail  : "+ay.getEmail()+"\nGender  : "+ay.getGender()+"\nHP      : "+ay.getPhone());
        klg.add("Nama    : "+rna.getName()+"\nE-mail  : "+rna.getEmail()+"\nGender  : "+rna.getGender()+"\nHP      : "+rna.getPhone());

        System.out.println("Daftar Cyrcle/Kelompok :");
        System.out.println("1. Musuh");
        System.out.print("pilihan : ");
        Scanner scan = new Scanner(System.in);
        pil = scan.nextInt();
        
        if(pil==1){
            HashMap<String, utama> hshmp = new HashMap<>(1);
            hshmp.put("Musuh", new utama(org.get(0)+"\n"+"\n"+org.get(1)));
            
            hshmp.forEach((k,v) -> 
            System.out.println("Cyrcle   : "+k+"\nDaftar  :\n"+v.getOrang()+"\n"));

        }
//        HashMap<String, utama> hshmp = new HashMap<>(1);
//            hshmp.put("Musuh", new utama(org.get(0)+"\n"+"\n"+org.get(1)));
//            hshmp.put("Keluarga", new utama(klg.get(0)+"\n"+"\n"+klg.get(1)+"\n"+"\n"+klg.get(2)));
//
//        hshmp.forEach((k,v) -> 
//            System.out.println("Cyrcle   : "+k+"\nDaftar  :\n"+v.getOrang()+"\n"));
    }
}
