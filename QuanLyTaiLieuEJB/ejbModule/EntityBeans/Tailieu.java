package EntityBeans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tailieu database table.
 * 
 */
@Entity
@NamedQuery(name="Tailieu.findAll", query="SELECT t FROM Tailieu t")
public class Tailieu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTaiLieu;

	@Column(name="ten_tai_lieu")
	private String tenTaiLieu;

	//bi-directional many-to-one association to Binhluan
	@OneToMany(mappedBy="tailieu")
	private List<Binhluan> binhluans;

	//bi-directional many-to-many association to Monhoc
	@ManyToMany
	@JoinTable(
		name="monhoc_has_tailieu"
		, joinColumns={
			@JoinColumn(name="TaiLieu_idTaiLieu")
			}
		, inverseJoinColumns={
			@JoinColumn(name="MonHoc_idMonHoc")
			}
		)
	private List<Monhoc> monhocs;

	public Tailieu() {
	}

	public int getIdTaiLieu() {
		return this.idTaiLieu;
	}

	public void setIdTaiLieu(int idTaiLieu) {
		this.idTaiLieu = idTaiLieu;
	}

	public String getTenTaiLieu() {
		return this.tenTaiLieu;
	}

	public void setTenTaiLieu(String tenTaiLieu) {
		this.tenTaiLieu = tenTaiLieu;
	}

	public List<Binhluan> getBinhluans() {
		return this.binhluans;
	}

	public void setBinhluans(List<Binhluan> binhluans) {
		this.binhluans = binhluans;
	}

	public Binhluan addBinhluan(Binhluan binhluan) {
		getBinhluans().add(binhluan);
		binhluan.setTailieu(this);

		return binhluan;
	}

	public Binhluan removeBinhluan(Binhluan binhluan) {
		getBinhluans().remove(binhluan);
		binhluan.setTailieu(null);

		return binhluan;
	}

	public List<Monhoc> getMonhocs() {
		return this.monhocs;
	}

	public void setMonhocs(List<Monhoc> monhocs) {
		this.monhocs = monhocs;
	}

}