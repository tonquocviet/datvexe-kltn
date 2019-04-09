package action;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import form.BusesForm;
import model.bo.BusBO;
import model.bo.BusesBO;
import model.bo.LocationBO;
import model.bo.TripBO;

public class AddBusesAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		int userId = (Integer)session.getAttribute("maNguoiDung");
		BusesForm busesForm = (BusesForm)form;
		
		if(busesForm.getSubmit()!=null )
		{
			System.out.println(busesForm.getListRepeatJson());
			Gson gson = new Gson();
			Type type = new TypeToken<Map<String, String>>(){}.getType();
			Map<String, String> repeatMap = gson.fromJson(busesForm.getListRepeatJson(), type);
			
			
			
			
			if(busesForm.getSubmit().equals("submit1"))
			{
				if((new BusesBO()).AddNewBusesAndTrip(busesForm,repeatMap))
					return mapping.findForward("success");
				else
					return mapping.findForward("fail");
			}
			else
			{
				if((new BusesBO()).AddNewBuses(busesForm,repeatMap))
					return mapping.findForward("success");
				else
					return mapping.findForward("fail");
			}
			
		}
		else
		{
			Gson gson = new Gson();
	        busesForm.setListBusJson( gson.toJson((new BusBO()).getAllBusByUserId(userId)));
	        busesForm.setListProvince((new LocationBO()).getAllProvince());
	        busesForm.setListTripJson( gson.toJson((new TripBO()).getAllTripByUserId(userId)));
			return mapping.findForward("render");
		}
	}

}
