package entityJPA;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class VanPhongPham extends SanPham {
	
	@OneToOne
	@JoinColumn(name = "mauSac")
	private MauSac	mauSac;
	
    private String noiSanXuat;
    
	public VanPhongPham(String tenSanPham, NhomSanPham nhomSanPham, NhaCungCap nhaCungCap, int soLuongTon,
			double donGiaNhap, String moTa, String tinhTrang, double donGiaBan, double VAT, LocalDateTime ngayTao,
			double giamGia, MauSac mauSac, String noiSanXuat) {
		super(tenSanPham, nhomSanPham, nhaCungCap, soLuongTon, donGiaNhap, moTa, tinhTrang, donGiaBan, VAT, ngayTao,
				giamGia);
		this.mauSac = mauSac;
		this.noiSanXuat = noiSanXuat;
	}
    
    
    
}
