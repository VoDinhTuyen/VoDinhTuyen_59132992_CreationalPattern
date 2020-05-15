/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author My PC
 */
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HoaDon hoaDon1 = new HoaDon.HoaDonBuilder().addMaHD("HD01").addNgayBan("20/11/2019").addTenKH("Nguyen Van A").build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Dien Thoai").addSoLuong(1).addDonGia(2000000).addChietKhau("5%").build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("USB Kingston").addSoLuong(1).addDonGia(200000).addChietKhau("5%").build();
        hoaDon1.addCTHD(cthd2);
        hoaDon1.addCTHD(cthd1);
        hoaDon1.xuatHoaDon();
    }
    
}
