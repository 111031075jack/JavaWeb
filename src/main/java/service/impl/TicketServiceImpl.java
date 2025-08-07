package service.impl;

import java.util.List;

import dao.TicketDao;
import dao.impl.TicketDaoImpl;
import model.Ticket;
import service.TicketService;

public class TicketServiceImpl implements TicketService {

	private TicketDao dao = new TicketDaoImpl();
	
	@Override
	public List<Ticket> findAlltTickets() {
		
		return dao.findAllTickets();
	}

	@Override
	public Ticket geTicket(int id) {
		
		return dao.geTicket(id);
	}

	@Override
	public void addTicket(Ticket ticket) {
		dao.addTicket(ticket);
		
	}

	@Override
	public void updateTicketPrice(int id, int price) {
		dao.updateTicketPrice(id, price);
		
	}

	@Override
	public void deleteTicket(int id) {
		dao.deleteTicket(id);
		
	}

}
