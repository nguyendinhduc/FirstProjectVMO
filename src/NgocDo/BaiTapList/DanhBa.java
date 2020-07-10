package NgocDo.BaiTapList;

public class DanhBa {
    private String Ten;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    private String SDT;

    public void nTT(){
        System.out.println(this.getTen()+" "+this.getSDT());
    }
}
