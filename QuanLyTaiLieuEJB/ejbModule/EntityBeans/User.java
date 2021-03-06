package EntityBeans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserPK id;

	@Column(name="ho_ten")
	private String hoTen;

	private String password;

	private String username;

	//bi-directional many-to-one association to Binhluan
	@OneToMany(cascade = CascadeType.ALL,mappedBy="user")
	private List<Binhluan> binhluans;

	//bi-directional many-to-one association to Loai
	@ManyToOne
	@JoinColumn(name="idLoai")
	private Loai loai;

	public User() {
	}

	public UserPK getId() {
		return this.id;
	}

	public void setId(UserPK id) {
		this.id = id;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Binhluan> getBinhluans() {
		return this.binhluans;
	}

	public void setBinhluans(List<Binhluan> binhluans) {
		this.binhluans = binhluans;
	}

	public Binhluan addBinhluan(Binhluan binhluan) {
		getBinhluans().add(binhluan);
		binhluan.setUser(this);

		return binhluan;
	}

	public Binhluan removeBinhluan(Binhluan binhluan) {
		getBinhluans().remove(binhluan);
		binhluan.setUser(null);

		return binhluan;
	}

	public Loai getLoai() {
		return this.loai;
	}

	public void setLoai(Loai loai) {
		this.loai = loai;
	}

}