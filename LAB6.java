package lab6;
public class NhanVien {
    public String ten;
    public long luong;

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


public NhanVien() {}
public NhanVien(String ten) {
    this.ten=ten;
}
public String loaiNhanVien() {
    return this.ten;
}
public void tinhLuong() {
    System.out.println("Luong la: ");
}
public void xuatThongTin() {
    System.out.println("Thong tin cua nhan vien: ");
}
}
public class NhanVienFullTime extends NhanVien {   
    public int loaiChucVu;
    public int ngayLamThem;
    public NhanVienFullTime() {
        }
    public NhanVienFullTime(int loaiChucVu,int ngayLamThem) {
        this.loaiChucVu=loaiChucVu;
        this.ngayLamThem=ngayLamThem;
    }
        public int getLoaiChucVu() {
            return loaiChucVu;
        }

        public void setLoaiChucVu(int loaiChucVu) {
            this.loaiChucVu = loaiChucVu;
        }

        public int getNgayLamThem() {
            return ngayLamThem;
        }

        public void setNgayLamThem(int ngayLamThem) {
            this.ngayLamThem = ngayLamThem;
        }

        public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {}
        @Override
        public String loaiNhanVien() {
        return "Nhan vien full time";
        }
        @Override
        public void tinhLuong() {
            System.out.println("Luong cua Nhan vien full time: "+loaiChucVu*luong+ngayLamThem);
        }
}
public class NhanVienPartTime extends NhanVien {
public NhanVienPartTime() {}
    int gioLamViec;

        public int getGioLamViec() {
            return gioLamViec;
        }

        public void setGioLamViec(int gioLamViec) {
            this.gioLamViec = gioLamViec;
        }
    public NhanVienPartTime(String ten, int gioLamViec) {}
    @Override 
    public String loaiNhanVien() {
    return "loai nhan vien";
    }
    @Override
    public void tinhLuong() {
        System.out.println("Luong cua nhan vien Part time:" +gioLamViec*luong);
    }
}

 class Mainclass {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.tinhLuong();
        nv.xuatThongTin();
        nv = new NhanVienPartTime();
        nv.tinhLuong();
        nv = new NhanVienFullTime();
        nv.tinhLuong();    
    }
 }
