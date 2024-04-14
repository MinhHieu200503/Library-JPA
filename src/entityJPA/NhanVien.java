package entityJPA;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NhanVien")
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNhanVien;
	
	@Column(columnDefinition = "nvarchar(50)")
	private String hoTenNV;
	@Column(columnDefinition = "nvarchar(50)")
	private LocalDate ngaySinh;
	@Column(columnDefinition = "nvarchar(50)")
	private String soDienThoai;
	@Column(columnDefinition = "nvarchar(50)")
	private String gioiTinh;
	@Column(columnDefinition = "nvarchar(50)")
	private String email;
	
	@OneToOne
	@JoinColumn(name = "tenDangNhap", unique = true, nullable = false)
	private TaiKhoan taiKhoan;
	private int tinhTrangLamViec;
	
	@ManyToOne
	@JoinColumn(name = "maCa")
	private CaLamViec caLamViec;
	
	@Enumerated(EnumType.STRING)
	private ChucVu chucVu;
	
	@OneToMany
	private List<HoaDon> hoaDon;
	
	@OneToMany
	private List<HoaDonHoanTra> hoaDonHoanTra;

	
}
