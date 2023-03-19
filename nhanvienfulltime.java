package lap6;

public class nhanvienfulltime extends nhanvien{
    private String loaiChucVu;
    private int ngayLamThem;
    
    public nhanvienfulltime(){}

    public nhanvienfulltime(String loaiChucVu, int ngayLamThem, String ten) {
        super();
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    public String getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(String loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }

    @Override
    public String getTen() {
        return ten;
    }

    @Override
    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public long getLuong() {
        return luong;
    }

    @Override
    public void setLuong(long luong) {
        this.luong = luong;
    }
 
    @Override
    public String loaiNhanVien() {
        System.out.println("Full time");
        return "Fulltime";
    }
    
    @Override
    public void tinhLuong() {
        float Luong = this.luong*this.ngayLamThem;
        System.out.println("Luong cua nhan vien FullTime la : " +Luong);
    }

}
