package entityJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "NhomSanPham")
public class NhomSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNhomSanPham;
	private String tenNhomSanPham;


}
