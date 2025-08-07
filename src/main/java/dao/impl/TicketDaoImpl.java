package dao.impl;

import java.util.List;

import dao.TicketDao;
import model.Ticket;

public class TicketDaoImpl implements TicketDao {

	private TicketDao dao = new TicketDaoImpl();
	
	@Override
	public List<Ticket> findAllTickets() {
		
		return dao.findAllTickets();
	}

	@Override
	public Ticket geTicket(int id) {
		
		return null;
	}

	@Override
	public void addTicket(Ticket ticket) {
		
		
	}

	@Override
	public void updateTicket(int id, Ticket ticket) {
		
		
	}

	@Override
	public void deleteTicket(int id) {
		
		
	}

}
