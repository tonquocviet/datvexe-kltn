package model.bo;

import java.util.ArrayList;

import model.bean.Ghe;
import model.bean.Ticket;
import model.dao.TicketDAO;

public class TicKetBO {

	public int buyTicKet(Ticket ticket) {
		return (new TicketDAO()).buyTicKet(ticket);
		
	}

	public int buyTicKet(int maChuyenXe,int maKhachHang,ArrayList<Ghe> listGhe) {
		return (new TicketDAO()).buyTicKet(maChuyenXe,maKhachHang,listGhe);
		
	}

	public int getRowCountTicketByUserId(int userId) {
		return (new TicketDAO()).getRowCountTicketByUserId(userId);
	}

	public ArrayList<Ticket> getPaginationTicket(int i, int userId) {
		return (new TicketDAO()).getPaginationTicket(i,userId);
	}

	public boolean removeTicketByTicket(int t) {
		return (new TicketDAO()).removeTicketByTicket(t);
		
	}
	
}
