package entity;
/**
 * 供应商数据表
 * @author Zylyyqx
 *
 */
public class Product {
	private int id;//ID值
	private String pname;//供应商名
	private String paddress;//地址
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	
}
