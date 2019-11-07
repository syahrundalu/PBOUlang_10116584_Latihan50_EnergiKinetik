/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan50_energikinetik;

/**
 *
 * @author syhar
 */
public class PBOUlang_10116584_Latihan50_EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKintetik x = new EnergiKintetik();
       
        x.setKecepatan(25);
        x.setMassa(145);
                
        System.out.println("==Menghitung Energi Kinetik==");
        System.out.println("Sebuah Bola baseball dengan massa "+x.getMassa()+" g"
                + "dilempar dengan kecepatan "+x.getKecepatan()+" m/s");
        System.out.println("a. Berapakah energi Kinetiknya ?");
        System.out.println("Diketahui");
        System.out.println("Massa Bola : "+x.getMassa()+" gram");
        System.out.println("Kecepatan Bola : "+x.getKecepatan()+" m/s");
        System.out.println("Energi Kinetiknya : "+ x.kinetikA()+" Joule");
        System.out.println("");
        System.out.println("b. Berapakah Usaha yang dilakukan pada bola untuk mencapai kecepatan ini,"
                + "\n jika dimulai dari keadaan diam ?");
        System.out.println("Diketahui");
        System.out.println("Massa Bola : "+x.getMassa()+" gram");
        System.out.println("Kecepatan Bola : 0 m/s");
        System.out.println("Usaha Dari Bola : "+ x.usaha()+" Newton/m2");
        
    }
    
}
