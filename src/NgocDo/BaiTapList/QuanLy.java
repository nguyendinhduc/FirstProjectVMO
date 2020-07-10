package NgocDo.BaiTapList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuanLy {
    private List<DanhBa> ListDB;
    public QuanLy(){
        ListDB = new ArrayList<>();
    }
    public void themDanhBa(DanhBa db){
        ListDB.add(db);
    }

    public boolean kiemTraTonTai(String ten, String SDT){
        for(int i = 0; i < ListDB.size(); i++){
            DanhBa db = ListDB.get(i);
            Pattern pattern = Pattern.compile(ten,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(db.getTen());
            if(matcher.find() && db.getSDT() == SDT){
                return true;
            }
        }
        return false;
    }

    public void suaTen(String ten, String tenMoi){
        for(int i = 0; i < ListDB.size(); i++){
            DanhBa db = ListDB.get(i);
            Pattern pattern = Pattern.compile(ten,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(db.getTen());
            if(matcher.find()){
                db.setTen(tenMoi);
            }else{
                System.out.print("Edit name failed, user not found");
            }
        }
    }
    public void timKiemDB(String ten){
        for(int i = 0; i < ListDB.size(); i++){
            DanhBa db = ListDB.get(i);
            Pattern pattern = Pattern.compile(ten,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(db.getTen());
            if(matcher.find()){
                db.nTT();
            }
        }
    }

    public void inListDB(){
        for(int i = 0; i < ListDB.size(); i++){
            ListDB.get(i).nTT();
        }
    }

    public List<DanhBa> timKiemNangCao(String timKiem){
        List<DanhBa> listResultContact = new ArrayList<>();
        char[] listCharTimKiem= new char[timKiem.length()];
        for (int i = 0; i < timKiem.length(); i++) {
            listCharTimKiem[i] = timKiem.charAt(i);
        }

        for(int i = 0; i < ListDB.size(); i++){
            int index = 0;
            DanhBa db = ListDB.get(i);
            String tenDb = db.getTen();
            Stack<Character> checkCharacter = new Stack<Character>();

            for(int j = 0; j < listCharTimKiem.length; j++){
                char compare = listCharTimKiem[j];
                for(int n = index; n < tenDb.length(); n++){
                    if( (compare+"").toUpperCase().equals((tenDb.charAt(n)+"").toUpperCase()) ){
                        index = n+1;
                        checkCharacter.push(tenDb.charAt(n));
                        break;
                    }
                }
            }
            if(checkCharacter.size() == listCharTimKiem.length) {
                db.nTT();
                listResultContact.add(db);
            }
        }
        return listResultContact;
    }
}
