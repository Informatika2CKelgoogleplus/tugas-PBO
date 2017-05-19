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
    protected String hobby;
    
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
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }

    public static void main(String[]args){
        int pil;
        utama fjr = new utama("satu");
        fjr.setName("DWI NUR FAJAR");
        fjr.setEmail("dwinurfajar05@gmail.com");
        fjr.setGender("Male");
        fjr.setCity("kalimantan");
        fjr.setPhone("0857 5053 2336");
        fjr.setHobby("sepakbola");
        
        utama gt = new utama("dua");
        gt.setName("GITA ISMADIANTI");
        gt.setEmail("ismadiantigita@gmail.com");
        gt.setGender("Female");
        gt.setCity("jombang");
        gt.setPhone("0857 4843 9765");
        gt.setHobby("makan");
        
        utama rna = new utama("tiga");
        rna.setName("RIANA WIDYANTI");
        rna.setEmail("riana.widianty@gmail.com");
        rna.setGender("Female");
        rna.setCity("Malang");
        rna.setPhone("0856 4999 6109");
        rna.setHobby("dolen");
        
        utama ay = new utama("empat");
        ay.setName("AYU PURWANINGSIH");
        ay.setEmail("lunaayu5@gmail.com");
        ay.setGender("Female");
        ay.setCity("Tulungagung");
        ay.setPhone("0857 8520 3133");
        ay.setHobby("menulis");
        
        ArrayList<String> org = new ArrayList<String>();
        org.add("Nama    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nHP      : "+fjr.getPhone());
        org.add("Nama    : "+gt.getName()+"\nE-mail  : "+gt.getEmail()+"\nGender  : "+gt.getGender()+"\nHP      : "+gt.getPhone());
        
        ArrayList<String> klg = new ArrayList<String>();
        klg.add("Nama    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nHP      : "+fjr.getPhone());
        klg.add("Nama    : "+ay.getName()+"\nE-mail  : "+ay.getEmail()+"\nGender  : "+ay.getGender()+"\nHP      : "+ay.getPhone());
        klg.add("Nama    : "+rna.getName()+"\nE-mail  : "+rna.getEmail()+"\nGender  : "+rna.getGender()+"\nHP      : "+rna.getPhone());

        ArrayList<String> tmn = new ArrayList<String>();
        tmn.add("Nama    : "+ay.getName()+"\nE-mail  : "+ay.getEmail()+"\nGender  : "+ay.getGender()+"\nHP      : "+ay.getPhone());
        tmn.add("Nama    : "+rna.getName()+"\nE-mail  : "+rna.getEmail()+"\nGender  : "+rna.getGender()+"\nHP      : "+rna.getPhone());
        tmn.add("Nama    : "+gt.getName()+"\nE-mail  : "+gt.getEmail()+"\nGender  : "+gt.getGender()+"\nHP      : "+gt.getPhone());
        
        System.out.println("Daftar Cyrcle/Kelompok :");
        System.out.println("1. Musuh");
        System.out.println("2. Keluarga");
        System.out.println("3. Teman");
        System.out.print("pilihan : ");
        Scanner scan = new Scanner(System.in);
        pil = scan.nextInt();
        
        if(pil==1){
            HashMap<String, utama> hshmp = new HashMap<>(1);
            hshmp.put("Musuh", new utama(org.get(0)+"\n"+"\n"+org.get(1)));
            
            hshmp.forEach((k,v) -> 
            System.out.println("Cyrcle   : "+k+"\nDaftar  :\n"+v.getOrang()+"\n"));
        }
        else if(pil==2){
            HashMap<String, utama> hshmp = new HashMap<>(1);
            hshmp.put("Keluarga", new utama(klg.get(0)+"\n"+"\n"+klg.get(1)+"\n"+"\n"+klg.get(2)));
            
            hshmp.forEach((k,v) ->
            System.out.println("Cyrcle   : "+k+"\nDaftar  :\n"+v.getOrang()+"\n"));        
        }
        else if(pil==3){
            HashMap<String, utama> hshmp = new HashMap<>(1);
            hshmp.put("Teman", new utama(tmn.get(0)+"\n"+"\n"+tmn.get(1)+"\n"+"\n"+tmn.get(2)));
            
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
