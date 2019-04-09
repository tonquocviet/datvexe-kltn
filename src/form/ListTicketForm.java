package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.Ticket;

public class ListTicketForm extends ActionForm{
	private ArrayList<Ticket> listTicket;
	private int paginationNumber,currentPageIndex;
	

	

	public int getPaginationNumber() {
		return paginationNumber;
	}

	public void setPaginationNumber(int paginationNumber) {
		this.paginationNumber = paginationNumber;
	}

	public int getCurrentPageIndex() {
		return currentPageIndex;
	}

	public void setCurrentPageIndex(int currentPageIndex) {
		this.currentPageIndex = currentPageIndex;
	}

	public void setListTicket(ArrayList<Ticket> listTicket) {
		this.listTicket = listTicket;
	}

	public ArrayList<Ticket> getListTicket() {
		return listTicket;
	}

	
	
}
