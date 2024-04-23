package entityJPA;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@NoArgsConstructor
@Entity
@Table(name = "HoaDon")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHoaDon;
	private LocalDateTime ngayLap;
	@Column(columnDefinition = "nvarchar(500)")
	private String ghiChu;
	private int tinhTrangHoaDon;
	private float tongTien;
	private float chietKhau;
	@Column(columnDefinition = "nvarchar(50)")
	private String khuyenMai;

	public HoaDon(LocalDateTime ngayLap, String ghiChu, int tinhTrangHoaDon, float tongTien, float chietKhau, String khuyenMai) {
		this.ngayLap = ngayLap;
		this.ghiChu = ghiChu;
		this.tinhTrangHoaDon = tinhTrangHoaDon;
		this.tongTien = tongTien;
		this.chietKhau = chietKhau;
		this.khuyenMai = khuyenMai;
	}

	@OneToMany(mappedBy = "hoaDon")
	private List<HoaDonHoanTra> hoaDonHoanTras;
	
	@ManyToOne
	@JoinColumn(name = "maKhachHang")
	private KhachHang khachHang;
	@ManyToOne
	@JoinColumn(name = "maNhanVien")
	private NhanVien nhanVien;
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", ngayLap=" + ngayLap + ", ghiChu=" + ghiChu + ", tinhTrangHoaDon="
				+ tinhTrangHoaDon + ", tongTien=" + tongTien + ", chietKhau=" + chietKhau + ", khuyenMai=" + khuyenMai
				+ ", maKhachHang=" + khachHang.getMaKhachHang() + ", maMhanVien=" + nhanVien.getMaNhanVien() + "]";
	}	
}
