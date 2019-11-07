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
public class EnergiKintetik {
    
    private double massa;
    private double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double kinetikA(){
        return 0.5 * massa * kecepatan;
    }
    
    public double kinetikB(){
        return 0.5 * massa * 0;
    }
    
    public double usaha(){
        return kinetikA()-kinetikB();
    }
    
}
