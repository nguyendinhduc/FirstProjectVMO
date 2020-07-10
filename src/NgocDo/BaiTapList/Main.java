package NgocDo.BaiTapList;

public class Main {
    public static void main(String[] args) {
        DanhBa db = new DanhBa();
        QuanLy ListDB = new QuanLy();

        db.setTen("Thang");
        db.setSDT("0123");
        ListDB.themDanhBa(db);

        db = new DanhBa();
        db.setTen("TranThanh");
        db.setSDT("43534");
        ListDB.themDanhBa(db);

        db = new DanhBa();
        db.setTen("Hoai");
        db.setSDT("0153");
        ListDB.themDanhBa(db);

        db = new DanhBa();
        db.setTen("ToHoang");
        db.setSDT("345345");
        ListDB.themDanhBa(db);

        db = new DanhBa();
        db.setTen("ToThang");
        db.setSDT("43534");
        ListDB.themDanhBa(db);

        db = new DanhBa();
        db.setTen("ToTien");
        db.setSDT("34534");
        ListDB.themDanhBa(db);

        ListDB.timKiemNangCao("Thang");
    }
}
