package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.google.gson.Gson;

import common.AutoGenChair;
import common.Convert;
import form.TicketForm;
import model.bean.Bus;
import model.bean.BusType;
import model.bean.Ghe;
import model.bo.BusBO;
import model.bo.BusTypeBO;
import model.bo.BusesBO;
import model.bo.ChairBO;
import model.bo.TicKetBO;
import model.bo.UserBO;

public class BookTicketAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		TicketForm ticketForm = (TicketForm) form;
		HttpSession session = request.getSession();
		if(session.getAttribute("maNguoiDung")==null)
		{
			return mapping.findForward("login");
		}
		else
		{
			int userId = (Integer)session.getAttribute("maNguoiDung");
			String username = (String)session.getAttribute("username");
			
			
			//submit layout
			if(ticketForm.getSubmit()!=null && ticketForm.getSubmit().equals("submit"))
			{
				Gson gson = new Gson();
				String jsonInString = ticketForm.getChairLayoutJson();
				Bus jsonBus = gson.fromJson(jsonInString,  Bus.class);
				
				
				if((new TicKetBO()).buyTicKet(ticketForm.getMaChuyen(),userId,jsonBus.getListGhe())!=0)
					return mapping.findForward("success");
				
				return mapping.findForward("fail");
			}
			else{	
				Gson gson = new Gson();
				int maChuyen =  Integer.parseInt(request.getParameter("maChuyen"));
				ticketForm.setMaChuyen(maChuyen);
				ticketForm.setUserJson(gson.toJson((new UserBO()).getOneUser(username)));
				ticketForm.setLocationJson(gson.toJson((new BusesBO()).getOneBuses(maChuyen)));
				int maXe = (new BusBO()).getBusIdByBusesId(maChuyen);
				
				BusType busType = (new BusTypeBO()).getBusTypeByBusId(maXe);
				int floor = busType.getSoTang();
				 
				ArrayList<Ghe> listGhe = (new ChairBO().getChairForSellByBusId(maChuyen));
				Convert convert = new Convert();
				ArrayList<ArrayList<Ghe>> listGheMaxtrix=null;
				if(listGhe.size()!=0)
				{
					listGheMaxtrix= convert.convertArrToMatrix(listGhe);
				}
				else
				{
					listGheMaxtrix=(new AutoGenChair()).genChair(busType.getMaLoaiXe());
				}
				request.setAttribute("listGheMatrix",listGheMaxtrix);
				
				request.setAttribute("soTang", floor);
				return mapping.findForward("render");
			}
		}
		
	}
	
}
