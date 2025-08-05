package dao.impl;

import java.util.List;

import dao.BaseDao;
import dao.DroneOrderDao;
import model.DroneOrder;

public class DroneOrderDaoImpl extends BaseDao implements DroneOrderDao {

	@Override
	public List<DroneOrder> findAll(String orderByName, boolean asc) {
		String sql = """
				select order_id, customer_name, drone_model, height, speed, quantity, price, order_date, status
				from drone_order
				order by %s %s
				""";
		sql = String.format(sql.trim(), orderByName, asc?"asc":"desc");
		return null;
	}

	@Override
	public List<DroneOrder> findAll() {
		
		return null;
	}
	
	
	
	
}
