package NgocDo.BaiTapList;

public class HocSinh {
    private String MaSV;
    private String Ten;
    private String Lop;
    private String Khoa;
    private Float diemTKHocKy;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        Khoa = khoa;
    }

    public Float getDiemTKHocKy() {
        return diemTKHocKy;
    }

    public void setDiemTKHocKy(Float diemTKHocKy) {
        this.diemTKHocKy = diemTKHocKy;
    }

    public void nTT(){
        System.out.println(this.getMaSV()+" "+this.getTen()+" "+this.getKhoa()+" "+this.getLop()+" "+this.getDiemTKHocKy());
    }
}
