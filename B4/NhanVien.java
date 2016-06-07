package com.example.admin.myapplication.B4;

/**
 * Created by Admin on 30/05/2016.
 */
public class NhanVien {
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public static int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if(soSP < 0){
            System.out.println("SoSp phai lon hon 0");
        }else{
            this.soSP = soSP;
        }

        this.soSP = soSP;
    }
    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }
    public String maNV;
    public static int soSP;

    public boolean coVuotChuan(){
        if (getSoSP() < 500){
            return false;
        }
        else{
            return true;
        }

    }
    public static String getTongKet(){
        if(getSoSP() > 500){
            return "VUot";
        }
        return "";
    }
    public double getLuong() {
        if (this.soSP < 500) {

            return this.soSP * 20000;
        } else {
            return this.soSP * 20000 +(this.soSP -500)* 30000;
        }
    }
    public void XuatTieuDe(){
        System.out.println("ma nhan vien:" + getMaNV()  );
        System.out.println("So san pham:" + soSP);
        System.out.println("Luong:" + getLuong());
        System.out.println("Tong ket" + getTongKet());

    }

    private String getsoSP() {
        return "";
    }


    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", soSP=" + soSP +
                '}';
    }


}
