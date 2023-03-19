package lap6;

public class nhanvien {
    protected String ten;
    protected long luong;

    public nhanvien() {
    }
   
    public nhanvien(String ten, long luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    protected String loaiNhanVien(){
        return "FullTime" + "PartTime";
    }
    
    public void tinhLuong() {
        System.out.println("Luong = " + this.luong);
    }
    
    public void xuatThongTin() {
        System.out.println("Ten nhan vien " + this.ten + "\nluong = "+ this.luong);
    }

}
