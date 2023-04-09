package inter;

import bean.clientformbean;
import bean.clientregbean;
import bean.deliverybean;
import bean.uploadbean;

public interface inter {
	
	public int reg(clientregbean cb);
	
	public boolean log(clientregbean lb);
	
	public int form(clientformbean cb);
	
	public int dreg(deliverybean db);
	
	public boolean dlog(deliverybean lb);
	
	public int upload(uploadbean ub);

}
