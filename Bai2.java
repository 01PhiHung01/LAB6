public class HocSinh {
    public String hoTen;
    public String lop;
    public double toan;
    public double li;
    public double hoa;
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen=hoTen;
    }
    public String getLop(){
        return this.lop;
    }
    public void setLop(String lop) {
        this.lop=lop;
    }
    public double getToan(){
        return this.toan;
    }
    public void setToan(double toan) {
        this.toan=toan;
    }
    public double getLi(){
        return this.li;
    }
    public void setLi(double li) {
        this.li=li;
    }
    public double getHoa(){
        return this.hoa;
    }
    public void setHoa(double hoa) {
        this.hoa=hoa;
    }
    public void diemTB() {
        System.out.println("Diemtb: " +((toan+li+hoa)/3));
    }
}
public class HocSinhChuyenToan extends HocSinh {
    @Override
    public void diemTB() {
        System.out.println("Diemtb hoc sinh chuyen Toan: "+(toan*2+li+hoa)/4);
    }
}
public class Mainclass {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        hocSinh.diemTB();
        hocSinh = new HocSinhChuyenToan();
        hocSinh.diemTB();
    }
}
