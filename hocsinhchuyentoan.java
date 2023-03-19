package lap6;

public class hocsinhchuyentoan extends hocsinh{
    public hocsinhchuyentoan() {}
    
    public hocsinhchuyentoan(String hoTen, int lop, float toan, float ly, float hoa) {
        super();
    }

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public int getLop() {
        return lop;
    }

    @Override
    public void setLop(int lop) {
        this.lop = lop;
    }

    @Override
    public float getLy() {
        return ly;
    }

    @Override
    public void setLy(float ly) {
        this.ly = ly;
    }

    @Override
    public float getHoa() {
        return hoa;
    }

    @Override
    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    @Override
    public float getToan() {
        return toan;
    }

    @Override
    public void setToan(float toan) {
        this.toan = toan;
    }
  
    @Override
    public void diemTrungBinh() {
        float diem = (this.toan*2+this.ly+this.hoa)/4;
        System.out.println("Diem trung binh cua hoc sinh la :" + diem);
    }

}
