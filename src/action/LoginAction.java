package action;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String user;
	private String pass;
	private String tip;
	
	public String regist(){
		ActionContext.getContext().getSession().put("user" , getUser());
		setTip("恭喜您," + getUser() + ",您已经注册成功！");
		return "success";
	}
	
	public String execute(){
		if(getUser().equals("crazyit")&&getPass().equals("leegang")){
			ActionContext.getContext().getSession().put("user", getUser());
			setTip("欢迎," + getUser() + ",您已经登录成功！");
			return "success";
		}
		else
			return "fail";
	}
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
