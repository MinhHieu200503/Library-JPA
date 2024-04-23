package entityJPA;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "MauSac")
public class MauSac {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maMau;
	@Column(columnDefinition = "nvarchar(50)")
	private String tenMau;

	@OneToOne(mappedBy = "mauSac")
	private VanPhongPham vanPhongPham;
	
	public MauSac(String tenMau) {
		this.tenMau = tenMau;
	}
	
	public MauSac(int maMau, String tenMau) {
		this.maMau = maMau;
		this.tenMau = tenMau;
	}
}
