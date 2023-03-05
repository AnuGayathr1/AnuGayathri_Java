package daoproject.dao;

import java.util.Collection;

import daoproject.dto.ItemMasterDTO;

public abstract class ItemMasterDAO {
	public abstract ItemMasterDTO findItemByNo(int item_no);
	public abstract Collection<ItemMasterDTO> findAll();
	public abstract int updateItem(ItemMasterDTO itemdto);
	public abstract int deleteItemByNo(int item_no);
}
