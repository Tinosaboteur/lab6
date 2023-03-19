package lap6;

public class hocsinh {
    protected String hoTen;
    protected int lop;
    protected float ly , hoa, toan;
    
    public hocsinh() {}

    public hocsinh(String hoTen, int lop, float toan, float ly, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }
   
    public void diemTrungBinh() {
        float diem = (this.toan+this.ly+this.hoa)/3;
        System.out.println("Diem trung binh cua hoc sinh la: " +diem);
    }

}
