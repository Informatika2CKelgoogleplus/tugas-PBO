package tugas.pbo;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class utama {
    public int data;
    public String kel;
    public String orang;
    public String nama;
    public String email;
    public String hp;

    public utama(int data){
        this.data = data;
        }
        public utama(String orang){
                this.orang = orang;
        }
        public void setData(int data){
                this.data = data;
        }
        public int getData(){
                return data;
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
        public void setNama(String nama){
                this.nama = nama;
        }
        public String getNama(){
                return nama;
        }
        public void setEmail(String email){
                this.email = email;
        }
        public String getEmail(){
                return email;
        }
        public void setHp(String hp){
                this.hp = hp;
        }
        public String getHp(String hp){
                return hp;
        }

        public static void main(String[]args){		
                utama qw = new utama("qw");
                qw.setNama("saya\n");
                qw.setEmail("qw@gmail.com");

                ArrayList<utama> obj = new ArrayList<>(1);		
                obj.add(new utama (1));

                ArrayList<utama> fajar = new ArrayList<>();
                fajar.add(new utama (qw.getNama()+qw.getEmail()));
                fajar.add(new utama ("dwinurfajar05@gmail.com"));

                ArrayList<utama> palui = new ArrayList<>();
                palui.add(new utama("Palui"));
                palui.add(new utama("palui@gmai.com"));

                HashMap<String, utama> hshmp = new HashMap<>(1);
                        hshmp.put("fajar", new utama("Nama  : DWI NUR FAJAR"+"\nEmail : dwinurfajar05@gmail.com"));
                        hshmp.put("palui", new utama("Nama  : PALUI"+"\nEmail  : palui@gmail.com"));

                for(utama a:obj){
                        System.out.println(a.getData());//angka
                }
                for(utama b:fajar){
                        System.out.println(b.getOrang()+"\n");//arraylist fjr
                }

            hshmp.forEach((k,v) -> 
                System.out.println("User  : "+k+"\nData  :\n"+v.getOrang()));
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");

            HashMap<String, utama> hshmp2 = new HashMap<>();
                hshmp2.put("palui2", new utama("Nama  : PALUI2"+"\nEmail  : palui2@gmail.com"));
        }

}
