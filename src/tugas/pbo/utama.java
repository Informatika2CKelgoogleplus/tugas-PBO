package tugas.pbo;

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
        fjr.setCity("Palangkaraya");
        fjr.setPhone("0857 5053 2336");
        fjr.setHobby("Sepakbola");
        
        utama gt = new utama("dua");
        gt.setName("GITA ISMADIANTI");
        gt.setEmail("ismadiantigita@gmail.com");
        gt.setGender("Female");
        gt.setCity("Jombang");
        gt.setPhone("0857 4843 9765");
        gt.setHobby("Makan");
        
        utama rna = new utama("tiga");
        rna.setName("RIANA WIDYANTI");
        rna.setEmail("riana.widianty@gmail.com");
        rna.setGender("Female");
        rna.setCity("Malang");
        rna.setPhone("0856 4999 6109");
        rna.setHobby("Dolen");
        
        utama ay = new utama("empat");
        ay.setName("AYU PURWANINGSIH");
        ay.setEmail("lunaayu5@gmail.com");
        ay.setGender("Female");
        ay.setCity("Tulungagung");
        ay.setPhone("0857 8520 3133");
        ay.setHobby("Menulis");
        
        ArrayList<String> org = new ArrayList<String>();
        org.add("Name    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nCity    : "+fjr.getCity()+"\nPhone   : "+fjr.getPhone()+"\nHobby   : "+fjr.getHobby());
        org.add("Name    : "+gt.getName()+"\nE-mail  : "+gt.getEmail()+"\nGender  : "+gt.getGender()+"\nCity    : "+gt.getCity()+"\nPhone   : "+gt.getPhone()+"\nHobby   : "+gt.getHobby());
        
        ArrayList<String> klg = new ArrayList<String>();
        klg.add("Name    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nCity    : "+fjr.getCity()+"\nPhone   : "+fjr.getPhone()+"\nHobby   : "+fjr.getHobby());
        klg.add("Name    : "+ay.getName()+"\nE-mail  : "+ay.getEmail()+"\nGender  : "+ay.getGender()+"\nCity    : "+ay.getCity()+"\nPhone   : "+ay.getPhone()+"\nHobby   : "+ay.getHobby());
        klg.add("Name    : "+rna.getName()+"\nE-mail  : "+rna.getEmail()+"\nGender  : "+rna.getGender()+"\nCity    : "+rna.getCity()+"\nPhone   : "+rna.getPhone()+"\nHobby   : "+rna.getHobby());

        ArrayList<String> tmn = new ArrayList<String>();
        tmn.add("Name    : "+ay.getName()+"\nE-mail  : "+ay.getEmail()+"\nGender  : "+ay.getGender()+"\nCity    : "+ay.getCity()+"\n\nPhone   : "+ay.getPhone()+"\nHobby   : "+ay.getHobby());
        tmn.add("Name    : "+rna.getName()+"\nE-mail  : "+rna.getEmail()+"\nGender  : "+rna.getGender()+"\nCity    : "+rna.getCity()+"\nPhone   : "+rna.getPhone()+"\nHobby   : "+rna.getHobby());
        tmn.add("Nama    : "+gt.getName()+"\nE-mail  : "+gt.getEmail()+"\nGender  : "+gt.getGender()+"\nCity    : "+gt.getCity()+"\nPhone   : "+gt.getPhone()+"\nHobby   : "+gt.getHobby());
        
        ArrayList<String> kmp = new ArrayList<String>();
        kmp.add("Name    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nCity    : "+fjr.getCity()+"\nPhone   : "+fjr.getPhone()+"\nHobby   : "+fjr.getHobby());
        kmp.add("Name    : "+ay.getName()+"\nE-mail  : "+ay.getEmail()+"\nGender  : "+ay.getGender()+"\nCity    : "+ay.getCity()+"\nPhone   : "+ay.getPhone()+"\nHobby   : "+ay.getHobby());
        kmp.add("Name    : "+rna.getName()+"\nE-mail  : "+rna.getEmail()+"\nGender  : "+rna.getGender()+"\nCity    : "+rna.getCity()+"\nPhone   : "+rna.getPhone()+"\nHobby   : "+rna.getHobby());
        kmp.add("Name    : "+gt.getName()+"\nE-mail  : "+gt.getEmail()+"\nGender  : "+gt.getGender()+"\nCity    : "+gt.getCity()+"\nPhone   : "+gt.getPhone()+"\nHobby   : "+gt.getHobby());
        
        ArrayList<String> rbt = new ArrayList<String>();
        rbt.add("Name    : "+fjr.getName()+"\nE-mail  : "+fjr.getEmail()+"\nGender  : "+fjr.getGender()+"\nCity    : "+fjr.getCity()+"\n\nPhone   : "+fjr.getPhone()+"\nHobby   : "+fjr.getHobby());
        rbt.add("Name    : "+ay.getName()+"\nE-mail  : "+ay.getEmail()+"\nGender  : "+ay.getGender()+"\nCity    : "+ay.getCity()+"\nPhone   : "+ay.getPhone()+"\nHobby   : "+ay.getHobby());
        
        do{
            System.out.println("Daftar Cyrcle/Kelompok :");
            System.out.println("1. Kelas");
            System.out.println("2. Keluarga");
            System.out.println("3. Teman");
            System.out.println("4. Kampus");
            System.out.println("5. Robotika");
            System.out.print("Masukkan pilihan (1-5): ");
            Scanner scan = new Scanner(System.in);
            pil = scan.nextInt();
        }while(pil < 1 || pil > 5);
        
        if(pil==1){
            HashMap<String, utama> hshmp = new HashMap<>(1);
            hshmp.put("Kelas", new utama(org.get(0)+"\n"+"\n"+org.get(1)));
            
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
        else if(pil==4){
            HashMap<String, utama> hshmp = new HashMap<>(1);
            hshmp.put("Kampus", new utama(kmp.get(0)+"\n"+"\n"+kmp.get(1)+"\n"+"\n"+kmp.get(2)+"\n"+"\n"+kmp.get(3)));
            
            hshmp.forEach((k,v) -> 
            System.out.println("Cyrcle   : "+k+"\nDaftar  :\n"+v.getOrang()+"\n"));
        }
        if(pil==5){
            HashMap<String, utama> hshmp = new HashMap<>(1);
            hshmp.put("Robotika", new utama(rbt.get(0)+"\n"+"\n"+rbt.get(1)));
            
            hshmp.forEach((k,v) -> 
            System.out.println("Cyrcle   : "+k+"\nDaftar  :\n"+v.getOrang()+"\n"));
        }
    }
}
