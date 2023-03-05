package daoproject.dto;

import java.io.Serializable;
import java.util.Objects;

public class ItemMasterDTO implements Comparable<ItemMasterDTO>,Serializable{
	private int item_no, item_price;
	private String item_desc, item_unit;
	@Override
	public int compareTo(ItemMasterDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getItem_no() {
		return item_no;
	}
	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_desc() {
		return item_desc;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public String getItem_unit() {
		return item_unit;
	}
	public void setItem_unit(String item_unit) {
		this.item_unit = item_unit;
	}
	@Override
	public int hashCode() {
		return Objects.hash(item_desc, item_no, item_price, item_unit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemMasterDTO other = (ItemMasterDTO) obj;
		return Objects.equals(item_desc, other.item_desc) && item_no == other.item_no && item_price == other.item_price
				&& Objects.equals(item_unit, other.item_unit);
	}
	@Override
	public String toString() {
		return "ItemMasterDTO [item_no=" + item_no + ", item_price=" + item_price + ", item_desc=" + item_desc
				+ ", item_unit=" + item_unit + "]";
	}
	public ItemMasterDTO(int item_no, int item_price, String item_desc, String item_unit) {
		super();
		this.item_no = item_no;
		this.item_price = item_price;
		this.item_desc = item_desc;
		this.item_unit = item_unit;
	}
	public ItemMasterDTO() {
		// TODO Auto-generated constructor stub
	}
}
