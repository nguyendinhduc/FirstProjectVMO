package NgocDo.BaiTapList;

import NgocDo.ListExcercise.Student;

import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuanLyHocSinh {
    private List<HocSinh> listHocSinh;
    public QuanLyHocSinh(){
        listHocSinh = new ArrayList<>();
    }
    public void themHocSinh(HocSinh hocSinh){
        listHocSinh.add(hocSinh);
    }

    public boolean kiemTraTonTai(String ten){
        for(int i = 0; i < listHocSinh.size(); i++){
            HocSinh h = listHocSinh.get(i);
            Pattern pattern = Pattern.compile(ten,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(h.getTen());
            if(matcher.find()){
                return true;
            }
        }
        return false;
    }

    public void suaTenHocSinh(String maHS, String tenMoi){
        for(int i = 0; i < listHocSinh.size(); i++){
            HocSinh h = listHocSinh.get(i);
            if(h.getMaSV() == maHS){
                h.setTen(tenMoi);
            }
        }
    }

    public ArrayList timKiem(String ten){
        ArrayList<HocSinh> ketQuaTimKiem = new ArrayList<>();
        for(int i = 0; i < listHocSinh.size(); i++){
            HocSinh h = listHocSinh.get(i);
            Pattern pattern = Pattern.compile(ten,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(h.getTen());
            if(matcher.find()){
                ketQuaTimKiem.add(h);
                h.nTT();
            }
        }
        return ketQuaTimKiem;
    }

    public void sapXepSinhVien(){
        for (int i = 0; i < listHocSinh.size() - 1; i++) {
            for (int j = i + 1; j < listHocSinh.size(); j++) {
                HocSinh s1 = listHocSinh.get(i);
                HocSinh s2 = listHocSinh.get(j);
                if (s1.getDiemTKHocKy() > s2.getDiemTKHocKy()) {
                    listHocSinh.set(i, s2);
                    listHocSinh.set(j, s1);
                }
            }
        }
    }

}
