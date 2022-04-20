/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package define;

/**
 *
 * @author ADMIN
 */
public class User {
    private String idUser, hoTen, tenTK, matKhau, gioiTinh, queQuan, dinhDanh, chucVu, sdt;

    public User()
    {
        
    }
    
    public User(User user) {
        this.idUser = user.idUser;
        this.hoTen = user.hoTen;
        this.tenTK = user.tenTK;
        this.matKhau = user.matKhau;
        this.gioiTinh = user.gioiTinh;
        this.queQuan = user.queQuan;
        this.dinhDanh = user.dinhDanh;
        this.chucVu = user.chucVu;
        this.sdt = user.sdt;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getDinhDanh() {
        return dinhDanh;
    }

    public void setDinhDanh(String dinhDanh) {
        this.dinhDanh = dinhDanh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    
}
